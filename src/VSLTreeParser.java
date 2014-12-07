// $ANTLR 3.5 ./src/VSLTreeParser.g 2014-12-07 16:24:11

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class VSLTreeParser extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASCII", "ASSIGN_KW", "COM", "COMMENT", 
		"DIGIT", "DIV", "DO_KW", "ELSE_KW", "FI_KW", "FUNC_KW", "IDENT", "IF_KW", 
		"INTEGER", "INT_KW", "LB", "LC", "LETTER", "LP", "MINUS", "MUL", "OD_KW", 
		"PLUS", "PRINT_KW", "PROTO_KW", "RB", "RC", "READ_KW", "RETURN_KW", "RP", 
		"TEXT", "THEN_KW", "VOID_KW", "WHILE_KW", "WS", "ARDECL", "ARELEM", "ARRAY", 
		"BLOCK", "BODY", "DECL", "FCALL", "FCALL_S", "INST", "PARAM", "PROG"
	};
	public static final int EOF=-1;
	public static final int ASCII=4;
	public static final int ASSIGN_KW=5;
	public static final int COM=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int DIV=9;
	public static final int DO_KW=10;
	public static final int ELSE_KW=11;
	public static final int FI_KW=12;
	public static final int FUNC_KW=13;
	public static final int IDENT=14;
	public static final int IF_KW=15;
	public static final int INTEGER=16;
	public static final int INT_KW=17;
	public static final int LB=18;
	public static final int LC=19;
	public static final int LETTER=20;
	public static final int LP=21;
	public static final int MINUS=22;
	public static final int MUL=23;
	public static final int OD_KW=24;
	public static final int PLUS=25;
	public static final int PRINT_KW=26;
	public static final int PROTO_KW=27;
	public static final int RB=28;
	public static final int RC=29;
	public static final int READ_KW=30;
	public static final int RETURN_KW=31;
	public static final int RP=32;
	public static final int TEXT=33;
	public static final int THEN_KW=34;
	public static final int VOID_KW=35;
	public static final int WHILE_KW=36;
	public static final int WS=37;
	public static final int ARDECL=38;
	public static final int ARELEM=39;
	public static final int ARRAY=40;
	public static final int BLOCK=41;
	public static final int BODY=42;
	public static final int DECL=43;
	public static final int FCALL=44;
	public static final int FCALL_S=45;
	public static final int INST=46;
	public static final int PARAM=47;
	public static final int PROG=48;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public VSLTreeParser(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public VSLTreeParser(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return VSLTreeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "./src/VSLTreeParser.g"; }



	// $ANTLR start "s"
	// ./src/VSLTreeParser.g:9:1: s[SymbolTable symTab] returns [Code3a code] : ^( PROG ( unit[symTab] )+ ) ;
	public final Code3a s(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a unit1 =null;


				code = new Code3a();
			
		try {
			// ./src/VSLTreeParser.g:13:2: ( ^( PROG ( unit[symTab] )+ ) )
			// ./src/VSLTreeParser.g:13:4: ^( PROG ( unit[symTab] )+ )
			{
			match(input,PROG,FOLLOW_PROG_in_s60); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:13:11: ( unit[symTab] )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC_KW||LA1_0==PROTO_KW) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ./src/VSLTreeParser.g:13:12: unit[symTab]
					{
					pushFollow(FOLLOW_unit_in_s63);
					unit1=unit(symTab);
					state._fsp--;


							code.append(unit1);
						
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "s"



	// $ANTLR start "unit"
	// ./src/VSLTreeParser.g:18:1: unit[SymbolTable ts] returns [Code3a code] : ( function[ts] | proto[ts] );
	public final Code3a unit(SymbolTable ts) throws RecognitionException {
		Code3a code = null;


		Code3a function2 =null;

		try {
			// ./src/VSLTreeParser.g:19:2: ( function[ts] | proto[ts] )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FUNC_KW) ) {
				alt2=1;
			}
			else if ( (LA2_0==PROTO_KW) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ./src/VSLTreeParser.g:19:4: function[ts]
					{
					pushFollow(FOLLOW_function_in_unit86);
					function2=function(ts);
					state._fsp--;


							code = function2;
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:22:4: proto[ts]
					{
					pushFollow(FOLLOW_proto_in_unit94);
					proto(ts);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "unit"



	// $ANTLR start "function"
	// ./src/VSLTreeParser.g:25:1: function[SymbolTable symTab] returns [Code3a code] : ^( FUNC_KW type IDENT pl= param_list[symTab, t] ^( BODY body= statement[symTab] ) ) ;
	public final Code3a function(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT4=null;
		Code3a body =null;
		Type type3 =null;

		try {
			// ./src/VSLTreeParser.g:26:2: ( ^( FUNC_KW type IDENT pl= param_list[symTab, t] ^( BODY body= statement[symTab] ) ) )
			// ./src/VSLTreeParser.g:26:4: ^( FUNC_KW type IDENT pl= param_list[symTab, t] ^( BODY body= statement[symTab] ) )
			{
			match(input,FUNC_KW,FOLLOW_FUNC_KW_in_function113); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_function115);
			type3=type();
			state._fsp--;

			 
							FunctionType t = new FunctionType(type3, false);	 
						
			IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_function123); 
			symTab.enterScope();
			pushFollow(FOLLOW_param_list_in_function129);
			param_list(symTab, t);
			state._fsp--;

			match(input,BODY,FOLLOW_BODY_in_function133); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_function137);
			body=statement(symTab);
			state._fsp--;

			match(input, Token.UP, null); 

			symTab.leaveScope();
			match(input, Token.UP, null); 


						
						Operand3a op = symTab.lookup((IDENT4!=null?IDENT4.getText():null));
						LabelSymbol label = new LabelSymbol((IDENT4!=null?IDENT4.getText():null));	
						
						if (op == null) { // pas de proto déclaré
							FunctionSymbol fs = new FunctionSymbol(label, t);
							symTab.insert((IDENT4!=null?IDENT4.getText():null), fs);
						}
						else if(op instanceof FunctionSymbol) {
							FunctionSymbol fs = (FunctionSymbol)op;
							if (!((FunctionType)fs.type).prototype) {
								Errors.redefinedIdentifier(IDENT4, (IDENT4!=null?IDENT4.getText():null), null);
								System.exit(1);
							}
							
							if(!fs.type.isCompatible((Type)t)) {
								Errors.incompatibleTypes(IDENT4, fs.type, t, null);
								System.exit(1);				
							}
							
						}

						code = new Code3a();
						VarSymbol var = new VarSymbol((IDENT4!=null?IDENT4.getText():null));
						code.append(Code3aGenerator.genFuncStart(var));
						code.append(body);
						code.append(Code3aGenerator.genFuncEnd());
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "function"



	// $ANTLR start "proto"
	// ./src/VSLTreeParser.g:61:1: proto[SymbolTable symTab] : ^( PROTO_KW type IDENT pl= param_list[symTab, t] ) ;
	public final void proto(SymbolTable symTab) throws RecognitionException {
		CommonTree IDENT6=null;
		Type type5 =null;

		try {
			// ./src/VSLTreeParser.g:62:2: ( ^( PROTO_KW type IDENT pl= param_list[symTab, t] ) )
			// ./src/VSLTreeParser.g:62:4: ^( PROTO_KW type IDENT pl= param_list[symTab, t] )
			{
			match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto162); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_proto164);
			type5=type();
			state._fsp--;

			 
							FunctionType t = new FunctionType(type5, true);	 
						
			IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_proto168); 
			symTab.enterScope();
			pushFollow(FOLLOW_param_list_in_proto174);
			param_list(symTab, t);
			state._fsp--;

			symTab.leaveScope();
			match(input, Token.UP, null); 


						if(symTab.lookup((IDENT6!=null?IDENT6.getText():null)) == null) {
							LabelSymbol label = new LabelSymbol((IDENT6!=null?IDENT6.getText():null));
							FunctionSymbol fs = new FunctionSymbol(label, t);
							symTab.insert((IDENT6!=null?IDENT6.getText():null), fs);
						}
						else {
							Errors.redefinedIdentifier(IDENT6, (IDENT6!=null?IDENT6.getText():null), null);
							System.exit(1);
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "proto"



	// $ANTLR start "type"
	// ./src/VSLTreeParser.g:78:1: type returns [Type type_ret] : ( INT_KW | VOID_KW );
	public final Type type() throws RecognitionException {
		Type type_ret = null;


		try {
			// ./src/VSLTreeParser.g:79:2: ( INT_KW | VOID_KW )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==INT_KW) ) {
				alt3=1;
			}
			else if ( (LA3_0==VOID_KW) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// ./src/VSLTreeParser.g:79:4: INT_KW
					{
					match(input,INT_KW,FOLLOW_INT_KW_in_type198); 

								type_ret = Type.INT;
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:83:4: VOID_KW
					{
					match(input,VOID_KW,FOLLOW_VOID_KW_in_type207); 

								type_ret = Type.VOID;
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type_ret;
	}
	// $ANTLR end "type"



	// $ANTLR start "param_list"
	// ./src/VSLTreeParser.g:89:1: param_list[SymbolTable symTab, FunctionType type] : ^( PARAM ( param[symTab, type] )* ) ;
	public final void param_list(SymbolTable symTab, FunctionType type) throws RecognitionException {
		try {
			// ./src/VSLTreeParser.g:90:2: ( ^( PARAM ( param[symTab, type] )* ) )
			// ./src/VSLTreeParser.g:90:4: ^( PARAM ( param[symTab, type] )* )
			{
			match(input,PARAM,FOLLOW_PARAM_in_param_list224); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./src/VSLTreeParser.g:90:12: ( param[symTab, type] )*
				loop4:
				while (true) {
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==IDENT||LA4_0==ARRAY) ) {
						alt4=1;
					}

					switch (alt4) {
					case 1 :
						// ./src/VSLTreeParser.g:90:13: param[symTab, type]
						{
						pushFollow(FOLLOW_param_in_param_list227);
						param(symTab, type);
						state._fsp--;

						}
						break;

					default :
						break loop4;
					}
				}

				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param_list"



	// $ANTLR start "param"
	// ./src/VSLTreeParser.g:93:1: param[SymbolTable symTab, FunctionType type] : ( IDENT | ^( ARRAY IDENT ) );
	public final void param(SymbolTable symTab, FunctionType type) throws RecognitionException {
		CommonTree IDENT7=null;
		CommonTree IDENT8=null;

		try {
			// ./src/VSLTreeParser.g:94:2: ( IDENT | ^( ARRAY IDENT ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==IDENT) ) {
				alt5=1;
			}
			else if ( (LA5_0==ARRAY) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// ./src/VSLTreeParser.g:94:4: IDENT
					{
					IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param243); 

							if (symTab.lookup((IDENT7!=null?IDENT7.getText():null)) == null) {
								VarSymbol vs = new VarSymbol(Type.INT, (IDENT7!=null?IDENT7.getText():null), symTab.getScope());
								vs.setParam();
								symTab.insert((IDENT7!=null?IDENT7.getText():null), vs);
								type.extend(Type.INT);
							}
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:103:4: ^( ARRAY IDENT )
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_param252); 
					match(input, Token.DOWN, null); 
					IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param254); 
					match(input, Token.UP, null); 


							if(symTab.lookup((IDENT8!=null?IDENT8.getText():null)) == null) {
								ArrayType t = new ArrayType(Type.INT, 0);
								VarSymbol vs = new VarSymbol(Type.INT, (IDENT8!=null?IDENT8.getText():null), symTab.getScope());
								vs.setParam();
								symTab.insert((IDENT8!=null?IDENT8.getText():null), vs);
								type.extend(t);
							}
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param"



	// $ANTLR start "statement"
	// ./src/VSLTreeParser.g:115:1: statement[SymbolTable symTab] returns [Code3a code] : ( ^( ASSIGN_KW e= expression[symTab] statement_lhs[symTab, $e.expAtt] ) | ^( RETURN_KW expression[symTab] ) | ^( IF_KW if_cond= expression[symTab] if_st= statement[symTab] (else_st= statement[symTab] )? ) | ^( WHILE_KW wh_cond= expression[symTab] while_st= statement[symTab] ) | ^( FCALL_S IDENT argument_list[symTab, t] ) | ^( PRINT_KW print_list[symTab] ) | ^( READ_KW read_list[symTab] ) |code_sequence= block[symTab] );
	public final Code3a statement(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree RETURN_KW11=null;
		CommonTree IDENT12=null;
		ExpAttribute e =null;
		ExpAttribute if_cond =null;
		Code3a if_st =null;
		Code3a else_st =null;
		ExpAttribute wh_cond =null;
		Code3a while_st =null;
		Code3a code_sequence =null;
		Code3a statement_lhs9 =null;
		ExpAttribute expression10 =null;
		Code3a argument_list13 =null;
		Code3a print_list14 =null;
		Code3a read_list15 =null;

		try {
			// ./src/VSLTreeParser.g:116:2: ( ^( ASSIGN_KW e= expression[symTab] statement_lhs[symTab, $e.expAtt] ) | ^( RETURN_KW expression[symTab] ) | ^( IF_KW if_cond= expression[symTab] if_st= statement[symTab] (else_st= statement[symTab] )? ) | ^( WHILE_KW wh_cond= expression[symTab] while_st= statement[symTab] ) | ^( FCALL_S IDENT argument_list[symTab, t] ) | ^( PRINT_KW print_list[symTab] ) | ^( READ_KW read_list[symTab] ) |code_sequence= block[symTab] )
			int alt7=8;
			switch ( input.LA(1) ) {
			case ASSIGN_KW:
				{
				alt7=1;
				}
				break;
			case RETURN_KW:
				{
				alt7=2;
				}
				break;
			case IF_KW:
				{
				alt7=3;
				}
				break;
			case WHILE_KW:
				{
				alt7=4;
				}
				break;
			case FCALL_S:
				{
				alt7=5;
				}
				break;
			case PRINT_KW:
				{
				alt7=6;
				}
				break;
			case READ_KW:
				{
				alt7=7;
				}
				break;
			case BLOCK:
				{
				alt7=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ./src/VSLTreeParser.g:116:4: ^( ASSIGN_KW e= expression[symTab] statement_lhs[symTab, $e.expAtt] )
					{
					match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement276); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement280);
					e=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_lhs_in_statement283);
					statement_lhs9=statement_lhs(symTab, e);
					state._fsp--;

					match(input, Token.UP, null); 


								code = statement_lhs9;
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:120:4: ^( RETURN_KW expression[symTab] )
					{
					RETURN_KW11=(CommonTree)match(input,RETURN_KW,FOLLOW_RETURN_KW_in_statement295); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement297);
					expression10=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								if(expression10.type != Type.INT) {
									Errors.incompatibleTypes(RETURN_KW11, Type.INT, expression10.type, null);
									System.exit(1);
								}
								
								code = Code3aGenerator.genReturn(expression10);
							
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:129:4: ^( IF_KW if_cond= expression[symTab] if_st= statement[symTab] (else_st= statement[symTab] )? )
					{
					match(input,IF_KW,FOLLOW_IF_KW_in_statement309); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement315);
					if_cond=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement320);
					if_st=statement(symTab);
					state._fsp--;

					// ./src/VSLTreeParser.g:129:65: (else_st= statement[symTab] )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ASSIGN_KW||LA6_0==IF_KW||LA6_0==PRINT_KW||(LA6_0 >= READ_KW && LA6_0 <= RETURN_KW)||LA6_0==WHILE_KW||LA6_0==BLOCK||LA6_0==FCALL_S) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// ./src/VSLTreeParser.g:129:66: else_st= statement[symTab]
							{
							pushFollow(FOLLOW_statement_in_statement326);
							else_st=statement(symTab);
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


								if (else_st != null) {
									code = Code3aGenerator.genIfThenElse(if_cond, if_st, else_st);
								}
								else {
									code = Code3aGenerator.genIfThen(if_cond, if_st);
								}
							
					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:138:4: ^( WHILE_KW wh_cond= expression[symTab] while_st= statement[symTab] )
					{
					match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement340); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement344);
					wh_cond=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement349);
					while_st=statement(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								code = Code3aGenerator.genWhile(wh_cond, while_st);
							
					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:142:4: ^( FCALL_S IDENT argument_list[symTab, t] )
					{
					match(input,FCALL_S,FOLLOW_FCALL_S_in_statement361); 
					match(input, Token.DOWN, null); 
					IDENT12=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement363); 
					FunctionType t = new FunctionType(Type.VOID, false);
					pushFollow(FOLLOW_argument_list_in_statement367);
					argument_list13=argument_list(symTab, t);
					state._fsp--;

					match(input, Token.UP, null); 


								Operand3a op = symTab.lookup((IDENT12!=null?IDENT12.getText():null));
								if(op != null && op instanceof FunctionSymbol) {
									FunctionSymbol fs = (FunctionSymbol)op;
									if (((FunctionType)fs.type).getReturnType() == Type.VOID) {
										VarSymbol vs = new VarSymbol((IDENT12!=null?IDENT12.getText():null));
										code = Code3aGenerator.genCall(argument_list13, vs);
									}
									else {
										Errors.unknownIdentifier(IDENT12, (IDENT12!=null?IDENT12.getText():null), null);
										System.exit(1);
									}
									
									if(!fs.type.isCompatible((Type)t)) {
										Errors.incompatibleTypes(IDENT12, fs.type, t, null);
										System.exit(1);				
									}
								}
							
					}
					break;
				case 6 :
					// ./src/VSLTreeParser.g:162:7: ^( PRINT_KW print_list[symTab] )
					{
					match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement382); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_print_list_in_statement384);
					print_list14=print_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code = print_list14;
					    
					}
					break;
				case 7 :
					// ./src/VSLTreeParser.g:165:7: ^( READ_KW read_list[symTab] )
					{
					match(input,READ_KW,FOLLOW_READ_KW_in_statement396); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_read_list_in_statement398);
					read_list15=read_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code = read_list15;
					    
					}
					break;
				case 8 :
					// ./src/VSLTreeParser.g:168:4: code_sequence= block[symTab]
					{
					pushFollow(FOLLOW_block_in_statement410);
					code_sequence=block(symTab);
					state._fsp--;


								code = code_sequence;
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "statement"



	// $ANTLR start "statement_lhs"
	// ./src/VSLTreeParser.g:174:1: statement_lhs[SymbolTable symTab, ExpAttribute exp] returns [Code3a code] : ( IDENT | array_elem[symTab, exp] );
	public final Code3a statement_lhs(SymbolTable symTab, ExpAttribute exp) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT16=null;
		ExpAttribute array_elem17 =null;

		try {
			// ./src/VSLTreeParser.g:175:2: ( IDENT | array_elem[symTab, exp] )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IDENT) ) {
				alt8=1;
			}
			else if ( (LA8_0==ARELEM) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// ./src/VSLTreeParser.g:175:4: IDENT
					{
					IDENT16=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement_lhs432); 

								Operand3a op = symTab.lookup((IDENT16!=null?IDENT16.getText():null));
								if (op != null) {
									if(exp.type instanceof ArrayType) {
										Errors.incompatibleTypes(IDENT16, Type.INT, exp.type, null);
										System.exit(1);
									}
									
									if(op.type instanceof ArrayType){
										Errors.incompatibleTypes(IDENT16, Type.INT, op.type, null);
										System.exit(1);
									}
									
									Type ty           = Type.INT;
									Code3a cod        = new Code3a();
									VarSymbol temp    = new VarSymbol((IDENT16!=null?IDENT16.getText():null));
									ExpAttribute exp1 = new ExpAttribute(ty, cod, temp);
									code = Code3aGenerator.genAssign(exp, exp1);
								}
								else {
									Errors.unknownIdentifier(IDENT16, (IDENT16!=null?IDENT16.getText():null), null);
									System.exit(1);
								}
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:200:4: array_elem[symTab, exp]
					{
					pushFollow(FOLLOW_array_elem_in_statement_lhs441);
					array_elem17=array_elem(symTab, exp);
					state._fsp--;


								code = array_elem17.code;
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "statement_lhs"



	// $ANTLR start "expression"
	// ./src/VSLTreeParser.g:206:1: expression[SymbolTable symTab] returns [ExpAttribute expAtt] : ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] );
	public final ExpAttribute expression(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		ExpAttribute e1 =null;
		ExpAttribute e2 =null;
		ExpAttribute pe =null;

		try {
			// ./src/VSLTreeParser.g:207:2: ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] )
			int alt9=5;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt9=1;
				}
				break;
			case MINUS:
				{
				alt9=2;
				}
				break;
			case MUL:
				{
				alt9=3;
				}
				break;
			case DIV:
				{
				alt9=4;
				}
				break;
			case IDENT:
			case INTEGER:
			case ARELEM:
			case FCALL:
				{
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// ./src/VSLTreeParser.g:207:4: ^( PLUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression464); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression468);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression473);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								Type ty        = TypeCheck.checkBinOp(e1.type, e2.type);
								VarSymbol temp = SymbDistrib.newTemp();
								Code3a cod     = Code3aGenerator.genBinOp(Inst3a.TAC.ADD, e1, e2, temp);
								expAtt         = new ExpAttribute(ty, cod, temp);
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:214:4: ^( MINUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression485); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression489);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression494);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								Type ty        = TypeCheck.checkBinOp(e1.type, e2.type);
								VarSymbol temp = SymbDistrib.newTemp();
								Code3a cod     = Code3aGenerator.genBinOp(Inst3a.TAC.SUB, e1, e2, temp);
								expAtt         = new ExpAttribute(ty, cod, temp);
							
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:221:4: ^( MUL e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MUL,FOLLOW_MUL_in_expression506); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression510);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression515);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								Type ty        = TypeCheck.checkBinOp(e1.type, e2.type);
								VarSymbol temp = SymbDistrib.newTemp();
								Code3a cod     = Code3aGenerator.genBinOp(Inst3a.TAC.MUL, e1, e2, temp);
								expAtt         = new ExpAttribute(ty, cod, temp);
							
					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:228:4: ^( DIV e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,DIV,FOLLOW_DIV_in_expression527); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression531);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression536);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								Type ty        = TypeCheck.checkBinOp(e1.type, e2.type);
								VarSymbol temp = SymbDistrib.newTemp();
								Code3a cod     = Code3aGenerator.genBinOp(Inst3a.TAC.DIV, e1, e2, temp);
								expAtt         = new ExpAttribute(ty, cod, temp);
							
					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:235:4: pe= primary_exp[symTab]
					{
					pushFollow(FOLLOW_primary_exp_in_expression549);
					pe=primary_exp(symTab);
					state._fsp--;


								expAtt = pe;
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expAtt;
	}
	// $ANTLR end "expression"



	// $ANTLR start "primary_exp"
	// ./src/VSLTreeParser.g:241:1: primary_exp[SymbolTable symTab] returns [ExpAttribute expAtt] : ( INTEGER | IDENT | ^( FCALL IDENT argument_list[symTab, null] ) | array_elem[symTab, null] );
	public final ExpAttribute primary_exp(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree INTEGER18=null;
		CommonTree IDENT19=null;
		CommonTree IDENT20=null;
		Code3a argument_list21 =null;
		ExpAttribute array_elem22 =null;

		try {
			// ./src/VSLTreeParser.g:242:2: ( INTEGER | IDENT | ^( FCALL IDENT argument_list[symTab, null] ) | array_elem[symTab, null] )
			int alt10=4;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt10=1;
				}
				break;
			case IDENT:
				{
				alt10=2;
				}
				break;
			case FCALL:
				{
				alt10=3;
				}
				break;
			case ARELEM:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// ./src/VSLTreeParser.g:242:4: INTEGER
					{
					INTEGER18=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_primary_exp571); 

								ConstSymbol cs = new ConstSymbol(Integer.parseInt((INTEGER18!=null?INTEGER18.getText():null)));
								expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:247:4: IDENT
					{
					IDENT19=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary_exp580); 

								Operand3a id = symTab.lookup((IDENT19!=null?IDENT19.getText():null));
								if (id != null) {
									expAtt = new ExpAttribute(id.type, new Code3a(), id);
								}
								else {
									Errors.unknownIdentifier(IDENT19, (IDENT19!=null?IDENT19.getText():null), null);
									System.exit(1);
								}
							
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:258:4: ^( FCALL IDENT argument_list[symTab, null] )
					{
					match(input,FCALL,FOLLOW_FCALL_in_primary_exp590); 
					match(input, Token.DOWN, null); 
					IDENT20=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary_exp592); 
					pushFollow(FOLLOW_argument_list_in_primary_exp594);
					argument_list21=argument_list(symTab, null);
					state._fsp--;

					match(input, Token.UP, null); 


								Operand3a op = symTab.lookup((IDENT20!=null?IDENT20.getText():null));
								if (op != null && op instanceof FunctionSymbol) {
									FunctionSymbol fs = (FunctionSymbol)op;

									if (((FunctionType)fs.type).getReturnType() != Type.VOID) {
										VarSymbol temp = SymbDistrib.newTemp();
										Code3a code = Code3aGenerator.genVar(temp);
										code.append(Code3aGenerator.genCallReturn(argument_list21, new VarSymbol((IDENT20!=null?IDENT20.getText():null)), temp));
										expAtt = new ExpAttribute(new FunctionType(fs.type), code, temp);
									}
									else {
										Errors.incompatibleTypes(IDENT20, Type.INT, ((FunctionType)fs.type).getReturnType(), null);
										System.exit(1);
									}
								} else {
									Errors.unknownIdentifier(IDENT20, (IDENT20!=null?IDENT20.getText():null), null);
									System.exit(1);
								}
							
					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:279:7: array_elem[symTab, null]
					{
					pushFollow(FOLLOW_array_elem_in_primary_exp608);
					array_elem22=array_elem(symTab, null);
					state._fsp--;


					                        expAtt = array_elem22;
					                
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expAtt;
	}
	// $ANTLR end "primary_exp"



	// $ANTLR start "block"
	// ./src/VSLTreeParser.g:285:1: block[SymbolTable symTab] returns [Code3a code] : ( ^( BLOCK decl_block= declaration[symTab] inst_block= inst_list[symTab] ) | ^( BLOCK inst_block2= inst_list[symTab] ) );
	public final Code3a block(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a decl_block =null;
		Code3a inst_block =null;
		Code3a inst_block2 =null;

		try {
			// ./src/VSLTreeParser.g:286:2: ( ^( BLOCK decl_block= declaration[symTab] inst_block= inst_list[symTab] ) | ^( BLOCK inst_block2= inst_list[symTab] ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BLOCK) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==DOWN) ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2==DECL) ) {
						alt11=1;
					}
					else if ( (LA11_2==INST) ) {
						alt11=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// ./src/VSLTreeParser.g:286:4: ^( BLOCK decl_block= declaration[symTab] inst_block= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block645); 
					symTab.enterScope();
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_declaration_in_block651);
					decl_block=declaration(symTab);
					state._fsp--;

					pushFollow(FOLLOW_inst_list_in_block656);
					inst_block=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								code = decl_block;
								code.append(inst_block);
								symTab.leaveScope();
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:292:4: ^( BLOCK inst_block2= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block668); 
					symTab.enterScope();
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_inst_list_in_block674);
					inst_block2=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								code = inst_block2;
								symTab.leaveScope();
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "block"



	// $ANTLR start "declaration"
	// ./src/VSLTreeParser.g:299:1: declaration[SymbolTable symTab] returns [Code3a code] : ^( DECL (di= decl_item[symTab] )+ ) ;
	public final Code3a declaration(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a di =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:301:2: ( ^( DECL (di= decl_item[symTab] )+ ) )
			// ./src/VSLTreeParser.g:301:4: ^( DECL (di= decl_item[symTab] )+ )
			{
			match(input,DECL,FOLLOW_DECL_in_declaration704); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:301:11: (di= decl_item[symTab] )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==IDENT||LA12_0==ARDECL) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ./src/VSLTreeParser.g:301:12: di= decl_item[symTab]
					{
					pushFollow(FOLLOW_decl_item_in_declaration709);
					di=decl_item(symTab);
					state._fsp--;


								code.append(di);
							
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "decl_item"
	// ./src/VSLTreeParser.g:308:1: decl_item[SymbolTable symTab] returns [Code3a code] : ( IDENT | ^( ARDECL IDENT INTEGER ) );
	public final Code3a decl_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT23=null;
		CommonTree IDENT24=null;
		CommonTree INTEGER25=null;

		try {
			// ./src/VSLTreeParser.g:309:2: ( IDENT | ^( ARDECL IDENT INTEGER ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IDENT) ) {
				alt13=1;
			}
			else if ( (LA13_0==ARDECL) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// ./src/VSLTreeParser.g:309:4: IDENT
					{
					IDENT23=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item736); 

								VarSymbol vOld = (VarSymbol)symTab.lookup((IDENT23!=null?IDENT23.getText():null));
								
								if(vOld != null && vOld.getScope() == symTab.getScope()) {
									Errors.redefinedIdentifier(IDENT23, (IDENT23!=null?IDENT23.getText():null), null);
									System.exit(1);
								}
								
								VarSymbol v = new VarSymbol(Type.INT, (IDENT23!=null?IDENT23.getText():null), symTab.getScope());
								symTab.insert((IDENT23!=null?IDENT23.getText():null), v);
								code = Code3aGenerator.genVar(v);
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:322:4: ^( ARDECL IDENT INTEGER )
					{
					match(input,ARDECL,FOLLOW_ARDECL_in_decl_item746); 
					match(input, Token.DOWN, null); 
					IDENT24=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item748); 
					INTEGER25=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_decl_item750); 
					match(input, Token.UP, null); 


								VarSymbol vOld = (VarSymbol)symTab.lookup((IDENT24!=null?IDENT24.getText():null));
								
								if(vOld != null && vOld.getScope() == symTab.getScope()) {
									Errors.redefinedIdentifier(IDENT24, (IDENT24!=null?IDENT24.getText():null), null);
									System.exit(1);
								}
								
								ArrayType t = new ArrayType(Type.INT, Integer.parseInt((INTEGER25!=null?INTEGER25.getText():null)));
								VarSymbol v = new VarSymbol(t, (IDENT24!=null?IDENT24.getText():null), symTab.getScope());
								symTab.insert((IDENT24!=null?IDENT24.getText():null), v);
								code = Code3aGenerator.genVar(v);
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "decl_item"



	// $ANTLR start "inst_list"
	// ./src/VSLTreeParser.g:338:1: inst_list[SymbolTable symTab] returns [Code3a code] : ^( INST (st= statement[symTab] )* ) ;
	public final Code3a inst_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a st =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:340:2: ( ^( INST (st= statement[symTab] )* ) )
			// ./src/VSLTreeParser.g:340:4: ^( INST (st= statement[symTab] )* )
			{
			match(input,INST,FOLLOW_INST_in_inst_list779); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./src/VSLTreeParser.g:340:11: (st= statement[symTab] )*
				loop14:
				while (true) {
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ASSIGN_KW||LA14_0==IF_KW||LA14_0==PRINT_KW||(LA14_0 >= READ_KW && LA14_0 <= RETURN_KW)||LA14_0==WHILE_KW||LA14_0==BLOCK||LA14_0==FCALL_S) ) {
						alt14=1;
					}

					switch (alt14) {
					case 1 :
						// ./src/VSLTreeParser.g:340:12: st= statement[symTab]
						{
						pushFollow(FOLLOW_statement_in_inst_list784);
						st=statement(symTab);
						state._fsp--;

						code.append(st);
						}
						break;

					default :
						break loop14;
					}
				}

				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "inst_list"



	// $ANTLR start "argument_list"
	// ./src/VSLTreeParser.g:344:1: argument_list[SymbolTable symTab, FunctionType t] returns [Code3a code] : ( expression[symTab] )* ;
	public final Code3a argument_list(SymbolTable symTab, FunctionType t) throws RecognitionException {
		Code3a code = null;


		ExpAttribute expression26 =null;

		try {
			// ./src/VSLTreeParser.g:345:2: ( ( expression[symTab] )* )
			// ./src/VSLTreeParser.g:345:4: ( expression[symTab] )*
			{
			// ./src/VSLTreeParser.g:345:4: ( expression[symTab] )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||LA15_0==IDENT||LA15_0==INTEGER||(LA15_0 >= MINUS && LA15_0 <= MUL)||LA15_0==PLUS||LA15_0==ARELEM||LA15_0==FCALL) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ./src/VSLTreeParser.g:345:5: expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_argument_list809);
					expression26=expression(symTab);
					state._fsp--;


								code = Code3aGenerator.genFuncArguments(expression26);
								if(t != null) {
									if(expression26.place.type == Type.I_CONST) // isCompatible will fail if we don't do this
										t.extend(Type.INT);
									else
										t.extend(expression26.place.type);
								}
							
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "argument_list"



	// $ANTLR start "print_list"
	// ./src/VSLTreeParser.g:358:1: print_list[SymbolTable symTab] returns [Code3a code] : ( print_item[symTab] )+ ;
	public final Code3a print_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a print_item27 =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:360:2: ( ( print_item[symTab] )+ )
			// ./src/VSLTreeParser.g:360:4: ( print_item[symTab] )+
			{
			// ./src/VSLTreeParser.g:360:4: ( print_item[symTab] )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==DIV||LA16_0==IDENT||LA16_0==INTEGER||(LA16_0 >= MINUS && LA16_0 <= MUL)||LA16_0==PLUS||LA16_0==TEXT||LA16_0==ARELEM||LA16_0==FCALL) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ./src/VSLTreeParser.g:360:5: print_item[symTab]
					{
					pushFollow(FOLLOW_print_item_in_print_list842);
					print_item27=print_item(symTab);
					state._fsp--;


								code.append(print_item27);
							
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "print_list"



	// $ANTLR start "print_item"
	// ./src/VSLTreeParser.g:367:1: print_item[SymbolTable symTab] returns [Code3a code] : ( TEXT | expression[symTab] );
	public final Code3a print_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree TEXT28=null;
		ExpAttribute expression29 =null;

		try {
			// ./src/VSLTreeParser.g:368:2: ( TEXT | expression[symTab] )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==TEXT) ) {
				alt17=1;
			}
			else if ( (LA17_0==DIV||LA17_0==IDENT||LA17_0==INTEGER||(LA17_0 >= MINUS && LA17_0 <= MUL)||LA17_0==PLUS||LA17_0==ARELEM||LA17_0==FCALL) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// ./src/VSLTreeParser.g:368:4: TEXT
					{
					TEXT28=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_print_item868); 

					    	Data3a data = new Data3a((TEXT28!=null?TEXT28.getText():null));
							code = Code3aGenerator.genPrintText(data);
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:372:7: expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_print_item877);
					expression29=expression(symTab);
					state._fsp--;


					    	code = Code3aGenerator.genPrintExpression(expression29);
					    
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "print_item"



	// $ANTLR start "read_list"
	// ./src/VSLTreeParser.g:377:1: read_list[SymbolTable symTab] returns [Code3a code] : ( read_item[symTab] )+ ;
	public final Code3a read_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a read_item30 =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:379:2: ( ( read_item[symTab] )+ )
			// ./src/VSLTreeParser.g:379:4: ( read_item[symTab] )+
			{
			// ./src/VSLTreeParser.g:379:4: ( read_item[symTab] )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==IDENT||LA18_0==ARELEM) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// ./src/VSLTreeParser.g:379:5: read_item[symTab]
					{
					pushFollow(FOLLOW_read_item_in_read_list907);
					read_item30=read_item(symTab);
					state._fsp--;


								code.append(read_item30);
							
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "read_list"



	// $ANTLR start "read_item"
	// ./src/VSLTreeParser.g:385:1: read_item[SymbolTable symTab] returns [Code3a code] : ( IDENT | array_elem[symTab, null] );
	public final Code3a read_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT31=null;

		try {
			// ./src/VSLTreeParser.g:386:2: ( IDENT | array_elem[symTab, null] )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==IDENT) ) {
				alt19=1;
			}
			else if ( (LA19_0==ARELEM) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// ./src/VSLTreeParser.g:386:4: IDENT
					{
					IDENT31=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_read_item932); 

					    	VarSymbol v = (VarSymbol)symTab.lookup((IDENT31!=null?IDENT31.getText():null));
					    	if(v != null) {
					    		code = Code3aGenerator.genRead(v);
					    	} else {
								Errors.unknownIdentifier(IDENT31, (IDENT31!=null?IDENT31.getText():null), null);
								System.exit(1);
					    	}
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:395:4: array_elem[symTab, null]
					{
					pushFollow(FOLLOW_array_elem_in_read_item939);
					array_elem(symTab, null);
					state._fsp--;


						
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "read_item"



	// $ANTLR start "array_elem"
	// ./src/VSLTreeParser.g:400:1: array_elem[SymbolTable symTab, ExpAttribute exp] returns [ExpAttribute expAtt] : ^( ARELEM IDENT expression[symTab] ) ;
	public final ExpAttribute array_elem(SymbolTable symTab, ExpAttribute exp) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree IDENT32=null;
		ExpAttribute expression33 =null;

		try {
			// ./src/VSLTreeParser.g:401:2: ( ^( ARELEM IDENT expression[symTab] ) )
			// ./src/VSLTreeParser.g:401:4: ^( ARELEM IDENT expression[symTab] )
			{
			match(input,ARELEM,FOLLOW_ARELEM_in_array_elem962); 
			match(input, Token.DOWN, null); 
			IDENT32=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_array_elem964); 
			pushFollow(FOLLOW_expression_in_array_elem966);
			expression33=expression(symTab);
			state._fsp--;

			match(input, Token.UP, null); 


					if(exp != null) { // Affectation
						VarSymbol v = new VarSymbol((IDENT32!=null?IDENT32.getText():null));
						Code3a c = Code3aGenerator.genArrayAssignment(exp, v, expression33);
						expAtt = new ExpAttribute(Type.INT, c, v);
					} else {
						VarSymbol v   = new VarSymbol((IDENT32!=null?IDENT32.getText():null));
						VarSymbol tmp = SymbDistrib.newTemp();
						Code3a c = Code3aGenerator.genArrayAccess(tmp, v, expression33);
						expAtt = new ExpAttribute(Type.INT, c, tmp);
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expAtt;
	}
	// $ANTLR end "array_elem"

	// Delegated rules



	public static final BitSet FOLLOW_PROG_in_s60 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unit_in_s63 = new BitSet(new long[]{0x0000000008002008L});
	public static final BitSet FOLLOW_function_in_unit86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_proto_in_unit94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_KW_in_function113 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_function115 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_function123 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_param_list_in_function129 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_BODY_in_function133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_function137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROTO_KW_in_proto162 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_proto164 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_proto168 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_param_list_in_proto174 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_KW_in_type198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_KW_in_type207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_in_param_list224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_param_in_param_list227 = new BitSet(new long[]{0x0000010000004008L});
	public static final BitSet FOLLOW_IDENT_in_param243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_param252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_param254 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_KW_in_statement276 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement280 = new BitSet(new long[]{0x0000008000004000L});
	public static final BitSet FOLLOW_statement_lhs_in_statement283 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_KW_in_statement295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement297 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_KW_in_statement309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement315 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement320 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_statement_in_statement326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_KW_in_statement340 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement344 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement349 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FCALL_S_in_statement361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement363 = new BitSet(new long[]{0x0000108002C14208L});
	public static final BitSet FOLLOW_argument_list_in_statement367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_KW_in_statement382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_print_list_in_statement384 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_KW_in_statement396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_read_list_in_statement398 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_statement410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_statement_lhs432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_elem_in_statement_lhs441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expression464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression468 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_expression473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression489 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_expression494 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_in_expression506 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression510 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_expression515 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression527 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression531 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_expression536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primary_exp_in_expression549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_primary_exp571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primary_exp580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FCALL_in_primary_exp590 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_primary_exp592 = new BitSet(new long[]{0x0000108002C14208L});
	public static final BitSet FOLLOW_argument_list_in_primary_exp594 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_array_elem_in_primary_exp608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block645 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_block651 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_inst_list_in_block656 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block668 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inst_list_in_block674 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_declaration704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_item_in_declaration709 = new BitSet(new long[]{0x0000004000004008L});
	public static final BitSet FOLLOW_IDENT_in_decl_item736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARDECL_in_decl_item746 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_decl_item748 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_INTEGER_in_decl_item750 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INST_in_inst_list779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_inst_list784 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_expression_in_argument_list809 = new BitSet(new long[]{0x0000108002C14202L});
	public static final BitSet FOLLOW_print_item_in_print_list842 = new BitSet(new long[]{0x0000108202C14202L});
	public static final BitSet FOLLOW_TEXT_in_print_item868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_print_item877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_item_in_read_list907 = new BitSet(new long[]{0x0000008000004002L});
	public static final BitSet FOLLOW_IDENT_in_read_item932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_elem_in_read_item939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARELEM_in_array_elem962 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_array_elem964 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_array_elem966 = new BitSet(new long[]{0x0000000000000008L});
}
