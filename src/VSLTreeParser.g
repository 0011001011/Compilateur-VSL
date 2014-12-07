tree grammar VSLTreeParser;

options {
	language     = Java;
	tokenVocab   = VSLParser;
	ASTLabelType = CommonTree;
}

s [SymbolTable symTab] returns [Code3a code]
	@init{
		code = new Code3a();
	}
	: ^(PROG (unit[symTab] {
		code.append($unit.code);
	})+)
	;

unit [SymbolTable ts] returns [Code3a code]
	: function[ts] {
		$code = $function.code;
	}
	| proto[ts]
	;

function [SymbolTable symTab] returns [Code3a code]
	: ^(FUNC_KW type { 
				FunctionType t = new FunctionType($type.type_ret, false);	 
			}
				IDENT {symTab.enterScope();} pl=param_list[symTab, t] ^(BODY body=statement[symTab]) {symTab.leaveScope();} )
			{
			Operand3a op = symTab.lookup($IDENT.text);
                        LabelSymbol label = new LabelSymbol($IDENT.text);	
			
			if (op == null) { // pas de proto déclaré
				FunctionSymbol fs = new FunctionSymbol(label, t);
				symTab.insert($IDENT.text, fs);
			}
			else if(op instanceof FunctionSymbol) {
				FunctionSymbol fs = (FunctionSymbol)op;
				if (!((FunctionType)fs.type).prototype) {
					Errors.redefinedIdentifier($IDENT, $IDENT.text, null);
					System.exit(1);
				}
				
				if(!fs.type.isCompatible((Type)t)) {
					Errors.incompatibleTypes($IDENT, fs.type, t, null);
					System.exit(1);				
				}
				
			}

			$code = new Code3a();
			VarSymbol var = new VarSymbol($IDENT.text);
			$code.append(Code3aGenerator.genFuncStart(var));
			$code.append($body.code);
			$code.append(Code3aGenerator.genFuncEnd());
		}
	;

proto [SymbolTable symTab]
	: ^(PROTO_KW type { 
				FunctionType t = new FunctionType($type.type_ret, true);	 
			} IDENT {symTab.enterScope();} pl=param_list[symTab, t] {symTab.leaveScope();})
			{
			if(symTab.lookup($IDENT.text) == null) {
				LabelSymbol label = new LabelSymbol($IDENT.text);
				FunctionSymbol fs = new FunctionSymbol(label, t);
				symTab.insert($IDENT.text, fs);
			}
			else {
				Errors.redefinedIdentifier($IDENT, $IDENT.text, null);
				System.exit(1);
			}
		}
	;

type returns [Type type_ret]
	: INT_KW
		{
			type_ret = Type.INT;
		}
	| VOID_KW
		{
			type_ret = Type.VOID;
		}
	;

param_list[SymbolTable symTab, FunctionType type]
	: ^(PARAM (param[symTab, type])*)
	;

param[SymbolTable symTab, FunctionType type]
	: IDENT
	{
		if (symTab.lookup($IDENT.text) == null) {
			VarSymbol vs = new VarSymbol(Type.INT, $IDENT.text, symTab.getScope());
			vs.setParam();
			symTab.insert($IDENT.text, vs);
			type.extend(Type.INT);
		}
	}
	| ^(ARRAY IDENT)
	{
		if(symTab.lookup($IDENT.text) == null) {
			ArrayType t = new ArrayType(Type.INT, 0);
			VarSymbol vs = new VarSymbol(Type.INT, $IDENT.text, symTab.getScope());
			vs.setParam();
			symTab.insert($IDENT.text, vs);
			type.extend(t);
		}
	}
	;

statement [SymbolTable symTab] returns [Code3a code]
	: ^(ASSIGN_KW e=expression[symTab] statement_lhs[symTab, $e.expAtt])
		{
			$code = $statement_lhs.code;
		}
	| ^(RETURN_KW expression[symTab])
		{
			$code = Code3aGenerator.genReturn($expression.expAtt);
		}
	| ^(IF_KW if_cond = expression[symTab] if_st=statement[symTab] (else_st=statement[symTab])?)
		{
			if ($else_st.code != null) {
				$code = Code3aGenerator.genIfThenElse($if_cond.expAtt, $if_st.code, $else_st.code);
			}
			else {
				$code = Code3aGenerator.genIfThen($if_cond.expAtt, $if_st.code);
			}
		}
	| ^(WHILE_KW wh_cond=expression[symTab] while_st=statement[symTab])
		{
			$code = Code3aGenerator.genWhile($wh_cond.expAtt, $while_st.code);
		}
	| ^(FCALL_S IDENT {FunctionType t = new FunctionType(Type.VOID, false);} argument_list[symTab, t])
		{
			Operand3a op = symTab.lookup($IDENT.text);
			if(op != null && op instanceof FunctionSymbol) {
				FunctionSymbol fs = (FunctionSymbol)op;
				if (((FunctionType)fs.type).getReturnType() == Type.VOID) {
					VarSymbol vs = new VarSymbol($IDENT.text);
					$code = Code3aGenerator.genCall($argument_list.code, vs);
				}
				else {
					Errors.unknownIdentifier($IDENT, $IDENT.text, null);
					System.exit(1);
				}
				
				if(!fs.type.isCompatible((Type)t)) {
					Errors.incompatibleTypes($IDENT, fs.type, t, null);
					System.exit(1);				
				}
			}
		}
    | ^(PRINT_KW print_list[symTab]){
    	$code = $print_list.code;
    }
    | ^(READ_KW read_list[symTab]){
    	$code = $read_list.code;
    }
	| code_sequence = block[symTab]
		{
			$code = $code_sequence.code;
		}
	;

statement_lhs [SymbolTable symTab, ExpAttribute exp] returns [Code3a code]
	: IDENT
		{
			Operand3a op = symTab.lookup($IDENT.text);
			if (op != null) {
				if(exp.type instanceof ArrayType) {
					Errors.incompatibleTypes($IDENT, Type.INT, exp.type, null);
					System.exit(1);
				}
				
				if(op.type instanceof ArrayType){
					Errors.incompatibleTypes($IDENT, Type.INT, op.type, null);
					System.exit(1);
				}
				
				Type ty           = Type.INT;
				Code3a cod        = new Code3a();
				VarSymbol temp    = new VarSymbol($IDENT.text);
				ExpAttribute exp1 = new ExpAttribute(ty, cod, temp);
				$code             = Code3aGenerator.genAssign(exp, exp1);
			}
			else {
				Errors.unknownIdentifier($IDENT, $IDENT.text, null);
				System.exit(1);
			}
		}
	| array_elem[symTab, exp]
		{
			$code = $array_elem.expAtt.code;
		}
	;

expression [SymbolTable symTab] returns [ExpAttribute expAtt]
	: ^(PLUS e1=expression[symTab] e2=expression[symTab])
		{
			Type ty        = TypeCheck.checkBinOp(e1.type, e2.type);
			VarSymbol temp = SymbDistrib.newTemp();
			Code3a cod     = Code3aGenerator.genBinOp(Inst3a.TAC.ADD, e1, e2, temp);
			expAtt         = new ExpAttribute(ty, cod, temp);
		}
	| ^(MINUS e1=expression[symTab] e2=expression[symTab])
		{
			Type ty        = TypeCheck.checkBinOp(e1.type, e2.type);
			VarSymbol temp = SymbDistrib.newTemp();
			Code3a cod     = Code3aGenerator.genBinOp(Inst3a.TAC.SUB, e1, e2, temp);
			expAtt         = new ExpAttribute(ty, cod, temp);
		}
	| ^(MUL e1=expression[symTab] e2=expression[symTab])
		{
			Type ty        = TypeCheck.checkBinOp(e1.type, e2.type);
			VarSymbol temp = SymbDistrib.newTemp();
			Code3a cod     = Code3aGenerator.genBinOp(Inst3a.TAC.MUL, e1, e2, temp);
			expAtt         = new ExpAttribute(ty, cod, temp);
		}
	| ^(DIV e1=expression[symTab] e2=expression[symTab])
		{
			Type ty        = TypeCheck.checkBinOp(e1.type, e2.type);
			VarSymbol temp = SymbDistrib.newTemp();
			Code3a cod     = Code3aGenerator.genBinOp(Inst3a.TAC.DIV, e1, e2, temp);
			expAtt         = new ExpAttribute(ty, cod, temp);
		}
	| pe=primary_exp[symTab]
		{
			expAtt = pe;
		}
	;

primary_exp [SymbolTable symTab] returns [ExpAttribute expAtt]
	: INTEGER
		{
			ConstSymbol cs = new ConstSymbol(Integer.parseInt($INTEGER.text));
			expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
		}
	| IDENT
		{
			Operand3a id = symTab.lookup($IDENT.text);
			if (id != null) {
				expAtt = new ExpAttribute(id.type, new Code3a(), id);
			}
			else {
				Errors.unknownIdentifier($IDENT, $IDENT.text, null);
				System.exit(1);
			}
		}
	| ^(FCALL IDENT argument_list[symTab, null])
		{
			Operand3a op = symTab.lookup($IDENT.text);
			if (op != null && op instanceof FunctionSymbol) {
				FunctionSymbol fs = (FunctionSymbol)op;

				if (((FunctionType)fs.type).getReturnType() != Type.VOID) {
					VarSymbol temp = SymbDistrib.newTemp();
					Code3a code = Code3aGenerator.genVar(temp);
					code.append(Code3aGenerator.genCallReturn($argument_list.code, new VarSymbol($IDENT.text), temp));
					expAtt = new ExpAttribute(new FunctionType(fs.type), code, temp);
				}
				else {
					Errors.incompatibleTypes($IDENT, Type.INT, ((FunctionType)fs.type).getReturnType(), null);
					System.exit(1);
				}
			} else {
				Errors.unknownIdentifier($IDENT, $IDENT.text, null);
				System.exit(1);
			}
		}
    | array_elem[symTab, null]
                {
                        $expAtt = $array_elem.expAtt;
                }
	;

block [SymbolTable symTab] returns [Code3a code]
	: ^(BLOCK {symTab.enterScope();} decl_block=declaration[symTab] inst_block=inst_list[symTab])
		{
			$code = $decl_block.code;
			$code.append($inst_block.code);
			symTab.leaveScope();
		}
	| ^(BLOCK {symTab.enterScope();} inst_block2=inst_list[symTab])
		{
			$code = $inst_block2.code;
			symTab.leaveScope();
		}
	;

declaration [SymbolTable symTab] returns [Code3a code]
	@init { $code = new Code3a(); }
	: ^(DECL (di=decl_item[symTab]
		{
			$code.append($di.code);
		}
	)+)
	;

decl_item [SymbolTable symTab] returns [Code3a code]
	: IDENT
		{
			VarSymbol vOld = (VarSymbol)symTab.lookup($IDENT.text);
			
			if(vOld != null && vOld.getScope() == symTab.getScope()) {
				Errors.redefinedIdentifier($IDENT, $IDENT.text, null);
				System.exit(1);
			}
			
			VarSymbol v = new VarSymbol(Type.INT, $IDENT.text, symTab.getScope());
			symTab.insert($IDENT.text, v);
			code = Code3aGenerator.genVar(v);
		}
	| ^(ARDECL IDENT INTEGER)
		{
			VarSymbol vOld = (VarSymbol)symTab.lookup($IDENT.text);
			
			if(vOld != null && vOld.getScope() == symTab.getScope()) {
				Errors.redefinedIdentifier($IDENT, $IDENT.text, null);
				System.exit(1);
			}
			
			ArrayType t = new ArrayType(Type.INT, Integer.parseInt($INTEGER.text));
			VarSymbol v = new VarSymbol(t, $IDENT.text, symTab.getScope());
			symTab.insert($IDENT.text, v);
			$code = Code3aGenerator.genVar(v);
		}
	;

inst_list [SymbolTable symTab] returns [Code3a code]
	@init { $code = new Code3a(); }
	: ^(INST (st=statement[symTab] {$code.append($st.code);})*)
	;


argument_list [SymbolTable symTab, FunctionType t] returns [Code3a code]
	: (expression[symTab]
		{
			$code = Code3aGenerator.genFuncArguments($expression.expAtt);
			if(t != null)
				t.extend($expression.expAtt.place.type);
		}
	)*
	;

print_list [SymbolTable symTab] returns [Code3a code]
	@init { $code = new Code3a(); }
	: (print_item[symTab]
		{
			$code.append($print_item.code);
		}
	)+
	;

print_item [SymbolTable symTab] returns [Code3a code]
	: TEXT{
    	Data3a data = new Data3a($TEXT.text);
		$code = Code3aGenerator.genPrintText(data);
	}
    | expression[symTab] {
    	$code = Code3aGenerator.genPrintExpression($expression.expAtt);
    }
    ;

read_list [SymbolTable symTab] returns [Code3a code]
	@init { $code = new Code3a(); }
	: (read_item[symTab]
		{
			$code.append($read_item.code);
		}
	)+
	;
read_item [SymbolTable symTab] returns [Code3a code]
	: IDENT {
    	VarSymbol v = (VarSymbol)symTab.lookup($IDENT.text);
    	if(v != null) {
    		$code = Code3aGenerator.genRead(v);
    	} else {
			Errors.unknownIdentifier($IDENT, $IDENT.text, null);
			System.exit(1);
    	}
	}
	| array_elem[symTab, null] {
	
	}
    ;

array_elem[SymbolTable symTab, ExpAttribute exp] returns [ExpAttribute expAtt]
	: ^(ARELEM IDENT expression[symTab]) {
		if(exp != null) { // Affectation
			VarSymbol v = new VarSymbol($IDENT.text);
			Code3a c = Code3aGenerator.genArrayAssignment(exp, v, $expression.expAtt);
			$expAtt = new ExpAttribute(Type.INT, c, v);
		} else {
			VarSymbol v   = new VarSymbol($IDENT.text);
			VarSymbol tmp = SymbDistrib.newTemp();
			Code3a c = Code3aGenerator.genArrayAccess(tmp, v, $expression.expAtt);
			$expAtt = new ExpAttribute(Type.INT, c, tmp);
		}
	}
	;