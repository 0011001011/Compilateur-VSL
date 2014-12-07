// $ANTLR 3.5 ./src/VSLTreeParser.g 2014-12-07 14:44:18

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
			                
			IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_function139); 
			symTab.enterScope();
			pushFollow(FOLLOW_param_list_in_function145);
			param_list(symTab, t);
			state._fsp--;

			match(input,BODY,FOLLOW_BODY_in_function149); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_function153);
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
								System.err.println("La fonction " + (IDENT4!=null?IDENT4.getText():null) + " est déjà déclarée");
								System.exit(1);
							}
							
							if(!fs.type.isCompatible((Type)t)) {
								System.err.println("La fonction " + (IDENT4!=null?IDENT4.getText():null) + " n'est pas compatible avec le prototype.");
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
	// ./src/VSLTreeParser.g:60:1: proto[SymbolTable symTab] : ^( PROTO_KW type IDENT pl= param_list[symTab, t] ) ;
	public final void proto(SymbolTable symTab) throws RecognitionException {
		CommonTree IDENT6=null;
		Type type5 =null;

		try {
			// ./src/VSLTreeParser.g:61:2: ( ^( PROTO_KW type IDENT pl= param_list[symTab, t] ) )
			// ./src/VSLTreeParser.g:61:4: ^( PROTO_KW type IDENT pl= param_list[symTab, t] )
			{
			match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto177); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_proto179);
			type5=type();
			state._fsp--;

			 
			                    FunctionType t = new FunctionType(type5, true);	 
			                
			IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_proto183); 
			symTab.enterScope();
			pushFollow(FOLLOW_param_list_in_proto189);
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
							System.err.println("La fonction " + (IDENT6!=null?IDENT6.getText():null) + " est déjà déclarée.");
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
	// ./src/VSLTreeParser.g:77:1: type returns [Type type_ret] : ( INT_KW | VOID_KW );
	public final Type type() throws RecognitionException {
		Type type_ret = null;


		try {
			// ./src/VSLTreeParser.g:78:2: ( INT_KW | VOID_KW )
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
					// ./src/VSLTreeParser.g:78:4: INT_KW
					{
					match(input,INT_KW,FOLLOW_INT_KW_in_type212); 

								type_ret = Type.INT;
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:82:4: VOID_KW
					{
					match(input,VOID_KW,FOLLOW_VOID_KW_in_type221); 

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
	// ./src/VSLTreeParser.g:88:1: param_list[SymbolTable symTab, FunctionType type] : ^( PARAM ( param[symTab, type] )* ) ;
	public final void param_list(SymbolTable symTab, FunctionType type) throws RecognitionException {
		try {
			// ./src/VSLTreeParser.g:89:2: ( ^( PARAM ( param[symTab, type] )* ) )
			// ./src/VSLTreeParser.g:89:4: ^( PARAM ( param[symTab, type] )* )
			{
			match(input,PARAM,FOLLOW_PARAM_in_param_list238); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./src/VSLTreeParser.g:89:12: ( param[symTab, type] )*
				loop4:
				while (true) {
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==IDENT||LA4_0==ARRAY) ) {
						alt4=1;
					}

					switch (alt4) {
					case 1 :
						// ./src/VSLTreeParser.g:89:13: param[symTab, type]
						{
						pushFollow(FOLLOW_param_in_param_list241);
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
	// ./src/VSLTreeParser.g:92:1: param[SymbolTable symTab, FunctionType type] : ( IDENT | ^( ARRAY IDENT ) );
	public final void param(SymbolTable symTab, FunctionType type) throws RecognitionException {
		CommonTree IDENT7=null;
		CommonTree IDENT8=null;

		try {
			// ./src/VSLTreeParser.g:93:2: ( IDENT | ^( ARRAY IDENT ) )
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
					// ./src/VSLTreeParser.g:93:4: IDENT
					{
					IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param257); 

							if (symTab.lookup((IDENT7!=null?IDENT7.getText():null)) == null) {
								VarSymbol vs = new VarSymbol(Type.INT, (IDENT7!=null?IDENT7.getText():null), symTab.getScope());
								vs.setParam();
								symTab.insert((IDENT7!=null?IDENT7.getText():null), vs);
								type.extend(Type.INT);
							}
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:102:4: ^( ARRAY IDENT )
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_param266); 
					match(input, Token.DOWN, null); 
					IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param268); 
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
	// ./src/VSLTreeParser.g:114:1: statement[SymbolTable symTab] returns [Code3a code] : ( ^( ASSIGN_KW e= expression[symTab] statement_lhs[symTab, $e.expAtt] ) | ^( RETURN_KW expression[symTab] ) | ^( IF_KW if_cond= expression[symTab] if_st= statement[symTab] (else_st= statement[symTab] )? ) | ^( WHILE_KW wh_cond= expression[symTab] while_st= statement[symTab] ) | ^( FCALL_S IDENT argument_list[symTab, t] ) | ^( PRINT_KW print_list[symTab] ) | ^( READ_KW read_list[symTab] ) |code_sequence= block[symTab] );
	public final Code3a statement(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT11=null;
		ExpAttribute e =null;
		ExpAttribute if_cond =null;
		Code3a if_st =null;
		Code3a else_st =null;
		ExpAttribute wh_cond =null;
		Code3a while_st =null;
		Code3a code_sequence =null;
		Code3a statement_lhs9 =null;
		ExpAttribute expression10 =null;
		Code3a argument_list12 =null;
		Code3a print_list13 =null;
		Code3a read_list14 =null;

		try {
			// ./src/VSLTreeParser.g:115:2: ( ^( ASSIGN_KW e= expression[symTab] statement_lhs[symTab, $e.expAtt] ) | ^( RETURN_KW expression[symTab] ) | ^( IF_KW if_cond= expression[symTab] if_st= statement[symTab] (else_st= statement[symTab] )? ) | ^( WHILE_KW wh_cond= expression[symTab] while_st= statement[symTab] ) | ^( FCALL_S IDENT argument_list[symTab, t] ) | ^( PRINT_KW print_list[symTab] ) | ^( READ_KW read_list[symTab] ) |code_sequence= block[symTab] )
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
					// ./src/VSLTreeParser.g:115:4: ^( ASSIGN_KW e= expression[symTab] statement_lhs[symTab, $e.expAtt] )
					{
					match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement290); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement294);
					e=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_lhs_in_statement297);
					statement_lhs9=statement_lhs(symTab, e);
					state._fsp--;

					match(input, Token.UP, null); 


								code = statement_lhs9;
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:119:4: ^( RETURN_KW expression[symTab] )
					{
					match(input,RETURN_KW,FOLLOW_RETURN_KW_in_statement309); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement311);
					expression10=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								code = Code3aGenerator.genReturn(expression10);
							
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:123:4: ^( IF_KW if_cond= expression[symTab] if_st= statement[symTab] (else_st= statement[symTab] )? )
					{
					match(input,IF_KW,FOLLOW_IF_KW_in_statement323); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement329);
					if_cond=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement334);
					if_st=statement(symTab);
					state._fsp--;

					// ./src/VSLTreeParser.g:123:65: (else_st= statement[symTab] )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ASSIGN_KW||LA6_0==IF_KW||LA6_0==PRINT_KW||(LA6_0 >= READ_KW && LA6_0 <= RETURN_KW)||LA6_0==WHILE_KW||LA6_0==BLOCK||LA6_0==FCALL_S) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// ./src/VSLTreeParser.g:123:66: else_st= statement[symTab]
							{
							pushFollow(FOLLOW_statement_in_statement340);
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
					// ./src/VSLTreeParser.g:132:4: ^( WHILE_KW wh_cond= expression[symTab] while_st= statement[symTab] )
					{
					match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement354); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement358);
					wh_cond=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement363);
					while_st=statement(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								code = Code3aGenerator.genWhile(wh_cond, while_st);
							
					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:136:4: ^( FCALL_S IDENT argument_list[symTab, t] )
					{
					match(input,FCALL_S,FOLLOW_FCALL_S_in_statement375); 
					match(input, Token.DOWN, null); 
					IDENT11=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement377); 
					FunctionType t = new FunctionType(Type.VOID, false);
					pushFollow(FOLLOW_argument_list_in_statement381);
					argument_list12=argument_list(symTab, t);
					state._fsp--;

					match(input, Token.UP, null); 


								Operand3a op = symTab.lookup((IDENT11!=null?IDENT11.getText():null));
								if(op != null && op instanceof FunctionSymbol) {
									FunctionSymbol fs = (FunctionSymbol)op;
									if (((FunctionType)fs.type).getReturnType() == Type.VOID) {
										VarSymbol vs = new VarSymbol((IDENT11!=null?IDENT11.getText():null));
										code = Code3aGenerator.genCall(argument_list12, vs);
									}
									else {
										System.err.println("Erreur : fonction " + (IDENT11!=null?IDENT11.getText():null) + " non declare.");
										System.exit(1);
									}
									
									if(!fs.type.isCompatible((Type)t)) {
										System.err.println("Erreur : fonction " + (IDENT11!=null?IDENT11.getText():null) + " non compatible avec la définition.");
										System.exit(1);				
									}
								}
							
					}
					break;
				case 6 :
					// ./src/VSLTreeParser.g:156:7: ^( PRINT_KW print_list[symTab] )
					{
					match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement396); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_print_list_in_statement398);
					print_list13=print_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code = print_list13;
					    
					}
					break;
				case 7 :
					// ./src/VSLTreeParser.g:159:7: ^( READ_KW read_list[symTab] )
					{
					match(input,READ_KW,FOLLOW_READ_KW_in_statement410); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_read_list_in_statement412);
					read_list14=read_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code = read_list14;
					    
					}
					break;
				case 8 :
					// ./src/VSLTreeParser.g:162:4: code_sequence= block[symTab]
					{
					pushFollow(FOLLOW_block_in_statement424);
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
	// ./src/VSLTreeParser.g:168:1: statement_lhs[SymbolTable symTab, ExpAttribute exp] returns [Code3a code] : ( IDENT | array_elem[symTab, exp] );
	public final Code3a statement_lhs(SymbolTable symTab, ExpAttribute exp) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT15=null;
		ExpAttribute array_elem16 =null;

		try {
			// ./src/VSLTreeParser.g:169:2: ( IDENT | array_elem[symTab, exp] )
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
					// ./src/VSLTreeParser.g:169:4: IDENT
					{
					IDENT15=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement_lhs446); 

					                        Operand3a op = symTab.lookup((IDENT15!=null?IDENT15.getText():null));
								if (op != null) {
					                                if(!(exp.type instanceof ArrayType) && !(op.type instanceof ArrayType)) {
					                                    Type ty           = Type.INT;
					                                    Code3a cod        = new Code3a();
					                                    VarSymbol temp    = new VarSymbol((IDENT15!=null?IDENT15.getText():null));
					                                    ExpAttribute exp1 = new ExpAttribute(ty, cod, temp);
					                                    code = Code3aGenerator.genAssign(exp, exp1);
					                                } else {
					                                    System.err.println("Erreur : assignation de mauvais types.");
					                                    System.exit(1);
					                                }
								}
								else {
									System.err.println("Erreur : ident " + (IDENT15!=null?IDENT15.getText():null) + " non declare");
									System.exit(1);
								}
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:189:4: array_elem[symTab, exp]
					{
					pushFollow(FOLLOW_array_elem_in_statement_lhs455);
					array_elem16=array_elem(symTab, exp);
					state._fsp--;


					                        code = array_elem16.code;
							
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
	// ./src/VSLTreeParser.g:195:1: expression[SymbolTable symTab] returns [ExpAttribute expAtt] : ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] );
	public final ExpAttribute expression(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		ExpAttribute e1 =null;
		ExpAttribute e2 =null;
		ExpAttribute pe =null;

		try {
			// ./src/VSLTreeParser.g:196:2: ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] )
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
					// ./src/VSLTreeParser.g:196:4: ^( PLUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression478); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression482);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression487);
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
					// ./src/VSLTreeParser.g:203:4: ^( MINUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression499); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression503);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression508);
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
					// ./src/VSLTreeParser.g:210:4: ^( MUL e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MUL,FOLLOW_MUL_in_expression520); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression524);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression529);
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
					// ./src/VSLTreeParser.g:217:4: ^( DIV e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,DIV,FOLLOW_DIV_in_expression541); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression545);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression550);
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
					// ./src/VSLTreeParser.g:224:4: pe= primary_exp[symTab]
					{
					pushFollow(FOLLOW_primary_exp_in_expression563);
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
	// ./src/VSLTreeParser.g:230:1: primary_exp[SymbolTable symTab] returns [ExpAttribute expAtt] : ( INTEGER | IDENT | ^( FCALL IDENT argument_list[symTab, null] ) | array_elem[symTab, null] );
	public final ExpAttribute primary_exp(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree INTEGER17=null;
		CommonTree IDENT18=null;
		CommonTree IDENT19=null;
		Code3a argument_list20 =null;
		ExpAttribute array_elem21 =null;

		try {
			// ./src/VSLTreeParser.g:231:2: ( INTEGER | IDENT | ^( FCALL IDENT argument_list[symTab, null] ) | array_elem[symTab, null] )
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
					// ./src/VSLTreeParser.g:231:4: INTEGER
					{
					INTEGER17=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_primary_exp585); 

								ConstSymbol cs = new ConstSymbol(Integer.parseInt((INTEGER17!=null?INTEGER17.getText():null)));
								expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:236:4: IDENT
					{
					IDENT18=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary_exp594); 

								Operand3a id = symTab.lookup((IDENT18!=null?IDENT18.getText():null));
								if (id != null) {
									expAtt = new ExpAttribute(id.type, new Code3a(), id);
								}
								else {
									System.err.println("Erreur : ident " + (IDENT18!=null?IDENT18.getText():null) + " non declare");
									System.exit(1);
								}
							
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:247:4: ^( FCALL IDENT argument_list[symTab, null] )
					{
					match(input,FCALL,FOLLOW_FCALL_in_primary_exp604); 
					match(input, Token.DOWN, null); 
					IDENT19=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary_exp606); 
					pushFollow(FOLLOW_argument_list_in_primary_exp608);
					argument_list20=argument_list(symTab, null);
					state._fsp--;

					match(input, Token.UP, null); 


								Operand3a op = symTab.lookup((IDENT19!=null?IDENT19.getText():null));
								if (op != null && op instanceof FunctionSymbol) {
									FunctionSymbol fs = (FunctionSymbol)op;

									if (((FunctionType)fs.type).getReturnType() != Type.VOID) {
										VarSymbol temp = SymbDistrib.newTemp();
										Code3a code = Code3aGenerator.genVar(temp);
										code.append(Code3aGenerator.genCallReturn(argument_list20, new VarSymbol((IDENT19!=null?IDENT19.getText():null)), temp));
										expAtt = new ExpAttribute(new FunctionType(fs.type), code, temp);
									}
									else {
										System.err.println("Erreur : types de retour différents entre la déclaration et la définition de la fonction " + (IDENT19!=null?IDENT19.getText():null));
										System.exit(1);
									}
								} else {
									System.err.println("Erreur : fonction " + (IDENT19!=null?IDENT19.getText():null) + " non declaree");
									System.exit(1);
								}
							
					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:268:7: array_elem[symTab, null]
					{
					pushFollow(FOLLOW_array_elem_in_primary_exp622);
					array_elem21=array_elem(symTab, null);
					state._fsp--;


					                        expAtt = array_elem21;
					                
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
	// ./src/VSLTreeParser.g:274:1: block[SymbolTable symTab] returns [Code3a code] : ( ^( BLOCK decl_block= declaration[symTab] inst_block= inst_list[symTab] ) | ^( BLOCK inst_block2= inst_list[symTab] ) );
	public final Code3a block(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a decl_block =null;
		Code3a inst_block =null;
		Code3a inst_block2 =null;

		try {
			// ./src/VSLTreeParser.g:275:2: ( ^( BLOCK decl_block= declaration[symTab] inst_block= inst_list[symTab] ) | ^( BLOCK inst_block2= inst_list[symTab] ) )
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
					// ./src/VSLTreeParser.g:275:4: ^( BLOCK decl_block= declaration[symTab] inst_block= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block659); 
					symTab.enterScope();
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_declaration_in_block665);
					decl_block=declaration(symTab);
					state._fsp--;

					pushFollow(FOLLOW_inst_list_in_block670);
					inst_block=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								code = decl_block;
								code.append(inst_block);
								symTab.leaveScope();
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:281:4: ^( BLOCK inst_block2= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block682); 
					symTab.enterScope();
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_inst_list_in_block688);
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
	// ./src/VSLTreeParser.g:288:1: declaration[SymbolTable symTab] returns [Code3a code] : ^( DECL (di= decl_item[symTab] )+ ) ;
	public final Code3a declaration(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a di =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:290:2: ( ^( DECL (di= decl_item[symTab] )+ ) )
			// ./src/VSLTreeParser.g:290:4: ^( DECL (di= decl_item[symTab] )+ )
			{
			match(input,DECL,FOLLOW_DECL_in_declaration718); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:290:11: (di= decl_item[symTab] )+
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
					// ./src/VSLTreeParser.g:290:12: di= decl_item[symTab]
					{
					pushFollow(FOLLOW_decl_item_in_declaration723);
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
	// ./src/VSLTreeParser.g:297:1: decl_item[SymbolTable symTab] returns [Code3a code] : ( IDENT | ^( ARDECL IDENT INTEGER ) );
	public final Code3a decl_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT22=null;
		CommonTree INTEGER23=null;
		CommonTree IDENT24=null;

		try {
			// ./src/VSLTreeParser.g:298:2: ( IDENT | ^( ARDECL IDENT INTEGER ) )
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
					// ./src/VSLTreeParser.g:298:4: IDENT
					{
					IDENT22=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item750); 

					                        VarSymbol v = new VarSymbol(Type.INT, (IDENT22!=null?IDENT22.getText():null), symTab.getScope());
					                        symTab.insert((IDENT22!=null?IDENT22.getText():null), v);
					                        code = Code3aGenerator.genVar(v);
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:304:4: ^( ARDECL IDENT INTEGER )
					{
					match(input,ARDECL,FOLLOW_ARDECL_in_decl_item760); 
					match(input, Token.DOWN, null); 
					IDENT24=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item762); 
					INTEGER23=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_decl_item764); 
					match(input, Token.UP, null); 


						    		ArrayType t = new ArrayType(Type.INT, Integer.parseInt((INTEGER23!=null?INTEGER23.getText():null)));
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
	// ./src/VSLTreeParser.g:313:1: inst_list[SymbolTable symTab] returns [Code3a code] : ^( INST (st= statement[symTab] )* ) ;
	public final Code3a inst_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a st =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:315:2: ( ^( INST (st= statement[symTab] )* ) )
			// ./src/VSLTreeParser.g:315:4: ^( INST (st= statement[symTab] )* )
			{
			match(input,INST,FOLLOW_INST_in_inst_list793); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./src/VSLTreeParser.g:315:11: (st= statement[symTab] )*
				loop14:
				while (true) {
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ASSIGN_KW||LA14_0==IF_KW||LA14_0==PRINT_KW||(LA14_0 >= READ_KW && LA14_0 <= RETURN_KW)||LA14_0==WHILE_KW||LA14_0==BLOCK||LA14_0==FCALL_S) ) {
						alt14=1;
					}

					switch (alt14) {
					case 1 :
						// ./src/VSLTreeParser.g:315:12: st= statement[symTab]
						{
						pushFollow(FOLLOW_statement_in_inst_list798);
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
	// ./src/VSLTreeParser.g:319:1: argument_list[SymbolTable symTab, FunctionType t] returns [Code3a code] : ( expression[symTab] )* ;
	public final Code3a argument_list(SymbolTable symTab, FunctionType t) throws RecognitionException {
		Code3a code = null;


		ExpAttribute expression25 =null;

		try {
			// ./src/VSLTreeParser.g:320:2: ( ( expression[symTab] )* )
			// ./src/VSLTreeParser.g:320:4: ( expression[symTab] )*
			{
			// ./src/VSLTreeParser.g:320:4: ( expression[symTab] )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||LA15_0==IDENT||LA15_0==INTEGER||(LA15_0 >= MINUS && LA15_0 <= MUL)||LA15_0==PLUS||LA15_0==ARELEM||LA15_0==FCALL) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ./src/VSLTreeParser.g:320:5: expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_argument_list823);
					expression25=expression(symTab);
					state._fsp--;


								code = Code3aGenerator.genFuncArguments(expression25);
								if(t != null)
					                            t.extend(expression25.place.type);
							
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
	// ./src/VSLTreeParser.g:329:1: print_list[SymbolTable symTab] returns [Code3a code] : ( print_item[symTab] )+ ;
	public final Code3a print_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a print_item26 =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:331:2: ( ( print_item[symTab] )+ )
			// ./src/VSLTreeParser.g:331:4: ( print_item[symTab] )+
			{
			// ./src/VSLTreeParser.g:331:4: ( print_item[symTab] )+
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
					// ./src/VSLTreeParser.g:331:5: print_item[symTab]
					{
					pushFollow(FOLLOW_print_item_in_print_list856);
					print_item26=print_item(symTab);
					state._fsp--;


								code.append(print_item26);
							
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
	// ./src/VSLTreeParser.g:338:1: print_item[SymbolTable symTab] returns [Code3a code] : ( TEXT | expression[symTab] );
	public final Code3a print_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree TEXT27=null;
		ExpAttribute expression28 =null;

		try {
			// ./src/VSLTreeParser.g:339:2: ( TEXT | expression[symTab] )
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
					// ./src/VSLTreeParser.g:339:4: TEXT
					{
					TEXT27=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_print_item882); 

					    	Data3a data = new Data3a((TEXT27!=null?TEXT27.getText():null));
							code = Code3aGenerator.genPrintText(data);
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:343:7: expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_print_item891);
					expression28=expression(symTab);
					state._fsp--;


					    	code = Code3aGenerator.genPrintExpression(expression28);
					    
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
	// ./src/VSLTreeParser.g:348:1: read_list[SymbolTable symTab] returns [Code3a code] : ( read_item[symTab] )+ ;
	public final Code3a read_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a read_item29 =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:350:2: ( ( read_item[symTab] )+ )
			// ./src/VSLTreeParser.g:350:4: ( read_item[symTab] )+
			{
			// ./src/VSLTreeParser.g:350:4: ( read_item[symTab] )+
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
					// ./src/VSLTreeParser.g:350:5: read_item[symTab]
					{
					pushFollow(FOLLOW_read_item_in_read_list921);
					read_item29=read_item(symTab);
					state._fsp--;


								code.append(read_item29);
							
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
	// ./src/VSLTreeParser.g:356:1: read_item[SymbolTable symTab] returns [Code3a code] : ( IDENT | array_elem[symTab, null] );
	public final Code3a read_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT30=null;

		try {
			// ./src/VSLTreeParser.g:357:2: ( IDENT | array_elem[symTab, null] )
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
					// ./src/VSLTreeParser.g:357:4: IDENT
					{
					IDENT30=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_read_item946); 

					    	VarSymbol v = (VarSymbol)symTab.lookup((IDENT30!=null?IDENT30.getText():null));
					    	if(v != null) {
					    		code = Code3aGenerator.genRead(v);
					    	} else {
					                System.err.println("Erreur : ident " + (IDENT30!=null?IDENT30.getText():null) + " non declaré");
					                System.exit(1);
					    	}
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:366:4: array_elem[symTab, null]
					{
					pushFollow(FOLLOW_array_elem_in_read_item953);
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
	// ./src/VSLTreeParser.g:371:1: array_elem[SymbolTable symTab, ExpAttribute exp] returns [ExpAttribute expAtt] : ^( ARELEM IDENT expression[symTab] ) ;
	public final ExpAttribute array_elem(SymbolTable symTab, ExpAttribute exp) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree IDENT31=null;
		ExpAttribute expression32 =null;

		try {
			// ./src/VSLTreeParser.g:372:2: ( ^( ARELEM IDENT expression[symTab] ) )
			// ./src/VSLTreeParser.g:372:4: ^( ARELEM IDENT expression[symTab] )
			{
			match(input,ARELEM,FOLLOW_ARELEM_in_array_elem976); 
			match(input, Token.DOWN, null); 
			IDENT31=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_array_elem978); 
			pushFollow(FOLLOW_expression_in_array_elem980);
			expression32=expression(symTab);
			state._fsp--;

			match(input, Token.UP, null); 


					if(exp != null) { // Affectation
						VarSymbol v = new VarSymbol((IDENT31!=null?IDENT31.getText():null));
						Code3a c = Code3aGenerator.genArrayAssignment(exp, v, expression32);
						expAtt = new ExpAttribute(Type.INT, c, v);
					} else {
						VarSymbol v   = new VarSymbol((IDENT31!=null?IDENT31.getText():null));
						VarSymbol tmp = SymbDistrib.newTemp();
						Code3a c = Code3aGenerator.genArrayAccess(tmp, v, expression32);
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
	public static final BitSet FOLLOW_IDENT_in_function139 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_param_list_in_function145 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_BODY_in_function149 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_function153 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROTO_KW_in_proto177 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_proto179 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_proto183 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_param_list_in_proto189 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_KW_in_type212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_KW_in_type221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_in_param_list238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_param_in_param_list241 = new BitSet(new long[]{0x0000010000004008L});
	public static final BitSet FOLLOW_IDENT_in_param257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_param266 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_param268 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_KW_in_statement290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement294 = new BitSet(new long[]{0x0000008000004000L});
	public static final BitSet FOLLOW_statement_lhs_in_statement297 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_KW_in_statement309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement311 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_KW_in_statement323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement329 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement334 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_statement_in_statement340 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_KW_in_statement354 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement358 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FCALL_S_in_statement375 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement377 = new BitSet(new long[]{0x0000108002C14208L});
	public static final BitSet FOLLOW_argument_list_in_statement381 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_KW_in_statement396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_print_list_in_statement398 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_KW_in_statement410 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_read_list_in_statement412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_statement424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_statement_lhs446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_elem_in_statement_lhs455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expression478 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression482 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_expression487 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression503 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_expression508 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_in_expression520 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression524 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_expression529 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression545 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_expression550 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primary_exp_in_expression563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_primary_exp585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primary_exp594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FCALL_in_primary_exp604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_primary_exp606 = new BitSet(new long[]{0x0000108002C14208L});
	public static final BitSet FOLLOW_argument_list_in_primary_exp608 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_array_elem_in_primary_exp622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_block665 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_inst_list_in_block670 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inst_list_in_block688 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_declaration718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_item_in_declaration723 = new BitSet(new long[]{0x0000004000004008L});
	public static final BitSet FOLLOW_IDENT_in_decl_item750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARDECL_in_decl_item760 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_decl_item762 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_INTEGER_in_decl_item764 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INST_in_inst_list793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_inst_list798 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_expression_in_argument_list823 = new BitSet(new long[]{0x0000108002C14202L});
	public static final BitSet FOLLOW_print_item_in_print_list856 = new BitSet(new long[]{0x0000108202C14202L});
	public static final BitSet FOLLOW_TEXT_in_print_item882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_print_item891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_item_in_read_list921 = new BitSet(new long[]{0x0000008000004002L});
	public static final BitSet FOLLOW_IDENT_in_read_item946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_elem_in_read_item953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARELEM_in_array_elem976 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_array_elem978 = new BitSet(new long[]{0x0000108002C14200L});
	public static final BitSet FOLLOW_expression_in_array_elem980 = new BitSet(new long[]{0x0000000000000008L});
}
