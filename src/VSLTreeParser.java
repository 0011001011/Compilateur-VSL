// $ANTLR 3.5 ./src/VSLTreeParser.g 2014-11-25 15:04:21

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
	// ./src/VSLTreeParser.g:25:1: function[SymbolTable symTab] returns [Code3a code] : ^( FUNC_KW type IDENT pl= param_list[symTab] ^( BODY body= statement[symTab] ) ) ;
	public final Code3a function(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT3=null;
		Code3a body =null;
		Type type4 =null;

		try {
			// ./src/VSLTreeParser.g:26:2: ( ^( FUNC_KW type IDENT pl= param_list[symTab] ^( BODY body= statement[symTab] ) ) )
			// ./src/VSLTreeParser.g:26:4: ^( FUNC_KW type IDENT pl= param_list[symTab] ^( BODY body= statement[symTab] ) )
			{
			match(input,FUNC_KW,FOLLOW_FUNC_KW_in_function113); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_function115);
			type4=type();
			state._fsp--;

			IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_function117); 
			pushFollow(FOLLOW_param_list_in_function121);
			param_list(symTab);
			state._fsp--;

			match(input,BODY,FOLLOW_BODY_in_function125); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_function129);
			body=statement(symTab);
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 


						Operand3a op = symTab.lookup((IDENT3!=null?IDENT3.getText():null));
						if (op == null) { // pas de proto déclaré
							LabelSymbol label = new LabelSymbol((IDENT3!=null?IDENT3.getText():null));
							FunctionType t    = new FunctionType(type4);
							FunctionSymbol fs = new FunctionSymbol(label, t);
							symTab.insert((IDENT3!=null?IDENT3.getText():null), fs);
						}
						else if(op instanceof FunctionSymbol) {
							FunctionSymbol fs = (FunctionSymbol)op;
							if (((FunctionType)fs.type).getReturnType() != type4) {
								System.err.println("La fonction " + (IDENT3!=null?IDENT3.getText():null) + " est déclarée sous un autre type.");
								System.exit(1);
							}
						}

						code = new Code3a();
						VarSymbol var = new VarSymbol((IDENT3!=null?IDENT3.getText():null));
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
	// ./src/VSLTreeParser.g:51:1: proto[SymbolTable symTab] : ^( PROTO_KW type IDENT pl= param_list[symTab] ) ;
	public final void proto(SymbolTable symTab) throws RecognitionException {
		CommonTree IDENT5=null;
		Type type6 =null;

		try {
			// ./src/VSLTreeParser.g:52:2: ( ^( PROTO_KW type IDENT pl= param_list[symTab] ) )
			// ./src/VSLTreeParser.g:52:4: ^( PROTO_KW type IDENT pl= param_list[symTab] )
			{
			match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto150); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_proto152);
			type6=type();
			state._fsp--;

			IDENT5=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_proto154); 
			pushFollow(FOLLOW_param_list_in_proto158);
			param_list(symTab);
			state._fsp--;

			match(input, Token.UP, null); 


						if(symTab.lookup((IDENT5!=null?IDENT5.getText():null)) == null) {
							LabelSymbol label = new LabelSymbol((IDENT5!=null?IDENT5.getText():null));
							FunctionType t    = new FunctionType(type6);
							FunctionSymbol fs = new FunctionSymbol(label, t);
							symTab.insert((IDENT5!=null?IDENT5.getText():null), fs);
						}
						else {
							System.err.println("La fonction " + (IDENT5!=null?IDENT5.getText():null) + " est déjà déclarée.");
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
	// ./src/VSLTreeParser.g:67:1: type returns [Type type_ret] : ( INT_KW | VOID_KW );
	public final Type type() throws RecognitionException {
		Type type_ret = null;


		try {
			// ./src/VSLTreeParser.g:68:2: ( INT_KW | VOID_KW )
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
					// ./src/VSLTreeParser.g:68:4: INT_KW
					{
					match(input,INT_KW,FOLLOW_INT_KW_in_type179); 

								type_ret = Type.INT;
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:72:4: VOID_KW
					{
					match(input,VOID_KW,FOLLOW_VOID_KW_in_type188); 

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
	// ./src/VSLTreeParser.g:78:1: param_list[SymbolTable symTab] : ^( PARAM ( param[symTab] )* ) ;
	public final void param_list(SymbolTable symTab) throws RecognitionException {
		try {
			// ./src/VSLTreeParser.g:79:2: ( ^( PARAM ( param[symTab] )* ) )
			// ./src/VSLTreeParser.g:79:4: ^( PARAM ( param[symTab] )* )
			{
			match(input,PARAM,FOLLOW_PARAM_in_param_list205); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./src/VSLTreeParser.g:79:12: ( param[symTab] )*
				loop4:
				while (true) {
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==IDENT||LA4_0==ARRAY) ) {
						alt4=1;
					}

					switch (alt4) {
					case 1 :
						// ./src/VSLTreeParser.g:79:13: param[symTab]
						{
						pushFollow(FOLLOW_param_in_param_list208);
						param(symTab);
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
	// ./src/VSLTreeParser.g:82:1: param[SymbolTable symTab] : ( IDENT | ^( ARRAY IDENT ) );
	public final void param(SymbolTable symTab) throws RecognitionException {
		CommonTree IDENT7=null;
		CommonTree IDENT8=null;

		try {
			// ./src/VSLTreeParser.g:83:2: ( IDENT | ^( ARRAY IDENT ) )
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
					// ./src/VSLTreeParser.g:83:4: IDENT
					{
					IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param224); 

							if (symTab.lookup((IDENT7!=null?IDENT7.getText():null)) == null) {
								VarSymbol vs = new VarSymbol(Type.INT, (IDENT7!=null?IDENT7.getText():null), symTab.getScope());
								vs.setParam();
								symTab.insert((IDENT7!=null?IDENT7.getText():null), vs);
							}
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:91:4: ^( ARRAY IDENT )
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_param233); 
					match(input, Token.DOWN, null); 
					IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param235); 
					match(input, Token.UP, null); 


							if(symTab.lookup((IDENT8!=null?IDENT8.getText():null)) == null) {
								ArrayType t = new ArrayType(Type.INT, 0);
								VarSymbol vs = new VarSymbol(Type.INT, (IDENT8!=null?IDENT8.getText():null), symTab.getScope());
								vs.setParam();
								symTab.insert((IDENT8!=null?IDENT8.getText():null), vs);
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
	// ./src/VSLTreeParser.g:102:1: statement[SymbolTable symTab] returns [Code3a code] : ( ^( ASSIGN_KW e= expression[symTab] IDENT ) | ^( RETURN_KW expression[symTab] ) | ^( IF_KW if_cond= expression[symTab] if_st= statement[symTab] (else_st= statement[symTab] )? ) | ^( WHILE_KW wh_cond= expression[symTab] while_st= statement[symTab] ) | ^( FCALL_S IDENT argument_list[symTab] ) | ^( PRINT_KW print_list[symTab] ) | ^( READ_KW read_list[symTab] ) |code_sequence= block[symTab] );
	public final Code3a statement(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT9=null;
		CommonTree IDENT11=null;
		ExpAttribute e =null;
		ExpAttribute if_cond =null;
		Code3a if_st =null;
		Code3a else_st =null;
		ExpAttribute wh_cond =null;
		Code3a while_st =null;
		Code3a code_sequence =null;
		ExpAttribute expression10 =null;
		Code3a argument_list12 =null;
		Code3a print_list13 =null;
		Code3a read_list14 =null;

		try {
			// ./src/VSLTreeParser.g:103:2: ( ^( ASSIGN_KW e= expression[symTab] IDENT ) | ^( RETURN_KW expression[symTab] ) | ^( IF_KW if_cond= expression[symTab] if_st= statement[symTab] (else_st= statement[symTab] )? ) | ^( WHILE_KW wh_cond= expression[symTab] while_st= statement[symTab] ) | ^( FCALL_S IDENT argument_list[symTab] ) | ^( PRINT_KW print_list[symTab] ) | ^( READ_KW read_list[symTab] ) |code_sequence= block[symTab] )
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
					// ./src/VSLTreeParser.g:103:4: ^( ASSIGN_KW e= expression[symTab] IDENT )
					{
					match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement257); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement261);
					e=expression(symTab);
					state._fsp--;

					IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement264); 
					match(input, Token.UP, null); 


								if (symTab.lookup((IDENT9!=null?IDENT9.getText():null)) != null) {
									Type ty           = Type.INT;
									Code3a cod        = new Code3a();
									VarSymbol temp    = new VarSymbol((IDENT9!=null?IDENT9.getText():null));
									ExpAttribute exp1 = new ExpAttribute(ty, cod, temp);
									code              = Code3aGenerator.genAssign(e, exp1);
								}
								else {
									System.err.println("Erreur : ident " + (IDENT9!=null?IDENT9.getText():null) + " non declare");
									System.exit(1);
								}
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:117:4: ^( RETURN_KW expression[symTab] )
					{
					match(input,RETURN_KW,FOLLOW_RETURN_KW_in_statement275); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement277);
					expression10=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								code = Code3aGenerator.genReturn(expression10);
							
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:121:4: ^( IF_KW if_cond= expression[symTab] if_st= statement[symTab] (else_st= statement[symTab] )? )
					{
					match(input,IF_KW,FOLLOW_IF_KW_in_statement289); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement295);
					if_cond=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement300);
					if_st=statement(symTab);
					state._fsp--;

					// ./src/VSLTreeParser.g:121:65: (else_st= statement[symTab] )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ASSIGN_KW||LA6_0==IF_KW||LA6_0==PRINT_KW||(LA6_0 >= READ_KW && LA6_0 <= RETURN_KW)||LA6_0==WHILE_KW||LA6_0==BLOCK||LA6_0==FCALL_S) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// ./src/VSLTreeParser.g:121:66: else_st= statement[symTab]
							{
							pushFollow(FOLLOW_statement_in_statement306);
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
					// ./src/VSLTreeParser.g:130:4: ^( WHILE_KW wh_cond= expression[symTab] while_st= statement[symTab] )
					{
					match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement320); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement324);
					wh_cond=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement329);
					while_st=statement(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								code = Code3aGenerator.genWhile(wh_cond, while_st);
							
					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:134:4: ^( FCALL_S IDENT argument_list[symTab] )
					{
					match(input,FCALL_S,FOLLOW_FCALL_S_in_statement341); 
					match(input, Token.DOWN, null); 
					IDENT11=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement343); 
					pushFollow(FOLLOW_argument_list_in_statement345);
					argument_list12=argument_list(symTab);
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
										System.err.println("Erreur : fonction " + (IDENT11!=null?IDENT11.getText():null) + " non declare");
										System.exit(1);
									}
								}
							
					}
					break;
				case 6 :
					// ./src/VSLTreeParser.g:149:7: ^( PRINT_KW print_list[symTab] )
					{
					match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement360); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_print_list_in_statement362);
					print_list13=print_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code = print_list13;
					    
					}
					break;
				case 7 :
					// ./src/VSLTreeParser.g:152:7: ^( READ_KW read_list[symTab] )
					{
					match(input,READ_KW,FOLLOW_READ_KW_in_statement374); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_read_list_in_statement376);
					read_list14=read_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code = read_list14;
					    
					}
					break;
				case 8 :
					// ./src/VSLTreeParser.g:155:4: code_sequence= block[symTab]
					{
					pushFollow(FOLLOW_block_in_statement388);
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



	// $ANTLR start "expression"
	// ./src/VSLTreeParser.g:161:1: expression[SymbolTable symTab] returns [ExpAttribute expAtt] : ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] );
	public final ExpAttribute expression(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		ExpAttribute e1 =null;
		ExpAttribute e2 =null;
		ExpAttribute pe =null;

		try {
			// ./src/VSLTreeParser.g:162:2: ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) |pe= primary_exp[symTab] )
			int alt8=5;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt8=1;
				}
				break;
			case MINUS:
				{
				alt8=2;
				}
				break;
			case MUL:
				{
				alt8=3;
				}
				break;
			case DIV:
				{
				alt8=4;
				}
				break;
			case IDENT:
			case INTEGER:
			case FCALL:
				{
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// ./src/VSLTreeParser.g:162:4: ^( PLUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression411); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression415);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression420);
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
					// ./src/VSLTreeParser.g:169:4: ^( MINUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression432); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression436);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression441);
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
					// ./src/VSLTreeParser.g:176:4: ^( MUL e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MUL,FOLLOW_MUL_in_expression453); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression457);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression462);
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
					// ./src/VSLTreeParser.g:183:4: ^( DIV e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,DIV,FOLLOW_DIV_in_expression474); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression478);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression483);
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
					// ./src/VSLTreeParser.g:190:4: pe= primary_exp[symTab]
					{
					pushFollow(FOLLOW_primary_exp_in_expression496);
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
	// ./src/VSLTreeParser.g:196:1: primary_exp[SymbolTable symTab] returns [ExpAttribute expAtt] : ( INTEGER | IDENT | ^( FCALL IDENT argument_list[symTab] ) );
	public final ExpAttribute primary_exp(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree INTEGER15=null;
		CommonTree IDENT16=null;
		CommonTree IDENT17=null;
		Code3a argument_list18 =null;

		try {
			// ./src/VSLTreeParser.g:197:2: ( INTEGER | IDENT | ^( FCALL IDENT argument_list[symTab] ) )
			int alt9=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt9=1;
				}
				break;
			case IDENT:
				{
				alt9=2;
				}
				break;
			case FCALL:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// ./src/VSLTreeParser.g:197:4: INTEGER
					{
					INTEGER15=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_primary_exp518); 

								ConstSymbol cs = new ConstSymbol(Integer.parseInt((INTEGER15!=null?INTEGER15.getText():null)));
								expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:202:4: IDENT
					{
					IDENT16=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary_exp527); 

								Operand3a id = symTab.lookup((IDENT16!=null?IDENT16.getText():null));
								if (id != null) {
									expAtt = new ExpAttribute(id.type, new Code3a(), id);
								}
								else {
									System.err.println("Erreur : ident " + (IDENT16!=null?IDENT16.getText():null) + " non declare");
									System.exit(1);
								}
							
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:213:4: ^( FCALL IDENT argument_list[symTab] )
					{
					match(input,FCALL,FOLLOW_FCALL_in_primary_exp537); 
					match(input, Token.DOWN, null); 
					IDENT17=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary_exp539); 
					pushFollow(FOLLOW_argument_list_in_primary_exp541);
					argument_list18=argument_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								Operand3a op = symTab.lookup((IDENT17!=null?IDENT17.getText():null));
								if (op != null && op instanceof FunctionSymbol) {
									FunctionSymbol fs = (FunctionSymbol)op;

									if (((FunctionType)fs.type).getReturnType() != Type.VOID) {
										VarSymbol temp = SymbDistrib.newTemp();
										Code3a code = Code3aGenerator.genVar(temp);
										code.append(Code3aGenerator.genCallReturn(argument_list18,
											new VarSymbol((IDENT17!=null?IDENT17.getText():null)), temp));
										expAtt = new ExpAttribute(new FunctionType(fs.type), code, temp);
									}
									else {
										System.err.println("Erreur : types de retour différents entre la déclaration et la définition de la fonction " + (IDENT17!=null?IDENT17.getText():null));
										System.exit(1);
									}
								} else {
									System.err.println("Erreur : fonction " + (IDENT17!=null?IDENT17.getText():null) + " non declaree");
									System.exit(1);
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
		return expAtt;
	}
	// $ANTLR end "primary_exp"



	// $ANTLR start "block"
	// ./src/VSLTreeParser.g:237:1: block[SymbolTable symTab] returns [Code3a code] : ( ^( BLOCK decl_block= declaration[symTab] inst_block= inst_list[symTab] ) | ^( BLOCK inst_block2= inst_list[symTab] ) );
	public final Code3a block(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a decl_block =null;
		Code3a inst_block =null;
		Code3a inst_block2 =null;

		try {
			// ./src/VSLTreeParser.g:238:2: ( ^( BLOCK decl_block= declaration[symTab] inst_block= inst_list[symTab] ) | ^( BLOCK inst_block2= inst_list[symTab] ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BLOCK) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==DOWN) ) {
					int LA10_2 = input.LA(3);
					if ( (LA10_2==DECL) ) {
						alt10=1;
					}
					else if ( (LA10_2==INST) ) {
						alt10=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
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
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// ./src/VSLTreeParser.g:238:4: ^( BLOCK decl_block= declaration[symTab] inst_block= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block565); 
					symTab.enterScope();
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_declaration_in_block571);
					decl_block=declaration(symTab);
					state._fsp--;

					pushFollow(FOLLOW_inst_list_in_block576);
					inst_block=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


								code = decl_block;
								code.append(inst_block);
								symTab.leaveScope();
							
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:244:4: ^( BLOCK inst_block2= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block588); 
					symTab.enterScope();
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_inst_list_in_block594);
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
	// ./src/VSLTreeParser.g:251:1: declaration[SymbolTable symTab] returns [Code3a code] : ^( DECL (di= decl_item[symTab] )+ ) ;
	public final Code3a declaration(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a di =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:253:2: ( ^( DECL (di= decl_item[symTab] )+ ) )
			// ./src/VSLTreeParser.g:253:4: ^( DECL (di= decl_item[symTab] )+ )
			{
			match(input,DECL,FOLLOW_DECL_in_declaration624); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:253:11: (di= decl_item[symTab] )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==IDENT) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ./src/VSLTreeParser.g:253:12: di= decl_item[symTab]
					{
					pushFollow(FOLLOW_decl_item_in_declaration629);
					di=decl_item(symTab);
					state._fsp--;


								code.append(di);
							
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
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
	// ./src/VSLTreeParser.g:260:1: decl_item[SymbolTable symTab] returns [Code3a code] : IDENT ;
	public final Code3a decl_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT19=null;

		try {
			// ./src/VSLTreeParser.g:261:2: ( IDENT )
			// ./src/VSLTreeParser.g:261:4: IDENT
			{
			IDENT19=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item656); 

						if (symTab.lookup((IDENT19!=null?IDENT19.getText():null)) == null) {
							VarSymbol v = new VarSymbol(Type.INT, (IDENT19!=null?IDENT19.getText():null), symTab.getScope());
							symTab.insert((IDENT19!=null?IDENT19.getText():null), v);
							code        = Code3aGenerator.genVar(v);
						}
						else {
							System.err.println("Erreur : ident " + (IDENT19!=null?IDENT19.getText():null) + " deja declare");
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
		return code;
	}
	// $ANTLR end "decl_item"



	// $ANTLR start "inst_list"
	// ./src/VSLTreeParser.g:275:1: inst_list[SymbolTable symTab] returns [Code3a code] : ^( INST (st= statement[symTab] )* ) ;
	public final Code3a inst_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a st =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:277:2: ( ^( INST (st= statement[symTab] )* ) )
			// ./src/VSLTreeParser.g:277:4: ^( INST (st= statement[symTab] )* )
			{
			match(input,INST,FOLLOW_INST_in_inst_list684); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./src/VSLTreeParser.g:277:11: (st= statement[symTab] )*
				loop12:
				while (true) {
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ASSIGN_KW||LA12_0==IF_KW||LA12_0==PRINT_KW||(LA12_0 >= READ_KW && LA12_0 <= RETURN_KW)||LA12_0==WHILE_KW||LA12_0==BLOCK||LA12_0==FCALL_S) ) {
						alt12=1;
					}

					switch (alt12) {
					case 1 :
						// ./src/VSLTreeParser.g:277:12: st= statement[symTab]
						{
						pushFollow(FOLLOW_statement_in_inst_list689);
						st=statement(symTab);
						state._fsp--;

						code.append(st);
						}
						break;

					default :
						break loop12;
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
	// ./src/VSLTreeParser.g:281:1: argument_list[SymbolTable symTab] returns [Code3a code] : ( expression[symTab] )+ ;
	public final Code3a argument_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		ExpAttribute expression20 =null;

		try {
			// ./src/VSLTreeParser.g:282:2: ( ( expression[symTab] )+ )
			// ./src/VSLTreeParser.g:282:4: ( expression[symTab] )+
			{
			// ./src/VSLTreeParser.g:282:4: ( expression[symTab] )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIV||LA13_0==IDENT||LA13_0==INTEGER||(LA13_0 >= MINUS && LA13_0 <= MUL)||LA13_0==PLUS||LA13_0==FCALL) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ./src/VSLTreeParser.g:282:5: expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_argument_list714);
					expression20=expression(symTab);
					state._fsp--;


								code = Code3aGenerator.genFuncArguments(expression20);
							
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
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
	// ./src/VSLTreeParser.g:289:1: print_list[SymbolTable symTab] returns [Code3a code] : ( print_item[symTab] )+ ;
	public final Code3a print_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a print_item21 =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:291:2: ( ( print_item[symTab] )+ )
			// ./src/VSLTreeParser.g:291:4: ( print_item[symTab] )+
			{
			// ./src/VSLTreeParser.g:291:4: ( print_item[symTab] )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIV||LA14_0==IDENT||LA14_0==INTEGER||(LA14_0 >= MINUS && LA14_0 <= MUL)||LA14_0==PLUS||LA14_0==TEXT||LA14_0==FCALL) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ./src/VSLTreeParser.g:291:5: print_item[symTab]
					{
					pushFollow(FOLLOW_print_item_in_print_list747);
					print_item21=print_item(symTab);
					state._fsp--;


								code.append(print_item21);
							
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
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
	// ./src/VSLTreeParser.g:298:1: print_item[SymbolTable symTab] returns [Code3a code] : ( TEXT | expression[symTab] );
	public final Code3a print_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree TEXT22=null;
		ExpAttribute expression23 =null;

		try {
			// ./src/VSLTreeParser.g:299:2: ( TEXT | expression[symTab] )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==TEXT) ) {
				alt15=1;
			}
			else if ( (LA15_0==DIV||LA15_0==IDENT||LA15_0==INTEGER||(LA15_0 >= MINUS && LA15_0 <= MUL)||LA15_0==PLUS||LA15_0==FCALL) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// ./src/VSLTreeParser.g:299:4: TEXT
					{
					TEXT22=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_print_item773); 

					    	Data3a data = new Data3a((TEXT22!=null?TEXT22.getText():null));
							code = Code3aGenerator.genPrintText(data);
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:303:7: expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_print_item782);
					expression23=expression(symTab);
					state._fsp--;


					    	code = Code3aGenerator.genPrintExpression(expression23);
					    
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
	// ./src/VSLTreeParser.g:308:1: read_list[SymbolTable symTab] returns [Code3a code] : ( read_item[symTab] )+ ;
	public final Code3a read_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a read_item24 =null;

		 code = new Code3a(); 
		try {
			// ./src/VSLTreeParser.g:310:2: ( ( read_item[symTab] )+ )
			// ./src/VSLTreeParser.g:310:4: ( read_item[symTab] )+
			{
			// ./src/VSLTreeParser.g:310:4: ( read_item[symTab] )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==IDENT) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ./src/VSLTreeParser.g:310:5: read_item[symTab]
					{
					pushFollow(FOLLOW_read_item_in_read_list812);
					read_item24=read_item(symTab);
					state._fsp--;


								code.append(read_item24);
							
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
	// $ANTLR end "read_list"



	// $ANTLR start "read_item"
	// ./src/VSLTreeParser.g:316:1: read_item[SymbolTable symTab] returns [Code3a code] : IDENT ;
	public final Code3a read_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree IDENT25=null;

		try {
			// ./src/VSLTreeParser.g:317:2: ( IDENT )
			// ./src/VSLTreeParser.g:317:4: IDENT
			{
			IDENT25=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_read_item837); 

			    	VarSymbol v = (VarSymbol)symTab.lookup((IDENT25!=null?IDENT25.getText():null));
			    	if(v != null) {
			    		code = Code3aGenerator.genRead(v);
			    	} else {
						System.err.println("Erreur : ident " + (IDENT25!=null?IDENT25.getText():null) + " non declaré");
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
		return code;
	}
	// $ANTLR end "read_item"

	// Delegated rules



	public static final BitSet FOLLOW_PROG_in_s60 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unit_in_s63 = new BitSet(new long[]{0x0000000008002008L});
	public static final BitSet FOLLOW_function_in_unit86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_proto_in_unit94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_KW_in_function113 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_function115 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_function117 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_param_list_in_function121 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_BODY_in_function125 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_function129 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROTO_KW_in_proto150 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_proto152 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_proto154 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_param_list_in_proto158 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_KW_in_type179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_KW_in_type188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_in_param_list205 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_param_in_param_list208 = new BitSet(new long[]{0x0000010000004008L});
	public static final BitSet FOLLOW_IDENT_in_param224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_param233 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_param235 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_KW_in_statement257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement261 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_statement264 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_KW_in_statement275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_KW_in_statement289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement295 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement300 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_statement_in_statement306 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_KW_in_statement320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement324 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement329 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FCALL_S_in_statement341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement343 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_argument_list_in_statement345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_KW_in_statement360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_print_list_in_statement362 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_KW_in_statement374 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_read_list_in_statement376 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_statement388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expression411 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression415 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression420 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression436 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_in_expression453 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression457 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression462 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression474 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression478 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression483 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primary_exp_in_expression496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_primary_exp518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primary_exp527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FCALL_in_primary_exp537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_primary_exp539 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_argument_list_in_primary_exp541 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_block571 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_inst_list_in_block576 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inst_list_in_block594 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_declaration624 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_item_in_declaration629 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_IDENT_in_decl_item656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INST_in_inst_list684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_inst_list689 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_expression_in_argument_list714 = new BitSet(new long[]{0x0000100002C14202L});
	public static final BitSet FOLLOW_print_item_in_print_list747 = new BitSet(new long[]{0x0000100202C14202L});
	public static final BitSet FOLLOW_TEXT_in_print_item773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_print_item782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_item_in_read_list812 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_IDENT_in_read_item837 = new BitSet(new long[]{0x0000000000000002L});
}
