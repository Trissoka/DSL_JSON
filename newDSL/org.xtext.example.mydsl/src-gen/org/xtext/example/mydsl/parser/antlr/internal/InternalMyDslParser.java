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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'count'", "'('", "')'", "'read'", "'writeJSON'", "','", "'writeCSV'", "'remove'", "'add'", "'get'", "'sort'", "'by'", "'{'", "';'", "'}'", "'='"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
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

                if ( (LA1_0==11||(LA1_0>=14 && LA1_0<=15)||(LA1_0>=17 && LA1_0<=21)) ) {
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
    // InternalMyDsl.g:107:1: ruleFun returns [EObject current=null] : (this_CountJson_0= ruleCountJson | this_ReadJson_1= ruleReadJson | this_WriteJson_2= ruleWriteJson | this_WriteCSV_3= ruleWriteCSV | this_Remove_4= ruleRemove | this_Add_5= ruleAdd | this_Get_6= ruleGet | this_Sort_7= ruleSort ) ;
    public final EObject ruleFun() throws RecognitionException {
        EObject current = null;

        EObject this_CountJson_0 = null;

        EObject this_ReadJson_1 = null;

        EObject this_WriteJson_2 = null;

        EObject this_WriteCSV_3 = null;

        EObject this_Remove_4 = null;

        EObject this_Add_5 = null;

        EObject this_Get_6 = null;

        EObject this_Sort_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_CountJson_0= ruleCountJson | this_ReadJson_1= ruleReadJson | this_WriteJson_2= ruleWriteJson | this_WriteCSV_3= ruleWriteCSV | this_Remove_4= ruleRemove | this_Add_5= ruleAdd | this_Get_6= ruleGet | this_Sort_7= ruleSort ) )
            // InternalMyDsl.g:114:2: (this_CountJson_0= ruleCountJson | this_ReadJson_1= ruleReadJson | this_WriteJson_2= ruleWriteJson | this_WriteCSV_3= ruleWriteCSV | this_Remove_4= ruleRemove | this_Add_5= ruleAdd | this_Get_6= ruleGet | this_Sort_7= ruleSort )
            {
            // InternalMyDsl.g:114:2: (this_CountJson_0= ruleCountJson | this_ReadJson_1= ruleReadJson | this_WriteJson_2= ruleWriteJson | this_WriteCSV_3= ruleWriteCSV | this_Remove_4= ruleRemove | this_Add_5= ruleAdd | this_Get_6= ruleGet | this_Sort_7= ruleSort )
            int alt2=8;
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
            case 17:
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
                    // InternalMyDsl.g:133:3: this_WriteJson_2= ruleWriteJson
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getWriteJsonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WriteJson_2=ruleWriteJson();

                    state._fsp--;


                    			current = this_WriteJson_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:142:3: this_WriteCSV_3= ruleWriteCSV
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getWriteCSVParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WriteCSV_3=ruleWriteCSV();

                    state._fsp--;


                    			current = this_WriteCSV_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:151:3: this_Remove_4= ruleRemove
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getRemoveParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Remove_4=ruleRemove();

                    state._fsp--;


                    			current = this_Remove_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:160:3: this_Add_5= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getAddParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_5=ruleAdd();

                    state._fsp--;


                    			current = this_Add_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:169:3: this_Get_6= ruleGet
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getGetParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Get_6=ruleGet();

                    state._fsp--;


                    			current = this_Get_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:178:3: this_Sort_7= ruleSort
                    {

                    			newCompositeNode(grammarAccess.getFunAccess().getSortParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sort_7=ruleSort();

                    state._fsp--;


                    			current = this_Sort_7;
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
    // InternalMyDsl.g:190:1: entryRuleCountJson returns [EObject current=null] : iv_ruleCountJson= ruleCountJson EOF ;
    public final EObject entryRuleCountJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountJson = null;


        try {
            // InternalMyDsl.g:190:50: (iv_ruleCountJson= ruleCountJson EOF )
            // InternalMyDsl.g:191:2: iv_ruleCountJson= ruleCountJson EOF
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
    // InternalMyDsl.g:197:1: ruleCountJson returns [EObject current=null] : ( ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ')' ) ;
    public final EObject ruleCountJson() throws RecognitionException {
        EObject current = null;

        Token lv_countJSON_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_file_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:203:2: ( ( ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:204:2: ( ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:204:2: ( ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ')' )
            // InternalMyDsl.g:205:3: ( (lv_countJSON_0_0= 'count' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:205:3: ( (lv_countJSON_0_0= 'count' ) )
            // InternalMyDsl.g:206:4: (lv_countJSON_0_0= 'count' )
            {
            // InternalMyDsl.g:206:4: (lv_countJSON_0_0= 'count' )
            // InternalMyDsl.g:207:5: lv_countJSON_0_0= 'count'
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
            		
            // InternalMyDsl.g:223:3: ( (lv_file_2_0= ruleJSON ) )
            // InternalMyDsl.g:224:4: (lv_file_2_0= ruleJSON )
            {
            // InternalMyDsl.g:224:4: (lv_file_2_0= ruleJSON )
            // InternalMyDsl.g:225:5: lv_file_2_0= ruleJSON
            {

            					newCompositeNode(grammarAccess.getCountJsonAccess().getFileJSONParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_file_2_0=ruleJSON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountJsonRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"org.xtext.example.mydsl.MyDsl.JSON");
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
    // InternalMyDsl.g:250:1: entryRuleReadJson returns [EObject current=null] : iv_ruleReadJson= ruleReadJson EOF ;
    public final EObject entryRuleReadJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadJson = null;


        try {
            // InternalMyDsl.g:250:49: (iv_ruleReadJson= ruleReadJson EOF )
            // InternalMyDsl.g:251:2: iv_ruleReadJson= ruleReadJson EOF
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
    // InternalMyDsl.g:257:1: ruleReadJson returns [EObject current=null] : ( ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleReadJson() throws RecognitionException {
        EObject current = null;

        Token lv_readJSON_0_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:263:2: ( ( ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:264:2: ( ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:264:2: ( ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalMyDsl.g:265:3: ( (lv_readJSON_0_0= 'read' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:265:3: ( (lv_readJSON_0_0= 'read' ) )
            // InternalMyDsl.g:266:4: (lv_readJSON_0_0= 'read' )
            {
            // InternalMyDsl.g:266:4: (lv_readJSON_0_0= 'read' )
            // InternalMyDsl.g:267:5: lv_readJSON_0_0= 'read'
            {
            lv_readJSON_0_0=(Token)match(input,14,FOLLOW_4); 

            					newLeafNode(lv_readJSON_0_0, grammarAccess.getReadJsonAccess().getReadJSONReadKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadJsonRule());
            					}
            					setWithLastConsumed(current, "readJSON", lv_readJSON_0_0, "read");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getReadJsonAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:283:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalMyDsl.g:284:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:284:4: (lv_path_2_0= RULE_STRING )
            // InternalMyDsl.g:285:5: lv_path_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleWriteJson"
    // InternalMyDsl.g:309:1: entryRuleWriteJson returns [EObject current=null] : iv_ruleWriteJson= ruleWriteJson EOF ;
    public final EObject entryRuleWriteJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteJson = null;


        try {
            // InternalMyDsl.g:309:50: (iv_ruleWriteJson= ruleWriteJson EOF )
            // InternalMyDsl.g:310:2: iv_ruleWriteJson= ruleWriteJson EOF
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
    // InternalMyDsl.g:316:1: ruleWriteJson returns [EObject current=null] : ( ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' ) ;
    public final EObject ruleWriteJson() throws RecognitionException {
        EObject current = null;

        Token lv_writeJSON_0_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:322:2: ( ( ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' ) )
            // InternalMyDsl.g:323:2: ( ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' )
            {
            // InternalMyDsl.g:323:2: ( ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' )
            // InternalMyDsl.g:324:3: ( (lv_writeJSON_0_0= 'writeJSON' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')'
            {
            // InternalMyDsl.g:324:3: ( (lv_writeJSON_0_0= 'writeJSON' ) )
            // InternalMyDsl.g:325:4: (lv_writeJSON_0_0= 'writeJSON' )
            {
            // InternalMyDsl.g:325:4: (lv_writeJSON_0_0= 'writeJSON' )
            // InternalMyDsl.g:326:5: lv_writeJSON_0_0= 'writeJSON'
            {
            lv_writeJSON_0_0=(Token)match(input,15,FOLLOW_4); 

            					newLeafNode(lv_writeJSON_0_0, grammarAccess.getWriteJsonAccess().getWriteJSONWriteJSONKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteJsonRule());
            					}
            					setWithLastConsumed(current, "writeJSON", lv_writeJSON_0_0, "writeJSON");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getWriteJsonAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:342:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalMyDsl.g:343:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:343:4: (lv_path_2_0= RULE_STRING )
            // InternalMyDsl.g:344:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getWriteJsonAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:364:3: ( (lv_file_4_0= ruleJSON ) )
            // InternalMyDsl.g:365:4: (lv_file_4_0= ruleJSON )
            {
            // InternalMyDsl.g:365:4: (lv_file_4_0= ruleJSON )
            // InternalMyDsl.g:366:5: lv_file_4_0= ruleJSON
            {

            					newCompositeNode(grammarAccess.getWriteJsonAccess().getFileJSONParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_file_4_0=ruleJSON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWriteJsonRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_4_0,
            						"org.xtext.example.mydsl.MyDsl.JSON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWriteJsonAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalMyDsl.g:391:1: entryRuleWriteCSV returns [EObject current=null] : iv_ruleWriteCSV= ruleWriteCSV EOF ;
    public final EObject entryRuleWriteCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCSV = null;


        try {
            // InternalMyDsl.g:391:49: (iv_ruleWriteCSV= ruleWriteCSV EOF )
            // InternalMyDsl.g:392:2: iv_ruleWriteCSV= ruleWriteCSV EOF
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
    // InternalMyDsl.g:398:1: ruleWriteCSV returns [EObject current=null] : ( ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' ) ;
    public final EObject ruleWriteCSV() throws RecognitionException {
        EObject current = null;

        Token lv_writeCVS_0_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:404:2: ( ( ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' ) )
            // InternalMyDsl.g:405:2: ( ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' )
            {
            // InternalMyDsl.g:405:2: ( ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' )
            // InternalMyDsl.g:406:3: ( (lv_writeCVS_0_0= 'writeCSV' ) ) otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')'
            {
            // InternalMyDsl.g:406:3: ( (lv_writeCVS_0_0= 'writeCSV' ) )
            // InternalMyDsl.g:407:4: (lv_writeCVS_0_0= 'writeCSV' )
            {
            // InternalMyDsl.g:407:4: (lv_writeCVS_0_0= 'writeCSV' )
            // InternalMyDsl.g:408:5: lv_writeCVS_0_0= 'writeCSV'
            {
            lv_writeCVS_0_0=(Token)match(input,17,FOLLOW_4); 

            					newLeafNode(lv_writeCVS_0_0, grammarAccess.getWriteCSVAccess().getWriteCVSWriteCSVKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteCSVRule());
            					}
            					setWithLastConsumed(current, "writeCVS", lv_writeCVS_0_0, "writeCSV");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getWriteCSVAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:424:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalMyDsl.g:425:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:425:4: (lv_path_2_0= RULE_STRING )
            // InternalMyDsl.g:426:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getWriteCSVAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:446:3: ( (lv_file_4_0= ruleJSON ) )
            // InternalMyDsl.g:447:4: (lv_file_4_0= ruleJSON )
            {
            // InternalMyDsl.g:447:4: (lv_file_4_0= ruleJSON )
            // InternalMyDsl.g:448:5: lv_file_4_0= ruleJSON
            {

            					newCompositeNode(grammarAccess.getWriteCSVAccess().getFileJSONParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_file_4_0=ruleJSON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWriteCSVRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_4_0,
            						"org.xtext.example.mydsl.MyDsl.JSON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWriteCSVAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalMyDsl.g:473:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalMyDsl.g:473:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalMyDsl.g:474:2: iv_ruleRemove= ruleRemove EOF
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
    // InternalMyDsl.g:480:1: ruleRemove returns [EObject current=null] : ( ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token lv_removeElement_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:486:2: ( ( ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' ) )
            // InternalMyDsl.g:487:2: ( ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' )
            {
            // InternalMyDsl.g:487:2: ( ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')' )
            // InternalMyDsl.g:488:3: ( (lv_removeElement_0_0= 'remove' ) ) otherlv_1= '(' ( (lv_id_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_file_4_0= ruleJSON ) ) otherlv_5= ')'
            {
            // InternalMyDsl.g:488:3: ( (lv_removeElement_0_0= 'remove' ) )
            // InternalMyDsl.g:489:4: (lv_removeElement_0_0= 'remove' )
            {
            // InternalMyDsl.g:489:4: (lv_removeElement_0_0= 'remove' )
            // InternalMyDsl.g:490:5: lv_removeElement_0_0= 'remove'
            {
            lv_removeElement_0_0=(Token)match(input,18,FOLLOW_4); 

            					newLeafNode(lv_removeElement_0_0, grammarAccess.getRemoveAccess().getRemoveElementRemoveKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRule());
            					}
            					setWithLastConsumed(current, "removeElement", lv_removeElement_0_0, "remove");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:506:3: ( (lv_id_2_0= RULE_INT ) )
            // InternalMyDsl.g:507:4: (lv_id_2_0= RULE_INT )
            {
            // InternalMyDsl.g:507:4: (lv_id_2_0= RULE_INT )
            // InternalMyDsl.g:508:5: lv_id_2_0= RULE_INT
            {
            lv_id_2_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_id_2_0, grammarAccess.getRemoveAccess().getIdINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRemoveAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:528:3: ( (lv_file_4_0= ruleJSON ) )
            // InternalMyDsl.g:529:4: (lv_file_4_0= ruleJSON )
            {
            // InternalMyDsl.g:529:4: (lv_file_4_0= ruleJSON )
            // InternalMyDsl.g:530:5: lv_file_4_0= ruleJSON
            {

            					newCompositeNode(grammarAccess.getRemoveAccess().getFileJSONParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_file_4_0=ruleJSON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_4_0,
            						"org.xtext.example.mydsl.MyDsl.JSON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRemoveAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalMyDsl.g:555:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalMyDsl.g:555:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalMyDsl.g:556:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalMyDsl.g:562:1: ruleAdd returns [EObject current=null] : ( ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ',' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token lv_addElement_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        EObject lv_file_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:568:2: ( ( ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ',' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalMyDsl.g:569:2: ( ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ',' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalMyDsl.g:569:2: ( ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ',' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalMyDsl.g:570:3: ( (lv_addElement_0_0= 'add' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ',' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            // InternalMyDsl.g:570:3: ( (lv_addElement_0_0= 'add' ) )
            // InternalMyDsl.g:571:4: (lv_addElement_0_0= 'add' )
            {
            // InternalMyDsl.g:571:4: (lv_addElement_0_0= 'add' )
            // InternalMyDsl.g:572:5: lv_addElement_0_0= 'add'
            {
            lv_addElement_0_0=(Token)match(input,19,FOLLOW_4); 

            					newLeafNode(lv_addElement_0_0, grammarAccess.getAddAccess().getAddElementAddKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(current, "addElement", lv_addElement_0_0, "add");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:588:3: ( (lv_file_2_0= ruleJSON ) )
            // InternalMyDsl.g:589:4: (lv_file_2_0= ruleJSON )
            {
            // InternalMyDsl.g:589:4: (lv_file_2_0= ruleJSON )
            // InternalMyDsl.g:590:5: lv_file_2_0= ruleJSON
            {

            					newCompositeNode(grammarAccess.getAddAccess().getFileJSONParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_file_2_0=ruleJSON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"org.xtext.example.mydsl.MyDsl.JSON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:611:3: ( (lv_id_4_0= RULE_INT ) )
            // InternalMyDsl.g:612:4: (lv_id_4_0= RULE_INT )
            {
            // InternalMyDsl.g:612:4: (lv_id_4_0= RULE_INT )
            // InternalMyDsl.g:613:5: lv_id_4_0= RULE_INT
            {
            lv_id_4_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_id_4_0, grammarAccess.getAddAccess().getIdINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAddAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalMyDsl.g:637:1: entryRuleGet returns [EObject current=null] : iv_ruleGet= ruleGet EOF ;
    public final EObject entryRuleGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGet = null;


        try {
            // InternalMyDsl.g:637:44: (iv_ruleGet= ruleGet EOF )
            // InternalMyDsl.g:638:2: iv_ruleGet= ruleGet EOF
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
    // InternalMyDsl.g:644:1: ruleGet returns [EObject current=null] : ( ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ',' ) ;
    public final EObject ruleGet() throws RecognitionException {
        EObject current = null;

        Token lv_getElement_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_file_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:650:2: ( ( ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ',' ) )
            // InternalMyDsl.g:651:2: ( ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ',' )
            {
            // InternalMyDsl.g:651:2: ( ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ',' )
            // InternalMyDsl.g:652:3: ( (lv_getElement_0_0= 'get' ) ) otherlv_1= '(' ( (lv_file_2_0= ruleJSON ) ) otherlv_3= ','
            {
            // InternalMyDsl.g:652:3: ( (lv_getElement_0_0= 'get' ) )
            // InternalMyDsl.g:653:4: (lv_getElement_0_0= 'get' )
            {
            // InternalMyDsl.g:653:4: (lv_getElement_0_0= 'get' )
            // InternalMyDsl.g:654:5: lv_getElement_0_0= 'get'
            {
            lv_getElement_0_0=(Token)match(input,20,FOLLOW_4); 

            					newLeafNode(lv_getElement_0_0, grammarAccess.getGetAccess().getGetElementGetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetRule());
            					}
            					setWithLastConsumed(current, "getElement", lv_getElement_0_0, "get");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGetAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:670:3: ( (lv_file_2_0= ruleJSON ) )
            // InternalMyDsl.g:671:4: (lv_file_2_0= ruleJSON )
            {
            // InternalMyDsl.g:671:4: (lv_file_2_0= ruleJSON )
            // InternalMyDsl.g:672:5: lv_file_2_0= ruleJSON
            {

            					newCompositeNode(grammarAccess.getGetAccess().getFileJSONParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_file_2_0=ruleJSON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_2_0,
            						"org.xtext.example.mydsl.MyDsl.JSON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGetAccess().getCommaKeyword_3());
            		

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
    // InternalMyDsl.g:697:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // InternalMyDsl.g:697:45: (iv_ruleSort= ruleSort EOF )
            // InternalMyDsl.g:698:2: iv_ruleSort= ruleSort EOF
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
    // InternalMyDsl.g:704:1: ruleSort returns [EObject current=null] : ( ( (lv_sort_0_0= 'sort' ) ) ( (lv_file_1_0= ruleJSON ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        Token lv_sort_0_0=null;
        Token otherlv_2=null;
        Token lv_attribute_3_0=null;
        EObject lv_file_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:710:2: ( ( ( (lv_sort_0_0= 'sort' ) ) ( (lv_file_1_0= ruleJSON ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:711:2: ( ( (lv_sort_0_0= 'sort' ) ) ( (lv_file_1_0= ruleJSON ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:711:2: ( ( (lv_sort_0_0= 'sort' ) ) ( (lv_file_1_0= ruleJSON ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:712:3: ( (lv_sort_0_0= 'sort' ) ) ( (lv_file_1_0= ruleJSON ) ) otherlv_2= 'by' ( (lv_attribute_3_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:712:3: ( (lv_sort_0_0= 'sort' ) )
            // InternalMyDsl.g:713:4: (lv_sort_0_0= 'sort' )
            {
            // InternalMyDsl.g:713:4: (lv_sort_0_0= 'sort' )
            // InternalMyDsl.g:714:5: lv_sort_0_0= 'sort'
            {
            lv_sort_0_0=(Token)match(input,21,FOLLOW_5); 

            					newLeafNode(lv_sort_0_0, grammarAccess.getSortAccess().getSortSortKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSortRule());
            					}
            					setWithLastConsumed(current, "sort", lv_sort_0_0, "sort");
            				

            }


            }

            // InternalMyDsl.g:726:3: ( (lv_file_1_0= ruleJSON ) )
            // InternalMyDsl.g:727:4: (lv_file_1_0= ruleJSON )
            {
            // InternalMyDsl.g:727:4: (lv_file_1_0= ruleJSON )
            // InternalMyDsl.g:728:5: lv_file_1_0= ruleJSON
            {

            					newCompositeNode(grammarAccess.getSortAccess().getFileJSONParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_file_1_0=ruleJSON();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSortRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_1_0,
            						"org.xtext.example.mydsl.MyDsl.JSON");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSortAccess().getByKeyword_2());
            		
            // InternalMyDsl.g:749:3: ( (lv_attribute_3_0= RULE_STRING ) )
            // InternalMyDsl.g:750:4: (lv_attribute_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:750:4: (lv_attribute_3_0= RULE_STRING )
            // InternalMyDsl.g:751:5: lv_attribute_3_0= RULE_STRING
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


    // $ANTLR start "entryRuleJSON"
    // InternalMyDsl.g:771:1: entryRuleJSON returns [EObject current=null] : iv_ruleJSON= ruleJSON EOF ;
    public final EObject entryRuleJSON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON = null;


        try {
            // InternalMyDsl.g:771:45: (iv_ruleJSON= ruleJSON EOF )
            // InternalMyDsl.g:772:2: iv_ruleJSON= ruleJSON EOF
            {
             newCompositeNode(grammarAccess.getJSONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON=ruleJSON();

            state._fsp--;

             current =iv_ruleJSON; 
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
    // $ANTLR end "entryRuleJSON"


    // $ANTLR start "ruleJSON"
    // InternalMyDsl.g:778:1: ruleJSON returns [EObject current=null] : ( (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= ';' )+ otherlv_3= '}' ) | (otherlv_4= '{' ( ( (lv_attribute_5_0= RULE_STRING ) ) otherlv_6= '=' ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) ) otherlv_10= ';' )+ otherlv_11= '}' ) ) ;
    public final EObject ruleJSON() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attribute_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_attribute_5_0=null;
        Token otherlv_6=null;
        Token lv_valueSTR_7_0=null;
        Token lv_valueINT_8_0=null;
        Token lv_valueID_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalMyDsl.g:784:2: ( ( (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= ';' )+ otherlv_3= '}' ) | (otherlv_4= '{' ( ( (lv_attribute_5_0= RULE_STRING ) ) otherlv_6= '=' ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) ) otherlv_10= ';' )+ otherlv_11= '}' ) ) )
            // InternalMyDsl.g:785:2: ( (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= ';' )+ otherlv_3= '}' ) | (otherlv_4= '{' ( ( (lv_attribute_5_0= RULE_STRING ) ) otherlv_6= '=' ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) ) otherlv_10= ';' )+ otherlv_11= '}' ) )
            {
            // InternalMyDsl.g:785:2: ( (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= ';' )+ otherlv_3= '}' ) | (otherlv_4= '{' ( ( (lv_attribute_5_0= RULE_STRING ) ) otherlv_6= '=' ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) ) otherlv_10= ';' )+ otherlv_11= '}' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_STRING) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:786:3: (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= ';' )+ otherlv_3= '}' )
                    {
                    // InternalMyDsl.g:786:3: (otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= ';' )+ otherlv_3= '}' )
                    // InternalMyDsl.g:787:4: otherlv_0= '{' ( ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= ';' )+ otherlv_3= '}'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getJSONAccess().getLeftCurlyBracketKeyword_0_0());
                    			
                    // InternalMyDsl.g:791:4: ( ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= ';' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:792:5: ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= ';'
                    	    {
                    	    // InternalMyDsl.g:792:5: ( (lv_attribute_1_0= RULE_ID ) )
                    	    // InternalMyDsl.g:793:6: (lv_attribute_1_0= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:793:6: (lv_attribute_1_0= RULE_ID )
                    	    // InternalMyDsl.g:794:7: lv_attribute_1_0= RULE_ID
                    	    {
                    	    lv_attribute_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    							newLeafNode(lv_attribute_1_0, grammarAccess.getJSONAccess().getAttributeIDTerminalRuleCall_0_1_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJSONRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_1_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }

                    	    otherlv_2=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getJSONAccess().getSemicolonKeyword_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getJSONAccess().getRightCurlyBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:821:3: (otherlv_4= '{' ( ( (lv_attribute_5_0= RULE_STRING ) ) otherlv_6= '=' ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) ) otherlv_10= ';' )+ otherlv_11= '}' )
                    {
                    // InternalMyDsl.g:821:3: (otherlv_4= '{' ( ( (lv_attribute_5_0= RULE_STRING ) ) otherlv_6= '=' ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) ) otherlv_10= ';' )+ otherlv_11= '}' )
                    // InternalMyDsl.g:822:4: otherlv_4= '{' ( ( (lv_attribute_5_0= RULE_STRING ) ) otherlv_6= '=' ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) ) otherlv_10= ';' )+ otherlv_11= '}'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getJSONAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:826:4: ( ( (lv_attribute_5_0= RULE_STRING ) ) otherlv_6= '=' ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) ) otherlv_10= ';' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_STRING) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:827:5: ( (lv_attribute_5_0= RULE_STRING ) ) otherlv_6= '=' ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) ) otherlv_10= ';'
                    	    {
                    	    // InternalMyDsl.g:827:5: ( (lv_attribute_5_0= RULE_STRING ) )
                    	    // InternalMyDsl.g:828:6: (lv_attribute_5_0= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:828:6: (lv_attribute_5_0= RULE_STRING )
                    	    // InternalMyDsl.g:829:7: lv_attribute_5_0= RULE_STRING
                    	    {
                    	    lv_attribute_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    	    							newLeafNode(lv_attribute_5_0, grammarAccess.getJSONAccess().getAttributeSTRINGTerminalRuleCall_1_1_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJSONRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,26,FOLLOW_15); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getJSONAccess().getEqualsSignKeyword_1_1_1());
                    	    				
                    	    // InternalMyDsl.g:849:5: ( ( (lv_valueSTR_7_0= RULE_STRING ) ) | ( (lv_valueINT_8_0= RULE_INT ) ) | ( (lv_valueID_9_0= RULE_ID ) ) )
                    	    int alt4=3;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_STRING:
                    	        {
                    	        alt4=1;
                    	        }
                    	        break;
                    	    case RULE_INT:
                    	        {
                    	        alt4=2;
                    	        }
                    	        break;
                    	    case RULE_ID:
                    	        {
                    	        alt4=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 4, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt4) {
                    	        case 1 :
                    	            // InternalMyDsl.g:850:6: ( (lv_valueSTR_7_0= RULE_STRING ) )
                    	            {
                    	            // InternalMyDsl.g:850:6: ( (lv_valueSTR_7_0= RULE_STRING ) )
                    	            // InternalMyDsl.g:851:7: (lv_valueSTR_7_0= RULE_STRING )
                    	            {
                    	            // InternalMyDsl.g:851:7: (lv_valueSTR_7_0= RULE_STRING )
                    	            // InternalMyDsl.g:852:8: lv_valueSTR_7_0= RULE_STRING
                    	            {
                    	            lv_valueSTR_7_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    	            								newLeafNode(lv_valueSTR_7_0, grammarAccess.getJSONAccess().getValueSTRSTRINGTerminalRuleCall_1_1_2_0_0());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getJSONRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"valueSTR",
                    	            									lv_valueSTR_7_0,
                    	            									"org.eclipse.xtext.common.Terminals.STRING");
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDsl.g:869:6: ( (lv_valueINT_8_0= RULE_INT ) )
                    	            {
                    	            // InternalMyDsl.g:869:6: ( (lv_valueINT_8_0= RULE_INT ) )
                    	            // InternalMyDsl.g:870:7: (lv_valueINT_8_0= RULE_INT )
                    	            {
                    	            // InternalMyDsl.g:870:7: (lv_valueINT_8_0= RULE_INT )
                    	            // InternalMyDsl.g:871:8: lv_valueINT_8_0= RULE_INT
                    	            {
                    	            lv_valueINT_8_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    	            								newLeafNode(lv_valueINT_8_0, grammarAccess.getJSONAccess().getValueINTINTTerminalRuleCall_1_1_2_1_0());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getJSONRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"valueINT",
                    	            									lv_valueINT_8_0,
                    	            									"org.eclipse.xtext.common.Terminals.INT");
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalMyDsl.g:888:6: ( (lv_valueID_9_0= RULE_ID ) )
                    	            {
                    	            // InternalMyDsl.g:888:6: ( (lv_valueID_9_0= RULE_ID ) )
                    	            // InternalMyDsl.g:889:7: (lv_valueID_9_0= RULE_ID )
                    	            {
                    	            // InternalMyDsl.g:889:7: (lv_valueID_9_0= RULE_ID )
                    	            // InternalMyDsl.g:890:8: lv_valueID_9_0= RULE_ID
                    	            {
                    	            lv_valueID_9_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	            								newLeafNode(lv_valueID_9_0, grammarAccess.getJSONAccess().getValueIDIDTerminalRuleCall_1_1_2_2_0());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getJSONRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"valueID",
                    	            									lv_valueID_9_0,
                    	            									"org.eclipse.xtext.common.Terminals.ID");
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_10=(Token)match(input,24,FOLLOW_16); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getJSONAccess().getSemicolonKeyword_1_1_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getJSONAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleJSON"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003EC802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000010L});

}