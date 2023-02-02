package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "','", "'by'", "'{'", "'}'", "'='", "';'", "':'", "'['", "']'", "'count'", "'read'", "'print'", "'writeJSON'", "'writeCSV'", "'remove'", "'add'", "'get'", "'sort'", "'show'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__SentencesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__SentencesAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__SentencesAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__SentencesAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__SentencesAssignment )*
            {
             before(grammarAccess.getModelAccess().getSentencesAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__SentencesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=22 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__SentencesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__SentencesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSentencesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFun"
    // InternalMyDsl.g:78:1: entryRuleFun : ruleFun EOF ;
    public final void entryRuleFun() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleFun EOF )
            // InternalMyDsl.g:80:1: ruleFun EOF
            {
             before(grammarAccess.getFunRule()); 
            pushFollow(FOLLOW_1);
            ruleFun();

            state._fsp--;

             after(grammarAccess.getFunRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // InternalMyDsl.g:87:1: ruleFun : ( ( rule__Fun__Alternatives ) ) ;
    public final void ruleFun() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Fun__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Fun__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Fun__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Fun__Alternatives )
            {
             before(grammarAccess.getFunAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Fun__Alternatives )
            // InternalMyDsl.g:94:4: rule__Fun__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Fun__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleCountJson"
    // InternalMyDsl.g:103:1: entryRuleCountJson : ruleCountJson EOF ;
    public final void entryRuleCountJson() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCountJson EOF )
            // InternalMyDsl.g:105:1: ruleCountJson EOF
            {
             before(grammarAccess.getCountJsonRule()); 
            pushFollow(FOLLOW_1);
            ruleCountJson();

            state._fsp--;

             after(grammarAccess.getCountJsonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCountJson"


    // $ANTLR start "ruleCountJson"
    // InternalMyDsl.g:112:1: ruleCountJson : ( ( rule__CountJson__Group__0 ) ) ;
    public final void ruleCountJson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__CountJson__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__CountJson__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__CountJson__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__CountJson__Group__0 )
            {
             before(grammarAccess.getCountJsonAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__CountJson__Group__0 )
            // InternalMyDsl.g:119:4: rule__CountJson__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountJson__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountJsonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountJson"


    // $ANTLR start "entryRuleReadJson"
    // InternalMyDsl.g:128:1: entryRuleReadJson : ruleReadJson EOF ;
    public final void entryRuleReadJson() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleReadJson EOF )
            // InternalMyDsl.g:130:1: ruleReadJson EOF
            {
             before(grammarAccess.getReadJsonRule()); 
            pushFollow(FOLLOW_1);
            ruleReadJson();

            state._fsp--;

             after(grammarAccess.getReadJsonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReadJson"


    // $ANTLR start "ruleReadJson"
    // InternalMyDsl.g:137:1: ruleReadJson : ( ( rule__ReadJson__Group__0 ) ) ;
    public final void ruleReadJson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ReadJson__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ReadJson__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ReadJson__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__ReadJson__Group__0 )
            {
             before(grammarAccess.getReadJsonAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ReadJson__Group__0 )
            // InternalMyDsl.g:144:4: rule__ReadJson__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReadJson__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadJsonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadJson"


    // $ANTLR start "entryRulePrintJson"
    // InternalMyDsl.g:153:1: entryRulePrintJson : rulePrintJson EOF ;
    public final void entryRulePrintJson() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePrintJson EOF )
            // InternalMyDsl.g:155:1: rulePrintJson EOF
            {
             before(grammarAccess.getPrintJsonRule()); 
            pushFollow(FOLLOW_1);
            rulePrintJson();

            state._fsp--;

             after(grammarAccess.getPrintJsonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrintJson"


    // $ANTLR start "rulePrintJson"
    // InternalMyDsl.g:162:1: rulePrintJson : ( ( rule__PrintJson__Group__0 ) ) ;
    public final void rulePrintJson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__PrintJson__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__PrintJson__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__PrintJson__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__PrintJson__Group__0 )
            {
             before(grammarAccess.getPrintJsonAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__PrintJson__Group__0 )
            // InternalMyDsl.g:169:4: rule__PrintJson__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintJson__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintJsonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintJson"


    // $ANTLR start "entryRuleWriteJson"
    // InternalMyDsl.g:178:1: entryRuleWriteJson : ruleWriteJson EOF ;
    public final void entryRuleWriteJson() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleWriteJson EOF )
            // InternalMyDsl.g:180:1: ruleWriteJson EOF
            {
             before(grammarAccess.getWriteJsonRule()); 
            pushFollow(FOLLOW_1);
            ruleWriteJson();

            state._fsp--;

             after(grammarAccess.getWriteJsonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWriteJson"


    // $ANTLR start "ruleWriteJson"
    // InternalMyDsl.g:187:1: ruleWriteJson : ( ( rule__WriteJson__Group__0 ) ) ;
    public final void ruleWriteJson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__WriteJson__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__WriteJson__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__WriteJson__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__WriteJson__Group__0 )
            {
             before(grammarAccess.getWriteJsonAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__WriteJson__Group__0 )
            // InternalMyDsl.g:194:4: rule__WriteJson__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WriteJson__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWriteJsonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWriteJson"


    // $ANTLR start "entryRuleWriteCSV"
    // InternalMyDsl.g:203:1: entryRuleWriteCSV : ruleWriteCSV EOF ;
    public final void entryRuleWriteCSV() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleWriteCSV EOF )
            // InternalMyDsl.g:205:1: ruleWriteCSV EOF
            {
             before(grammarAccess.getWriteCSVRule()); 
            pushFollow(FOLLOW_1);
            ruleWriteCSV();

            state._fsp--;

             after(grammarAccess.getWriteCSVRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWriteCSV"


    // $ANTLR start "ruleWriteCSV"
    // InternalMyDsl.g:212:1: ruleWriteCSV : ( ( rule__WriteCSV__Group__0 ) ) ;
    public final void ruleWriteCSV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__WriteCSV__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__WriteCSV__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__WriteCSV__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__WriteCSV__Group__0 )
            {
             before(grammarAccess.getWriteCSVAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__WriteCSV__Group__0 )
            // InternalMyDsl.g:219:4: rule__WriteCSV__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WriteCSV__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWriteCSVAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWriteCSV"


    // $ANTLR start "entryRuleRemove"
    // InternalMyDsl.g:228:1: entryRuleRemove : ruleRemove EOF ;
    public final void entryRuleRemove() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRemove EOF )
            // InternalMyDsl.g:230:1: ruleRemove EOF
            {
             before(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            ruleRemove();

            state._fsp--;

             after(grammarAccess.getRemoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalMyDsl.g:237:1: ruleRemove : ( ( rule__Remove__Group__0 ) ) ;
    public final void ruleRemove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Remove__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Remove__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Remove__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Remove__Group__0 )
            {
             before(grammarAccess.getRemoveAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Remove__Group__0 )
            // InternalMyDsl.g:244:4: rule__Remove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Remove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDsl.g:253:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleAdd EOF )
            // InternalMyDsl.g:255:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDsl.g:262:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Add__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Add__Group__0 )
            // InternalMyDsl.g:269:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleGet"
    // InternalMyDsl.g:278:1: entryRuleGet : ruleGet EOF ;
    public final void entryRuleGet() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleGet EOF )
            // InternalMyDsl.g:280:1: ruleGet EOF
            {
             before(grammarAccess.getGetRule()); 
            pushFollow(FOLLOW_1);
            ruleGet();

            state._fsp--;

             after(grammarAccess.getGetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGet"


    // $ANTLR start "ruleGet"
    // InternalMyDsl.g:287:1: ruleGet : ( ( rule__Get__Group__0 ) ) ;
    public final void ruleGet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Get__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Get__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Get__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Get__Group__0 )
            {
             before(grammarAccess.getGetAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Get__Group__0 )
            // InternalMyDsl.g:294:4: rule__Get__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Get__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGet"


    // $ANTLR start "entryRuleSort"
    // InternalMyDsl.g:303:1: entryRuleSort : ruleSort EOF ;
    public final void entryRuleSort() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleSort EOF )
            // InternalMyDsl.g:305:1: ruleSort EOF
            {
             before(grammarAccess.getSortRule()); 
            pushFollow(FOLLOW_1);
            ruleSort();

            state._fsp--;

             after(grammarAccess.getSortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSort"


    // $ANTLR start "ruleSort"
    // InternalMyDsl.g:312:1: ruleSort : ( ( rule__Sort__Group__0 ) ) ;
    public final void ruleSort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Sort__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Sort__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Sort__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Sort__Group__0 )
            {
             before(grammarAccess.getSortAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Sort__Group__0 )
            // InternalMyDsl.g:319:4: rule__Sort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSort"


    // $ANTLR start "entryRuleShow"
    // InternalMyDsl.g:328:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleShow EOF )
            // InternalMyDsl.g:330:1: ruleShow EOF
            {
             before(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            ruleShow();

            state._fsp--;

             after(grammarAccess.getShowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalMyDsl.g:337:1: ruleShow : ( ( rule__Show__Group__0 ) ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Show__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Show__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Show__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Show__Group__0 )
            {
             before(grammarAccess.getShowAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Show__Group__0 )
            // InternalMyDsl.g:344:4: rule__Show__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleTypeReference"
    // InternalMyDsl.g:353:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleTypeReference EOF )
            // InternalMyDsl.g:355:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalMyDsl.g:362:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__TypeReference__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__TypeReference__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__TypeReference__Alternatives )
            {
             before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__TypeReference__Alternatives )
            // InternalMyDsl.g:369:4: rule__TypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleTypeInt"
    // InternalMyDsl.g:378:1: entryRuleTypeInt : ruleTypeInt EOF ;
    public final void entryRuleTypeInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleTypeInt EOF )
            // InternalMyDsl.g:380:1: ruleTypeInt EOF
            {
             before(grammarAccess.getTypeIntRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeInt();

            state._fsp--;

             after(grammarAccess.getTypeIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeInt"


    // $ANTLR start "ruleTypeInt"
    // InternalMyDsl.g:387:1: ruleTypeInt : ( ( rule__TypeInt__ValAssignment ) ) ;
    public final void ruleTypeInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__TypeInt__ValAssignment ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__TypeInt__ValAssignment ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__TypeInt__ValAssignment ) )
            // InternalMyDsl.g:393:3: ( rule__TypeInt__ValAssignment )
            {
             before(grammarAccess.getTypeIntAccess().getValAssignment()); 
            // InternalMyDsl.g:394:3: ( rule__TypeInt__ValAssignment )
            // InternalMyDsl.g:394:4: rule__TypeInt__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeInt__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeIntAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeInt"


    // $ANTLR start "entryRuleTypeString"
    // InternalMyDsl.g:403:1: entryRuleTypeString : ruleTypeString EOF ;
    public final void entryRuleTypeString() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleTypeString EOF )
            // InternalMyDsl.g:405:1: ruleTypeString EOF
            {
             before(grammarAccess.getTypeStringRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeString();

            state._fsp--;

             after(grammarAccess.getTypeStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeString"


    // $ANTLR start "ruleTypeString"
    // InternalMyDsl.g:412:1: ruleTypeString : ( ( rule__TypeString__ValAssignment ) ) ;
    public final void ruleTypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__TypeString__ValAssignment ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__TypeString__ValAssignment ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__TypeString__ValAssignment ) )
            // InternalMyDsl.g:418:3: ( rule__TypeString__ValAssignment )
            {
             before(grammarAccess.getTypeStringAccess().getValAssignment()); 
            // InternalMyDsl.g:419:3: ( rule__TypeString__ValAssignment )
            // InternalMyDsl.g:419:4: rule__TypeString__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeString__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeStringAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeString"


    // $ANTLR start "entryRuleTypeJSON"
    // InternalMyDsl.g:428:1: entryRuleTypeJSON : ruleTypeJSON EOF ;
    public final void entryRuleTypeJSON() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleTypeJSON EOF )
            // InternalMyDsl.g:430:1: ruleTypeJSON EOF
            {
             before(grammarAccess.getTypeJSONRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeJSON();

            state._fsp--;

             after(grammarAccess.getTypeJSONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeJSON"


    // $ANTLR start "ruleTypeJSON"
    // InternalMyDsl.g:437:1: ruleTypeJSON : ( ( rule__TypeJSON__Alternatives ) ) ;
    public final void ruleTypeJSON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__TypeJSON__Alternatives ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__TypeJSON__Alternatives ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__TypeJSON__Alternatives ) )
            // InternalMyDsl.g:443:3: ( rule__TypeJSON__Alternatives )
            {
             before(grammarAccess.getTypeJSONAccess().getAlternatives()); 
            // InternalMyDsl.g:444:3: ( rule__TypeJSON__Alternatives )
            // InternalMyDsl.g:444:4: rule__TypeJSON__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeJSON"


    // $ANTLR start "rule__Fun__Alternatives"
    // InternalMyDsl.g:452:1: rule__Fun__Alternatives : ( ( ruleCountJson ) | ( ruleReadJson ) | ( rulePrintJson ) | ( ruleWriteJson ) | ( ruleWriteCSV ) | ( ruleRemove ) | ( ruleAdd ) | ( ruleGet ) | ( ruleSort ) | ( ruleShow ) );
    public final void rule__Fun__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:456:1: ( ( ruleCountJson ) | ( ruleReadJson ) | ( rulePrintJson ) | ( ruleWriteJson ) | ( ruleWriteCSV ) | ( ruleRemove ) | ( ruleAdd ) | ( ruleGet ) | ( ruleSort ) | ( ruleShow ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case 27:
                {
                alt2=6;
                }
                break;
            case 28:
                {
                alt2=7;
                }
                break;
            case 29:
                {
                alt2=8;
                }
                break;
            case 30:
                {
                alt2=9;
                }
                break;
            case 31:
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
                    // InternalMyDsl.g:457:2: ( ruleCountJson )
                    {
                    // InternalMyDsl.g:457:2: ( ruleCountJson )
                    // InternalMyDsl.g:458:3: ruleCountJson
                    {
                     before(grammarAccess.getFunAccess().getCountJsonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCountJson();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getCountJsonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:463:2: ( ruleReadJson )
                    {
                    // InternalMyDsl.g:463:2: ( ruleReadJson )
                    // InternalMyDsl.g:464:3: ruleReadJson
                    {
                     before(grammarAccess.getFunAccess().getReadJsonParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReadJson();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getReadJsonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:469:2: ( rulePrintJson )
                    {
                    // InternalMyDsl.g:469:2: ( rulePrintJson )
                    // InternalMyDsl.g:470:3: rulePrintJson
                    {
                     before(grammarAccess.getFunAccess().getPrintJsonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrintJson();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getPrintJsonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:475:2: ( ruleWriteJson )
                    {
                    // InternalMyDsl.g:475:2: ( ruleWriteJson )
                    // InternalMyDsl.g:476:3: ruleWriteJson
                    {
                     before(grammarAccess.getFunAccess().getWriteJsonParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWriteJson();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getWriteJsonParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:481:2: ( ruleWriteCSV )
                    {
                    // InternalMyDsl.g:481:2: ( ruleWriteCSV )
                    // InternalMyDsl.g:482:3: ruleWriteCSV
                    {
                     before(grammarAccess.getFunAccess().getWriteCSVParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleWriteCSV();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getWriteCSVParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:487:2: ( ruleRemove )
                    {
                    // InternalMyDsl.g:487:2: ( ruleRemove )
                    // InternalMyDsl.g:488:3: ruleRemove
                    {
                     before(grammarAccess.getFunAccess().getRemoveParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleRemove();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getRemoveParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:493:2: ( ruleAdd )
                    {
                    // InternalMyDsl.g:493:2: ( ruleAdd )
                    // InternalMyDsl.g:494:3: ruleAdd
                    {
                     before(grammarAccess.getFunAccess().getAddParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getAddParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:499:2: ( ruleGet )
                    {
                    // InternalMyDsl.g:499:2: ( ruleGet )
                    // InternalMyDsl.g:500:3: ruleGet
                    {
                     before(grammarAccess.getFunAccess().getGetParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleGet();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getGetParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:505:2: ( ruleSort )
                    {
                    // InternalMyDsl.g:505:2: ( ruleSort )
                    // InternalMyDsl.g:506:3: ruleSort
                    {
                     before(grammarAccess.getFunAccess().getSortParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleSort();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getSortParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:511:2: ( ruleShow )
                    {
                    // InternalMyDsl.g:511:2: ( ruleShow )
                    // InternalMyDsl.g:512:3: ruleShow
                    {
                     before(grammarAccess.getFunAccess().getShowParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleShow();

                    state._fsp--;

                     after(grammarAccess.getFunAccess().getShowParserRuleCall_9()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Alternatives"


    // $ANTLR start "rule__TypeReference__Alternatives"
    // InternalMyDsl.g:521:1: rule__TypeReference__Alternatives : ( ( ruleTypeInt ) | ( ruleTypeString ) | ( ruleTypeJSON ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:525:1: ( ( ruleTypeInt ) | ( ruleTypeString ) | ( ruleTypeJSON ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:526:2: ( ruleTypeInt )
                    {
                    // InternalMyDsl.g:526:2: ( ruleTypeInt )
                    // InternalMyDsl.g:527:3: ruleTypeInt
                    {
                     before(grammarAccess.getTypeReferenceAccess().getTypeIntParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeInt();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getTypeIntParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:532:2: ( ruleTypeString )
                    {
                    // InternalMyDsl.g:532:2: ( ruleTypeString )
                    // InternalMyDsl.g:533:3: ruleTypeString
                    {
                     before(grammarAccess.getTypeReferenceAccess().getTypeStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeString();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getTypeStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:538:2: ( ruleTypeJSON )
                    {
                    // InternalMyDsl.g:538:2: ( ruleTypeJSON )
                    // InternalMyDsl.g:539:3: ruleTypeJSON
                    {
                     before(grammarAccess.getTypeReferenceAccess().getTypeJSONParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeJSON();

                    state._fsp--;

                     after(grammarAccess.getTypeReferenceAccess().getTypeJSONParserRuleCall_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Alternatives"


    // $ANTLR start "rule__TypeJSON__Alternatives"
    // InternalMyDsl.g:548:1: rule__TypeJSON__Alternatives : ( ( ( rule__TypeJSON__Group_0__0 ) ) | ( ( rule__TypeJSON__Group_1__0 ) ) | ( ( rule__TypeJSON__Group_2__0 ) ) );
    public final void rule__TypeJSON__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:552:1: ( ( ( rule__TypeJSON__Group_0__0 ) ) | ( ( rule__TypeJSON__Group_1__0 ) ) | ( ( rule__TypeJSON__Group_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==19) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==20) ) {
                            alt4=3;
                        }
                        else if ( (LA4_3==15) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_2==17) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:553:2: ( ( rule__TypeJSON__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:553:2: ( ( rule__TypeJSON__Group_0__0 ) )
                    // InternalMyDsl.g:554:3: ( rule__TypeJSON__Group_0__0 )
                    {
                     before(grammarAccess.getTypeJSONAccess().getGroup_0()); 
                    // InternalMyDsl.g:555:3: ( rule__TypeJSON__Group_0__0 )
                    // InternalMyDsl.g:555:4: rule__TypeJSON__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeJSON__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeJSONAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:559:2: ( ( rule__TypeJSON__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:559:2: ( ( rule__TypeJSON__Group_1__0 ) )
                    // InternalMyDsl.g:560:3: ( rule__TypeJSON__Group_1__0 )
                    {
                     before(grammarAccess.getTypeJSONAccess().getGroup_1()); 
                    // InternalMyDsl.g:561:3: ( rule__TypeJSON__Group_1__0 )
                    // InternalMyDsl.g:561:4: rule__TypeJSON__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeJSON__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeJSONAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:565:2: ( ( rule__TypeJSON__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:565:2: ( ( rule__TypeJSON__Group_2__0 ) )
                    // InternalMyDsl.g:566:3: ( rule__TypeJSON__Group_2__0 )
                    {
                     before(grammarAccess.getTypeJSONAccess().getGroup_2()); 
                    // InternalMyDsl.g:567:3: ( rule__TypeJSON__Group_2__0 )
                    // InternalMyDsl.g:567:4: rule__TypeJSON__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeJSON__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeJSONAccess().getGroup_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Alternatives"


    // $ANTLR start "rule__CountJson__Group__0"
    // InternalMyDsl.g:575:1: rule__CountJson__Group__0 : rule__CountJson__Group__0__Impl rule__CountJson__Group__1 ;
    public final void rule__CountJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:579:1: ( rule__CountJson__Group__0__Impl rule__CountJson__Group__1 )
            // InternalMyDsl.g:580:2: rule__CountJson__Group__0__Impl rule__CountJson__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CountJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountJson__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__Group__0"


    // $ANTLR start "rule__CountJson__Group__0__Impl"
    // InternalMyDsl.g:587:1: rule__CountJson__Group__0__Impl : ( ( rule__CountJson__CountJSONAssignment_0 ) ) ;
    public final void rule__CountJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( ( ( rule__CountJson__CountJSONAssignment_0 ) ) )
            // InternalMyDsl.g:592:1: ( ( rule__CountJson__CountJSONAssignment_0 ) )
            {
            // InternalMyDsl.g:592:1: ( ( rule__CountJson__CountJSONAssignment_0 ) )
            // InternalMyDsl.g:593:2: ( rule__CountJson__CountJSONAssignment_0 )
            {
             before(grammarAccess.getCountJsonAccess().getCountJSONAssignment_0()); 
            // InternalMyDsl.g:594:2: ( rule__CountJson__CountJSONAssignment_0 )
            // InternalMyDsl.g:594:3: rule__CountJson__CountJSONAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CountJson__CountJSONAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCountJsonAccess().getCountJSONAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__Group__0__Impl"


    // $ANTLR start "rule__CountJson__Group__1"
    // InternalMyDsl.g:602:1: rule__CountJson__Group__1 : rule__CountJson__Group__1__Impl rule__CountJson__Group__2 ;
    public final void rule__CountJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:606:1: ( rule__CountJson__Group__1__Impl rule__CountJson__Group__2 )
            // InternalMyDsl.g:607:2: rule__CountJson__Group__1__Impl rule__CountJson__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CountJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountJson__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__Group__1"


    // $ANTLR start "rule__CountJson__Group__1__Impl"
    // InternalMyDsl.g:614:1: rule__CountJson__Group__1__Impl : ( '(' ) ;
    public final void rule__CountJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:618:1: ( ( '(' ) )
            // InternalMyDsl.g:619:1: ( '(' )
            {
            // InternalMyDsl.g:619:1: ( '(' )
            // InternalMyDsl.g:620:2: '('
            {
             before(grammarAccess.getCountJsonAccess().getLeftParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCountJsonAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__Group__1__Impl"


    // $ANTLR start "rule__CountJson__Group__2"
    // InternalMyDsl.g:629:1: rule__CountJson__Group__2 : rule__CountJson__Group__2__Impl rule__CountJson__Group__3 ;
    public final void rule__CountJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:633:1: ( rule__CountJson__Group__2__Impl rule__CountJson__Group__3 )
            // InternalMyDsl.g:634:2: rule__CountJson__Group__2__Impl rule__CountJson__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CountJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountJson__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__Group__2"


    // $ANTLR start "rule__CountJson__Group__2__Impl"
    // InternalMyDsl.g:641:1: rule__CountJson__Group__2__Impl : ( ( rule__CountJson__ValueAssignment_2 ) ) ;
    public final void rule__CountJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:645:1: ( ( ( rule__CountJson__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:646:1: ( ( rule__CountJson__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:646:1: ( ( rule__CountJson__ValueAssignment_2 ) )
            // InternalMyDsl.g:647:2: ( rule__CountJson__ValueAssignment_2 )
            {
             before(grammarAccess.getCountJsonAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:648:2: ( rule__CountJson__ValueAssignment_2 )
            // InternalMyDsl.g:648:3: rule__CountJson__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CountJson__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCountJsonAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__Group__2__Impl"


    // $ANTLR start "rule__CountJson__Group__3"
    // InternalMyDsl.g:656:1: rule__CountJson__Group__3 : rule__CountJson__Group__3__Impl ;
    public final void rule__CountJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:660:1: ( rule__CountJson__Group__3__Impl )
            // InternalMyDsl.g:661:2: rule__CountJson__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountJson__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__Group__3"


    // $ANTLR start "rule__CountJson__Group__3__Impl"
    // InternalMyDsl.g:667:1: rule__CountJson__Group__3__Impl : ( ')' ) ;
    public final void rule__CountJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( ')' ) )
            // InternalMyDsl.g:672:1: ( ')' )
            {
            // InternalMyDsl.g:672:1: ( ')' )
            // InternalMyDsl.g:673:2: ')'
            {
             before(grammarAccess.getCountJsonAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCountJsonAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__Group__3__Impl"


    // $ANTLR start "rule__ReadJson__Group__0"
    // InternalMyDsl.g:683:1: rule__ReadJson__Group__0 : rule__ReadJson__Group__0__Impl rule__ReadJson__Group__1 ;
    public final void rule__ReadJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( rule__ReadJson__Group__0__Impl rule__ReadJson__Group__1 )
            // InternalMyDsl.g:688:2: rule__ReadJson__Group__0__Impl rule__ReadJson__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ReadJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadJson__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__Group__0"


    // $ANTLR start "rule__ReadJson__Group__0__Impl"
    // InternalMyDsl.g:695:1: rule__ReadJson__Group__0__Impl : ( ( rule__ReadJson__ReadJSONAssignment_0 ) ) ;
    public final void rule__ReadJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:699:1: ( ( ( rule__ReadJson__ReadJSONAssignment_0 ) ) )
            // InternalMyDsl.g:700:1: ( ( rule__ReadJson__ReadJSONAssignment_0 ) )
            {
            // InternalMyDsl.g:700:1: ( ( rule__ReadJson__ReadJSONAssignment_0 ) )
            // InternalMyDsl.g:701:2: ( rule__ReadJson__ReadJSONAssignment_0 )
            {
             before(grammarAccess.getReadJsonAccess().getReadJSONAssignment_0()); 
            // InternalMyDsl.g:702:2: ( rule__ReadJson__ReadJSONAssignment_0 )
            // InternalMyDsl.g:702:3: rule__ReadJson__ReadJSONAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReadJson__ReadJSONAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReadJsonAccess().getReadJSONAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__Group__0__Impl"


    // $ANTLR start "rule__ReadJson__Group__1"
    // InternalMyDsl.g:710:1: rule__ReadJson__Group__1 : rule__ReadJson__Group__1__Impl rule__ReadJson__Group__2 ;
    public final void rule__ReadJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:714:1: ( rule__ReadJson__Group__1__Impl rule__ReadJson__Group__2 )
            // InternalMyDsl.g:715:2: rule__ReadJson__Group__1__Impl rule__ReadJson__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReadJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadJson__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__Group__1"


    // $ANTLR start "rule__ReadJson__Group__1__Impl"
    // InternalMyDsl.g:722:1: rule__ReadJson__Group__1__Impl : ( '(' ) ;
    public final void rule__ReadJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:726:1: ( ( '(' ) )
            // InternalMyDsl.g:727:1: ( '(' )
            {
            // InternalMyDsl.g:727:1: ( '(' )
            // InternalMyDsl.g:728:2: '('
            {
             before(grammarAccess.getReadJsonAccess().getLeftParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getReadJsonAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__Group__1__Impl"


    // $ANTLR start "rule__ReadJson__Group__2"
    // InternalMyDsl.g:737:1: rule__ReadJson__Group__2 : rule__ReadJson__Group__2__Impl rule__ReadJson__Group__3 ;
    public final void rule__ReadJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:1: ( rule__ReadJson__Group__2__Impl rule__ReadJson__Group__3 )
            // InternalMyDsl.g:742:2: rule__ReadJson__Group__2__Impl rule__ReadJson__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ReadJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadJson__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__Group__2"


    // $ANTLR start "rule__ReadJson__Group__2__Impl"
    // InternalMyDsl.g:749:1: rule__ReadJson__Group__2__Impl : ( ( rule__ReadJson__PathAssignment_2 ) ) ;
    public final void rule__ReadJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:753:1: ( ( ( rule__ReadJson__PathAssignment_2 ) ) )
            // InternalMyDsl.g:754:1: ( ( rule__ReadJson__PathAssignment_2 ) )
            {
            // InternalMyDsl.g:754:1: ( ( rule__ReadJson__PathAssignment_2 ) )
            // InternalMyDsl.g:755:2: ( rule__ReadJson__PathAssignment_2 )
            {
             before(grammarAccess.getReadJsonAccess().getPathAssignment_2()); 
            // InternalMyDsl.g:756:2: ( rule__ReadJson__PathAssignment_2 )
            // InternalMyDsl.g:756:3: rule__ReadJson__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReadJson__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReadJsonAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__Group__2__Impl"


    // $ANTLR start "rule__ReadJson__Group__3"
    // InternalMyDsl.g:764:1: rule__ReadJson__Group__3 : rule__ReadJson__Group__3__Impl ;
    public final void rule__ReadJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:768:1: ( rule__ReadJson__Group__3__Impl )
            // InternalMyDsl.g:769:2: rule__ReadJson__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReadJson__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__Group__3"


    // $ANTLR start "rule__ReadJson__Group__3__Impl"
    // InternalMyDsl.g:775:1: rule__ReadJson__Group__3__Impl : ( ')' ) ;
    public final void rule__ReadJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( ')' ) )
            // InternalMyDsl.g:780:1: ( ')' )
            {
            // InternalMyDsl.g:780:1: ( ')' )
            // InternalMyDsl.g:781:2: ')'
            {
             before(grammarAccess.getReadJsonAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReadJsonAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__Group__3__Impl"


    // $ANTLR start "rule__PrintJson__Group__0"
    // InternalMyDsl.g:791:1: rule__PrintJson__Group__0 : rule__PrintJson__Group__0__Impl rule__PrintJson__Group__1 ;
    public final void rule__PrintJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( rule__PrintJson__Group__0__Impl rule__PrintJson__Group__1 )
            // InternalMyDsl.g:796:2: rule__PrintJson__Group__0__Impl rule__PrintJson__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PrintJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintJson__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__Group__0"


    // $ANTLR start "rule__PrintJson__Group__0__Impl"
    // InternalMyDsl.g:803:1: rule__PrintJson__Group__0__Impl : ( ( rule__PrintJson__PrintJsonAssignment_0 ) ) ;
    public final void rule__PrintJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:807:1: ( ( ( rule__PrintJson__PrintJsonAssignment_0 ) ) )
            // InternalMyDsl.g:808:1: ( ( rule__PrintJson__PrintJsonAssignment_0 ) )
            {
            // InternalMyDsl.g:808:1: ( ( rule__PrintJson__PrintJsonAssignment_0 ) )
            // InternalMyDsl.g:809:2: ( rule__PrintJson__PrintJsonAssignment_0 )
            {
             before(grammarAccess.getPrintJsonAccess().getPrintJsonAssignment_0()); 
            // InternalMyDsl.g:810:2: ( rule__PrintJson__PrintJsonAssignment_0 )
            // InternalMyDsl.g:810:3: rule__PrintJson__PrintJsonAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrintJson__PrintJsonAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrintJsonAccess().getPrintJsonAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__Group__0__Impl"


    // $ANTLR start "rule__PrintJson__Group__1"
    // InternalMyDsl.g:818:1: rule__PrintJson__Group__1 : rule__PrintJson__Group__1__Impl rule__PrintJson__Group__2 ;
    public final void rule__PrintJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:822:1: ( rule__PrintJson__Group__1__Impl rule__PrintJson__Group__2 )
            // InternalMyDsl.g:823:2: rule__PrintJson__Group__1__Impl rule__PrintJson__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PrintJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintJson__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__Group__1"


    // $ANTLR start "rule__PrintJson__Group__1__Impl"
    // InternalMyDsl.g:830:1: rule__PrintJson__Group__1__Impl : ( '(' ) ;
    public final void rule__PrintJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( ( '(' ) )
            // InternalMyDsl.g:835:1: ( '(' )
            {
            // InternalMyDsl.g:835:1: ( '(' )
            // InternalMyDsl.g:836:2: '('
            {
             before(grammarAccess.getPrintJsonAccess().getLeftParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPrintJsonAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__Group__1__Impl"


    // $ANTLR start "rule__PrintJson__Group__2"
    // InternalMyDsl.g:845:1: rule__PrintJson__Group__2 : rule__PrintJson__Group__2__Impl rule__PrintJson__Group__3 ;
    public final void rule__PrintJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:849:1: ( rule__PrintJson__Group__2__Impl rule__PrintJson__Group__3 )
            // InternalMyDsl.g:850:2: rule__PrintJson__Group__2__Impl rule__PrintJson__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PrintJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintJson__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__Group__2"


    // $ANTLR start "rule__PrintJson__Group__2__Impl"
    // InternalMyDsl.g:857:1: rule__PrintJson__Group__2__Impl : ( ( rule__PrintJson__ValueAssignment_2 ) ) ;
    public final void rule__PrintJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:861:1: ( ( ( rule__PrintJson__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:862:1: ( ( rule__PrintJson__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:862:1: ( ( rule__PrintJson__ValueAssignment_2 ) )
            // InternalMyDsl.g:863:2: ( rule__PrintJson__ValueAssignment_2 )
            {
             before(grammarAccess.getPrintJsonAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:864:2: ( rule__PrintJson__ValueAssignment_2 )
            // InternalMyDsl.g:864:3: rule__PrintJson__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PrintJson__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrintJsonAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__Group__2__Impl"


    // $ANTLR start "rule__PrintJson__Group__3"
    // InternalMyDsl.g:872:1: rule__PrintJson__Group__3 : rule__PrintJson__Group__3__Impl ;
    public final void rule__PrintJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:876:1: ( rule__PrintJson__Group__3__Impl )
            // InternalMyDsl.g:877:2: rule__PrintJson__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintJson__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__Group__3"


    // $ANTLR start "rule__PrintJson__Group__3__Impl"
    // InternalMyDsl.g:883:1: rule__PrintJson__Group__3__Impl : ( ')' ) ;
    public final void rule__PrintJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( ( ')' ) )
            // InternalMyDsl.g:888:1: ( ')' )
            {
            // InternalMyDsl.g:888:1: ( ')' )
            // InternalMyDsl.g:889:2: ')'
            {
             before(grammarAccess.getPrintJsonAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPrintJsonAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__Group__3__Impl"


    // $ANTLR start "rule__WriteJson__Group__0"
    // InternalMyDsl.g:899:1: rule__WriteJson__Group__0 : rule__WriteJson__Group__0__Impl rule__WriteJson__Group__1 ;
    public final void rule__WriteJson__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:903:1: ( rule__WriteJson__Group__0__Impl rule__WriteJson__Group__1 )
            // InternalMyDsl.g:904:2: rule__WriteJson__Group__0__Impl rule__WriteJson__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WriteJson__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteJson__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__0"


    // $ANTLR start "rule__WriteJson__Group__0__Impl"
    // InternalMyDsl.g:911:1: rule__WriteJson__Group__0__Impl : ( ( rule__WriteJson__WriteJSONAssignment_0 ) ) ;
    public final void rule__WriteJson__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:915:1: ( ( ( rule__WriteJson__WriteJSONAssignment_0 ) ) )
            // InternalMyDsl.g:916:1: ( ( rule__WriteJson__WriteJSONAssignment_0 ) )
            {
            // InternalMyDsl.g:916:1: ( ( rule__WriteJson__WriteJSONAssignment_0 ) )
            // InternalMyDsl.g:917:2: ( rule__WriteJson__WriteJSONAssignment_0 )
            {
             before(grammarAccess.getWriteJsonAccess().getWriteJSONAssignment_0()); 
            // InternalMyDsl.g:918:2: ( rule__WriteJson__WriteJSONAssignment_0 )
            // InternalMyDsl.g:918:3: rule__WriteJson__WriteJSONAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WriteJson__WriteJSONAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWriteJsonAccess().getWriteJSONAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__0__Impl"


    // $ANTLR start "rule__WriteJson__Group__1"
    // InternalMyDsl.g:926:1: rule__WriteJson__Group__1 : rule__WriteJson__Group__1__Impl rule__WriteJson__Group__2 ;
    public final void rule__WriteJson__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:930:1: ( rule__WriteJson__Group__1__Impl rule__WriteJson__Group__2 )
            // InternalMyDsl.g:931:2: rule__WriteJson__Group__1__Impl rule__WriteJson__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__WriteJson__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteJson__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__1"


    // $ANTLR start "rule__WriteJson__Group__1__Impl"
    // InternalMyDsl.g:938:1: rule__WriteJson__Group__1__Impl : ( '(' ) ;
    public final void rule__WriteJson__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:942:1: ( ( '(' ) )
            // InternalMyDsl.g:943:1: ( '(' )
            {
            // InternalMyDsl.g:943:1: ( '(' )
            // InternalMyDsl.g:944:2: '('
            {
             before(grammarAccess.getWriteJsonAccess().getLeftParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWriteJsonAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__1__Impl"


    // $ANTLR start "rule__WriteJson__Group__2"
    // InternalMyDsl.g:953:1: rule__WriteJson__Group__2 : rule__WriteJson__Group__2__Impl rule__WriteJson__Group__3 ;
    public final void rule__WriteJson__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:957:1: ( rule__WriteJson__Group__2__Impl rule__WriteJson__Group__3 )
            // InternalMyDsl.g:958:2: rule__WriteJson__Group__2__Impl rule__WriteJson__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__WriteJson__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteJson__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__2"


    // $ANTLR start "rule__WriteJson__Group__2__Impl"
    // InternalMyDsl.g:965:1: rule__WriteJson__Group__2__Impl : ( ( rule__WriteJson__PathAssignment_2 ) ) ;
    public final void rule__WriteJson__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:969:1: ( ( ( rule__WriteJson__PathAssignment_2 ) ) )
            // InternalMyDsl.g:970:1: ( ( rule__WriteJson__PathAssignment_2 ) )
            {
            // InternalMyDsl.g:970:1: ( ( rule__WriteJson__PathAssignment_2 ) )
            // InternalMyDsl.g:971:2: ( rule__WriteJson__PathAssignment_2 )
            {
             before(grammarAccess.getWriteJsonAccess().getPathAssignment_2()); 
            // InternalMyDsl.g:972:2: ( rule__WriteJson__PathAssignment_2 )
            // InternalMyDsl.g:972:3: rule__WriteJson__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WriteJson__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWriteJsonAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__2__Impl"


    // $ANTLR start "rule__WriteJson__Group__3"
    // InternalMyDsl.g:980:1: rule__WriteJson__Group__3 : rule__WriteJson__Group__3__Impl rule__WriteJson__Group__4 ;
    public final void rule__WriteJson__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:984:1: ( rule__WriteJson__Group__3__Impl rule__WriteJson__Group__4 )
            // InternalMyDsl.g:985:2: rule__WriteJson__Group__3__Impl rule__WriteJson__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__WriteJson__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteJson__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__3"


    // $ANTLR start "rule__WriteJson__Group__3__Impl"
    // InternalMyDsl.g:992:1: rule__WriteJson__Group__3__Impl : ( ( rule__WriteJson__Group_3__0 )? ) ;
    public final void rule__WriteJson__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:996:1: ( ( ( rule__WriteJson__Group_3__0 )? ) )
            // InternalMyDsl.g:997:1: ( ( rule__WriteJson__Group_3__0 )? )
            {
            // InternalMyDsl.g:997:1: ( ( rule__WriteJson__Group_3__0 )? )
            // InternalMyDsl.g:998:2: ( rule__WriteJson__Group_3__0 )?
            {
             before(grammarAccess.getWriteJsonAccess().getGroup_3()); 
            // InternalMyDsl.g:999:2: ( rule__WriteJson__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:999:3: rule__WriteJson__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WriteJson__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWriteJsonAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__3__Impl"


    // $ANTLR start "rule__WriteJson__Group__4"
    // InternalMyDsl.g:1007:1: rule__WriteJson__Group__4 : rule__WriteJson__Group__4__Impl ;
    public final void rule__WriteJson__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( rule__WriteJson__Group__4__Impl )
            // InternalMyDsl.g:1012:2: rule__WriteJson__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteJson__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__4"


    // $ANTLR start "rule__WriteJson__Group__4__Impl"
    // InternalMyDsl.g:1018:1: rule__WriteJson__Group__4__Impl : ( ')' ) ;
    public final void rule__WriteJson__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( ')' ) )
            // InternalMyDsl.g:1023:1: ( ')' )
            {
            // InternalMyDsl.g:1023:1: ( ')' )
            // InternalMyDsl.g:1024:2: ')'
            {
             before(grammarAccess.getWriteJsonAccess().getRightParenthesisKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWriteJsonAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group__4__Impl"


    // $ANTLR start "rule__WriteJson__Group_3__0"
    // InternalMyDsl.g:1034:1: rule__WriteJson__Group_3__0 : rule__WriteJson__Group_3__0__Impl rule__WriteJson__Group_3__1 ;
    public final void rule__WriteJson__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1038:1: ( rule__WriteJson__Group_3__0__Impl rule__WriteJson__Group_3__1 )
            // InternalMyDsl.g:1039:2: rule__WriteJson__Group_3__0__Impl rule__WriteJson__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__WriteJson__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteJson__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group_3__0"


    // $ANTLR start "rule__WriteJson__Group_3__0__Impl"
    // InternalMyDsl.g:1046:1: rule__WriteJson__Group_3__0__Impl : ( ',' ) ;
    public final void rule__WriteJson__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1050:1: ( ( ',' ) )
            // InternalMyDsl.g:1051:1: ( ',' )
            {
            // InternalMyDsl.g:1051:1: ( ',' )
            // InternalMyDsl.g:1052:2: ','
            {
             before(grammarAccess.getWriteJsonAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWriteJsonAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group_3__0__Impl"


    // $ANTLR start "rule__WriteJson__Group_3__1"
    // InternalMyDsl.g:1061:1: rule__WriteJson__Group_3__1 : rule__WriteJson__Group_3__1__Impl ;
    public final void rule__WriteJson__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1065:1: ( rule__WriteJson__Group_3__1__Impl )
            // InternalMyDsl.g:1066:2: rule__WriteJson__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteJson__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group_3__1"


    // $ANTLR start "rule__WriteJson__Group_3__1__Impl"
    // InternalMyDsl.g:1072:1: rule__WriteJson__Group_3__1__Impl : ( ( rule__WriteJson__ValueAssignment_3_1 ) ) ;
    public final void rule__WriteJson__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( ( ( rule__WriteJson__ValueAssignment_3_1 ) ) )
            // InternalMyDsl.g:1077:1: ( ( rule__WriteJson__ValueAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1077:1: ( ( rule__WriteJson__ValueAssignment_3_1 ) )
            // InternalMyDsl.g:1078:2: ( rule__WriteJson__ValueAssignment_3_1 )
            {
             before(grammarAccess.getWriteJsonAccess().getValueAssignment_3_1()); 
            // InternalMyDsl.g:1079:2: ( rule__WriteJson__ValueAssignment_3_1 )
            // InternalMyDsl.g:1079:3: rule__WriteJson__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WriteJson__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWriteJsonAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__Group_3__1__Impl"


    // $ANTLR start "rule__WriteCSV__Group__0"
    // InternalMyDsl.g:1088:1: rule__WriteCSV__Group__0 : rule__WriteCSV__Group__0__Impl rule__WriteCSV__Group__1 ;
    public final void rule__WriteCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1092:1: ( rule__WriteCSV__Group__0__Impl rule__WriteCSV__Group__1 )
            // InternalMyDsl.g:1093:2: rule__WriteCSV__Group__0__Impl rule__WriteCSV__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WriteCSV__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteCSV__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__0"


    // $ANTLR start "rule__WriteCSV__Group__0__Impl"
    // InternalMyDsl.g:1100:1: rule__WriteCSV__Group__0__Impl : ( ( rule__WriteCSV__WriteCVSAssignment_0 ) ) ;
    public final void rule__WriteCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( ( ( rule__WriteCSV__WriteCVSAssignment_0 ) ) )
            // InternalMyDsl.g:1105:1: ( ( rule__WriteCSV__WriteCVSAssignment_0 ) )
            {
            // InternalMyDsl.g:1105:1: ( ( rule__WriteCSV__WriteCVSAssignment_0 ) )
            // InternalMyDsl.g:1106:2: ( rule__WriteCSV__WriteCVSAssignment_0 )
            {
             before(grammarAccess.getWriteCSVAccess().getWriteCVSAssignment_0()); 
            // InternalMyDsl.g:1107:2: ( rule__WriteCSV__WriteCVSAssignment_0 )
            // InternalMyDsl.g:1107:3: rule__WriteCSV__WriteCVSAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WriteCSV__WriteCVSAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWriteCSVAccess().getWriteCVSAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__0__Impl"


    // $ANTLR start "rule__WriteCSV__Group__1"
    // InternalMyDsl.g:1115:1: rule__WriteCSV__Group__1 : rule__WriteCSV__Group__1__Impl rule__WriteCSV__Group__2 ;
    public final void rule__WriteCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1119:1: ( rule__WriteCSV__Group__1__Impl rule__WriteCSV__Group__2 )
            // InternalMyDsl.g:1120:2: rule__WriteCSV__Group__1__Impl rule__WriteCSV__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__WriteCSV__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteCSV__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__1"


    // $ANTLR start "rule__WriteCSV__Group__1__Impl"
    // InternalMyDsl.g:1127:1: rule__WriteCSV__Group__1__Impl : ( '(' ) ;
    public final void rule__WriteCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( ( '(' ) )
            // InternalMyDsl.g:1132:1: ( '(' )
            {
            // InternalMyDsl.g:1132:1: ( '(' )
            // InternalMyDsl.g:1133:2: '('
            {
             before(grammarAccess.getWriteCSVAccess().getLeftParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWriteCSVAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__1__Impl"


    // $ANTLR start "rule__WriteCSV__Group__2"
    // InternalMyDsl.g:1142:1: rule__WriteCSV__Group__2 : rule__WriteCSV__Group__2__Impl rule__WriteCSV__Group__3 ;
    public final void rule__WriteCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1146:1: ( rule__WriteCSV__Group__2__Impl rule__WriteCSV__Group__3 )
            // InternalMyDsl.g:1147:2: rule__WriteCSV__Group__2__Impl rule__WriteCSV__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__WriteCSV__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteCSV__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__2"


    // $ANTLR start "rule__WriteCSV__Group__2__Impl"
    // InternalMyDsl.g:1154:1: rule__WriteCSV__Group__2__Impl : ( ( rule__WriteCSV__PathAssignment_2 ) ) ;
    public final void rule__WriteCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( ( ( rule__WriteCSV__PathAssignment_2 ) ) )
            // InternalMyDsl.g:1159:1: ( ( rule__WriteCSV__PathAssignment_2 ) )
            {
            // InternalMyDsl.g:1159:1: ( ( rule__WriteCSV__PathAssignment_2 ) )
            // InternalMyDsl.g:1160:2: ( rule__WriteCSV__PathAssignment_2 )
            {
             before(grammarAccess.getWriteCSVAccess().getPathAssignment_2()); 
            // InternalMyDsl.g:1161:2: ( rule__WriteCSV__PathAssignment_2 )
            // InternalMyDsl.g:1161:3: rule__WriteCSV__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WriteCSV__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWriteCSVAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__2__Impl"


    // $ANTLR start "rule__WriteCSV__Group__3"
    // InternalMyDsl.g:1169:1: rule__WriteCSV__Group__3 : rule__WriteCSV__Group__3__Impl rule__WriteCSV__Group__4 ;
    public final void rule__WriteCSV__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1173:1: ( rule__WriteCSV__Group__3__Impl rule__WriteCSV__Group__4 )
            // InternalMyDsl.g:1174:2: rule__WriteCSV__Group__3__Impl rule__WriteCSV__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__WriteCSV__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteCSV__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__3"


    // $ANTLR start "rule__WriteCSV__Group__3__Impl"
    // InternalMyDsl.g:1181:1: rule__WriteCSV__Group__3__Impl : ( ( rule__WriteCSV__Group_3__0 )? ) ;
    public final void rule__WriteCSV__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( ( ( rule__WriteCSV__Group_3__0 )? ) )
            // InternalMyDsl.g:1186:1: ( ( rule__WriteCSV__Group_3__0 )? )
            {
            // InternalMyDsl.g:1186:1: ( ( rule__WriteCSV__Group_3__0 )? )
            // InternalMyDsl.g:1187:2: ( rule__WriteCSV__Group_3__0 )?
            {
             before(grammarAccess.getWriteCSVAccess().getGroup_3()); 
            // InternalMyDsl.g:1188:2: ( rule__WriteCSV__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1188:3: rule__WriteCSV__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WriteCSV__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWriteCSVAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__3__Impl"


    // $ANTLR start "rule__WriteCSV__Group__4"
    // InternalMyDsl.g:1196:1: rule__WriteCSV__Group__4 : rule__WriteCSV__Group__4__Impl ;
    public final void rule__WriteCSV__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1200:1: ( rule__WriteCSV__Group__4__Impl )
            // InternalMyDsl.g:1201:2: rule__WriteCSV__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteCSV__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__4"


    // $ANTLR start "rule__WriteCSV__Group__4__Impl"
    // InternalMyDsl.g:1207:1: rule__WriteCSV__Group__4__Impl : ( ')' ) ;
    public final void rule__WriteCSV__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( ( ')' ) )
            // InternalMyDsl.g:1212:1: ( ')' )
            {
            // InternalMyDsl.g:1212:1: ( ')' )
            // InternalMyDsl.g:1213:2: ')'
            {
             before(grammarAccess.getWriteCSVAccess().getRightParenthesisKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWriteCSVAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group__4__Impl"


    // $ANTLR start "rule__WriteCSV__Group_3__0"
    // InternalMyDsl.g:1223:1: rule__WriteCSV__Group_3__0 : rule__WriteCSV__Group_3__0__Impl rule__WriteCSV__Group_3__1 ;
    public final void rule__WriteCSV__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1227:1: ( rule__WriteCSV__Group_3__0__Impl rule__WriteCSV__Group_3__1 )
            // InternalMyDsl.g:1228:2: rule__WriteCSV__Group_3__0__Impl rule__WriteCSV__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__WriteCSV__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteCSV__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group_3__0"


    // $ANTLR start "rule__WriteCSV__Group_3__0__Impl"
    // InternalMyDsl.g:1235:1: rule__WriteCSV__Group_3__0__Impl : ( ',' ) ;
    public final void rule__WriteCSV__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( ( ',' ) )
            // InternalMyDsl.g:1240:1: ( ',' )
            {
            // InternalMyDsl.g:1240:1: ( ',' )
            // InternalMyDsl.g:1241:2: ','
            {
             before(grammarAccess.getWriteCSVAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWriteCSVAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group_3__0__Impl"


    // $ANTLR start "rule__WriteCSV__Group_3__1"
    // InternalMyDsl.g:1250:1: rule__WriteCSV__Group_3__1 : rule__WriteCSV__Group_3__1__Impl ;
    public final void rule__WriteCSV__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1254:1: ( rule__WriteCSV__Group_3__1__Impl )
            // InternalMyDsl.g:1255:2: rule__WriteCSV__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteCSV__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group_3__1"


    // $ANTLR start "rule__WriteCSV__Group_3__1__Impl"
    // InternalMyDsl.g:1261:1: rule__WriteCSV__Group_3__1__Impl : ( ( rule__WriteCSV__ValueAssignment_3_1 ) ) ;
    public final void rule__WriteCSV__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( ( rule__WriteCSV__ValueAssignment_3_1 ) ) )
            // InternalMyDsl.g:1266:1: ( ( rule__WriteCSV__ValueAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1266:1: ( ( rule__WriteCSV__ValueAssignment_3_1 ) )
            // InternalMyDsl.g:1267:2: ( rule__WriteCSV__ValueAssignment_3_1 )
            {
             before(grammarAccess.getWriteCSVAccess().getValueAssignment_3_1()); 
            // InternalMyDsl.g:1268:2: ( rule__WriteCSV__ValueAssignment_3_1 )
            // InternalMyDsl.g:1268:3: rule__WriteCSV__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WriteCSV__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWriteCSVAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__Group_3__1__Impl"


    // $ANTLR start "rule__Remove__Group__0"
    // InternalMyDsl.g:1277:1: rule__Remove__Group__0 : rule__Remove__Group__0__Impl rule__Remove__Group__1 ;
    public final void rule__Remove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( rule__Remove__Group__0__Impl rule__Remove__Group__1 )
            // InternalMyDsl.g:1282:2: rule__Remove__Group__0__Impl rule__Remove__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Remove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__0"


    // $ANTLR start "rule__Remove__Group__0__Impl"
    // InternalMyDsl.g:1289:1: rule__Remove__Group__0__Impl : ( ( rule__Remove__RemoveElementAssignment_0 ) ) ;
    public final void rule__Remove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( ( ( rule__Remove__RemoveElementAssignment_0 ) ) )
            // InternalMyDsl.g:1294:1: ( ( rule__Remove__RemoveElementAssignment_0 ) )
            {
            // InternalMyDsl.g:1294:1: ( ( rule__Remove__RemoveElementAssignment_0 ) )
            // InternalMyDsl.g:1295:2: ( rule__Remove__RemoveElementAssignment_0 )
            {
             before(grammarAccess.getRemoveAccess().getRemoveElementAssignment_0()); 
            // InternalMyDsl.g:1296:2: ( rule__Remove__RemoveElementAssignment_0 )
            // InternalMyDsl.g:1296:3: rule__Remove__RemoveElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Remove__RemoveElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveAccess().getRemoveElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__0__Impl"


    // $ANTLR start "rule__Remove__Group__1"
    // InternalMyDsl.g:1304:1: rule__Remove__Group__1 : rule__Remove__Group__1__Impl rule__Remove__Group__2 ;
    public final void rule__Remove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1308:1: ( rule__Remove__Group__1__Impl rule__Remove__Group__2 )
            // InternalMyDsl.g:1309:2: rule__Remove__Group__1__Impl rule__Remove__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Remove__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__1"


    // $ANTLR start "rule__Remove__Group__1__Impl"
    // InternalMyDsl.g:1316:1: rule__Remove__Group__1__Impl : ( '(' ) ;
    public final void rule__Remove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( ( '(' ) )
            // InternalMyDsl.g:1321:1: ( '(' )
            {
            // InternalMyDsl.g:1321:1: ( '(' )
            // InternalMyDsl.g:1322:2: '('
            {
             before(grammarAccess.getRemoveAccess().getLeftParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__1__Impl"


    // $ANTLR start "rule__Remove__Group__2"
    // InternalMyDsl.g:1331:1: rule__Remove__Group__2 : rule__Remove__Group__2__Impl rule__Remove__Group__3 ;
    public final void rule__Remove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1335:1: ( rule__Remove__Group__2__Impl rule__Remove__Group__3 )
            // InternalMyDsl.g:1336:2: rule__Remove__Group__2__Impl rule__Remove__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Remove__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__2"


    // $ANTLR start "rule__Remove__Group__2__Impl"
    // InternalMyDsl.g:1343:1: rule__Remove__Group__2__Impl : ( ( rule__Remove__IdAssignment_2 ) ) ;
    public final void rule__Remove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1347:1: ( ( ( rule__Remove__IdAssignment_2 ) ) )
            // InternalMyDsl.g:1348:1: ( ( rule__Remove__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:1348:1: ( ( rule__Remove__IdAssignment_2 ) )
            // InternalMyDsl.g:1349:2: ( rule__Remove__IdAssignment_2 )
            {
             before(grammarAccess.getRemoveAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:1350:2: ( rule__Remove__IdAssignment_2 )
            // InternalMyDsl.g:1350:3: rule__Remove__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Remove__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRemoveAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__2__Impl"


    // $ANTLR start "rule__Remove__Group__3"
    // InternalMyDsl.g:1358:1: rule__Remove__Group__3 : rule__Remove__Group__3__Impl ;
    public final void rule__Remove__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1362:1: ( rule__Remove__Group__3__Impl )
            // InternalMyDsl.g:1363:2: rule__Remove__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Remove__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__3"


    // $ANTLR start "rule__Remove__Group__3__Impl"
    // InternalMyDsl.g:1369:1: rule__Remove__Group__3__Impl : ( ')' ) ;
    public final void rule__Remove__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( ( ')' ) )
            // InternalMyDsl.g:1374:1: ( ')' )
            {
            // InternalMyDsl.g:1374:1: ( ')' )
            // InternalMyDsl.g:1375:2: ')'
            {
             before(grammarAccess.getRemoveAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__3__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // InternalMyDsl.g:1385:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1389:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMyDsl.g:1390:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalMyDsl.g:1397:1: rule__Add__Group__0__Impl : ( ( rule__Add__AddElementAssignment_0 ) ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( ( ( rule__Add__AddElementAssignment_0 ) ) )
            // InternalMyDsl.g:1402:1: ( ( rule__Add__AddElementAssignment_0 ) )
            {
            // InternalMyDsl.g:1402:1: ( ( rule__Add__AddElementAssignment_0 ) )
            // InternalMyDsl.g:1403:2: ( rule__Add__AddElementAssignment_0 )
            {
             before(grammarAccess.getAddAccess().getAddElementAssignment_0()); 
            // InternalMyDsl.g:1404:2: ( rule__Add__AddElementAssignment_0 )
            // InternalMyDsl.g:1404:3: rule__Add__AddElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Add__AddElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getAddElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalMyDsl.g:1412:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1416:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalMyDsl.g:1417:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Add__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalMyDsl.g:1424:1: rule__Add__Group__1__Impl : ( '(' ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( ( '(' ) )
            // InternalMyDsl.g:1429:1: ( '(' )
            {
            // InternalMyDsl.g:1429:1: ( '(' )
            // InternalMyDsl.g:1430:2: '('
            {
             before(grammarAccess.getAddAccess().getLeftParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Add__Group__2"
    // InternalMyDsl.g:1439:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalMyDsl.g:1444:2: rule__Add__Group__2__Impl rule__Add__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Add__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__2"


    // $ANTLR start "rule__Add__Group__2__Impl"
    // InternalMyDsl.g:1451:1: rule__Add__Group__2__Impl : ( ( rule__Add__ValueAssignment_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1455:1: ( ( ( rule__Add__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1456:1: ( ( rule__Add__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1456:1: ( ( rule__Add__ValueAssignment_2 ) )
            // InternalMyDsl.g:1457:2: ( rule__Add__ValueAssignment_2 )
            {
             before(grammarAccess.getAddAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1458:2: ( rule__Add__ValueAssignment_2 )
            // InternalMyDsl.g:1458:3: rule__Add__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Add__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__2__Impl"


    // $ANTLR start "rule__Add__Group__3"
    // InternalMyDsl.g:1466:1: rule__Add__Group__3 : rule__Add__Group__3__Impl ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1470:1: ( rule__Add__Group__3__Impl )
            // InternalMyDsl.g:1471:2: rule__Add__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__3"


    // $ANTLR start "rule__Add__Group__3__Impl"
    // InternalMyDsl.g:1477:1: rule__Add__Group__3__Impl : ( ')' ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( ( ')' ) )
            // InternalMyDsl.g:1482:1: ( ')' )
            {
            // InternalMyDsl.g:1482:1: ( ')' )
            // InternalMyDsl.g:1483:2: ')'
            {
             before(grammarAccess.getAddAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__3__Impl"


    // $ANTLR start "rule__Get__Group__0"
    // InternalMyDsl.g:1493:1: rule__Get__Group__0 : rule__Get__Group__0__Impl rule__Get__Group__1 ;
    public final void rule__Get__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1497:1: ( rule__Get__Group__0__Impl rule__Get__Group__1 )
            // InternalMyDsl.g:1498:2: rule__Get__Group__0__Impl rule__Get__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Get__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__0"


    // $ANTLR start "rule__Get__Group__0__Impl"
    // InternalMyDsl.g:1505:1: rule__Get__Group__0__Impl : ( ( rule__Get__GetElementAssignment_0 ) ) ;
    public final void rule__Get__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1509:1: ( ( ( rule__Get__GetElementAssignment_0 ) ) )
            // InternalMyDsl.g:1510:1: ( ( rule__Get__GetElementAssignment_0 ) )
            {
            // InternalMyDsl.g:1510:1: ( ( rule__Get__GetElementAssignment_0 ) )
            // InternalMyDsl.g:1511:2: ( rule__Get__GetElementAssignment_0 )
            {
             before(grammarAccess.getGetAccess().getGetElementAssignment_0()); 
            // InternalMyDsl.g:1512:2: ( rule__Get__GetElementAssignment_0 )
            // InternalMyDsl.g:1512:3: rule__Get__GetElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Get__GetElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getGetElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__0__Impl"


    // $ANTLR start "rule__Get__Group__1"
    // InternalMyDsl.g:1520:1: rule__Get__Group__1 : rule__Get__Group__1__Impl rule__Get__Group__2 ;
    public final void rule__Get__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1524:1: ( rule__Get__Group__1__Impl rule__Get__Group__2 )
            // InternalMyDsl.g:1525:2: rule__Get__Group__1__Impl rule__Get__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Get__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__1"


    // $ANTLR start "rule__Get__Group__1__Impl"
    // InternalMyDsl.g:1532:1: rule__Get__Group__1__Impl : ( '(' ) ;
    public final void rule__Get__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( ( '(' ) )
            // InternalMyDsl.g:1537:1: ( '(' )
            {
            // InternalMyDsl.g:1537:1: ( '(' )
            // InternalMyDsl.g:1538:2: '('
            {
             before(grammarAccess.getGetAccess().getLeftParenthesisKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__1__Impl"


    // $ANTLR start "rule__Get__Group__2"
    // InternalMyDsl.g:1547:1: rule__Get__Group__2 : rule__Get__Group__2__Impl rule__Get__Group__3 ;
    public final void rule__Get__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1551:1: ( rule__Get__Group__2__Impl rule__Get__Group__3 )
            // InternalMyDsl.g:1552:2: rule__Get__Group__2__Impl rule__Get__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Get__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Get__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__2"


    // $ANTLR start "rule__Get__Group__2__Impl"
    // InternalMyDsl.g:1559:1: rule__Get__Group__2__Impl : ( ( rule__Get__IdAssignment_2 ) ) ;
    public final void rule__Get__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( ( ( rule__Get__IdAssignment_2 ) ) )
            // InternalMyDsl.g:1564:1: ( ( rule__Get__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:1564:1: ( ( rule__Get__IdAssignment_2 ) )
            // InternalMyDsl.g:1565:2: ( rule__Get__IdAssignment_2 )
            {
             before(grammarAccess.getGetAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:1566:2: ( rule__Get__IdAssignment_2 )
            // InternalMyDsl.g:1566:3: rule__Get__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Get__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGetAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__2__Impl"


    // $ANTLR start "rule__Get__Group__3"
    // InternalMyDsl.g:1574:1: rule__Get__Group__3 : rule__Get__Group__3__Impl ;
    public final void rule__Get__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1578:1: ( rule__Get__Group__3__Impl )
            // InternalMyDsl.g:1579:2: rule__Get__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Get__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__3"


    // $ANTLR start "rule__Get__Group__3__Impl"
    // InternalMyDsl.g:1585:1: rule__Get__Group__3__Impl : ( ')' ) ;
    public final void rule__Get__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( ( ')' ) )
            // InternalMyDsl.g:1590:1: ( ')' )
            {
            // InternalMyDsl.g:1590:1: ( ')' )
            // InternalMyDsl.g:1591:2: ')'
            {
             before(grammarAccess.getGetAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__Group__3__Impl"


    // $ANTLR start "rule__Sort__Group__0"
    // InternalMyDsl.g:1601:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1605:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // InternalMyDsl.g:1606:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Sort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__0"


    // $ANTLR start "rule__Sort__Group__0__Impl"
    // InternalMyDsl.g:1613:1: rule__Sort__Group__0__Impl : ( ( rule__Sort__SortAssignment_0 ) ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1617:1: ( ( ( rule__Sort__SortAssignment_0 ) ) )
            // InternalMyDsl.g:1618:1: ( ( rule__Sort__SortAssignment_0 ) )
            {
            // InternalMyDsl.g:1618:1: ( ( rule__Sort__SortAssignment_0 ) )
            // InternalMyDsl.g:1619:2: ( rule__Sort__SortAssignment_0 )
            {
             before(grammarAccess.getSortAccess().getSortAssignment_0()); 
            // InternalMyDsl.g:1620:2: ( rule__Sort__SortAssignment_0 )
            // InternalMyDsl.g:1620:3: rule__Sort__SortAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Sort__SortAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getSortAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__0__Impl"


    // $ANTLR start "rule__Sort__Group__1"
    // InternalMyDsl.g:1628:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl rule__Sort__Group__2 ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1632:1: ( rule__Sort__Group__1__Impl rule__Sort__Group__2 )
            // InternalMyDsl.g:1633:2: rule__Sort__Group__1__Impl rule__Sort__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Sort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__1"


    // $ANTLR start "rule__Sort__Group__1__Impl"
    // InternalMyDsl.g:1640:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__ValueAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1644:1: ( ( ( rule__Sort__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:1645:1: ( ( rule__Sort__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:1645:1: ( ( rule__Sort__ValueAssignment_1 ) )
            // InternalMyDsl.g:1646:2: ( rule__Sort__ValueAssignment_1 )
            {
             before(grammarAccess.getSortAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:1647:2: ( rule__Sort__ValueAssignment_1 )
            // InternalMyDsl.g:1647:3: rule__Sort__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sort__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__1__Impl"


    // $ANTLR start "rule__Sort__Group__2"
    // InternalMyDsl.g:1655:1: rule__Sort__Group__2 : rule__Sort__Group__2__Impl rule__Sort__Group__3 ;
    public final void rule__Sort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1659:1: ( rule__Sort__Group__2__Impl rule__Sort__Group__3 )
            // InternalMyDsl.g:1660:2: rule__Sort__Group__2__Impl rule__Sort__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Sort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__2"


    // $ANTLR start "rule__Sort__Group__2__Impl"
    // InternalMyDsl.g:1667:1: rule__Sort__Group__2__Impl : ( 'by' ) ;
    public final void rule__Sort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1671:1: ( ( 'by' ) )
            // InternalMyDsl.g:1672:1: ( 'by' )
            {
            // InternalMyDsl.g:1672:1: ( 'by' )
            // InternalMyDsl.g:1673:2: 'by'
            {
             before(grammarAccess.getSortAccess().getByKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__2__Impl"


    // $ANTLR start "rule__Sort__Group__3"
    // InternalMyDsl.g:1682:1: rule__Sort__Group__3 : rule__Sort__Group__3__Impl ;
    public final void rule__Sort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1686:1: ( rule__Sort__Group__3__Impl )
            // InternalMyDsl.g:1687:2: rule__Sort__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sort__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__3"


    // $ANTLR start "rule__Sort__Group__3__Impl"
    // InternalMyDsl.g:1693:1: rule__Sort__Group__3__Impl : ( ( rule__Sort__AttributeAssignment_3 ) ) ;
    public final void rule__Sort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( ( ( rule__Sort__AttributeAssignment_3 ) ) )
            // InternalMyDsl.g:1698:1: ( ( rule__Sort__AttributeAssignment_3 ) )
            {
            // InternalMyDsl.g:1698:1: ( ( rule__Sort__AttributeAssignment_3 ) )
            // InternalMyDsl.g:1699:2: ( rule__Sort__AttributeAssignment_3 )
            {
             before(grammarAccess.getSortAccess().getAttributeAssignment_3()); 
            // InternalMyDsl.g:1700:2: ( rule__Sort__AttributeAssignment_3 )
            // InternalMyDsl.g:1700:3: rule__Sort__AttributeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sort__AttributeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSortAccess().getAttributeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__3__Impl"


    // $ANTLR start "rule__Show__Group__0"
    // InternalMyDsl.g:1709:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1713:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // InternalMyDsl.g:1714:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Show__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0"


    // $ANTLR start "rule__Show__Group__0__Impl"
    // InternalMyDsl.g:1721:1: rule__Show__Group__0__Impl : ( ( rule__Show__ShowAssignment_0 ) ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1725:1: ( ( ( rule__Show__ShowAssignment_0 ) ) )
            // InternalMyDsl.g:1726:1: ( ( rule__Show__ShowAssignment_0 ) )
            {
            // InternalMyDsl.g:1726:1: ( ( rule__Show__ShowAssignment_0 ) )
            // InternalMyDsl.g:1727:2: ( rule__Show__ShowAssignment_0 )
            {
             before(grammarAccess.getShowAccess().getShowAssignment_0()); 
            // InternalMyDsl.g:1728:2: ( rule__Show__ShowAssignment_0 )
            // InternalMyDsl.g:1728:3: rule__Show__ShowAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Show__ShowAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getShowAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0__Impl"


    // $ANTLR start "rule__Show__Group__1"
    // InternalMyDsl.g:1736:1: rule__Show__Group__1 : rule__Show__Group__1__Impl ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1740:1: ( rule__Show__Group__1__Impl )
            // InternalMyDsl.g:1741:2: rule__Show__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1"


    // $ANTLR start "rule__Show__Group__1__Impl"
    // InternalMyDsl.g:1747:1: rule__Show__Group__1__Impl : ( ( rule__Show__Group_1__0 )? ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( ( ( rule__Show__Group_1__0 )? ) )
            // InternalMyDsl.g:1752:1: ( ( rule__Show__Group_1__0 )? )
            {
            // InternalMyDsl.g:1752:1: ( ( rule__Show__Group_1__0 )? )
            // InternalMyDsl.g:1753:2: ( rule__Show__Group_1__0 )?
            {
             before(grammarAccess.getShowAccess().getGroup_1()); 
            // InternalMyDsl.g:1754:2: ( rule__Show__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1754:3: rule__Show__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Show__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShowAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1__Impl"


    // $ANTLR start "rule__Show__Group_1__0"
    // InternalMyDsl.g:1763:1: rule__Show__Group_1__0 : rule__Show__Group_1__0__Impl rule__Show__Group_1__1 ;
    public final void rule__Show__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1767:1: ( rule__Show__Group_1__0__Impl rule__Show__Group_1__1 )
            // InternalMyDsl.g:1768:2: rule__Show__Group_1__0__Impl rule__Show__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Show__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group_1__0"


    // $ANTLR start "rule__Show__Group_1__0__Impl"
    // InternalMyDsl.g:1775:1: rule__Show__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Show__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( ( '(' ) )
            // InternalMyDsl.g:1780:1: ( '(' )
            {
            // InternalMyDsl.g:1780:1: ( '(' )
            // InternalMyDsl.g:1781:2: '('
            {
             before(grammarAccess.getShowAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group_1__0__Impl"


    // $ANTLR start "rule__Show__Group_1__1"
    // InternalMyDsl.g:1790:1: rule__Show__Group_1__1 : rule__Show__Group_1__1__Impl rule__Show__Group_1__2 ;
    public final void rule__Show__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1794:1: ( rule__Show__Group_1__1__Impl rule__Show__Group_1__2 )
            // InternalMyDsl.g:1795:2: rule__Show__Group_1__1__Impl rule__Show__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Show__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group_1__1"


    // $ANTLR start "rule__Show__Group_1__1__Impl"
    // InternalMyDsl.g:1802:1: rule__Show__Group_1__1__Impl : ( ( rule__Show__NameAssignment_1_1 ) ) ;
    public final void rule__Show__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1806:1: ( ( ( rule__Show__NameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1807:1: ( ( rule__Show__NameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1807:1: ( ( rule__Show__NameAssignment_1_1 ) )
            // InternalMyDsl.g:1808:2: ( rule__Show__NameAssignment_1_1 )
            {
             before(grammarAccess.getShowAccess().getNameAssignment_1_1()); 
            // InternalMyDsl.g:1809:2: ( rule__Show__NameAssignment_1_1 )
            // InternalMyDsl.g:1809:3: rule__Show__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Show__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group_1__1__Impl"


    // $ANTLR start "rule__Show__Group_1__2"
    // InternalMyDsl.g:1817:1: rule__Show__Group_1__2 : rule__Show__Group_1__2__Impl ;
    public final void rule__Show__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1821:1: ( rule__Show__Group_1__2__Impl )
            // InternalMyDsl.g:1822:2: rule__Show__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group_1__2"


    // $ANTLR start "rule__Show__Group_1__2__Impl"
    // InternalMyDsl.g:1828:1: rule__Show__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Show__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( ( ')' ) )
            // InternalMyDsl.g:1833:1: ( ')' )
            {
            // InternalMyDsl.g:1833:1: ( ')' )
            // InternalMyDsl.g:1834:2: ')'
            {
             before(grammarAccess.getShowAccess().getRightParenthesisKeyword_1_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group_1__2__Impl"


    // $ANTLR start "rule__TypeJSON__Group_0__0"
    // InternalMyDsl.g:1844:1: rule__TypeJSON__Group_0__0 : rule__TypeJSON__Group_0__0__Impl rule__TypeJSON__Group_0__1 ;
    public final void rule__TypeJSON__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1848:1: ( rule__TypeJSON__Group_0__0__Impl rule__TypeJSON__Group_0__1 )
            // InternalMyDsl.g:1849:2: rule__TypeJSON__Group_0__0__Impl rule__TypeJSON__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__TypeJSON__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0__0"


    // $ANTLR start "rule__TypeJSON__Group_0__0__Impl"
    // InternalMyDsl.g:1856:1: rule__TypeJSON__Group_0__0__Impl : ( '{' ) ;
    public final void rule__TypeJSON__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1860:1: ( ( '{' ) )
            // InternalMyDsl.g:1861:1: ( '{' )
            {
            // InternalMyDsl.g:1861:1: ( '{' )
            // InternalMyDsl.g:1862:2: '{'
            {
             before(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0__0__Impl"


    // $ANTLR start "rule__TypeJSON__Group_0__1"
    // InternalMyDsl.g:1871:1: rule__TypeJSON__Group_0__1 : rule__TypeJSON__Group_0__1__Impl rule__TypeJSON__Group_0__2 ;
    public final void rule__TypeJSON__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1875:1: ( rule__TypeJSON__Group_0__1__Impl rule__TypeJSON__Group_0__2 )
            // InternalMyDsl.g:1876:2: rule__TypeJSON__Group_0__1__Impl rule__TypeJSON__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__TypeJSON__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0__1"


    // $ANTLR start "rule__TypeJSON__Group_0__1__Impl"
    // InternalMyDsl.g:1883:1: rule__TypeJSON__Group_0__1__Impl : ( ( ( rule__TypeJSON__Group_0_1__0 ) ) ( ( rule__TypeJSON__Group_0_1__0 )* ) ) ;
    public final void rule__TypeJSON__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1887:1: ( ( ( ( rule__TypeJSON__Group_0_1__0 ) ) ( ( rule__TypeJSON__Group_0_1__0 )* ) ) )
            // InternalMyDsl.g:1888:1: ( ( ( rule__TypeJSON__Group_0_1__0 ) ) ( ( rule__TypeJSON__Group_0_1__0 )* ) )
            {
            // InternalMyDsl.g:1888:1: ( ( ( rule__TypeJSON__Group_0_1__0 ) ) ( ( rule__TypeJSON__Group_0_1__0 )* ) )
            // InternalMyDsl.g:1889:2: ( ( rule__TypeJSON__Group_0_1__0 ) ) ( ( rule__TypeJSON__Group_0_1__0 )* )
            {
            // InternalMyDsl.g:1889:2: ( ( rule__TypeJSON__Group_0_1__0 ) )
            // InternalMyDsl.g:1890:3: ( rule__TypeJSON__Group_0_1__0 )
            {
             before(grammarAccess.getTypeJSONAccess().getGroup_0_1()); 
            // InternalMyDsl.g:1891:3: ( rule__TypeJSON__Group_0_1__0 )
            // InternalMyDsl.g:1891:4: rule__TypeJSON__Group_0_1__0
            {
            pushFollow(FOLLOW_11);
            rule__TypeJSON__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getGroup_0_1()); 

            }

            // InternalMyDsl.g:1894:2: ( ( rule__TypeJSON__Group_0_1__0 )* )
            // InternalMyDsl.g:1895:3: ( rule__TypeJSON__Group_0_1__0 )*
            {
             before(grammarAccess.getTypeJSONAccess().getGroup_0_1()); 
            // InternalMyDsl.g:1896:3: ( rule__TypeJSON__Group_0_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1896:4: rule__TypeJSON__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TypeJSON__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTypeJSONAccess().getGroup_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0__1__Impl"


    // $ANTLR start "rule__TypeJSON__Group_0__2"
    // InternalMyDsl.g:1905:1: rule__TypeJSON__Group_0__2 : rule__TypeJSON__Group_0__2__Impl ;
    public final void rule__TypeJSON__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1909:1: ( rule__TypeJSON__Group_0__2__Impl )
            // InternalMyDsl.g:1910:2: rule__TypeJSON__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0__2"


    // $ANTLR start "rule__TypeJSON__Group_0__2__Impl"
    // InternalMyDsl.g:1916:1: rule__TypeJSON__Group_0__2__Impl : ( '}' ) ;
    public final void rule__TypeJSON__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( ( '}' ) )
            // InternalMyDsl.g:1921:1: ( '}' )
            {
            // InternalMyDsl.g:1921:1: ( '}' )
            // InternalMyDsl.g:1922:2: '}'
            {
             before(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0__2__Impl"


    // $ANTLR start "rule__TypeJSON__Group_0_1__0"
    // InternalMyDsl.g:1932:1: rule__TypeJSON__Group_0_1__0 : rule__TypeJSON__Group_0_1__0__Impl rule__TypeJSON__Group_0_1__1 ;
    public final void rule__TypeJSON__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1936:1: ( rule__TypeJSON__Group_0_1__0__Impl rule__TypeJSON__Group_0_1__1 )
            // InternalMyDsl.g:1937:2: rule__TypeJSON__Group_0_1__0__Impl rule__TypeJSON__Group_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__TypeJSON__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0_1__0"


    // $ANTLR start "rule__TypeJSON__Group_0_1__0__Impl"
    // InternalMyDsl.g:1944:1: rule__TypeJSON__Group_0_1__0__Impl : ( ( rule__TypeJSON__AttributeAssignment_0_1_0 ) ) ;
    public final void rule__TypeJSON__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( ( ( rule__TypeJSON__AttributeAssignment_0_1_0 ) ) )
            // InternalMyDsl.g:1949:1: ( ( rule__TypeJSON__AttributeAssignment_0_1_0 ) )
            {
            // InternalMyDsl.g:1949:1: ( ( rule__TypeJSON__AttributeAssignment_0_1_0 ) )
            // InternalMyDsl.g:1950:2: ( rule__TypeJSON__AttributeAssignment_0_1_0 )
            {
             before(grammarAccess.getTypeJSONAccess().getAttributeAssignment_0_1_0()); 
            // InternalMyDsl.g:1951:2: ( rule__TypeJSON__AttributeAssignment_0_1_0 )
            // InternalMyDsl.g:1951:3: rule__TypeJSON__AttributeAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__AttributeAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getAttributeAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0_1__0__Impl"


    // $ANTLR start "rule__TypeJSON__Group_0_1__1"
    // InternalMyDsl.g:1959:1: rule__TypeJSON__Group_0_1__1 : rule__TypeJSON__Group_0_1__1__Impl rule__TypeJSON__Group_0_1__2 ;
    public final void rule__TypeJSON__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1963:1: ( rule__TypeJSON__Group_0_1__1__Impl rule__TypeJSON__Group_0_1__2 )
            // InternalMyDsl.g:1964:2: rule__TypeJSON__Group_0_1__1__Impl rule__TypeJSON__Group_0_1__2
            {
            pushFollow(FOLLOW_13);
            rule__TypeJSON__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0_1__1"


    // $ANTLR start "rule__TypeJSON__Group_0_1__1__Impl"
    // InternalMyDsl.g:1971:1: rule__TypeJSON__Group_0_1__1__Impl : ( '=' ) ;
    public final void rule__TypeJSON__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( ( '=' ) )
            // InternalMyDsl.g:1976:1: ( '=' )
            {
            // InternalMyDsl.g:1976:1: ( '=' )
            // InternalMyDsl.g:1977:2: '='
            {
             before(grammarAccess.getTypeJSONAccess().getEqualsSignKeyword_0_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getEqualsSignKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0_1__1__Impl"


    // $ANTLR start "rule__TypeJSON__Group_0_1__2"
    // InternalMyDsl.g:1986:1: rule__TypeJSON__Group_0_1__2 : rule__TypeJSON__Group_0_1__2__Impl rule__TypeJSON__Group_0_1__3 ;
    public final void rule__TypeJSON__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( rule__TypeJSON__Group_0_1__2__Impl rule__TypeJSON__Group_0_1__3 )
            // InternalMyDsl.g:1991:2: rule__TypeJSON__Group_0_1__2__Impl rule__TypeJSON__Group_0_1__3
            {
            pushFollow(FOLLOW_14);
            rule__TypeJSON__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0_1__2"


    // $ANTLR start "rule__TypeJSON__Group_0_1__2__Impl"
    // InternalMyDsl.g:1998:1: rule__TypeJSON__Group_0_1__2__Impl : ( ( rule__TypeJSON__ValueAssignment_0_1_2 ) ) ;
    public final void rule__TypeJSON__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( ( ( rule__TypeJSON__ValueAssignment_0_1_2 ) ) )
            // InternalMyDsl.g:2003:1: ( ( rule__TypeJSON__ValueAssignment_0_1_2 ) )
            {
            // InternalMyDsl.g:2003:1: ( ( rule__TypeJSON__ValueAssignment_0_1_2 ) )
            // InternalMyDsl.g:2004:2: ( rule__TypeJSON__ValueAssignment_0_1_2 )
            {
             before(grammarAccess.getTypeJSONAccess().getValueAssignment_0_1_2()); 
            // InternalMyDsl.g:2005:2: ( rule__TypeJSON__ValueAssignment_0_1_2 )
            // InternalMyDsl.g:2005:3: rule__TypeJSON__ValueAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__ValueAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getValueAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0_1__2__Impl"


    // $ANTLR start "rule__TypeJSON__Group_0_1__3"
    // InternalMyDsl.g:2013:1: rule__TypeJSON__Group_0_1__3 : rule__TypeJSON__Group_0_1__3__Impl ;
    public final void rule__TypeJSON__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( rule__TypeJSON__Group_0_1__3__Impl )
            // InternalMyDsl.g:2018:2: rule__TypeJSON__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0_1__3"


    // $ANTLR start "rule__TypeJSON__Group_0_1__3__Impl"
    // InternalMyDsl.g:2024:1: rule__TypeJSON__Group_0_1__3__Impl : ( ';' ) ;
    public final void rule__TypeJSON__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2028:1: ( ( ';' ) )
            // InternalMyDsl.g:2029:1: ( ';' )
            {
            // InternalMyDsl.g:2029:1: ( ';' )
            // InternalMyDsl.g:2030:2: ';'
            {
             before(grammarAccess.getTypeJSONAccess().getSemicolonKeyword_0_1_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getSemicolonKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_0_1__3__Impl"


    // $ANTLR start "rule__TypeJSON__Group_1__0"
    // InternalMyDsl.g:2040:1: rule__TypeJSON__Group_1__0 : rule__TypeJSON__Group_1__0__Impl rule__TypeJSON__Group_1__1 ;
    public final void rule__TypeJSON__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2044:1: ( rule__TypeJSON__Group_1__0__Impl rule__TypeJSON__Group_1__1 )
            // InternalMyDsl.g:2045:2: rule__TypeJSON__Group_1__0__Impl rule__TypeJSON__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__TypeJSON__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1__0"


    // $ANTLR start "rule__TypeJSON__Group_1__0__Impl"
    // InternalMyDsl.g:2052:1: rule__TypeJSON__Group_1__0__Impl : ( '{' ) ;
    public final void rule__TypeJSON__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( ( '{' ) )
            // InternalMyDsl.g:2057:1: ( '{' )
            {
            // InternalMyDsl.g:2057:1: ( '{' )
            // InternalMyDsl.g:2058:2: '{'
            {
             before(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1__0__Impl"


    // $ANTLR start "rule__TypeJSON__Group_1__1"
    // InternalMyDsl.g:2067:1: rule__TypeJSON__Group_1__1 : rule__TypeJSON__Group_1__1__Impl rule__TypeJSON__Group_1__2 ;
    public final void rule__TypeJSON__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2071:1: ( rule__TypeJSON__Group_1__1__Impl rule__TypeJSON__Group_1__2 )
            // InternalMyDsl.g:2072:2: rule__TypeJSON__Group_1__1__Impl rule__TypeJSON__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__TypeJSON__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1__1"


    // $ANTLR start "rule__TypeJSON__Group_1__1__Impl"
    // InternalMyDsl.g:2079:1: rule__TypeJSON__Group_1__1__Impl : ( ( ( rule__TypeJSON__Group_1_1__0 ) ) ( ( rule__TypeJSON__Group_1_1__0 )* ) ) ;
    public final void rule__TypeJSON__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( ( ( ( rule__TypeJSON__Group_1_1__0 ) ) ( ( rule__TypeJSON__Group_1_1__0 )* ) ) )
            // InternalMyDsl.g:2084:1: ( ( ( rule__TypeJSON__Group_1_1__0 ) ) ( ( rule__TypeJSON__Group_1_1__0 )* ) )
            {
            // InternalMyDsl.g:2084:1: ( ( ( rule__TypeJSON__Group_1_1__0 ) ) ( ( rule__TypeJSON__Group_1_1__0 )* ) )
            // InternalMyDsl.g:2085:2: ( ( rule__TypeJSON__Group_1_1__0 ) ) ( ( rule__TypeJSON__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:2085:2: ( ( rule__TypeJSON__Group_1_1__0 ) )
            // InternalMyDsl.g:2086:3: ( rule__TypeJSON__Group_1_1__0 )
            {
             before(grammarAccess.getTypeJSONAccess().getGroup_1_1()); 
            // InternalMyDsl.g:2087:3: ( rule__TypeJSON__Group_1_1__0 )
            // InternalMyDsl.g:2087:4: rule__TypeJSON__Group_1_1__0
            {
            pushFollow(FOLLOW_11);
            rule__TypeJSON__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getGroup_1_1()); 

            }

            // InternalMyDsl.g:2090:2: ( ( rule__TypeJSON__Group_1_1__0 )* )
            // InternalMyDsl.g:2091:3: ( rule__TypeJSON__Group_1_1__0 )*
            {
             before(grammarAccess.getTypeJSONAccess().getGroup_1_1()); 
            // InternalMyDsl.g:2092:3: ( rule__TypeJSON__Group_1_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:2092:4: rule__TypeJSON__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TypeJSON__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTypeJSONAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1__1__Impl"


    // $ANTLR start "rule__TypeJSON__Group_1__2"
    // InternalMyDsl.g:2101:1: rule__TypeJSON__Group_1__2 : rule__TypeJSON__Group_1__2__Impl ;
    public final void rule__TypeJSON__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2105:1: ( rule__TypeJSON__Group_1__2__Impl )
            // InternalMyDsl.g:2106:2: rule__TypeJSON__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1__2"


    // $ANTLR start "rule__TypeJSON__Group_1__2__Impl"
    // InternalMyDsl.g:2112:1: rule__TypeJSON__Group_1__2__Impl : ( '}' ) ;
    public final void rule__TypeJSON__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( '}' ) )
            // InternalMyDsl.g:2117:1: ( '}' )
            {
            // InternalMyDsl.g:2117:1: ( '}' )
            // InternalMyDsl.g:2118:2: '}'
            {
             before(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1__2__Impl"


    // $ANTLR start "rule__TypeJSON__Group_1_1__0"
    // InternalMyDsl.g:2128:1: rule__TypeJSON__Group_1_1__0 : rule__TypeJSON__Group_1_1__0__Impl rule__TypeJSON__Group_1_1__1 ;
    public final void rule__TypeJSON__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2132:1: ( rule__TypeJSON__Group_1_1__0__Impl rule__TypeJSON__Group_1_1__1 )
            // InternalMyDsl.g:2133:2: rule__TypeJSON__Group_1_1__0__Impl rule__TypeJSON__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__TypeJSON__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__0"


    // $ANTLR start "rule__TypeJSON__Group_1_1__0__Impl"
    // InternalMyDsl.g:2140:1: rule__TypeJSON__Group_1_1__0__Impl : ( ( rule__TypeJSON__AttributeAssignment_1_1_0 ) ) ;
    public final void rule__TypeJSON__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2144:1: ( ( ( rule__TypeJSON__AttributeAssignment_1_1_0 ) ) )
            // InternalMyDsl.g:2145:1: ( ( rule__TypeJSON__AttributeAssignment_1_1_0 ) )
            {
            // InternalMyDsl.g:2145:1: ( ( rule__TypeJSON__AttributeAssignment_1_1_0 ) )
            // InternalMyDsl.g:2146:2: ( rule__TypeJSON__AttributeAssignment_1_1_0 )
            {
             before(grammarAccess.getTypeJSONAccess().getAttributeAssignment_1_1_0()); 
            // InternalMyDsl.g:2147:2: ( rule__TypeJSON__AttributeAssignment_1_1_0 )
            // InternalMyDsl.g:2147:3: rule__TypeJSON__AttributeAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__AttributeAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getAttributeAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__0__Impl"


    // $ANTLR start "rule__TypeJSON__Group_1_1__1"
    // InternalMyDsl.g:2155:1: rule__TypeJSON__Group_1_1__1 : rule__TypeJSON__Group_1_1__1__Impl rule__TypeJSON__Group_1_1__2 ;
    public final void rule__TypeJSON__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2159:1: ( rule__TypeJSON__Group_1_1__1__Impl rule__TypeJSON__Group_1_1__2 )
            // InternalMyDsl.g:2160:2: rule__TypeJSON__Group_1_1__1__Impl rule__TypeJSON__Group_1_1__2
            {
            pushFollow(FOLLOW_8);
            rule__TypeJSON__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__1"


    // $ANTLR start "rule__TypeJSON__Group_1_1__1__Impl"
    // InternalMyDsl.g:2167:1: rule__TypeJSON__Group_1_1__1__Impl : ( ':' ) ;
    public final void rule__TypeJSON__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2171:1: ( ( ':' ) )
            // InternalMyDsl.g:2172:1: ( ':' )
            {
            // InternalMyDsl.g:2172:1: ( ':' )
            // InternalMyDsl.g:2173:2: ':'
            {
             before(grammarAccess.getTypeJSONAccess().getColonKeyword_1_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getColonKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__1__Impl"


    // $ANTLR start "rule__TypeJSON__Group_1_1__2"
    // InternalMyDsl.g:2182:1: rule__TypeJSON__Group_1_1__2 : rule__TypeJSON__Group_1_1__2__Impl rule__TypeJSON__Group_1_1__3 ;
    public final void rule__TypeJSON__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2186:1: ( rule__TypeJSON__Group_1_1__2__Impl rule__TypeJSON__Group_1_1__3 )
            // InternalMyDsl.g:2187:2: rule__TypeJSON__Group_1_1__2__Impl rule__TypeJSON__Group_1_1__3
            {
            pushFollow(FOLLOW_13);
            rule__TypeJSON__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__2"


    // $ANTLR start "rule__TypeJSON__Group_1_1__2__Impl"
    // InternalMyDsl.g:2194:1: rule__TypeJSON__Group_1_1__2__Impl : ( '{' ) ;
    public final void rule__TypeJSON__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2198:1: ( ( '{' ) )
            // InternalMyDsl.g:2199:1: ( '{' )
            {
            // InternalMyDsl.g:2199:1: ( '{' )
            // InternalMyDsl.g:2200:2: '{'
            {
             before(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_1_1_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__2__Impl"


    // $ANTLR start "rule__TypeJSON__Group_1_1__3"
    // InternalMyDsl.g:2209:1: rule__TypeJSON__Group_1_1__3 : rule__TypeJSON__Group_1_1__3__Impl rule__TypeJSON__Group_1_1__4 ;
    public final void rule__TypeJSON__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2213:1: ( rule__TypeJSON__Group_1_1__3__Impl rule__TypeJSON__Group_1_1__4 )
            // InternalMyDsl.g:2214:2: rule__TypeJSON__Group_1_1__3__Impl rule__TypeJSON__Group_1_1__4
            {
            pushFollow(FOLLOW_10);
            rule__TypeJSON__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__3"


    // $ANTLR start "rule__TypeJSON__Group_1_1__3__Impl"
    // InternalMyDsl.g:2221:1: rule__TypeJSON__Group_1_1__3__Impl : ( ( ( rule__TypeJSON__ValueAssignment_1_1_3 ) ) ( ( rule__TypeJSON__ValueAssignment_1_1_3 )* ) ) ;
    public final void rule__TypeJSON__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2225:1: ( ( ( ( rule__TypeJSON__ValueAssignment_1_1_3 ) ) ( ( rule__TypeJSON__ValueAssignment_1_1_3 )* ) ) )
            // InternalMyDsl.g:2226:1: ( ( ( rule__TypeJSON__ValueAssignment_1_1_3 ) ) ( ( rule__TypeJSON__ValueAssignment_1_1_3 )* ) )
            {
            // InternalMyDsl.g:2226:1: ( ( ( rule__TypeJSON__ValueAssignment_1_1_3 ) ) ( ( rule__TypeJSON__ValueAssignment_1_1_3 )* ) )
            // InternalMyDsl.g:2227:2: ( ( rule__TypeJSON__ValueAssignment_1_1_3 ) ) ( ( rule__TypeJSON__ValueAssignment_1_1_3 )* )
            {
            // InternalMyDsl.g:2227:2: ( ( rule__TypeJSON__ValueAssignment_1_1_3 ) )
            // InternalMyDsl.g:2228:3: ( rule__TypeJSON__ValueAssignment_1_1_3 )
            {
             before(grammarAccess.getTypeJSONAccess().getValueAssignment_1_1_3()); 
            // InternalMyDsl.g:2229:3: ( rule__TypeJSON__ValueAssignment_1_1_3 )
            // InternalMyDsl.g:2229:4: rule__TypeJSON__ValueAssignment_1_1_3
            {
            pushFollow(FOLLOW_16);
            rule__TypeJSON__ValueAssignment_1_1_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getValueAssignment_1_1_3()); 

            }

            // InternalMyDsl.g:2232:2: ( ( rule__TypeJSON__ValueAssignment_1_1_3 )* )
            // InternalMyDsl.g:2233:3: ( rule__TypeJSON__ValueAssignment_1_1_3 )*
            {
             before(grammarAccess.getTypeJSONAccess().getValueAssignment_1_1_3()); 
            // InternalMyDsl.g:2234:3: ( rule__TypeJSON__ValueAssignment_1_1_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:2234:4: rule__TypeJSON__ValueAssignment_1_1_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TypeJSON__ValueAssignment_1_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTypeJSONAccess().getValueAssignment_1_1_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__3__Impl"


    // $ANTLR start "rule__TypeJSON__Group_1_1__4"
    // InternalMyDsl.g:2243:1: rule__TypeJSON__Group_1_1__4 : rule__TypeJSON__Group_1_1__4__Impl rule__TypeJSON__Group_1_1__5 ;
    public final void rule__TypeJSON__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2247:1: ( rule__TypeJSON__Group_1_1__4__Impl rule__TypeJSON__Group_1_1__5 )
            // InternalMyDsl.g:2248:2: rule__TypeJSON__Group_1_1__4__Impl rule__TypeJSON__Group_1_1__5
            {
            pushFollow(FOLLOW_14);
            rule__TypeJSON__Group_1_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_1_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__4"


    // $ANTLR start "rule__TypeJSON__Group_1_1__4__Impl"
    // InternalMyDsl.g:2255:1: rule__TypeJSON__Group_1_1__4__Impl : ( '}' ) ;
    public final void rule__TypeJSON__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2259:1: ( ( '}' ) )
            // InternalMyDsl.g:2260:1: ( '}' )
            {
            // InternalMyDsl.g:2260:1: ( '}' )
            // InternalMyDsl.g:2261:2: '}'
            {
             before(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_1_1_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__4__Impl"


    // $ANTLR start "rule__TypeJSON__Group_1_1__5"
    // InternalMyDsl.g:2270:1: rule__TypeJSON__Group_1_1__5 : rule__TypeJSON__Group_1_1__5__Impl ;
    public final void rule__TypeJSON__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2274:1: ( rule__TypeJSON__Group_1_1__5__Impl )
            // InternalMyDsl.g:2275:2: rule__TypeJSON__Group_1_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_1_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__5"


    // $ANTLR start "rule__TypeJSON__Group_1_1__5__Impl"
    // InternalMyDsl.g:2281:1: rule__TypeJSON__Group_1_1__5__Impl : ( ';' ) ;
    public final void rule__TypeJSON__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( ';' ) )
            // InternalMyDsl.g:2286:1: ( ';' )
            {
            // InternalMyDsl.g:2286:1: ( ';' )
            // InternalMyDsl.g:2287:2: ';'
            {
             before(grammarAccess.getTypeJSONAccess().getSemicolonKeyword_1_1_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getSemicolonKeyword_1_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_1_1__5__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2__0"
    // InternalMyDsl.g:2297:1: rule__TypeJSON__Group_2__0 : rule__TypeJSON__Group_2__0__Impl rule__TypeJSON__Group_2__1 ;
    public final void rule__TypeJSON__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2301:1: ( rule__TypeJSON__Group_2__0__Impl rule__TypeJSON__Group_2__1 )
            // InternalMyDsl.g:2302:2: rule__TypeJSON__Group_2__0__Impl rule__TypeJSON__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__TypeJSON__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2__0"


    // $ANTLR start "rule__TypeJSON__Group_2__0__Impl"
    // InternalMyDsl.g:2309:1: rule__TypeJSON__Group_2__0__Impl : ( '{' ) ;
    public final void rule__TypeJSON__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( ( '{' ) )
            // InternalMyDsl.g:2314:1: ( '{' )
            {
            // InternalMyDsl.g:2314:1: ( '{' )
            // InternalMyDsl.g:2315:2: '{'
            {
             before(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2__0__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2__1"
    // InternalMyDsl.g:2324:1: rule__TypeJSON__Group_2__1 : rule__TypeJSON__Group_2__1__Impl rule__TypeJSON__Group_2__2 ;
    public final void rule__TypeJSON__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( rule__TypeJSON__Group_2__1__Impl rule__TypeJSON__Group_2__2 )
            // InternalMyDsl.g:2329:2: rule__TypeJSON__Group_2__1__Impl rule__TypeJSON__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__TypeJSON__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2__1"


    // $ANTLR start "rule__TypeJSON__Group_2__1__Impl"
    // InternalMyDsl.g:2336:1: rule__TypeJSON__Group_2__1__Impl : ( ( ( rule__TypeJSON__Group_2_1__0 ) ) ( ( rule__TypeJSON__Group_2_1__0 )* ) ) ;
    public final void rule__TypeJSON__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( ( ( ( rule__TypeJSON__Group_2_1__0 ) ) ( ( rule__TypeJSON__Group_2_1__0 )* ) ) )
            // InternalMyDsl.g:2341:1: ( ( ( rule__TypeJSON__Group_2_1__0 ) ) ( ( rule__TypeJSON__Group_2_1__0 )* ) )
            {
            // InternalMyDsl.g:2341:1: ( ( ( rule__TypeJSON__Group_2_1__0 ) ) ( ( rule__TypeJSON__Group_2_1__0 )* ) )
            // InternalMyDsl.g:2342:2: ( ( rule__TypeJSON__Group_2_1__0 ) ) ( ( rule__TypeJSON__Group_2_1__0 )* )
            {
            // InternalMyDsl.g:2342:2: ( ( rule__TypeJSON__Group_2_1__0 ) )
            // InternalMyDsl.g:2343:3: ( rule__TypeJSON__Group_2_1__0 )
            {
             before(grammarAccess.getTypeJSONAccess().getGroup_2_1()); 
            // InternalMyDsl.g:2344:3: ( rule__TypeJSON__Group_2_1__0 )
            // InternalMyDsl.g:2344:4: rule__TypeJSON__Group_2_1__0
            {
            pushFollow(FOLLOW_11);
            rule__TypeJSON__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getGroup_2_1()); 

            }

            // InternalMyDsl.g:2347:2: ( ( rule__TypeJSON__Group_2_1__0 )* )
            // InternalMyDsl.g:2348:3: ( rule__TypeJSON__Group_2_1__0 )*
            {
             before(grammarAccess.getTypeJSONAccess().getGroup_2_1()); 
            // InternalMyDsl.g:2349:3: ( rule__TypeJSON__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2349:4: rule__TypeJSON__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TypeJSON__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTypeJSONAccess().getGroup_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2__1__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2__2"
    // InternalMyDsl.g:2358:1: rule__TypeJSON__Group_2__2 : rule__TypeJSON__Group_2__2__Impl ;
    public final void rule__TypeJSON__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( rule__TypeJSON__Group_2__2__Impl )
            // InternalMyDsl.g:2363:2: rule__TypeJSON__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2__2"


    // $ANTLR start "rule__TypeJSON__Group_2__2__Impl"
    // InternalMyDsl.g:2369:1: rule__TypeJSON__Group_2__2__Impl : ( '}' ) ;
    public final void rule__TypeJSON__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( ( '}' ) )
            // InternalMyDsl.g:2374:1: ( '}' )
            {
            // InternalMyDsl.g:2374:1: ( '}' )
            // InternalMyDsl.g:2375:2: '}'
            {
             before(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2__2__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2_1__0"
    // InternalMyDsl.g:2385:1: rule__TypeJSON__Group_2_1__0 : rule__TypeJSON__Group_2_1__0__Impl rule__TypeJSON__Group_2_1__1 ;
    public final void rule__TypeJSON__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( rule__TypeJSON__Group_2_1__0__Impl rule__TypeJSON__Group_2_1__1 )
            // InternalMyDsl.g:2390:2: rule__TypeJSON__Group_2_1__0__Impl rule__TypeJSON__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__TypeJSON__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__0"


    // $ANTLR start "rule__TypeJSON__Group_2_1__0__Impl"
    // InternalMyDsl.g:2397:1: rule__TypeJSON__Group_2_1__0__Impl : ( ( rule__TypeJSON__AttributeAssignment_2_1_0 ) ) ;
    public final void rule__TypeJSON__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( ( ( rule__TypeJSON__AttributeAssignment_2_1_0 ) ) )
            // InternalMyDsl.g:2402:1: ( ( rule__TypeJSON__AttributeAssignment_2_1_0 ) )
            {
            // InternalMyDsl.g:2402:1: ( ( rule__TypeJSON__AttributeAssignment_2_1_0 ) )
            // InternalMyDsl.g:2403:2: ( rule__TypeJSON__AttributeAssignment_2_1_0 )
            {
             before(grammarAccess.getTypeJSONAccess().getAttributeAssignment_2_1_0()); 
            // InternalMyDsl.g:2404:2: ( rule__TypeJSON__AttributeAssignment_2_1_0 )
            // InternalMyDsl.g:2404:3: rule__TypeJSON__AttributeAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__AttributeAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getAttributeAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__0__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2_1__1"
    // InternalMyDsl.g:2412:1: rule__TypeJSON__Group_2_1__1 : rule__TypeJSON__Group_2_1__1__Impl rule__TypeJSON__Group_2_1__2 ;
    public final void rule__TypeJSON__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2416:1: ( rule__TypeJSON__Group_2_1__1__Impl rule__TypeJSON__Group_2_1__2 )
            // InternalMyDsl.g:2417:2: rule__TypeJSON__Group_2_1__1__Impl rule__TypeJSON__Group_2_1__2
            {
            pushFollow(FOLLOW_17);
            rule__TypeJSON__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__1"


    // $ANTLR start "rule__TypeJSON__Group_2_1__1__Impl"
    // InternalMyDsl.g:2424:1: rule__TypeJSON__Group_2_1__1__Impl : ( ':' ) ;
    public final void rule__TypeJSON__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( ( ':' ) )
            // InternalMyDsl.g:2429:1: ( ':' )
            {
            // InternalMyDsl.g:2429:1: ( ':' )
            // InternalMyDsl.g:2430:2: ':'
            {
             before(grammarAccess.getTypeJSONAccess().getColonKeyword_2_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getColonKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__1__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2_1__2"
    // InternalMyDsl.g:2439:1: rule__TypeJSON__Group_2_1__2 : rule__TypeJSON__Group_2_1__2__Impl rule__TypeJSON__Group_2_1__3 ;
    public final void rule__TypeJSON__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( rule__TypeJSON__Group_2_1__2__Impl rule__TypeJSON__Group_2_1__3 )
            // InternalMyDsl.g:2444:2: rule__TypeJSON__Group_2_1__2__Impl rule__TypeJSON__Group_2_1__3
            {
            pushFollow(FOLLOW_8);
            rule__TypeJSON__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__2"


    // $ANTLR start "rule__TypeJSON__Group_2_1__2__Impl"
    // InternalMyDsl.g:2451:1: rule__TypeJSON__Group_2_1__2__Impl : ( '[' ) ;
    public final void rule__TypeJSON__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( ( '[' ) )
            // InternalMyDsl.g:2456:1: ( '[' )
            {
            // InternalMyDsl.g:2456:1: ( '[' )
            // InternalMyDsl.g:2457:2: '['
            {
             before(grammarAccess.getTypeJSONAccess().getLeftSquareBracketKeyword_2_1_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getLeftSquareBracketKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__2__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2_1__3"
    // InternalMyDsl.g:2466:1: rule__TypeJSON__Group_2_1__3 : rule__TypeJSON__Group_2_1__3__Impl rule__TypeJSON__Group_2_1__4 ;
    public final void rule__TypeJSON__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2470:1: ( rule__TypeJSON__Group_2_1__3__Impl rule__TypeJSON__Group_2_1__4 )
            // InternalMyDsl.g:2471:2: rule__TypeJSON__Group_2_1__3__Impl rule__TypeJSON__Group_2_1__4
            {
            pushFollow(FOLLOW_13);
            rule__TypeJSON__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__3"


    // $ANTLR start "rule__TypeJSON__Group_2_1__3__Impl"
    // InternalMyDsl.g:2478:1: rule__TypeJSON__Group_2_1__3__Impl : ( '{' ) ;
    public final void rule__TypeJSON__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( ( '{' ) )
            // InternalMyDsl.g:2483:1: ( '{' )
            {
            // InternalMyDsl.g:2483:1: ( '{' )
            // InternalMyDsl.g:2484:2: '{'
            {
             before(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_2_1_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getLeftCurlyBracketKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__3__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2_1__4"
    // InternalMyDsl.g:2493:1: rule__TypeJSON__Group_2_1__4 : rule__TypeJSON__Group_2_1__4__Impl rule__TypeJSON__Group_2_1__5 ;
    public final void rule__TypeJSON__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( rule__TypeJSON__Group_2_1__4__Impl rule__TypeJSON__Group_2_1__5 )
            // InternalMyDsl.g:2498:2: rule__TypeJSON__Group_2_1__4__Impl rule__TypeJSON__Group_2_1__5
            {
            pushFollow(FOLLOW_10);
            rule__TypeJSON__Group_2_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__4"


    // $ANTLR start "rule__TypeJSON__Group_2_1__4__Impl"
    // InternalMyDsl.g:2505:1: rule__TypeJSON__Group_2_1__4__Impl : ( ( ( rule__TypeJSON__ValueAssignment_2_1_4 ) ) ( ( rule__TypeJSON__ValueAssignment_2_1_4 )* ) ) ;
    public final void rule__TypeJSON__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( ( ( ( rule__TypeJSON__ValueAssignment_2_1_4 ) ) ( ( rule__TypeJSON__ValueAssignment_2_1_4 )* ) ) )
            // InternalMyDsl.g:2510:1: ( ( ( rule__TypeJSON__ValueAssignment_2_1_4 ) ) ( ( rule__TypeJSON__ValueAssignment_2_1_4 )* ) )
            {
            // InternalMyDsl.g:2510:1: ( ( ( rule__TypeJSON__ValueAssignment_2_1_4 ) ) ( ( rule__TypeJSON__ValueAssignment_2_1_4 )* ) )
            // InternalMyDsl.g:2511:2: ( ( rule__TypeJSON__ValueAssignment_2_1_4 ) ) ( ( rule__TypeJSON__ValueAssignment_2_1_4 )* )
            {
            // InternalMyDsl.g:2511:2: ( ( rule__TypeJSON__ValueAssignment_2_1_4 ) )
            // InternalMyDsl.g:2512:3: ( rule__TypeJSON__ValueAssignment_2_1_4 )
            {
             before(grammarAccess.getTypeJSONAccess().getValueAssignment_2_1_4()); 
            // InternalMyDsl.g:2513:3: ( rule__TypeJSON__ValueAssignment_2_1_4 )
            // InternalMyDsl.g:2513:4: rule__TypeJSON__ValueAssignment_2_1_4
            {
            pushFollow(FOLLOW_16);
            rule__TypeJSON__ValueAssignment_2_1_4();

            state._fsp--;


            }

             after(grammarAccess.getTypeJSONAccess().getValueAssignment_2_1_4()); 

            }

            // InternalMyDsl.g:2516:2: ( ( rule__TypeJSON__ValueAssignment_2_1_4 )* )
            // InternalMyDsl.g:2517:3: ( rule__TypeJSON__ValueAssignment_2_1_4 )*
            {
             before(grammarAccess.getTypeJSONAccess().getValueAssignment_2_1_4()); 
            // InternalMyDsl.g:2518:3: ( rule__TypeJSON__ValueAssignment_2_1_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)||LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2518:4: rule__TypeJSON__ValueAssignment_2_1_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TypeJSON__ValueAssignment_2_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTypeJSONAccess().getValueAssignment_2_1_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__4__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2_1__5"
    // InternalMyDsl.g:2527:1: rule__TypeJSON__Group_2_1__5 : rule__TypeJSON__Group_2_1__5__Impl rule__TypeJSON__Group_2_1__6 ;
    public final void rule__TypeJSON__Group_2_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2531:1: ( rule__TypeJSON__Group_2_1__5__Impl rule__TypeJSON__Group_2_1__6 )
            // InternalMyDsl.g:2532:2: rule__TypeJSON__Group_2_1__5__Impl rule__TypeJSON__Group_2_1__6
            {
            pushFollow(FOLLOW_18);
            rule__TypeJSON__Group_2_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__5"


    // $ANTLR start "rule__TypeJSON__Group_2_1__5__Impl"
    // InternalMyDsl.g:2539:1: rule__TypeJSON__Group_2_1__5__Impl : ( '}' ) ;
    public final void rule__TypeJSON__Group_2_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( ( '}' ) )
            // InternalMyDsl.g:2544:1: ( '}' )
            {
            // InternalMyDsl.g:2544:1: ( '}' )
            // InternalMyDsl.g:2545:2: '}'
            {
             before(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_2_1_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getRightCurlyBracketKeyword_2_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__5__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2_1__6"
    // InternalMyDsl.g:2554:1: rule__TypeJSON__Group_2_1__6 : rule__TypeJSON__Group_2_1__6__Impl rule__TypeJSON__Group_2_1__7 ;
    public final void rule__TypeJSON__Group_2_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2558:1: ( rule__TypeJSON__Group_2_1__6__Impl rule__TypeJSON__Group_2_1__7 )
            // InternalMyDsl.g:2559:2: rule__TypeJSON__Group_2_1__6__Impl rule__TypeJSON__Group_2_1__7
            {
            pushFollow(FOLLOW_14);
            rule__TypeJSON__Group_2_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__6"


    // $ANTLR start "rule__TypeJSON__Group_2_1__6__Impl"
    // InternalMyDsl.g:2566:1: rule__TypeJSON__Group_2_1__6__Impl : ( ']' ) ;
    public final void rule__TypeJSON__Group_2_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( ( ']' ) )
            // InternalMyDsl.g:2571:1: ( ']' )
            {
            // InternalMyDsl.g:2571:1: ( ']' )
            // InternalMyDsl.g:2572:2: ']'
            {
             before(grammarAccess.getTypeJSONAccess().getRightSquareBracketKeyword_2_1_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getRightSquareBracketKeyword_2_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__6__Impl"


    // $ANTLR start "rule__TypeJSON__Group_2_1__7"
    // InternalMyDsl.g:2581:1: rule__TypeJSON__Group_2_1__7 : rule__TypeJSON__Group_2_1__7__Impl ;
    public final void rule__TypeJSON__Group_2_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2585:1: ( rule__TypeJSON__Group_2_1__7__Impl )
            // InternalMyDsl.g:2586:2: rule__TypeJSON__Group_2_1__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeJSON__Group_2_1__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__7"


    // $ANTLR start "rule__TypeJSON__Group_2_1__7__Impl"
    // InternalMyDsl.g:2592:1: rule__TypeJSON__Group_2_1__7__Impl : ( ';' ) ;
    public final void rule__TypeJSON__Group_2_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( ( ';' ) )
            // InternalMyDsl.g:2597:1: ( ';' )
            {
            // InternalMyDsl.g:2597:1: ( ';' )
            // InternalMyDsl.g:2598:2: ';'
            {
             before(grammarAccess.getTypeJSONAccess().getSemicolonKeyword_2_1_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getSemicolonKeyword_2_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__Group_2_1__7__Impl"


    // $ANTLR start "rule__Model__SentencesAssignment"
    // InternalMyDsl.g:2608:1: rule__Model__SentencesAssignment : ( ruleFun ) ;
    public final void rule__Model__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2612:1: ( ( ruleFun ) )
            // InternalMyDsl.g:2613:2: ( ruleFun )
            {
            // InternalMyDsl.g:2613:2: ( ruleFun )
            // InternalMyDsl.g:2614:3: ruleFun
            {
             before(grammarAccess.getModelAccess().getSentencesFunParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFun();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSentencesFunParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SentencesAssignment"


    // $ANTLR start "rule__CountJson__CountJSONAssignment_0"
    // InternalMyDsl.g:2623:1: rule__CountJson__CountJSONAssignment_0 : ( ( 'count' ) ) ;
    public final void rule__CountJson__CountJSONAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2627:1: ( ( ( 'count' ) ) )
            // InternalMyDsl.g:2628:2: ( ( 'count' ) )
            {
            // InternalMyDsl.g:2628:2: ( ( 'count' ) )
            // InternalMyDsl.g:2629:3: ( 'count' )
            {
             before(grammarAccess.getCountJsonAccess().getCountJSONCountKeyword_0_0()); 
            // InternalMyDsl.g:2630:3: ( 'count' )
            // InternalMyDsl.g:2631:4: 'count'
            {
             before(grammarAccess.getCountJsonAccess().getCountJSONCountKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCountJsonAccess().getCountJSONCountKeyword_0_0()); 

            }

             after(grammarAccess.getCountJsonAccess().getCountJSONCountKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__CountJSONAssignment_0"


    // $ANTLR start "rule__CountJson__ValueAssignment_2"
    // InternalMyDsl.g:2642:1: rule__CountJson__ValueAssignment_2 : ( ruleTypeString ) ;
    public final void rule__CountJson__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2646:1: ( ( ruleTypeString ) )
            // InternalMyDsl.g:2647:2: ( ruleTypeString )
            {
            // InternalMyDsl.g:2647:2: ( ruleTypeString )
            // InternalMyDsl.g:2648:3: ruleTypeString
            {
             before(grammarAccess.getCountJsonAccess().getValueTypeStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeString();

            state._fsp--;

             after(grammarAccess.getCountJsonAccess().getValueTypeStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountJson__ValueAssignment_2"


    // $ANTLR start "rule__ReadJson__ReadJSONAssignment_0"
    // InternalMyDsl.g:2657:1: rule__ReadJson__ReadJSONAssignment_0 : ( ( 'read' ) ) ;
    public final void rule__ReadJson__ReadJSONAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2661:1: ( ( ( 'read' ) ) )
            // InternalMyDsl.g:2662:2: ( ( 'read' ) )
            {
            // InternalMyDsl.g:2662:2: ( ( 'read' ) )
            // InternalMyDsl.g:2663:3: ( 'read' )
            {
             before(grammarAccess.getReadJsonAccess().getReadJSONReadKeyword_0_0()); 
            // InternalMyDsl.g:2664:3: ( 'read' )
            // InternalMyDsl.g:2665:4: 'read'
            {
             before(grammarAccess.getReadJsonAccess().getReadJSONReadKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getReadJsonAccess().getReadJSONReadKeyword_0_0()); 

            }

             after(grammarAccess.getReadJsonAccess().getReadJSONReadKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__ReadJSONAssignment_0"


    // $ANTLR start "rule__ReadJson__PathAssignment_2"
    // InternalMyDsl.g:2676:1: rule__ReadJson__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ReadJson__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2680:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2681:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2681:2: ( RULE_STRING )
            // InternalMyDsl.g:2682:3: RULE_STRING
            {
             before(grammarAccess.getReadJsonAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReadJsonAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadJson__PathAssignment_2"


    // $ANTLR start "rule__PrintJson__PrintJsonAssignment_0"
    // InternalMyDsl.g:2691:1: rule__PrintJson__PrintJsonAssignment_0 : ( ( 'print' ) ) ;
    public final void rule__PrintJson__PrintJsonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2695:1: ( ( ( 'print' ) ) )
            // InternalMyDsl.g:2696:2: ( ( 'print' ) )
            {
            // InternalMyDsl.g:2696:2: ( ( 'print' ) )
            // InternalMyDsl.g:2697:3: ( 'print' )
            {
             before(grammarAccess.getPrintJsonAccess().getPrintJsonPrintKeyword_0_0()); 
            // InternalMyDsl.g:2698:3: ( 'print' )
            // InternalMyDsl.g:2699:4: 'print'
            {
             before(grammarAccess.getPrintJsonAccess().getPrintJsonPrintKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrintJsonAccess().getPrintJsonPrintKeyword_0_0()); 

            }

             after(grammarAccess.getPrintJsonAccess().getPrintJsonPrintKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__PrintJsonAssignment_0"


    // $ANTLR start "rule__PrintJson__ValueAssignment_2"
    // InternalMyDsl.g:2710:1: rule__PrintJson__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PrintJson__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2714:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2715:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2715:2: ( RULE_STRING )
            // InternalMyDsl.g:2716:3: RULE_STRING
            {
             before(grammarAccess.getPrintJsonAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrintJsonAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintJson__ValueAssignment_2"


    // $ANTLR start "rule__WriteJson__WriteJSONAssignment_0"
    // InternalMyDsl.g:2725:1: rule__WriteJson__WriteJSONAssignment_0 : ( ( 'writeJSON' ) ) ;
    public final void rule__WriteJson__WriteJSONAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2729:1: ( ( ( 'writeJSON' ) ) )
            // InternalMyDsl.g:2730:2: ( ( 'writeJSON' ) )
            {
            // InternalMyDsl.g:2730:2: ( ( 'writeJSON' ) )
            // InternalMyDsl.g:2731:3: ( 'writeJSON' )
            {
             before(grammarAccess.getWriteJsonAccess().getWriteJSONWriteJSONKeyword_0_0()); 
            // InternalMyDsl.g:2732:3: ( 'writeJSON' )
            // InternalMyDsl.g:2733:4: 'writeJSON'
            {
             before(grammarAccess.getWriteJsonAccess().getWriteJSONWriteJSONKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWriteJsonAccess().getWriteJSONWriteJSONKeyword_0_0()); 

            }

             after(grammarAccess.getWriteJsonAccess().getWriteJSONWriteJSONKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__WriteJSONAssignment_0"


    // $ANTLR start "rule__WriteJson__PathAssignment_2"
    // InternalMyDsl.g:2744:1: rule__WriteJson__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WriteJson__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2748:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2749:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2749:2: ( RULE_STRING )
            // InternalMyDsl.g:2750:3: RULE_STRING
            {
             before(grammarAccess.getWriteJsonAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWriteJsonAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__PathAssignment_2"


    // $ANTLR start "rule__WriteJson__ValueAssignment_3_1"
    // InternalMyDsl.g:2759:1: rule__WriteJson__ValueAssignment_3_1 : ( ruleTypeJSON ) ;
    public final void rule__WriteJson__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( ( ruleTypeJSON ) )
            // InternalMyDsl.g:2764:2: ( ruleTypeJSON )
            {
            // InternalMyDsl.g:2764:2: ( ruleTypeJSON )
            // InternalMyDsl.g:2765:3: ruleTypeJSON
            {
             before(grammarAccess.getWriteJsonAccess().getValueTypeJSONParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeJSON();

            state._fsp--;

             after(grammarAccess.getWriteJsonAccess().getValueTypeJSONParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteJson__ValueAssignment_3_1"


    // $ANTLR start "rule__WriteCSV__WriteCVSAssignment_0"
    // InternalMyDsl.g:2774:1: rule__WriteCSV__WriteCVSAssignment_0 : ( ( 'writeCSV' ) ) ;
    public final void rule__WriteCSV__WriteCVSAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2778:1: ( ( ( 'writeCSV' ) ) )
            // InternalMyDsl.g:2779:2: ( ( 'writeCSV' ) )
            {
            // InternalMyDsl.g:2779:2: ( ( 'writeCSV' ) )
            // InternalMyDsl.g:2780:3: ( 'writeCSV' )
            {
             before(grammarAccess.getWriteCSVAccess().getWriteCVSWriteCSVKeyword_0_0()); 
            // InternalMyDsl.g:2781:3: ( 'writeCSV' )
            // InternalMyDsl.g:2782:4: 'writeCSV'
            {
             before(grammarAccess.getWriteCSVAccess().getWriteCVSWriteCSVKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWriteCSVAccess().getWriteCVSWriteCSVKeyword_0_0()); 

            }

             after(grammarAccess.getWriteCSVAccess().getWriteCVSWriteCSVKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__WriteCVSAssignment_0"


    // $ANTLR start "rule__WriteCSV__PathAssignment_2"
    // InternalMyDsl.g:2793:1: rule__WriteCSV__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WriteCSV__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2798:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2798:2: ( RULE_STRING )
            // InternalMyDsl.g:2799:3: RULE_STRING
            {
             before(grammarAccess.getWriteCSVAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWriteCSVAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__PathAssignment_2"


    // $ANTLR start "rule__WriteCSV__ValueAssignment_3_1"
    // InternalMyDsl.g:2808:1: rule__WriteCSV__ValueAssignment_3_1 : ( ruleTypeJSON ) ;
    public final void rule__WriteCSV__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2812:1: ( ( ruleTypeJSON ) )
            // InternalMyDsl.g:2813:2: ( ruleTypeJSON )
            {
            // InternalMyDsl.g:2813:2: ( ruleTypeJSON )
            // InternalMyDsl.g:2814:3: ruleTypeJSON
            {
             before(grammarAccess.getWriteCSVAccess().getValueTypeJSONParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeJSON();

            state._fsp--;

             after(grammarAccess.getWriteCSVAccess().getValueTypeJSONParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCSV__ValueAssignment_3_1"


    // $ANTLR start "rule__Remove__RemoveElementAssignment_0"
    // InternalMyDsl.g:2823:1: rule__Remove__RemoveElementAssignment_0 : ( ( 'remove' ) ) ;
    public final void rule__Remove__RemoveElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2827:1: ( ( ( 'remove' ) ) )
            // InternalMyDsl.g:2828:2: ( ( 'remove' ) )
            {
            // InternalMyDsl.g:2828:2: ( ( 'remove' ) )
            // InternalMyDsl.g:2829:3: ( 'remove' )
            {
             before(grammarAccess.getRemoveAccess().getRemoveElementRemoveKeyword_0_0()); 
            // InternalMyDsl.g:2830:3: ( 'remove' )
            // InternalMyDsl.g:2831:4: 'remove'
            {
             before(grammarAccess.getRemoveAccess().getRemoveElementRemoveKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getRemoveElementRemoveKeyword_0_0()); 

            }

             after(grammarAccess.getRemoveAccess().getRemoveElementRemoveKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__RemoveElementAssignment_0"


    // $ANTLR start "rule__Remove__IdAssignment_2"
    // InternalMyDsl.g:2842:1: rule__Remove__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Remove__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2847:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2847:2: ( RULE_STRING )
            // InternalMyDsl.g:2848:3: RULE_STRING
            {
             before(grammarAccess.getRemoveAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__IdAssignment_2"


    // $ANTLR start "rule__Add__AddElementAssignment_0"
    // InternalMyDsl.g:2857:1: rule__Add__AddElementAssignment_0 : ( ( 'add' ) ) ;
    public final void rule__Add__AddElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2861:1: ( ( ( 'add' ) ) )
            // InternalMyDsl.g:2862:2: ( ( 'add' ) )
            {
            // InternalMyDsl.g:2862:2: ( ( 'add' ) )
            // InternalMyDsl.g:2863:3: ( 'add' )
            {
             before(grammarAccess.getAddAccess().getAddElementAddKeyword_0_0()); 
            // InternalMyDsl.g:2864:3: ( 'add' )
            // InternalMyDsl.g:2865:4: 'add'
            {
             before(grammarAccess.getAddAccess().getAddElementAddKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getAddElementAddKeyword_0_0()); 

            }

             after(grammarAccess.getAddAccess().getAddElementAddKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__AddElementAssignment_0"


    // $ANTLR start "rule__Add__ValueAssignment_2"
    // InternalMyDsl.g:2876:1: rule__Add__ValueAssignment_2 : ( ruleTypeJSON ) ;
    public final void rule__Add__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2880:1: ( ( ruleTypeJSON ) )
            // InternalMyDsl.g:2881:2: ( ruleTypeJSON )
            {
            // InternalMyDsl.g:2881:2: ( ruleTypeJSON )
            // InternalMyDsl.g:2882:3: ruleTypeJSON
            {
             before(grammarAccess.getAddAccess().getValueTypeJSONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeJSON();

            state._fsp--;

             after(grammarAccess.getAddAccess().getValueTypeJSONParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__ValueAssignment_2"


    // $ANTLR start "rule__Get__GetElementAssignment_0"
    // InternalMyDsl.g:2891:1: rule__Get__GetElementAssignment_0 : ( ( 'get' ) ) ;
    public final void rule__Get__GetElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2895:1: ( ( ( 'get' ) ) )
            // InternalMyDsl.g:2896:2: ( ( 'get' ) )
            {
            // InternalMyDsl.g:2896:2: ( ( 'get' ) )
            // InternalMyDsl.g:2897:3: ( 'get' )
            {
             before(grammarAccess.getGetAccess().getGetElementGetKeyword_0_0()); 
            // InternalMyDsl.g:2898:3: ( 'get' )
            // InternalMyDsl.g:2899:4: 'get'
            {
             before(grammarAccess.getGetAccess().getGetElementGetKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getGetElementGetKeyword_0_0()); 

            }

             after(grammarAccess.getGetAccess().getGetElementGetKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__GetElementAssignment_0"


    // $ANTLR start "rule__Get__IdAssignment_2"
    // InternalMyDsl.g:2910:1: rule__Get__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Get__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2915:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2915:2: ( RULE_STRING )
            // InternalMyDsl.g:2916:3: RULE_STRING
            {
             before(grammarAccess.getGetAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGetAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Get__IdAssignment_2"


    // $ANTLR start "rule__Sort__SortAssignment_0"
    // InternalMyDsl.g:2925:1: rule__Sort__SortAssignment_0 : ( ( 'sort' ) ) ;
    public final void rule__Sort__SortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( ( ( 'sort' ) ) )
            // InternalMyDsl.g:2930:2: ( ( 'sort' ) )
            {
            // InternalMyDsl.g:2930:2: ( ( 'sort' ) )
            // InternalMyDsl.g:2931:3: ( 'sort' )
            {
             before(grammarAccess.getSortAccess().getSortSortKeyword_0_0()); 
            // InternalMyDsl.g:2932:3: ( 'sort' )
            // InternalMyDsl.g:2933:4: 'sort'
            {
             before(grammarAccess.getSortAccess().getSortSortKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getSortSortKeyword_0_0()); 

            }

             after(grammarAccess.getSortAccess().getSortSortKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__SortAssignment_0"


    // $ANTLR start "rule__Sort__ValueAssignment_1"
    // InternalMyDsl.g:2944:1: rule__Sort__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Sort__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2948:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2949:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2949:2: ( RULE_STRING )
            // InternalMyDsl.g:2950:3: RULE_STRING
            {
             before(grammarAccess.getSortAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__ValueAssignment_1"


    // $ANTLR start "rule__Sort__AttributeAssignment_3"
    // InternalMyDsl.g:2959:1: rule__Sort__AttributeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Sort__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2963:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2964:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2964:2: ( RULE_STRING )
            // InternalMyDsl.g:2965:3: RULE_STRING
            {
             before(grammarAccess.getSortAccess().getAttributeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSortAccess().getAttributeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__AttributeAssignment_3"


    // $ANTLR start "rule__Show__ShowAssignment_0"
    // InternalMyDsl.g:2974:1: rule__Show__ShowAssignment_0 : ( ( 'show' ) ) ;
    public final void rule__Show__ShowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2978:1: ( ( ( 'show' ) ) )
            // InternalMyDsl.g:2979:2: ( ( 'show' ) )
            {
            // InternalMyDsl.g:2979:2: ( ( 'show' ) )
            // InternalMyDsl.g:2980:3: ( 'show' )
            {
             before(grammarAccess.getShowAccess().getShowShowKeyword_0_0()); 
            // InternalMyDsl.g:2981:3: ( 'show' )
            // InternalMyDsl.g:2982:4: 'show'
            {
             before(grammarAccess.getShowAccess().getShowShowKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getShowShowKeyword_0_0()); 

            }

             after(grammarAccess.getShowAccess().getShowShowKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__ShowAssignment_0"


    // $ANTLR start "rule__Show__NameAssignment_1_1"
    // InternalMyDsl.g:2993:1: rule__Show__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Show__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2997:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2998:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2998:2: ( RULE_STRING )
            // InternalMyDsl.g:2999:3: RULE_STRING
            {
             before(grammarAccess.getShowAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__NameAssignment_1_1"


    // $ANTLR start "rule__TypeInt__ValAssignment"
    // InternalMyDsl.g:3008:1: rule__TypeInt__ValAssignment : ( RULE_INT ) ;
    public final void rule__TypeInt__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3012:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3013:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3013:2: ( RULE_INT )
            // InternalMyDsl.g:3014:3: RULE_INT
            {
             before(grammarAccess.getTypeIntAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeIntAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeInt__ValAssignment"


    // $ANTLR start "rule__TypeString__ValAssignment"
    // InternalMyDsl.g:3023:1: rule__TypeString__ValAssignment : ( RULE_STRING ) ;
    public final void rule__TypeString__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3027:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3028:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3028:2: ( RULE_STRING )
            // InternalMyDsl.g:3029:3: RULE_STRING
            {
             before(grammarAccess.getTypeStringAccess().getValSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeStringAccess().getValSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeString__ValAssignment"


    // $ANTLR start "rule__TypeJSON__AttributeAssignment_0_1_0"
    // InternalMyDsl.g:3038:1: rule__TypeJSON__AttributeAssignment_0_1_0 : ( RULE_STRING ) ;
    public final void rule__TypeJSON__AttributeAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3042:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3043:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3043:2: ( RULE_STRING )
            // InternalMyDsl.g:3044:3: RULE_STRING
            {
             before(grammarAccess.getTypeJSONAccess().getAttributeSTRINGTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getAttributeSTRINGTerminalRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__AttributeAssignment_0_1_0"


    // $ANTLR start "rule__TypeJSON__ValueAssignment_0_1_2"
    // InternalMyDsl.g:3053:1: rule__TypeJSON__ValueAssignment_0_1_2 : ( ruleTypeReference ) ;
    public final void rule__TypeJSON__ValueAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3057:1: ( ( ruleTypeReference ) )
            // InternalMyDsl.g:3058:2: ( ruleTypeReference )
            {
            // InternalMyDsl.g:3058:2: ( ruleTypeReference )
            // InternalMyDsl.g:3059:3: ruleTypeReference
            {
             before(grammarAccess.getTypeJSONAccess().getValueTypeReferenceParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeJSONAccess().getValueTypeReferenceParserRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__ValueAssignment_0_1_2"


    // $ANTLR start "rule__TypeJSON__AttributeAssignment_1_1_0"
    // InternalMyDsl.g:3068:1: rule__TypeJSON__AttributeAssignment_1_1_0 : ( RULE_STRING ) ;
    public final void rule__TypeJSON__AttributeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3072:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3073:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3073:2: ( RULE_STRING )
            // InternalMyDsl.g:3074:3: RULE_STRING
            {
             before(grammarAccess.getTypeJSONAccess().getAttributeSTRINGTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getAttributeSTRINGTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__AttributeAssignment_1_1_0"


    // $ANTLR start "rule__TypeJSON__ValueAssignment_1_1_3"
    // InternalMyDsl.g:3083:1: rule__TypeJSON__ValueAssignment_1_1_3 : ( ruleTypeReference ) ;
    public final void rule__TypeJSON__ValueAssignment_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3087:1: ( ( ruleTypeReference ) )
            // InternalMyDsl.g:3088:2: ( ruleTypeReference )
            {
            // InternalMyDsl.g:3088:2: ( ruleTypeReference )
            // InternalMyDsl.g:3089:3: ruleTypeReference
            {
             before(grammarAccess.getTypeJSONAccess().getValueTypeReferenceParserRuleCall_1_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeJSONAccess().getValueTypeReferenceParserRuleCall_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__ValueAssignment_1_1_3"


    // $ANTLR start "rule__TypeJSON__AttributeAssignment_2_1_0"
    // InternalMyDsl.g:3098:1: rule__TypeJSON__AttributeAssignment_2_1_0 : ( RULE_STRING ) ;
    public final void rule__TypeJSON__AttributeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3102:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3103:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3103:2: ( RULE_STRING )
            // InternalMyDsl.g:3104:3: RULE_STRING
            {
             before(grammarAccess.getTypeJSONAccess().getAttributeSTRINGTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeJSONAccess().getAttributeSTRINGTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__AttributeAssignment_2_1_0"


    // $ANTLR start "rule__TypeJSON__ValueAssignment_2_1_4"
    // InternalMyDsl.g:3113:1: rule__TypeJSON__ValueAssignment_2_1_4 : ( ruleTypeReference ) ;
    public final void rule__TypeJSON__ValueAssignment_2_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3117:1: ( ( ruleTypeReference ) )
            // InternalMyDsl.g:3118:2: ( ruleTypeReference )
            {
            // InternalMyDsl.g:3118:2: ( ruleTypeReference )
            // InternalMyDsl.g:3119:3: ruleTypeReference
            {
             before(grammarAccess.getTypeJSONAccess().getValueTypeReferenceParserRuleCall_2_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeJSONAccess().getValueTypeReferenceParserRuleCall_2_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeJSON__ValueAssignment_2_1_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000FFC00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});

}