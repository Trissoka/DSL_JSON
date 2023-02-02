package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'count'", "'('", "')'", "'read'", "'print'", "'writeJSON'", "','", "'writeCSV'", "'remove'", "'add'", "'get'", "'sort'", "'by'", "'show'", "'{'", "'='", "';'", "'}'", "':'", "'['", "']'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_sentences_0_0= ruleFun ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_sentences_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_sentences_0_0= ruleFun ) )* )
            // InternalMyDsl.g:78:2: ( (lv_sentences_0_0= ruleFun ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_sentences_0_0= ruleFun ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=14 && LA1_0<=16)||(LA1_0>=18 && LA1_0<=22)||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_sentences_0_0= ruleFun )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_sentences_0_0= ruleFun )
            	    // InternalMyDsl.g:80:4: lv_sentences_0_0= ruleFun
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getSentencesFunParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_sentences_0_0=ruleFun();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"sentences",
            	    					lv_sentences_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Fun");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFun"
    // InternalMyDsl.g:100:1: entryRuleFun returns [EObject current=null] : iv_ruleFun= ruleFun EOF ;
    public final EObject entryRuleFun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFun = null;


        try {
            // InternalMyDsl.g:100:44: (iv_ruleFun= ruleFun EOF )
            // InternalMyDsl.g:101:2: iv_ruleFun= ruleFun EOF
            {
             newCompositeNode(grammarAccess.getFunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFun=ruleFun();

            state._fsp--;

             current =iv_ruleFun; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // InternalMyDsl.g:107:1: ruleFun returns [EObject current=null] : (this_CountJson_0= ruleCountJson | this_ReadJson_1= ruleReadJson | this_PrintJson_2= rulePrintJson | this_WriteJson_3= ruleWriteJson | this_WriteCSV_4= ruleWriteCSV | this_Remove_5= ruleRemove | this_Add_6= ruleAdd | this_Get_7= ruleGet | this_Sort_8= ruleSort | this_Show_9= ruleShow ) ;
    public final EObject ruleFun() throws RecognitionException {
        EObject current = null;

        EObject this_CountJson_0 = null;

        EObject this_ReadJson_1 = null;

        EObject this_PrintJson_2 = null;

        EObject this_WriteJson_3 = null;

        EObject this_WriteCSV_4 = null;

        EObject this_Remove_5 = null;

        EObject this_Add_6 = null;

        EObject this_Get_7 = null;

        EObject this_Sort_8 = null;

        EObject this_Show_9 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_CountJson_0= ruleCountJson | this_ReadJson_1= ruleReadJson | this_PrintJson_2= rulePrintJson | this_WriteJson_3= ruleWriteJson | this_WriteCSV_4= ruleWriteCSV | this_Remove_5= ruleRemove | this_Add_6= ruleAdd | this_Get_7= ruleGet | this_Sort_8= ruleSort | this_Show_9= ruleShow ) )
            // InternalMyDsl.g:114:2: (this_CountJson_0= ruleCountJson | this_ReadJson_1= ruleReadJson | this_PrintJson_2= rulePrintJson | this_WriteJson_3= ruleWriteJson | this_WriteCSV_4= ruleWriteCSV | this_Remove_5= ruleRemove | this_Add_6= ruleAdd | this_Get_7= ruleGet | this_Sort_8= ruleSort | this_Show_9= ruleShow )
            {
            // InternalMyDsl.g:114:2: (this_CountJson_0= ruleCountJson | this_ReadJson_1= ruleReadJson | this_PrintJson_2= rulePrintJson | this_WriteJson_3= ruleWriteJson | this_WriteCSV_4= ruleWriteCSV | this_Remove_5= ruleRemove | this_Add_6= ruleAdd | this_Get_7= ruleGet | this_Sort_8= ruleSort | this_Show_9= ruleShow )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            case 22:
                {
                alt2=9;
                }
                break;
            case 24:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_CountJson_0= ruleCountJson
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getCountJsonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountJson_0=ruleCountJson();

                    state._fsp--;


                    			current = this_CountJson_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_ReadJson_1= ruleReadJson
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getReadJsonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReadJson_1=ruleReadJson();

                    state._fsp--;


                    			current = this_ReadJson_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:133:3: this_PrintJson_2= rulePrintJson
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getPrintJsonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintJson_2=rulePrintJson();

                    state._fsp--;


                    			current = this_PrintJson_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:142:3: this_WriteJson_3= ruleWriteJson
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getWriteJsonParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WriteJson_3=ruleWriteJson();

                    state._fsp--;


                    			current = this_WriteJson_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:151:3: this_WriteCSV_4= ruleWriteCSV
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getWriteCSVParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_WriteCSV_4=ruleWriteCSV();

                    state._fsp--;


                    			current = this_WriteCSV_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:160:3: this_Remove_5= ruleRemove
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getRemoveParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Remove_5=ruleRemove();

                    state._fsp--;


                    			current = this_Remove_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:169:3: this_Add_6= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getAddParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_6=ruleAdd();

                    state._fsp--;


                    			current = this_Add_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:178:3: this_Get_7= ruleGet
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getGetParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Get_7=ruleGet();

                    state._fsp--;


                    			current = this_Get_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:187:3: this_Sort_8= ruleSort
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getSortParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sort_8=ruleSort();

                    state._fsp--;


                    			current = this_Sort_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:196:3: this_Show_9= ruleShow
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getShowParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Show_9=ruleShow();

                    state._fsp--;


                    			current = this_Show_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleCountJson"
    // InternalMyDsl.g:208:1: entryRuleCountJson returns [EObject current=null] : iv_ruleCountJson= ruleCountJson EOF ;
    public final EObject entryRuleCountJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountJson = null;


        try {
            // InternalMyDsl.g:208:50: (iv_ruleCountJson= ruleCountJson EOF )
            // InternalMyDsl.g:209:2: iv_ruleCountJson= ruleCountJson EOF
            {
             newCompositeNode(grammarAccess.getCountJsonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountJson=ruleCountJson();

            state._fsp--;

             current =iv_ruleCountJson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountJson"


    // $ANTLR start "ruleCountJson"
    // InternalMyDsl.g:215:1: ruleCountJson returns [EObject current=null] : ( ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeString ) ) otherlv_3= ')' ) ;
    public final EObject ruleCountJson() throws RecognitionException {
        EObject current = null;

        Token lv_countJSON_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:221:2: ( ( ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeString ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:222:2: ( ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeString ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:222:2: ( ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeString ) ) otherlv_3= ')' )
            // InternalMyDsl.g:223:3: ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeString ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:223:3: ( (lv_countJSON_0_0= 'count' ) )
            // InternalMyDsl.g:224:4: (lv_countJSON_0_0= 'count' )
            {
            // InternalMyDsl.g:224:4: (lv_countJSON_0_0= 'count' )
            // InternalMyDsl.g:225:5: lv_countJSON_0_0= 'count'
            {
            lv_countJSON_0_0=(Token)match(input,11,FOLLOW_4); 

            					newLeafNode(lv_countJSON_0_0, grammarAccess.getCountJsonAccess().getCountJSONCountKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountJsonRule());
            					}
            					setWithLastConsumed(current, "countJSON", lv_countJSON_0_0, "count");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCountJsonAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:241:3: ( (lv_value_2_0= ruleTypeString ) )
            // InternalMyDsl.g:242:4: (lv_value_2_0= ruleTypeString )
            {
            // InternalMyDsl.g:242:4: (lv_value_2_0= ruleTypeString )
            // InternalMyDsl.g:243:5: lv_value_2_0= ruleTypeString
            {

            					newCompositeNode(grammarAccess.getCountJsonAccess().getValueTypeStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_value_2_0=ruleTypeString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountJsonRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.MyDsl.TypeString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCountJsonAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountJson"


    // $ANTLR start "entryRuleReadJson"
    // InternalMyDsl.g:268:1: entryRuleReadJson returns [EObject current=null] : iv_ruleReadJson= ruleReadJson EOF ;
    public final EObject entryRuleReadJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadJson = null;


        try {
            // InternalMyDsl.g:268:49: (iv_ruleReadJson= ruleReadJson EOF )
            // InternalMyDsl.g:269:2: iv_ruleReadJson= ruleReadJson EOF
            {
             newCompositeNode(grammarAccess.getReadJsonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadJson=ruleReadJson();

            state._fsp--;

             current =iv_ruleReadJson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadJson"


    // $ANTLR start "ruleReadJson"
    // InternalMyDsl.g:275:1: ruleReadJson returns [EObject current=null] : ( ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleReadJson() throws RecognitionException {
        EObject current = null;

        Token lv_readJSON_0_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:281:2: ( ( ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:282:2: ( ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:282:2: ( ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalMyDsl.g:283:3: ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:283:3: ( (lv_readJSON_0_0= 'read' ) )
            // InternalMyDsl.g:284:4: (lv_readJSON_0_0= 'read' )
            {
            // InternalMyDsl.g:284:4: (lv_readJSON_0_0= 'read' )
            // InternalMyDsl.g:285:5: lv_readJSON_0_0= 'read'
            {
            lv_readJSON_0_0=(Token)match(input,14,FOLLOW_4); 

            					newLeafNode(lv_readJSON_0_0, grammarAccess.getReadJsonAccess().getReadJSONReadKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadJsonRule());
            					}
            					setWithLastConsumed(current, "readJSON", lv_readJSON_0_0, "read");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getReadJsonAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:301:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalMyDsl.g:302:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:302:4: (lv_path_2_0= RULE_STRING )
            // InternalMyDsl.g:303:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_path_2_0, grammarAccess.getReadJsonAccess().getPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadJsonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getReadJsonAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadJson"


    // $ANTLR start "entryRulePrintJson"
    // InternalMyDsl.g:327:1: entryRulePrintJson returns [EObject current=null] : iv_rulePrintJson= rulePrintJson EOF ;
    public final EObject entryRulePrintJson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintJson = null;


        try {
            // InternalMyDsl.g:327:50: (iv_rulePrintJson= rulePrintJson EOF )
            // InternalMyDsl.g:328:2: iv_rulePrintJson= rulePrintJson EOF
            {
             newCompositeNode(grammarAccess.getPrintJsonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintJson=rulePrintJson();

            state._fsp--;

             current =iv_rulePrintJson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintJson"


    // $ANTLR start "rulePrintJson"
    // InternalMyDsl.g:334:1: rulePrintJson returns [EObject current=null] : ( ( (lv_printJson_0_0= 'print' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject rulePrintJson() throws RecognitionException {
        EObject current = null;

        Token lv_printJson_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:340:2: ( ( ( (lv_printJson_0_0= 'print' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:341:2: ( ( (lv_printJson_0_0= 'print' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:341:2: ( ( (lv_printJson_0_0= 'print' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalMyDsl.g:342:3: ( (lv_printJson_0_0= 'print' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:342:3: ( (lv_printJson_0_0= 'print' ) )
            // InternalMyDsl.g:343:4: (lv_printJson_0_0= 'print' )
            {
            // InternalMyDsl.g:343:4: (lv_printJson_0_0= 'print' )
            // InternalMyDsl.g:344:5: lv_printJson_0_0= 'print'
            {
            lv_printJson_0_0=(Token)match(input,15,FOLLOW_4); 

            					newLeafNode(lv_printJson_0_0, grammarAccess.getPrintJsonAccess().getPrintJsonPrintKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintJsonRule());
            					}
            					setWithLastConsumed(current, "printJson", lv_printJson_0_0, "print");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintJsonAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:360:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:361:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:361:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:362:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_value_2_0, grammarAccess.getPrintJsonAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintJsonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPrintJsonAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintJson"


    // $ANTLR start "entryRuleWriteJson"
    // InternalMyDsl.g:386:1: entryRuleWriteJson returns [EObject current=null] : iv_ruleWriteJson= ruleWriteJson EOF ;
    public final EObject entryRuleWriteJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteJson = null;


        try {
            // InternalMyDsl.g:386:50: (iv_ruleWriteJson= ruleWriteJson EOF )
            // InternalMyDsl.g:387:2: iv_ruleWriteJson= ruleWriteJson EOF
            {
             newCompositeNode(grammarAccess.getWriteJsonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteJson=ruleWriteJson();

            state._fsp--;

             current =iv_ruleWriteJson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWriteJson"


    // $ANTLR start "ruleWriteJson"
    // InternalMyDsl.g:393:1: ruleWriteJson returns [EObject current=null] : ( ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleWriteJson() throws RecognitionException {
        EObject current = null;

        Token lv_writeJSON_0_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:399:2: ( ( ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:400:2: ( ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:400:2: ( ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:401:3: ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')'
            {
            // InternalMyDsl.g:401:3: ( (lv_writeJSON_0_0= 'writeJSON' ) )
            // InternalMyDsl.g:402:4: (lv_writeJSON_0_0= 'writeJSON' )
            {
            // InternalMyDsl.g:402:4: (lv_writeJSON_0_0= 'writeJSON' )
            // InternalMyDsl.g:403:5: lv_writeJSON_0_0= 'writeJSON'
            {
            lv_writeJSON_0_0=(Token)match(input,16,FOLLOW_4); 

            					newLeafNode(lv_writeJSON_0_0, grammarAccess.getWriteJsonAccess().getWriteJSONWriteJSONKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteJsonRule());
            					}
            					setWithLastConsumed(current, "writeJSON", lv_writeJSON_0_0, "writeJSON");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getWriteJsonAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:419:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalMyDsl.g:420:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:420:4: (lv_path_2_0= RULE_STRING )
            // InternalMyDsl.g:421:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_path_2_0, grammarAccess.getWriteJsonAccess().getPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteJsonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:437:3: (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:438:4: otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getWriteJsonAccess().getCommaKeyword_3_0());
                    			
                    // InternalMyDsl.g:442:4: ( (lv_value_4_0= ruleTypeJSON ) )
                    // InternalMyDsl.g:443:5: (lv_value_4_0= ruleTypeJSON )
                    {
                    // InternalMyDsl.g:443:5: (lv_value_4_0= ruleTypeJSON )
                    // InternalMyDsl.g:444:6: lv_value_4_0= ruleTypeJSON
                    {

                    						newCompositeNode(grammarAccess.getWriteJsonAccess().getValueTypeJSONParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_value_4_0=ruleTypeJSON();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWriteJsonRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydsl.MyDsl.TypeJSON");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWriteJsonAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWriteJson"


    // $ANTLR start "entryRuleWriteCSV"
    // InternalMyDsl.g:470:1: entryRuleWriteCSV returns [EObject current=null] : iv_ruleWriteCSV= ruleWriteCSV EOF ;
    public final EObject entryRuleWriteCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCSV = null;


        try {
            // InternalMyDsl.g:470:49: (iv_ruleWriteCSV= ruleWriteCSV EOF )
            // InternalMyDsl.g:471:2: iv_ruleWriteCSV= ruleWriteCSV EOF
            {
             newCompositeNode(grammarAccess.getWriteCSVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteCSV=ruleWriteCSV();

            state._fsp--;

             current =iv_ruleWriteCSV; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWriteCSV"


    // $ANTLR start "ruleWriteCSV"
    // InternalMyDsl.g:477:1: ruleWriteCSV returns [EObject current=null] : ( ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleWriteCSV() throws RecognitionException {
        EObject current = null;

        Token lv_writeCVS_0_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:483:2: ( ( ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:484:2: ( ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:484:2: ( ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')' )
            // InternalMyDsl.g:485:3: ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )? otherlv_5= ')'
            {
            // InternalMyDsl.g:485:3: ( (lv_writeCVS_0_0= 'writeCSV' ) )
            // InternalMyDsl.g:486:4: (lv_writeCVS_0_0= 'writeCSV' )
            {
            // InternalMyDsl.g:486:4: (lv_writeCVS_0_0= 'writeCSV' )
            // InternalMyDsl.g:487:5: lv_writeCVS_0_0= 'writeCSV'
            {
            lv_writeCVS_0_0=(Token)match(input,18,FOLLOW_4); 

            					newLeafNode(lv_writeCVS_0_0, grammarAccess.getWriteCSVAccess().getWriteCVSWriteCSVKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteCSVRule());
            					}
            					setWithLastConsumed(current, "writeCVS", lv_writeCVS_0_0, "writeCSV");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getWriteCSVAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:503:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalMyDsl.g:504:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:504:4: (lv_path_2_0= RULE_STRING )
            // InternalMyDsl.g:505:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_path_2_0, grammarAccess.getWriteCSVAccess().getPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteCSVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:521:3: (otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:522:4: otherlv_3= ',' ( (lv_value_4_0= ruleTypeJSON ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getWriteCSVAccess().getCommaKeyword_3_0());
                    			
                    // InternalMyDsl.g:526:4: ( (lv_value_4_0= ruleTypeJSON ) )
                    // InternalMyDsl.g:527:5: (lv_value_4_0= ruleTypeJSON )
                    {
                    // InternalMyDsl.g:527:5: (lv_value_4_0= ruleTypeJSON )
                    // InternalMyDsl.g:528:6: lv_value_4_0= ruleTypeJSON
                    {

                    						newCompositeNode(grammarAccess.getWriteCSVAccess().getValueTypeJSONParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_value_4_0=ruleTypeJSON();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWriteCSVRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydsl.MyDsl.TypeJSON");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWriteCSVAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWriteCSV"


    // $ANTLR start "entryRuleRemove"
    // InternalMyDsl.g:554:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalMyDsl.g:554:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalMyDsl.g:555:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalMyDsl.g:561:1: ruleRemove returns [EObject current=null] : ( ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token lv_removeElement_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:567:2: ( ( ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:568:2: ( ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:568:2: ( ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalMyDsl.g:569:3: ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:569:3: ( (lv_removeElement_0_0= 'remove' ) )
            // InternalMyDsl.g:570:4: (lv_removeElement_0_0= 'remove' )
            {
            // InternalMyDsl.g:570:4: (lv_removeElement_0_0= 'remove' )
            // InternalMyDsl.g:571:5: lv_removeElement_0_0= 'remove'
            {
            lv_removeElement_0_0=(Token)match(input,19,FOLLOW_4); 

            					newLeafNode(lv_removeElement_0_0, grammarAccess.getRemoveAccess().getRemoveElementRemoveKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRule());
            					}
            					setWithLastConsumed(current, "removeElement", lv_removeElement_0_0, "remove");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:587:3: ( (lv_id_2_0= RULE_STRING ) )
            // InternalMyDsl.g:588:4: (lv_id_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:588:4: (lv_id_2_0= RULE_STRING )
            // InternalMyDsl.g:589:5: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_id_2_0, grammarAccess.getRemoveAccess().getIdSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRemoveAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDsl.g:613:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalMyDsl.g:613:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalMyDsl.g:614:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDsl.g:620:1: ruleAdd returns [EObject current=null] : ( ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeJSON ) ) otherlv_3= ')' ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token lv_addElement_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:626:2: ( ( ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeJSON ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:627:2: ( ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeJSON ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:627:2: ( ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeJSON ) ) otherlv_3= ')' )
            // InternalMyDsl.g:628:3: ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleTypeJSON ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:628:3: ( (lv_addElement_0_0= 'add' ) )
            // InternalMyDsl.g:629:4: (lv_addElement_0_0= 'add' )
            {
            // InternalMyDsl.g:629:4: (lv_addElement_0_0= 'add' )
            // InternalMyDsl.g:630:5: lv_addElement_0_0= 'add'
            {
            lv_addElement_0_0=(Token)match(input,20,FOLLOW_4); 

            					newLeafNode(lv_addElement_0_0, grammarAccess.getAddAccess().getAddElementAddKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(current, "addElement", lv_addElement_0_0, "add");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:646:3: ( (lv_value_2_0= ruleTypeJSON ) )
            // InternalMyDsl.g:647:4: (lv_value_2_0= ruleTypeJSON )
            {
            // InternalMyDsl.g:647:4: (lv_value_2_0= ruleTypeJSON )
            // InternalMyDsl.g:648:5: lv_value_2_0= ruleTypeJSON
            {

            					newCompositeNode(grammarAccess.getAddAccess().getValueTypeJSONParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_value_2_0=ruleTypeJSON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.MyDsl.TypeJSON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleGet"
    // InternalMyDsl.g:673:1: entryRuleGet returns [EObject current=null] : iv_ruleGet= ruleGet EOF ;
    public final EObject entryRuleGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGet = null;


        try {
            // InternalMyDsl.g:673:44: (iv_ruleGet= ruleGet EOF )
            // InternalMyDsl.g:674:2: iv_ruleGet= ruleGet EOF
            {
             newCompositeNode(grammarAccess.getGetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGet=ruleGet();

            state._fsp--;

             current =iv_ruleGet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGet"


    // $ANTLR start "ruleGet"
    // InternalMyDsl.g:680:1: ruleGet returns [EObject current=null] : ( ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleGet() throws RecognitionException {
        EObject current = null;

        Token lv_getElement_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:686:2: ( ( ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:687:2: ( ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:687:2: ( ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalMyDsl.g:688:3: ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:688:3: ( (lv_getElement_0_0= 'get' ) )
            // InternalMyDsl.g:689:4: (lv_getElement_0_0= 'get' )
            {
            // InternalMyDsl.g:689:4: (lv_getElement_0_0= 'get' )
            // InternalMyDsl.g:690:5: lv_getElement_0_0= 'get'
            {
            lv_getElement_0_0=(Token)match(input,21,FOLLOW_4); 

            					newLeafNode(lv_getElement_0_0, grammarAccess.getGetAccess().getGetElementGetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetRule());
            					}
            					setWithLastConsumed(current, "getElement", lv_getElement_0_0, "get");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGetAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:706:3: ( (lv_id_2_0= RULE_STRING ) )
            // InternalMyDsl.g:707:4: (lv_id_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:707:4: (lv_id_2_0= RULE_STRING )
            // InternalMyDsl.g:708:5: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_id_2_0, grammarAccess.getGetAccess().getIdSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGetAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGet"


    // $ANTLR start "entryRuleSort"
    // InternalMyDsl.g:732:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // InternalMyDsl.g:732:45: (iv_ruleSort= ruleSort EOF )
            // InternalMyDsl.g:733:2: iv_ruleSort= ruleSort EOF
            {
             newCompositeNode(grammarAccess.getSortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSort=ruleSort();

            state._fsp--;

             current =iv_ruleSort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSort"


    // $ANTLR start "ruleSort"
    // InternalMyDsl.g:739:1: ruleSort returns [EObject current=null] : ( ( (lv_sort_0_0= 'sort' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        Token lv_sort_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_attribute_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:745:2: ( ( ( (lv_sort_0_0= 'sort' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:746:2: ( ( (lv_sort_0_0= 'sort' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:746:2: ( ( (lv_sort_0_0= 'sort' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:747:3: ( (lv_sort_0_0= 'sort' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:747:3: ( (lv_sort_0_0= 'sort' ) )
            // InternalMyDsl.g:748:4: (lv_sort_0_0= 'sort' )
            {
            // InternalMyDsl.g:748:4: (lv_sort_0_0= 'sort' )
            // InternalMyDsl.g:749:5: lv_sort_0_0= 'sort'
            {
            lv_sort_0_0=(Token)match(input,22,FOLLOW_5); 

            					newLeafNode(lv_sort_0_0, grammarAccess.getSortAccess().getSortSortKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSortRule());
            					}
            					setWithLastConsumed(current, "sort", lv_sort_0_0, "sort");
            				

            }


            }

            // InternalMyDsl.g:761:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalMyDsl.g:762:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:762:4: (lv_value_1_0= RULE_STRING )
            // InternalMyDsl.g:763:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_value_1_0, grammarAccess.getSortAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSortAccess().getByKeyword_2());
            		
            // InternalMyDsl.g:783:3: ( (lv_attribute_3_0= RULE_STRING ) )
            // InternalMyDsl.g:784:4: (lv_attribute_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:784:4: (lv_attribute_3_0= RULE_STRING )
            // InternalMyDsl.g:785:5: lv_attribute_3_0= RULE_STRING
            {
            lv_attribute_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_attribute_3_0, grammarAccess.getSortAccess().getAttributeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSort"


    // $ANTLR start "entryRuleShow"
    // InternalMyDsl.g:805:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // InternalMyDsl.g:805:45: (iv_ruleShow= ruleShow EOF )
            // InternalMyDsl.g:806:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalMyDsl.g:812:1: ruleShow returns [EObject current=null] : ( ( (lv_show_0_0= 'show' ) ) (otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token lv_show_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:818:2: ( ( ( (lv_show_0_0= 'show' ) ) (otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )? ) )
            // InternalMyDsl.g:819:2: ( ( (lv_show_0_0= 'show' ) ) (otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )? )
            {
            // InternalMyDsl.g:819:2: ( ( (lv_show_0_0= 'show' ) ) (otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )? )
            // InternalMyDsl.g:820:3: ( (lv_show_0_0= 'show' ) ) (otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            {
            // InternalMyDsl.g:820:3: ( (lv_show_0_0= 'show' ) )
            // InternalMyDsl.g:821:4: (lv_show_0_0= 'show' )
            {
            // InternalMyDsl.g:821:4: (lv_show_0_0= 'show' )
            // InternalMyDsl.g:822:5: lv_show_0_0= 'show'
            {
            lv_show_0_0=(Token)match(input,24,FOLLOW_10); 

            					newLeafNode(lv_show_0_0, grammarAccess.getShowAccess().getShowShowKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShowRule());
            					}
            					setWithLastConsumed(current, "show", lv_show_0_0, "show");
            				

            }


            }

            // InternalMyDsl.g:834:3: (otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:835:4: otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getShowAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:839:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalMyDsl.g:840:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:840:5: (lv_name_2_0= RULE_STRING )
                    // InternalMyDsl.g:841:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getShowAccess().getNameSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getShowRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getShowAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleTypeReference"
    // InternalMyDsl.g:866:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalMyDsl.g:866:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalMyDsl.g:867:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalMyDsl.g:873:1: ruleTypeReference returns [EObject current=null] : (this_TypeInt_0= ruleTypeInt | this_TypeString_1= ruleTypeString | this_TypeJSON_2= ruleTypeJSON ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_TypeInt_0 = null;

        EObject this_TypeString_1 = null;

        EObject this_TypeJSON_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:879:2: ( (this_TypeInt_0= ruleTypeInt | this_TypeString_1= ruleTypeString | this_TypeJSON_2= ruleTypeJSON ) )
            // InternalMyDsl.g:880:2: (this_TypeInt_0= ruleTypeInt | this_TypeString_1= ruleTypeString | this_TypeJSON_2= ruleTypeJSON )
            {
            // InternalMyDsl.g:880:2: (this_TypeInt_0= ruleTypeInt | this_TypeString_1= ruleTypeString | this_TypeJSON_2= ruleTypeJSON )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:881:3: this_TypeInt_0= ruleTypeInt
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeIntParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeInt_0=ruleTypeInt();

                    state._fsp--;


                    			current = this_TypeInt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:890:3: this_TypeString_1= ruleTypeString
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeString_1=ruleTypeString();

                    state._fsp--;


                    			current = this_TypeString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:899:3: this_TypeJSON_2= ruleTypeJSON
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeJSONParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeJSON_2=ruleTypeJSON();

                    state._fsp--;


                    			current = this_TypeJSON_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleTypeInt"
    // InternalMyDsl.g:911:1: entryRuleTypeInt returns [EObject current=null] : iv_ruleTypeInt= ruleTypeInt EOF ;
    public final EObject entryRuleTypeInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeInt = null;


        try {
            // InternalMyDsl.g:911:48: (iv_ruleTypeInt= ruleTypeInt EOF )
            // InternalMyDsl.g:912:2: iv_ruleTypeInt= ruleTypeInt EOF
            {
             newCompositeNode(grammarAccess.getTypeIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeInt=ruleTypeInt();

            state._fsp--;

             current =iv_ruleTypeInt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeInt"


    // $ANTLR start "ruleTypeInt"
    // InternalMyDsl.g:918:1: ruleTypeInt returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleTypeInt() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:924:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:925:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:925:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalMyDsl.g:926:3: (lv_val_0_0= RULE_INT )
            {
            // InternalMyDsl.g:926:3: (lv_val_0_0= RULE_INT )
            // InternalMyDsl.g:927:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getTypeIntAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeIntRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeInt"


    // $ANTLR start "entryRuleTypeString"
    // InternalMyDsl.g:946:1: entryRuleTypeString returns [EObject current=null] : iv_ruleTypeString= ruleTypeString EOF ;
    public final EObject entryRuleTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeString = null;


        try {
            // InternalMyDsl.g:946:51: (iv_ruleTypeString= ruleTypeString EOF )
            // InternalMyDsl.g:947:2: iv_ruleTypeString= ruleTypeString EOF
            {
             newCompositeNode(grammarAccess.getTypeStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeString=ruleTypeString();

            state._fsp--;

             current =iv_ruleTypeString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeString"


    // $ANTLR start "ruleTypeString"
    // InternalMyDsl.g:953:1: ruleTypeString returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleTypeString() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:959:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:960:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:960:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalMyDsl.g:961:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:961:3: (lv_val_0_0= RULE_STRING )
            // InternalMyDsl.g:962:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getTypeStringAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeString"


    // $ANTLR start "entryRuleTypeJSON"
    // InternalMyDsl.g:981:1: entryRuleTypeJSON returns [EObject current=null] : iv_ruleTypeJSON= ruleTypeJSON EOF ;
    public final EObject entryRuleTypeJSON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeJSON = null;


        try {
            // InternalMyDsl.g:981:49: (iv_ruleTypeJSON= ruleTypeJSON EOF )
            // InternalMyDsl.g:982:2: iv_ruleTypeJSON= ruleTypeJSON EOF
            {
             newCompositeNode(grammarAccess.getTypeJSONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeJSON=ruleTypeJSON();

            state._fsp--;

             current =iv_ruleTypeJSON; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeJSON"


    // $ANTLR start "ruleTypeJSON"
    // InternalMyDsl.g:988:1: ruleTypeJSON returns [EObject current=null] : ( (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= ruleTypeReference ) ) otherlv_4= ';' )+ otherlv_5= '}' ) | (otherlv_6= '{' ( ( (lv_attribute_7_0= RULE_STRING ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_value_10_0= ruleTypeReference ) )+ otherlv_11= '}' otherlv_12= ';' )+ otherlv_13= '}' ) | (otherlv_14= '{' ( ( (lv_attribute_15_0= RULE_STRING ) ) otherlv_16= ':' otherlv_17= '[' otherlv_18= '{' ( (lv_value_19_0= ruleTypeReference ) )+ otherlv_20= '}' otherlv_21= ']' otherlv_22= ';' )+ otherlv_23= '}' ) ) ;
    public final EObject ruleTypeJSON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attribute_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_attribute_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_attribute_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_value_3_0 = null;

        EObject lv_value_10_0 = null;

        EObject lv_value_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:994:2: ( ( (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= ruleTypeReference ) ) otherlv_4= ';' )+ otherlv_5= '}' ) | (otherlv_6= '{' ( ( (lv_attribute_7_0= RULE_STRING ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_value_10_0= ruleTypeReference ) )+ otherlv_11= '}' otherlv_12= ';' )+ otherlv_13= '}' ) | (otherlv_14= '{' ( ( (lv_attribute_15_0= RULE_STRING ) ) otherlv_16= ':' otherlv_17= '[' otherlv_18= '{' ( (lv_value_19_0= ruleTypeReference ) )+ otherlv_20= '}' otherlv_21= ']' otherlv_22= ';' )+ otherlv_23= '}' ) ) )
            // InternalMyDsl.g:995:2: ( (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= ruleTypeReference ) ) otherlv_4= ';' )+ otherlv_5= '}' ) | (otherlv_6= '{' ( ( (lv_attribute_7_0= RULE_STRING ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_value_10_0= ruleTypeReference ) )+ otherlv_11= '}' otherlv_12= ';' )+ otherlv_13= '}' ) | (otherlv_14= '{' ( ( (lv_attribute_15_0= RULE_STRING ) ) otherlv_16= ':' otherlv_17= '[' otherlv_18= '{' ( (lv_value_19_0= ruleTypeReference ) )+ otherlv_20= '}' otherlv_21= ']' otherlv_22= ';' )+ otherlv_23= '}' ) )
            {
            // InternalMyDsl.g:995:2: ( (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= ruleTypeReference ) ) otherlv_4= ';' )+ otherlv_5= '}' ) | (otherlv_6= '{' ( ( (lv_attribute_7_0= RULE_STRING ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_value_10_0= ruleTypeReference ) )+ otherlv_11= '}' otherlv_12= ';' )+ otherlv_13= '}' ) | (otherlv_14= '{' ( ( (lv_attribute_15_0= RULE_STRING ) ) otherlv_16= ':' otherlv_17= '[' otherlv_18= '{' ( (lv_value_19_0= ruleTypeReference ) )+ otherlv_20= '}' otherlv_21= ']' otherlv_22= ';' )+ otherlv_23= '}' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_STRING) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==29) ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3==25) ) {
                            alt12=2;
                        }
                        else if ( (LA12_3==30) ) {
                            alt12=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA12_2==26) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:996:3: (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= ruleTypeReference ) ) otherlv_4= ';' )+ otherlv_5= '}' )
                    {
                    // InternalMyDsl.g:996:3: (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= ruleTypeReference ) ) otherlv_4= ';' )+ otherlv_5= '}' )
                    // InternalMyDsl.g:997:4: otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= ruleTypeReference ) ) otherlv_4= ';' )+ otherlv_5= '}'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_0_0());
                    			
                    // InternalMyDsl.g:1001:4: ( ( (lv_attribute_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= ruleTypeReference ) ) otherlv_4= ';' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_STRING) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:1002:5: ( (lv_attribute_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_value_3_0= ruleTypeReference ) ) otherlv_4= ';'
                    	    {
                    	    // InternalMyDsl.g:1002:5: ( (lv_attribute_1_0= RULE_STRING ) )
                    	    // InternalMyDsl.g:1003:6: (lv_attribute_1_0= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:1003:6: (lv_attribute_1_0= RULE_STRING )
                    	    // InternalMyDsl.g:1004:7: lv_attribute_1_0= RULE_STRING
                    	    {
                    	    lv_attribute_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    							newLeafNode(lv_attribute_1_0, grammarAccess.getTypeJSONAccess().getAttributeSTRINGTerminalRuleCall_0_1_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTypeJSONRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_1_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }

                    	    otherlv_2=(Token)match(input,26,FOLLOW_12); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getTypeJSONAccess().getEqualsSignKeyword_0_1_1());
                    	    				
                    	    // InternalMyDsl.g:1024:5: ( (lv_value_3_0= ruleTypeReference ) )
                    	    // InternalMyDsl.g:1025:6: (lv_value_3_0= ruleTypeReference )
                    	    {
                    	    // InternalMyDsl.g:1025:6: (lv_value_3_0= ruleTypeReference )
                    	    // InternalMyDsl.g:1026:7: lv_value_3_0= ruleTypeReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypeJSONAccess().getValueTypeReferenceParserRuleCall_0_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_value_3_0=ruleTypeReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypeJSONRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_3_0,
                    	    								"org.xtext.example.mydsl.MyDsl.TypeReference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_4=(Token)match(input,27,FOLLOW_14); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTypeJSONAccess().getSemicolonKeyword_0_1_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1054:3: (otherlv_6= '{' ( ( (lv_attribute_7_0= RULE_STRING ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_value_10_0= ruleTypeReference ) )+ otherlv_11= '}' otherlv_12= ';' )+ otherlv_13= '}' )
                    {
                    // InternalMyDsl.g:1054:3: (otherlv_6= '{' ( ( (lv_attribute_7_0= RULE_STRING ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_value_10_0= ruleTypeReference ) )+ otherlv_11= '}' otherlv_12= ';' )+ otherlv_13= '}' )
                    // InternalMyDsl.g:1055:4: otherlv_6= '{' ( ( (lv_attribute_7_0= RULE_STRING ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_value_10_0= ruleTypeReference ) )+ otherlv_11= '}' otherlv_12= ';' )+ otherlv_13= '}'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:1059:4: ( ( (lv_attribute_7_0= RULE_STRING ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_value_10_0= ruleTypeReference ) )+ otherlv_11= '}' otherlv_12= ';' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_STRING) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:1060:5: ( (lv_attribute_7_0= RULE_STRING ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_value_10_0= ruleTypeReference ) )+ otherlv_11= '}' otherlv_12= ';'
                    	    {
                    	    // InternalMyDsl.g:1060:5: ( (lv_attribute_7_0= RULE_STRING ) )
                    	    // InternalMyDsl.g:1061:6: (lv_attribute_7_0= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:1061:6: (lv_attribute_7_0= RULE_STRING )
                    	    // InternalMyDsl.g:1062:7: lv_attribute_7_0= RULE_STRING
                    	    {
                    	    lv_attribute_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    	    							newLeafNode(lv_attribute_7_0, grammarAccess.getTypeJSONAccess().getAttributeSTRINGTerminalRuleCall_1_1_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTypeJSONRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_7_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,29,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTypeJSONAccess().getColonKeyword_1_1_1());
                    	    				
                    	    otherlv_9=(Token)match(input,25,FOLLOW_12); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_1_1_2());
                    	    				
                    	    // InternalMyDsl.g:1086:5: ( (lv_value_10_0= ruleTypeReference ) )+
                    	    int cnt8=0;
                    	    loop8:
                    	    do {
                    	        int alt8=2;
                    	        int LA8_0 = input.LA(1);

                    	        if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)||LA8_0==25) ) {
                    	            alt8=1;
                    	        }


                    	        switch (alt8) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:1087:6: (lv_value_10_0= ruleTypeReference )
                    	    	    {
                    	    	    // InternalMyDsl.g:1087:6: (lv_value_10_0= ruleTypeReference )
                    	    	    // InternalMyDsl.g:1088:7: lv_value_10_0= ruleTypeReference
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getTypeJSONAccess().getValueTypeReferenceParserRuleCall_1_1_3_0());
                    	    	    						
                    	    	    pushFollow(FOLLOW_16);
                    	    	    lv_value_10_0=ruleTypeReference();

                    	    	    state._fsp--;


                    	    	    							if (current==null) {
                    	    	    								current = createModelElementForParent(grammarAccess.getTypeJSONRule());
                    	    	    							}
                    	    	    							add(
                    	    	    								current,
                    	    	    								"value",
                    	    	    								lv_value_10_0,
                    	    	    								"org.xtext.example.mydsl.MyDsl.TypeReference");
                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt8 >= 1 ) break loop8;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(8, input);
                    	                throw eee;
                    	        }
                    	        cnt8++;
                    	    } while (true);

                    	    otherlv_11=(Token)match(input,28,FOLLOW_13); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_1_1_4());
                    	    				
                    	    otherlv_12=(Token)match(input,27,FOLLOW_14); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getTypeJSONAccess().getSemicolonKeyword_1_1_5());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_13=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1120:3: (otherlv_14= '{' ( ( (lv_attribute_15_0= RULE_STRING ) ) otherlv_16= ':' otherlv_17= '[' otherlv_18= '{' ( (lv_value_19_0= ruleTypeReference ) )+ otherlv_20= '}' otherlv_21= ']' otherlv_22= ';' )+ otherlv_23= '}' )
                    {
                    // InternalMyDsl.g:1120:3: (otherlv_14= '{' ( ( (lv_attribute_15_0= RULE_STRING ) ) otherlv_16= ':' otherlv_17= '[' otherlv_18= '{' ( (lv_value_19_0= ruleTypeReference ) )+ otherlv_20= '}' otherlv_21= ']' otherlv_22= ';' )+ otherlv_23= '}' )
                    // InternalMyDsl.g:1121:4: otherlv_14= '{' ( ( (lv_attribute_15_0= RULE_STRING ) ) otherlv_16= ':' otherlv_17= '[' otherlv_18= '{' ( (lv_value_19_0= ruleTypeReference ) )+ otherlv_20= '}' otherlv_21= ']' otherlv_22= ';' )+ otherlv_23= '}'
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalMyDsl.g:1125:4: ( ( (lv_attribute_15_0= RULE_STRING ) ) otherlv_16= ':' otherlv_17= '[' otherlv_18= '{' ( (lv_value_19_0= ruleTypeReference ) )+ otherlv_20= '}' otherlv_21= ']' otherlv_22= ';' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_STRING) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:1126:5: ( (lv_attribute_15_0= RULE_STRING ) ) otherlv_16= ':' otherlv_17= '[' otherlv_18= '{' ( (lv_value_19_0= ruleTypeReference ) )+ otherlv_20= '}' otherlv_21= ']' otherlv_22= ';'
                    	    {
                    	    // InternalMyDsl.g:1126:5: ( (lv_attribute_15_0= RULE_STRING ) )
                    	    // InternalMyDsl.g:1127:6: (lv_attribute_15_0= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:1127:6: (lv_attribute_15_0= RULE_STRING )
                    	    // InternalMyDsl.g:1128:7: lv_attribute_15_0= RULE_STRING
                    	    {
                    	    lv_attribute_15_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    	    							newLeafNode(lv_attribute_15_0, grammarAccess.getTypeJSONAccess().getAttributeSTRINGTerminalRuleCall_2_1_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTypeJSONRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_15_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,29,FOLLOW_17); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getTypeJSONAccess().getColonKeyword_2_1_1());
                    	    				
                    	    otherlv_17=(Token)match(input,30,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getTypeJSONAccess().getLeftSquareBracketKeyword_2_1_2());
                    	    				
                    	    otherlv_18=(Token)match(input,25,FOLLOW_12); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_2_1_3());
                    	    				
                    	    // InternalMyDsl.g:1156:5: ( (lv_value_19_0= ruleTypeReference ) )+
                    	    int cnt10=0;
                    	    loop10:
                    	    do {
                    	        int alt10=2;
                    	        int LA10_0 = input.LA(1);

                    	        if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||LA10_0==25) ) {
                    	            alt10=1;
                    	        }


                    	        switch (alt10) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:1157:6: (lv_value_19_0= ruleTypeReference )
                    	    	    {
                    	    	    // InternalMyDsl.g:1157:6: (lv_value_19_0= ruleTypeReference )
                    	    	    // InternalMyDsl.g:1158:7: lv_value_19_0= ruleTypeReference
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getTypeJSONAccess().getValueTypeReferenceParserRuleCall_2_1_4_0());
                    	    	    						
                    	    	    pushFollow(FOLLOW_16);
                    	    	    lv_value_19_0=ruleTypeReference();

                    	    	    state._fsp--;


                    	    	    							if (current==null) {
                    	    	    								current = createModelElementForParent(grammarAccess.getTypeJSONRule());
                    	    	    							}
                    	    	    							add(
                    	    	    								current,
                    	    	    								"value",
                    	    	    								lv_value_19_0,
                    	    	    								"org.xtext.example.mydsl.MyDsl.TypeReference");
                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt10 >= 1 ) break loop10;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(10, input);
                    	                throw eee;
                    	        }
                    	        cnt10++;
                    	    } while (true);

                    	    otherlv_20=(Token)match(input,28,FOLLOW_18); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_2_1_5());
                    	    				
                    	    otherlv_21=(Token)match(input,31,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getTypeJSONAccess().getRightSquareBracketKeyword_2_1_6());
                    	    				
                    	    otherlv_22=(Token)match(input,27,FOLLOW_14); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getTypeJSONAccess().getSemicolonKeyword_2_1_7());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_23=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeJSON"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000017DC802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000012000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});

}