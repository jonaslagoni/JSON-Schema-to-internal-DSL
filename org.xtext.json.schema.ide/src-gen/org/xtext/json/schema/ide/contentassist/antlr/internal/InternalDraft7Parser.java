package org.xtext.json.schema.ide.contentassist.antlr.internal;

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
import org.xtext.json.schema.services.Draft7GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDraft7Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\"string\"'", "'\"integer\"'", "'\"number\"'", "'\"object\"'", "'\"array\"'", "'\"boolean\"'", "'\"null\"'", "'{'", "'}'", "','", "'\"properties\"'", "':'", "'\"type\"'", "'['", "']'", "'\"multiples\":'", "'\"minimum\":'", "'\"exclusiveMinimum\":'", "'\"maximum\":'", "'\"exclusiveMaximum\":'", "'\"length\":'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


        public InternalDraft7Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDraft7Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDraft7Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalDraft7.g"; }


    	private Draft7GrammarAccess grammarAccess;

    	public void setGrammarAccess(Draft7GrammarAccess grammarAccess) {
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
    // InternalDraft7.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDraft7.g:54:1: ( ruleModel EOF )
            // InternalDraft7.g:55:1: ruleModel EOF
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
    // InternalDraft7.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDraft7.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDraft7.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDraft7.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDraft7.g:69:3: ( rule__Model__Group__0 )
            // InternalDraft7.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleRoot"
    // InternalDraft7.g:78:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalDraft7.g:79:1: ( ruleRoot EOF )
            // InternalDraft7.g:80:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalDraft7.g:87:1: ruleRoot : ( ( rule__Root__Alternatives ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:91:2: ( ( ( rule__Root__Alternatives ) ) )
            // InternalDraft7.g:92:2: ( ( rule__Root__Alternatives ) )
            {
            // InternalDraft7.g:92:2: ( ( rule__Root__Alternatives ) )
            // InternalDraft7.g:93:3: ( rule__Root__Alternatives )
            {
             before(grammarAccess.getRootAccess().getAlternatives()); 
            // InternalDraft7.g:94:3: ( rule__Root__Alternatives )
            // InternalDraft7.g:94:4: rule__Root__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Root__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleJSONProperties"
    // InternalDraft7.g:103:1: entryRuleJSONProperties : ruleJSONProperties EOF ;
    public final void entryRuleJSONProperties() throws RecognitionException {
        try {
            // InternalDraft7.g:104:1: ( ruleJSONProperties EOF )
            // InternalDraft7.g:105:1: ruleJSONProperties EOF
            {
             before(grammarAccess.getJSONPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONProperties();

            state._fsp--;

             after(grammarAccess.getJSONPropertiesRule()); 
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
    // $ANTLR end "entryRuleJSONProperties"


    // $ANTLR start "ruleJSONProperties"
    // InternalDraft7.g:112:1: ruleJSONProperties : ( ( rule__JSONProperties__Group__0 ) ) ;
    public final void ruleJSONProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:116:2: ( ( ( rule__JSONProperties__Group__0 ) ) )
            // InternalDraft7.g:117:2: ( ( rule__JSONProperties__Group__0 ) )
            {
            // InternalDraft7.g:117:2: ( ( rule__JSONProperties__Group__0 ) )
            // InternalDraft7.g:118:3: ( rule__JSONProperties__Group__0 )
            {
             before(grammarAccess.getJSONPropertiesAccess().getGroup()); 
            // InternalDraft7.g:119:3: ( rule__JSONProperties__Group__0 )
            // InternalDraft7.g:119:4: rule__JSONProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSONProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSONPropertiesAccess().getGroup()); 

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
    // $ANTLR end "ruleJSONProperties"


    // $ANTLR start "entryRuleJSONProperty"
    // InternalDraft7.g:128:1: entryRuleJSONProperty : ruleJSONProperty EOF ;
    public final void entryRuleJSONProperty() throws RecognitionException {
        try {
            // InternalDraft7.g:129:1: ( ruleJSONProperty EOF )
            // InternalDraft7.g:130:1: ruleJSONProperty EOF
            {
             before(grammarAccess.getJSONPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONProperty();

            state._fsp--;

             after(grammarAccess.getJSONPropertyRule()); 
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
    // $ANTLR end "entryRuleJSONProperty"


    // $ANTLR start "ruleJSONProperty"
    // InternalDraft7.g:137:1: ruleJSONProperty : ( ( rule__JSONProperty__Group__0 ) ) ;
    public final void ruleJSONProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:141:2: ( ( ( rule__JSONProperty__Group__0 ) ) )
            // InternalDraft7.g:142:2: ( ( rule__JSONProperty__Group__0 ) )
            {
            // InternalDraft7.g:142:2: ( ( rule__JSONProperty__Group__0 ) )
            // InternalDraft7.g:143:3: ( rule__JSONProperty__Group__0 )
            {
             before(grammarAccess.getJSONPropertyAccess().getGroup()); 
            // InternalDraft7.g:144:3: ( rule__JSONProperty__Group__0 )
            // InternalDraft7.g:144:4: rule__JSONProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSONProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSONPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleJSONProperty"


    // $ANTLR start "entryRuleType"
    // InternalDraft7.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDraft7.g:154:1: ( ruleType EOF )
            // InternalDraft7.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDraft7.g:162:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:166:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalDraft7.g:167:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalDraft7.g:167:2: ( ( rule__Type__Group__0 ) )
            // InternalDraft7.g:168:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalDraft7.g:169:3: ( rule__Type__Group__0 )
            // InternalDraft7.g:169:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleJsonTypes"
    // InternalDraft7.g:178:1: entryRuleJsonTypes : ruleJsonTypes EOF ;
    public final void entryRuleJsonTypes() throws RecognitionException {
        try {
            // InternalDraft7.g:179:1: ( ruleJsonTypes EOF )
            // InternalDraft7.g:180:1: ruleJsonTypes EOF
            {
             before(grammarAccess.getJsonTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonTypes();

            state._fsp--;

             after(grammarAccess.getJsonTypesRule()); 
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
    // $ANTLR end "entryRuleJsonTypes"


    // $ANTLR start "ruleJsonTypes"
    // InternalDraft7.g:187:1: ruleJsonTypes : ( ( rule__JsonTypes__Alternatives ) ) ;
    public final void ruleJsonTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:191:2: ( ( ( rule__JsonTypes__Alternatives ) ) )
            // InternalDraft7.g:192:2: ( ( rule__JsonTypes__Alternatives ) )
            {
            // InternalDraft7.g:192:2: ( ( rule__JsonTypes__Alternatives ) )
            // InternalDraft7.g:193:3: ( rule__JsonTypes__Alternatives )
            {
             before(grammarAccess.getJsonTypesAccess().getAlternatives()); 
            // InternalDraft7.g:194:3: ( rule__JsonTypes__Alternatives )
            // InternalDraft7.g:194:4: rule__JsonTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JsonTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJsonTypes"


    // $ANTLR start "entryRuleMultiples"
    // InternalDraft7.g:203:1: entryRuleMultiples : ruleMultiples EOF ;
    public final void entryRuleMultiples() throws RecognitionException {
        try {
            // InternalDraft7.g:204:1: ( ruleMultiples EOF )
            // InternalDraft7.g:205:1: ruleMultiples EOF
            {
             before(grammarAccess.getMultiplesRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiples();

            state._fsp--;

             after(grammarAccess.getMultiplesRule()); 
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
    // $ANTLR end "entryRuleMultiples"


    // $ANTLR start "ruleMultiples"
    // InternalDraft7.g:212:1: ruleMultiples : ( ( rule__Multiples__Group__0 ) ) ;
    public final void ruleMultiples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:216:2: ( ( ( rule__Multiples__Group__0 ) ) )
            // InternalDraft7.g:217:2: ( ( rule__Multiples__Group__0 ) )
            {
            // InternalDraft7.g:217:2: ( ( rule__Multiples__Group__0 ) )
            // InternalDraft7.g:218:3: ( rule__Multiples__Group__0 )
            {
             before(grammarAccess.getMultiplesAccess().getGroup()); 
            // InternalDraft7.g:219:3: ( rule__Multiples__Group__0 )
            // InternalDraft7.g:219:4: rule__Multiples__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiples__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplesAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiples"


    // $ANTLR start "entryRuleMinimum"
    // InternalDraft7.g:228:1: entryRuleMinimum : ruleMinimum EOF ;
    public final void entryRuleMinimum() throws RecognitionException {
        try {
            // InternalDraft7.g:229:1: ( ruleMinimum EOF )
            // InternalDraft7.g:230:1: ruleMinimum EOF
            {
             before(grammarAccess.getMinimumRule()); 
            pushFollow(FOLLOW_1);
            ruleMinimum();

            state._fsp--;

             after(grammarAccess.getMinimumRule()); 
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
    // $ANTLR end "entryRuleMinimum"


    // $ANTLR start "ruleMinimum"
    // InternalDraft7.g:237:1: ruleMinimum : ( ( rule__Minimum__Group__0 ) ) ;
    public final void ruleMinimum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:241:2: ( ( ( rule__Minimum__Group__0 ) ) )
            // InternalDraft7.g:242:2: ( ( rule__Minimum__Group__0 ) )
            {
            // InternalDraft7.g:242:2: ( ( rule__Minimum__Group__0 ) )
            // InternalDraft7.g:243:3: ( rule__Minimum__Group__0 )
            {
             before(grammarAccess.getMinimumAccess().getGroup()); 
            // InternalDraft7.g:244:3: ( rule__Minimum__Group__0 )
            // InternalDraft7.g:244:4: rule__Minimum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Minimum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinimumAccess().getGroup()); 

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
    // $ANTLR end "ruleMinimum"


    // $ANTLR start "entryRuleExclusiveMinimum"
    // InternalDraft7.g:253:1: entryRuleExclusiveMinimum : ruleExclusiveMinimum EOF ;
    public final void entryRuleExclusiveMinimum() throws RecognitionException {
        try {
            // InternalDraft7.g:254:1: ( ruleExclusiveMinimum EOF )
            // InternalDraft7.g:255:1: ruleExclusiveMinimum EOF
            {
             before(grammarAccess.getExclusiveMinimumRule()); 
            pushFollow(FOLLOW_1);
            ruleExclusiveMinimum();

            state._fsp--;

             after(grammarAccess.getExclusiveMinimumRule()); 
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
    // $ANTLR end "entryRuleExclusiveMinimum"


    // $ANTLR start "ruleExclusiveMinimum"
    // InternalDraft7.g:262:1: ruleExclusiveMinimum : ( ( rule__ExclusiveMinimum__Group__0 ) ) ;
    public final void ruleExclusiveMinimum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:266:2: ( ( ( rule__ExclusiveMinimum__Group__0 ) ) )
            // InternalDraft7.g:267:2: ( ( rule__ExclusiveMinimum__Group__0 ) )
            {
            // InternalDraft7.g:267:2: ( ( rule__ExclusiveMinimum__Group__0 ) )
            // InternalDraft7.g:268:3: ( rule__ExclusiveMinimum__Group__0 )
            {
             before(grammarAccess.getExclusiveMinimumAccess().getGroup()); 
            // InternalDraft7.g:269:3: ( rule__ExclusiveMinimum__Group__0 )
            // InternalDraft7.g:269:4: rule__ExclusiveMinimum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveMinimumAccess().getGroup()); 

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
    // $ANTLR end "ruleExclusiveMinimum"


    // $ANTLR start "entryRuleMaximum"
    // InternalDraft7.g:278:1: entryRuleMaximum : ruleMaximum EOF ;
    public final void entryRuleMaximum() throws RecognitionException {
        try {
            // InternalDraft7.g:279:1: ( ruleMaximum EOF )
            // InternalDraft7.g:280:1: ruleMaximum EOF
            {
             before(grammarAccess.getMaximumRule()); 
            pushFollow(FOLLOW_1);
            ruleMaximum();

            state._fsp--;

             after(grammarAccess.getMaximumRule()); 
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
    // $ANTLR end "entryRuleMaximum"


    // $ANTLR start "ruleMaximum"
    // InternalDraft7.g:287:1: ruleMaximum : ( ( rule__Maximum__Group__0 ) ) ;
    public final void ruleMaximum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:291:2: ( ( ( rule__Maximum__Group__0 ) ) )
            // InternalDraft7.g:292:2: ( ( rule__Maximum__Group__0 ) )
            {
            // InternalDraft7.g:292:2: ( ( rule__Maximum__Group__0 ) )
            // InternalDraft7.g:293:3: ( rule__Maximum__Group__0 )
            {
             before(grammarAccess.getMaximumAccess().getGroup()); 
            // InternalDraft7.g:294:3: ( rule__Maximum__Group__0 )
            // InternalDraft7.g:294:4: rule__Maximum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Maximum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaximumAccess().getGroup()); 

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
    // $ANTLR end "ruleMaximum"


    // $ANTLR start "entryRuleExclusiveMaximum"
    // InternalDraft7.g:303:1: entryRuleExclusiveMaximum : ruleExclusiveMaximum EOF ;
    public final void entryRuleExclusiveMaximum() throws RecognitionException {
        try {
            // InternalDraft7.g:304:1: ( ruleExclusiveMaximum EOF )
            // InternalDraft7.g:305:1: ruleExclusiveMaximum EOF
            {
             before(grammarAccess.getExclusiveMaximumRule()); 
            pushFollow(FOLLOW_1);
            ruleExclusiveMaximum();

            state._fsp--;

             after(grammarAccess.getExclusiveMaximumRule()); 
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
    // $ANTLR end "entryRuleExclusiveMaximum"


    // $ANTLR start "ruleExclusiveMaximum"
    // InternalDraft7.g:312:1: ruleExclusiveMaximum : ( ( rule__ExclusiveMaximum__Group__0 ) ) ;
    public final void ruleExclusiveMaximum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:316:2: ( ( ( rule__ExclusiveMaximum__Group__0 ) ) )
            // InternalDraft7.g:317:2: ( ( rule__ExclusiveMaximum__Group__0 ) )
            {
            // InternalDraft7.g:317:2: ( ( rule__ExclusiveMaximum__Group__0 ) )
            // InternalDraft7.g:318:3: ( rule__ExclusiveMaximum__Group__0 )
            {
             before(grammarAccess.getExclusiveMaximumAccess().getGroup()); 
            // InternalDraft7.g:319:3: ( rule__ExclusiveMaximum__Group__0 )
            // InternalDraft7.g:319:4: rule__ExclusiveMaximum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveMaximumAccess().getGroup()); 

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
    // $ANTLR end "ruleExclusiveMaximum"


    // $ANTLR start "entryRuleLength"
    // InternalDraft7.g:328:1: entryRuleLength : ruleLength EOF ;
    public final void entryRuleLength() throws RecognitionException {
        try {
            // InternalDraft7.g:329:1: ( ruleLength EOF )
            // InternalDraft7.g:330:1: ruleLength EOF
            {
             before(grammarAccess.getLengthRule()); 
            pushFollow(FOLLOW_1);
            ruleLength();

            state._fsp--;

             after(grammarAccess.getLengthRule()); 
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
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // InternalDraft7.g:337:1: ruleLength : ( ( rule__Length__Group__0 ) ) ;
    public final void ruleLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:341:2: ( ( ( rule__Length__Group__0 ) ) )
            // InternalDraft7.g:342:2: ( ( rule__Length__Group__0 ) )
            {
            // InternalDraft7.g:342:2: ( ( rule__Length__Group__0 ) )
            // InternalDraft7.g:343:3: ( rule__Length__Group__0 )
            {
             before(grammarAccess.getLengthAccess().getGroup()); 
            // InternalDraft7.g:344:3: ( rule__Length__Group__0 )
            // InternalDraft7.g:344:4: rule__Length__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Length__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLengthAccess().getGroup()); 

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
    // $ANTLR end "ruleLength"


    // $ANTLR start "rule__Root__Alternatives"
    // InternalDraft7.g:352:1: rule__Root__Alternatives : ( ( ( rule__Root__Group_0__0 ) ) | ( ( rule__Root__Group_1__0 ) ) | ( ( rule__Root__Group_2__0 ) ) | ( ( rule__Root__Group_3__0 ) ) | ( ( rule__Root__Group_4__0 ) ) | ( ( rule__Root__Group_5__0 ) ) | ( ( rule__Root__Group_6__0 ) ) | ( ruleJSONProperties ) );
    public final void rule__Root__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:356:1: ( ( ( rule__Root__Group_0__0 ) ) | ( ( rule__Root__Group_1__0 ) ) | ( ( rule__Root__Group_2__0 ) ) | ( ( rule__Root__Group_3__0 ) ) | ( ( rule__Root__Group_4__0 ) ) | ( ( rule__Root__Group_5__0 ) ) | ( ( rule__Root__Group_6__0 ) ) | ( ruleJSONProperties ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            case 28:
                {
                alt1=5;
                }
                break;
            case 29:
                {
                alt1=6;
                }
                break;
            case 30:
                {
                alt1=7;
                }
                break;
            case 21:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDraft7.g:357:2: ( ( rule__Root__Group_0__0 ) )
                    {
                    // InternalDraft7.g:357:2: ( ( rule__Root__Group_0__0 ) )
                    // InternalDraft7.g:358:3: ( rule__Root__Group_0__0 )
                    {
                     before(grammarAccess.getRootAccess().getGroup_0()); 
                    // InternalDraft7.g:359:3: ( rule__Root__Group_0__0 )
                    // InternalDraft7.g:359:4: rule__Root__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:363:2: ( ( rule__Root__Group_1__0 ) )
                    {
                    // InternalDraft7.g:363:2: ( ( rule__Root__Group_1__0 ) )
                    // InternalDraft7.g:364:3: ( rule__Root__Group_1__0 )
                    {
                     before(grammarAccess.getRootAccess().getGroup_1()); 
                    // InternalDraft7.g:365:3: ( rule__Root__Group_1__0 )
                    // InternalDraft7.g:365:4: rule__Root__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:369:2: ( ( rule__Root__Group_2__0 ) )
                    {
                    // InternalDraft7.g:369:2: ( ( rule__Root__Group_2__0 ) )
                    // InternalDraft7.g:370:3: ( rule__Root__Group_2__0 )
                    {
                     before(grammarAccess.getRootAccess().getGroup_2()); 
                    // InternalDraft7.g:371:3: ( rule__Root__Group_2__0 )
                    // InternalDraft7.g:371:4: rule__Root__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:375:2: ( ( rule__Root__Group_3__0 ) )
                    {
                    // InternalDraft7.g:375:2: ( ( rule__Root__Group_3__0 ) )
                    // InternalDraft7.g:376:3: ( rule__Root__Group_3__0 )
                    {
                     before(grammarAccess.getRootAccess().getGroup_3()); 
                    // InternalDraft7.g:377:3: ( rule__Root__Group_3__0 )
                    // InternalDraft7.g:377:4: rule__Root__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:381:2: ( ( rule__Root__Group_4__0 ) )
                    {
                    // InternalDraft7.g:381:2: ( ( rule__Root__Group_4__0 ) )
                    // InternalDraft7.g:382:3: ( rule__Root__Group_4__0 )
                    {
                     before(grammarAccess.getRootAccess().getGroup_4()); 
                    // InternalDraft7.g:383:3: ( rule__Root__Group_4__0 )
                    // InternalDraft7.g:383:4: rule__Root__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDraft7.g:387:2: ( ( rule__Root__Group_5__0 ) )
                    {
                    // InternalDraft7.g:387:2: ( ( rule__Root__Group_5__0 ) )
                    // InternalDraft7.g:388:3: ( rule__Root__Group_5__0 )
                    {
                     before(grammarAccess.getRootAccess().getGroup_5()); 
                    // InternalDraft7.g:389:3: ( rule__Root__Group_5__0 )
                    // InternalDraft7.g:389:4: rule__Root__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDraft7.g:393:2: ( ( rule__Root__Group_6__0 ) )
                    {
                    // InternalDraft7.g:393:2: ( ( rule__Root__Group_6__0 ) )
                    // InternalDraft7.g:394:3: ( rule__Root__Group_6__0 )
                    {
                     before(grammarAccess.getRootAccess().getGroup_6()); 
                    // InternalDraft7.g:395:3: ( rule__Root__Group_6__0 )
                    // InternalDraft7.g:395:4: rule__Root__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDraft7.g:399:2: ( ruleJSONProperties )
                    {
                    // InternalDraft7.g:399:2: ( ruleJSONProperties )
                    // InternalDraft7.g:400:3: ruleJSONProperties
                    {
                     before(grammarAccess.getRootAccess().getJSONPropertiesParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleJSONProperties();

                    state._fsp--;

                     after(grammarAccess.getRootAccess().getJSONPropertiesParserRuleCall_7()); 

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
    // $ANTLR end "rule__Root__Alternatives"


    // $ANTLR start "rule__Type__Alternatives_2"
    // InternalDraft7.g:409:1: rule__Type__Alternatives_2 : ( ( ( rule__Type__Group_2_0__0 ) ) | ( ruleJsonTypes ) );
    public final void rule__Type__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:413:1: ( ( ( rule__Type__Group_2_0__0 ) ) | ( ruleJsonTypes ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=17)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDraft7.g:414:2: ( ( rule__Type__Group_2_0__0 ) )
                    {
                    // InternalDraft7.g:414:2: ( ( rule__Type__Group_2_0__0 ) )
                    // InternalDraft7.g:415:3: ( rule__Type__Group_2_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2_0()); 
                    // InternalDraft7.g:416:3: ( rule__Type__Group_2_0__0 )
                    // InternalDraft7.g:416:4: rule__Type__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:420:2: ( ruleJsonTypes )
                    {
                    // InternalDraft7.g:420:2: ( ruleJsonTypes )
                    // InternalDraft7.g:421:3: ruleJsonTypes
                    {
                     before(grammarAccess.getTypeAccess().getJsonTypesParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonTypes();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getJsonTypesParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Type__Alternatives_2"


    // $ANTLR start "rule__JsonTypes__Alternatives"
    // InternalDraft7.g:430:1: rule__JsonTypes__Alternatives : ( ( '\"string\"' ) | ( '\"integer\"' ) | ( '\"number\"' ) | ( '\"object\"' ) | ( '\"array\"' ) | ( '\"boolean\"' ) | ( '\"null\"' ) );
    public final void rule__JsonTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:434:1: ( ( '\"string\"' ) | ( '\"integer\"' ) | ( '\"number\"' ) | ( '\"object\"' ) | ( '\"array\"' ) | ( '\"boolean\"' ) | ( '\"null\"' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDraft7.g:435:2: ( '\"string\"' )
                    {
                    // InternalDraft7.g:435:2: ( '\"string\"' )
                    // InternalDraft7.g:436:3: '\"string\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:441:2: ( '\"integer\"' )
                    {
                    // InternalDraft7.g:441:2: ( '\"integer\"' )
                    // InternalDraft7.g:442:3: '\"integer\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getIntegerKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:447:2: ( '\"number\"' )
                    {
                    // InternalDraft7.g:447:2: ( '\"number\"' )
                    // InternalDraft7.g:448:3: '\"number\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getNumberKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getNumberKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:453:2: ( '\"object\"' )
                    {
                    // InternalDraft7.g:453:2: ( '\"object\"' )
                    // InternalDraft7.g:454:3: '\"object\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getObjectKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getObjectKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:459:2: ( '\"array\"' )
                    {
                    // InternalDraft7.g:459:2: ( '\"array\"' )
                    // InternalDraft7.g:460:3: '\"array\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getArrayKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getArrayKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDraft7.g:465:2: ( '\"boolean\"' )
                    {
                    // InternalDraft7.g:465:2: ( '\"boolean\"' )
                    // InternalDraft7.g:466:3: '\"boolean\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getBooleanKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getBooleanKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDraft7.g:471:2: ( '\"null\"' )
                    {
                    // InternalDraft7.g:471:2: ( '\"null\"' )
                    // InternalDraft7.g:472:3: '\"null\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getNullKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getNullKeyword_6()); 

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
    // $ANTLR end "rule__JsonTypes__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDraft7.g:481:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:485:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDraft7.g:486:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDraft7.g:493:1: rule__Model__Group__0__Impl : ( '{' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:497:1: ( ( '{' ) )
            // InternalDraft7.g:498:1: ( '{' )
            {
            // InternalDraft7.g:498:1: ( '{' )
            // InternalDraft7.g:499:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDraft7.g:508:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:512:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDraft7.g:513:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDraft7.g:520:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:524:1: ( ( ( rule__Model__Group_1__0 )* ) )
            // InternalDraft7.g:525:1: ( ( rule__Model__Group_1__0 )* )
            {
            // InternalDraft7.g:525:1: ( ( rule__Model__Group_1__0 )* )
            // InternalDraft7.g:526:2: ( rule__Model__Group_1__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_1()); 
            // InternalDraft7.g:527:2: ( rule__Model__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21||LA4_0==23||(LA4_0>=26 && LA4_0<=31)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDraft7.g:527:3: rule__Model__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalDraft7.g:535:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:539:1: ( rule__Model__Group__2__Impl )
            // InternalDraft7.g:540:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalDraft7.g:546:1: rule__Model__Group__2__Impl : ( '}' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:550:1: ( ( '}' ) )
            // InternalDraft7.g:551:1: ( '}' )
            {
            // InternalDraft7.g:551:1: ( '}' )
            // InternalDraft7.g:552:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group_1__0"
    // InternalDraft7.g:562:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:566:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // InternalDraft7.g:567:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1();

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
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // InternalDraft7.g:574:1: rule__Model__Group_1__0__Impl : ( ( rule__Model__RootAssignment_1_0 ) ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:578:1: ( ( ( rule__Model__RootAssignment_1_0 ) ) )
            // InternalDraft7.g:579:1: ( ( rule__Model__RootAssignment_1_0 ) )
            {
            // InternalDraft7.g:579:1: ( ( rule__Model__RootAssignment_1_0 ) )
            // InternalDraft7.g:580:2: ( rule__Model__RootAssignment_1_0 )
            {
             before(grammarAccess.getModelAccess().getRootAssignment_1_0()); 
            // InternalDraft7.g:581:2: ( rule__Model__RootAssignment_1_0 )
            // InternalDraft7.g:581:3: rule__Model__RootAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__RootAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRootAssignment_1_0()); 

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
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // InternalDraft7.g:589:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:593:1: ( rule__Model__Group_1__1__Impl )
            // InternalDraft7.g:594:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1__Impl();

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
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // InternalDraft7.g:600:1: rule__Model__Group_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:604:1: ( ( ( ',' )? ) )
            // InternalDraft7.g:605:1: ( ( ',' )? )
            {
            // InternalDraft7.g:605:1: ( ( ',' )? )
            // InternalDraft7.g:606:2: ( ',' )?
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_1_1()); 
            // InternalDraft7.g:607:2: ( ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDraft7.g:607:3: ','
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__Root__Group_0__0"
    // InternalDraft7.g:616:1: rule__Root__Group_0__0 : rule__Root__Group_0__0__Impl rule__Root__Group_0__1 ;
    public final void rule__Root__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:620:1: ( rule__Root__Group_0__0__Impl rule__Root__Group_0__1 )
            // InternalDraft7.g:621:2: rule__Root__Group_0__0__Impl rule__Root__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Root__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_0__1();

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
    // $ANTLR end "rule__Root__Group_0__0"


    // $ANTLR start "rule__Root__Group_0__0__Impl"
    // InternalDraft7.g:628:1: rule__Root__Group_0__0__Impl : ( () ) ;
    public final void rule__Root__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:632:1: ( ( () ) )
            // InternalDraft7.g:633:1: ( () )
            {
            // InternalDraft7.g:633:1: ( () )
            // InternalDraft7.g:634:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_0_0()); 
            // InternalDraft7.g:635:2: ()
            // InternalDraft7.g:635:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_0__0__Impl"


    // $ANTLR start "rule__Root__Group_0__1"
    // InternalDraft7.g:643:1: rule__Root__Group_0__1 : rule__Root__Group_0__1__Impl ;
    public final void rule__Root__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:647:1: ( rule__Root__Group_0__1__Impl )
            // InternalDraft7.g:648:2: rule__Root__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_0__1__Impl();

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
    // $ANTLR end "rule__Root__Group_0__1"


    // $ANTLR start "rule__Root__Group_0__1__Impl"
    // InternalDraft7.g:654:1: rule__Root__Group_0__1__Impl : ( ruleType ) ;
    public final void rule__Root__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:658:1: ( ( ruleType ) )
            // InternalDraft7.g:659:1: ( ruleType )
            {
            // InternalDraft7.g:659:1: ( ruleType )
            // InternalDraft7.g:660:2: ruleType
            {
             before(grammarAccess.getRootAccess().getTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRootAccess().getTypeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Root__Group_0__1__Impl"


    // $ANTLR start "rule__Root__Group_1__0"
    // InternalDraft7.g:670:1: rule__Root__Group_1__0 : rule__Root__Group_1__0__Impl rule__Root__Group_1__1 ;
    public final void rule__Root__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:674:1: ( rule__Root__Group_1__0__Impl rule__Root__Group_1__1 )
            // InternalDraft7.g:675:2: rule__Root__Group_1__0__Impl rule__Root__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Root__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_1__1();

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
    // $ANTLR end "rule__Root__Group_1__0"


    // $ANTLR start "rule__Root__Group_1__0__Impl"
    // InternalDraft7.g:682:1: rule__Root__Group_1__0__Impl : ( () ) ;
    public final void rule__Root__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:686:1: ( ( () ) )
            // InternalDraft7.g:687:1: ( () )
            {
            // InternalDraft7.g:687:1: ( () )
            // InternalDraft7.g:688:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_1_0()); 
            // InternalDraft7.g:689:2: ()
            // InternalDraft7.g:689:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_1__0__Impl"


    // $ANTLR start "rule__Root__Group_1__1"
    // InternalDraft7.g:697:1: rule__Root__Group_1__1 : rule__Root__Group_1__1__Impl ;
    public final void rule__Root__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:701:1: ( rule__Root__Group_1__1__Impl )
            // InternalDraft7.g:702:2: rule__Root__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_1__1__Impl();

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
    // $ANTLR end "rule__Root__Group_1__1"


    // $ANTLR start "rule__Root__Group_1__1__Impl"
    // InternalDraft7.g:708:1: rule__Root__Group_1__1__Impl : ( ruleLength ) ;
    public final void rule__Root__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:712:1: ( ( ruleLength ) )
            // InternalDraft7.g:713:1: ( ruleLength )
            {
            // InternalDraft7.g:713:1: ( ruleLength )
            // InternalDraft7.g:714:2: ruleLength
            {
             before(grammarAccess.getRootAccess().getLengthParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleLength();

            state._fsp--;

             after(grammarAccess.getRootAccess().getLengthParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Root__Group_1__1__Impl"


    // $ANTLR start "rule__Root__Group_2__0"
    // InternalDraft7.g:724:1: rule__Root__Group_2__0 : rule__Root__Group_2__0__Impl rule__Root__Group_2__1 ;
    public final void rule__Root__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:728:1: ( rule__Root__Group_2__0__Impl rule__Root__Group_2__1 )
            // InternalDraft7.g:729:2: rule__Root__Group_2__0__Impl rule__Root__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Root__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_2__1();

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
    // $ANTLR end "rule__Root__Group_2__0"


    // $ANTLR start "rule__Root__Group_2__0__Impl"
    // InternalDraft7.g:736:1: rule__Root__Group_2__0__Impl : ( () ) ;
    public final void rule__Root__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:740:1: ( ( () ) )
            // InternalDraft7.g:741:1: ( () )
            {
            // InternalDraft7.g:741:1: ( () )
            // InternalDraft7.g:742:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_2_0()); 
            // InternalDraft7.g:743:2: ()
            // InternalDraft7.g:743:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_2__0__Impl"


    // $ANTLR start "rule__Root__Group_2__1"
    // InternalDraft7.g:751:1: rule__Root__Group_2__1 : rule__Root__Group_2__1__Impl ;
    public final void rule__Root__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:755:1: ( rule__Root__Group_2__1__Impl )
            // InternalDraft7.g:756:2: rule__Root__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_2__1__Impl();

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
    // $ANTLR end "rule__Root__Group_2__1"


    // $ANTLR start "rule__Root__Group_2__1__Impl"
    // InternalDraft7.g:762:1: rule__Root__Group_2__1__Impl : ( ruleMultiples ) ;
    public final void rule__Root__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:766:1: ( ( ruleMultiples ) )
            // InternalDraft7.g:767:1: ( ruleMultiples )
            {
            // InternalDraft7.g:767:1: ( ruleMultiples )
            // InternalDraft7.g:768:2: ruleMultiples
            {
             before(grammarAccess.getRootAccess().getMultiplesParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleMultiples();

            state._fsp--;

             after(grammarAccess.getRootAccess().getMultiplesParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Root__Group_2__1__Impl"


    // $ANTLR start "rule__Root__Group_3__0"
    // InternalDraft7.g:778:1: rule__Root__Group_3__0 : rule__Root__Group_3__0__Impl rule__Root__Group_3__1 ;
    public final void rule__Root__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:782:1: ( rule__Root__Group_3__0__Impl rule__Root__Group_3__1 )
            // InternalDraft7.g:783:2: rule__Root__Group_3__0__Impl rule__Root__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Root__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_3__1();

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
    // $ANTLR end "rule__Root__Group_3__0"


    // $ANTLR start "rule__Root__Group_3__0__Impl"
    // InternalDraft7.g:790:1: rule__Root__Group_3__0__Impl : ( () ) ;
    public final void rule__Root__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:794:1: ( ( () ) )
            // InternalDraft7.g:795:1: ( () )
            {
            // InternalDraft7.g:795:1: ( () )
            // InternalDraft7.g:796:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_3_0()); 
            // InternalDraft7.g:797:2: ()
            // InternalDraft7.g:797:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_3__0__Impl"


    // $ANTLR start "rule__Root__Group_3__1"
    // InternalDraft7.g:805:1: rule__Root__Group_3__1 : rule__Root__Group_3__1__Impl ;
    public final void rule__Root__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:809:1: ( rule__Root__Group_3__1__Impl )
            // InternalDraft7.g:810:2: rule__Root__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_3__1__Impl();

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
    // $ANTLR end "rule__Root__Group_3__1"


    // $ANTLR start "rule__Root__Group_3__1__Impl"
    // InternalDraft7.g:816:1: rule__Root__Group_3__1__Impl : ( ruleMinimum ) ;
    public final void rule__Root__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:820:1: ( ( ruleMinimum ) )
            // InternalDraft7.g:821:1: ( ruleMinimum )
            {
            // InternalDraft7.g:821:1: ( ruleMinimum )
            // InternalDraft7.g:822:2: ruleMinimum
            {
             before(grammarAccess.getRootAccess().getMinimumParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleMinimum();

            state._fsp--;

             after(grammarAccess.getRootAccess().getMinimumParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__Root__Group_3__1__Impl"


    // $ANTLR start "rule__Root__Group_4__0"
    // InternalDraft7.g:832:1: rule__Root__Group_4__0 : rule__Root__Group_4__0__Impl rule__Root__Group_4__1 ;
    public final void rule__Root__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:836:1: ( rule__Root__Group_4__0__Impl rule__Root__Group_4__1 )
            // InternalDraft7.g:837:2: rule__Root__Group_4__0__Impl rule__Root__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Root__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_4__1();

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
    // $ANTLR end "rule__Root__Group_4__0"


    // $ANTLR start "rule__Root__Group_4__0__Impl"
    // InternalDraft7.g:844:1: rule__Root__Group_4__0__Impl : ( () ) ;
    public final void rule__Root__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:848:1: ( ( () ) )
            // InternalDraft7.g:849:1: ( () )
            {
            // InternalDraft7.g:849:1: ( () )
            // InternalDraft7.g:850:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_4_0()); 
            // InternalDraft7.g:851:2: ()
            // InternalDraft7.g:851:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_4__0__Impl"


    // $ANTLR start "rule__Root__Group_4__1"
    // InternalDraft7.g:859:1: rule__Root__Group_4__1 : rule__Root__Group_4__1__Impl ;
    public final void rule__Root__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:863:1: ( rule__Root__Group_4__1__Impl )
            // InternalDraft7.g:864:2: rule__Root__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_4__1__Impl();

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
    // $ANTLR end "rule__Root__Group_4__1"


    // $ANTLR start "rule__Root__Group_4__1__Impl"
    // InternalDraft7.g:870:1: rule__Root__Group_4__1__Impl : ( ruleExclusiveMinimum ) ;
    public final void rule__Root__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:874:1: ( ( ruleExclusiveMinimum ) )
            // InternalDraft7.g:875:1: ( ruleExclusiveMinimum )
            {
            // InternalDraft7.g:875:1: ( ruleExclusiveMinimum )
            // InternalDraft7.g:876:2: ruleExclusiveMinimum
            {
             before(grammarAccess.getRootAccess().getExclusiveMinimumParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleExclusiveMinimum();

            state._fsp--;

             after(grammarAccess.getRootAccess().getExclusiveMinimumParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__Root__Group_4__1__Impl"


    // $ANTLR start "rule__Root__Group_5__0"
    // InternalDraft7.g:886:1: rule__Root__Group_5__0 : rule__Root__Group_5__0__Impl rule__Root__Group_5__1 ;
    public final void rule__Root__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:890:1: ( rule__Root__Group_5__0__Impl rule__Root__Group_5__1 )
            // InternalDraft7.g:891:2: rule__Root__Group_5__0__Impl rule__Root__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Root__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_5__1();

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
    // $ANTLR end "rule__Root__Group_5__0"


    // $ANTLR start "rule__Root__Group_5__0__Impl"
    // InternalDraft7.g:898:1: rule__Root__Group_5__0__Impl : ( () ) ;
    public final void rule__Root__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:902:1: ( ( () ) )
            // InternalDraft7.g:903:1: ( () )
            {
            // InternalDraft7.g:903:1: ( () )
            // InternalDraft7.g:904:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_5_0()); 
            // InternalDraft7.g:905:2: ()
            // InternalDraft7.g:905:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_5__0__Impl"


    // $ANTLR start "rule__Root__Group_5__1"
    // InternalDraft7.g:913:1: rule__Root__Group_5__1 : rule__Root__Group_5__1__Impl ;
    public final void rule__Root__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:917:1: ( rule__Root__Group_5__1__Impl )
            // InternalDraft7.g:918:2: rule__Root__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_5__1__Impl();

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
    // $ANTLR end "rule__Root__Group_5__1"


    // $ANTLR start "rule__Root__Group_5__1__Impl"
    // InternalDraft7.g:924:1: rule__Root__Group_5__1__Impl : ( ruleMaximum ) ;
    public final void rule__Root__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:928:1: ( ( ruleMaximum ) )
            // InternalDraft7.g:929:1: ( ruleMaximum )
            {
            // InternalDraft7.g:929:1: ( ruleMaximum )
            // InternalDraft7.g:930:2: ruleMaximum
            {
             before(grammarAccess.getRootAccess().getMaximumParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
            ruleMaximum();

            state._fsp--;

             after(grammarAccess.getRootAccess().getMaximumParserRuleCall_5_1()); 

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
    // $ANTLR end "rule__Root__Group_5__1__Impl"


    // $ANTLR start "rule__Root__Group_6__0"
    // InternalDraft7.g:940:1: rule__Root__Group_6__0 : rule__Root__Group_6__0__Impl rule__Root__Group_6__1 ;
    public final void rule__Root__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:944:1: ( rule__Root__Group_6__0__Impl rule__Root__Group_6__1 )
            // InternalDraft7.g:945:2: rule__Root__Group_6__0__Impl rule__Root__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Root__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_6__1();

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
    // $ANTLR end "rule__Root__Group_6__0"


    // $ANTLR start "rule__Root__Group_6__0__Impl"
    // InternalDraft7.g:952:1: rule__Root__Group_6__0__Impl : ( () ) ;
    public final void rule__Root__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:956:1: ( ( () ) )
            // InternalDraft7.g:957:1: ( () )
            {
            // InternalDraft7.g:957:1: ( () )
            // InternalDraft7.g:958:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_6_0()); 
            // InternalDraft7.g:959:2: ()
            // InternalDraft7.g:959:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group_6__0__Impl"


    // $ANTLR start "rule__Root__Group_6__1"
    // InternalDraft7.g:967:1: rule__Root__Group_6__1 : rule__Root__Group_6__1__Impl ;
    public final void rule__Root__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:971:1: ( rule__Root__Group_6__1__Impl )
            // InternalDraft7.g:972:2: rule__Root__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_6__1__Impl();

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
    // $ANTLR end "rule__Root__Group_6__1"


    // $ANTLR start "rule__Root__Group_6__1__Impl"
    // InternalDraft7.g:978:1: rule__Root__Group_6__1__Impl : ( ruleExclusiveMaximum ) ;
    public final void rule__Root__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:982:1: ( ( ruleExclusiveMaximum ) )
            // InternalDraft7.g:983:1: ( ruleExclusiveMaximum )
            {
            // InternalDraft7.g:983:1: ( ruleExclusiveMaximum )
            // InternalDraft7.g:984:2: ruleExclusiveMaximum
            {
             before(grammarAccess.getRootAccess().getExclusiveMaximumParserRuleCall_6_1()); 
            pushFollow(FOLLOW_2);
            ruleExclusiveMaximum();

            state._fsp--;

             after(grammarAccess.getRootAccess().getExclusiveMaximumParserRuleCall_6_1()); 

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
    // $ANTLR end "rule__Root__Group_6__1__Impl"


    // $ANTLR start "rule__JSONProperties__Group__0"
    // InternalDraft7.g:994:1: rule__JSONProperties__Group__0 : rule__JSONProperties__Group__0__Impl rule__JSONProperties__Group__1 ;
    public final void rule__JSONProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:998:1: ( rule__JSONProperties__Group__0__Impl rule__JSONProperties__Group__1 )
            // InternalDraft7.g:999:2: rule__JSONProperties__Group__0__Impl rule__JSONProperties__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__JSONProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONProperties__Group__1();

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
    // $ANTLR end "rule__JSONProperties__Group__0"


    // $ANTLR start "rule__JSONProperties__Group__0__Impl"
    // InternalDraft7.g:1006:1: rule__JSONProperties__Group__0__Impl : ( () ) ;
    public final void rule__JSONProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1010:1: ( ( () ) )
            // InternalDraft7.g:1011:1: ( () )
            {
            // InternalDraft7.g:1011:1: ( () )
            // InternalDraft7.g:1012:2: ()
            {
             before(grammarAccess.getJSONPropertiesAccess().getJSONPropertiesAction_0()); 
            // InternalDraft7.g:1013:2: ()
            // InternalDraft7.g:1013:3: 
            {
            }

             after(grammarAccess.getJSONPropertiesAccess().getJSONPropertiesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONProperties__Group__0__Impl"


    // $ANTLR start "rule__JSONProperties__Group__1"
    // InternalDraft7.g:1021:1: rule__JSONProperties__Group__1 : rule__JSONProperties__Group__1__Impl rule__JSONProperties__Group__2 ;
    public final void rule__JSONProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1025:1: ( rule__JSONProperties__Group__1__Impl rule__JSONProperties__Group__2 )
            // InternalDraft7.g:1026:2: rule__JSONProperties__Group__1__Impl rule__JSONProperties__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__JSONProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONProperties__Group__2();

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
    // $ANTLR end "rule__JSONProperties__Group__1"


    // $ANTLR start "rule__JSONProperties__Group__1__Impl"
    // InternalDraft7.g:1033:1: rule__JSONProperties__Group__1__Impl : ( '\"properties\"' ) ;
    public final void rule__JSONProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1037:1: ( ( '\"properties\"' ) )
            // InternalDraft7.g:1038:1: ( '\"properties\"' )
            {
            // InternalDraft7.g:1038:1: ( '\"properties\"' )
            // InternalDraft7.g:1039:2: '\"properties\"'
            {
             before(grammarAccess.getJSONPropertiesAccess().getPropertiesKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJSONPropertiesAccess().getPropertiesKeyword_1()); 

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
    // $ANTLR end "rule__JSONProperties__Group__1__Impl"


    // $ANTLR start "rule__JSONProperties__Group__2"
    // InternalDraft7.g:1048:1: rule__JSONProperties__Group__2 : rule__JSONProperties__Group__2__Impl rule__JSONProperties__Group__3 ;
    public final void rule__JSONProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1052:1: ( rule__JSONProperties__Group__2__Impl rule__JSONProperties__Group__3 )
            // InternalDraft7.g:1053:2: rule__JSONProperties__Group__2__Impl rule__JSONProperties__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__JSONProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONProperties__Group__3();

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
    // $ANTLR end "rule__JSONProperties__Group__2"


    // $ANTLR start "rule__JSONProperties__Group__2__Impl"
    // InternalDraft7.g:1060:1: rule__JSONProperties__Group__2__Impl : ( ':' ) ;
    public final void rule__JSONProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1064:1: ( ( ':' ) )
            // InternalDraft7.g:1065:1: ( ':' )
            {
            // InternalDraft7.g:1065:1: ( ':' )
            // InternalDraft7.g:1066:2: ':'
            {
             before(grammarAccess.getJSONPropertiesAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJSONPropertiesAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__JSONProperties__Group__2__Impl"


    // $ANTLR start "rule__JSONProperties__Group__3"
    // InternalDraft7.g:1075:1: rule__JSONProperties__Group__3 : rule__JSONProperties__Group__3__Impl rule__JSONProperties__Group__4 ;
    public final void rule__JSONProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1079:1: ( rule__JSONProperties__Group__3__Impl rule__JSONProperties__Group__4 )
            // InternalDraft7.g:1080:2: rule__JSONProperties__Group__3__Impl rule__JSONProperties__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__JSONProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONProperties__Group__4();

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
    // $ANTLR end "rule__JSONProperties__Group__3"


    // $ANTLR start "rule__JSONProperties__Group__3__Impl"
    // InternalDraft7.g:1087:1: rule__JSONProperties__Group__3__Impl : ( '{' ) ;
    public final void rule__JSONProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1091:1: ( ( '{' ) )
            // InternalDraft7.g:1092:1: ( '{' )
            {
            // InternalDraft7.g:1092:1: ( '{' )
            // InternalDraft7.g:1093:2: '{'
            {
             before(grammarAccess.getJSONPropertiesAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJSONPropertiesAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__JSONProperties__Group__3__Impl"


    // $ANTLR start "rule__JSONProperties__Group__4"
    // InternalDraft7.g:1102:1: rule__JSONProperties__Group__4 : rule__JSONProperties__Group__4__Impl rule__JSONProperties__Group__5 ;
    public final void rule__JSONProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1106:1: ( rule__JSONProperties__Group__4__Impl rule__JSONProperties__Group__5 )
            // InternalDraft7.g:1107:2: rule__JSONProperties__Group__4__Impl rule__JSONProperties__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__JSONProperties__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONProperties__Group__5();

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
    // $ANTLR end "rule__JSONProperties__Group__4"


    // $ANTLR start "rule__JSONProperties__Group__4__Impl"
    // InternalDraft7.g:1114:1: rule__JSONProperties__Group__4__Impl : ( ( rule__JSONProperties__PropertiesAssignment_4 )* ) ;
    public final void rule__JSONProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1118:1: ( ( ( rule__JSONProperties__PropertiesAssignment_4 )* ) )
            // InternalDraft7.g:1119:1: ( ( rule__JSONProperties__PropertiesAssignment_4 )* )
            {
            // InternalDraft7.g:1119:1: ( ( rule__JSONProperties__PropertiesAssignment_4 )* )
            // InternalDraft7.g:1120:2: ( rule__JSONProperties__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getJSONPropertiesAccess().getPropertiesAssignment_4()); 
            // InternalDraft7.g:1121:2: ( rule__JSONProperties__PropertiesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDraft7.g:1121:3: rule__JSONProperties__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__JSONProperties__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJSONPropertiesAccess().getPropertiesAssignment_4()); 

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
    // $ANTLR end "rule__JSONProperties__Group__4__Impl"


    // $ANTLR start "rule__JSONProperties__Group__5"
    // InternalDraft7.g:1129:1: rule__JSONProperties__Group__5 : rule__JSONProperties__Group__5__Impl ;
    public final void rule__JSONProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1133:1: ( rule__JSONProperties__Group__5__Impl )
            // InternalDraft7.g:1134:2: rule__JSONProperties__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONProperties__Group__5__Impl();

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
    // $ANTLR end "rule__JSONProperties__Group__5"


    // $ANTLR start "rule__JSONProperties__Group__5__Impl"
    // InternalDraft7.g:1140:1: rule__JSONProperties__Group__5__Impl : ( '}' ) ;
    public final void rule__JSONProperties__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1144:1: ( ( '}' ) )
            // InternalDraft7.g:1145:1: ( '}' )
            {
            // InternalDraft7.g:1145:1: ( '}' )
            // InternalDraft7.g:1146:2: '}'
            {
             before(grammarAccess.getJSONPropertiesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJSONPropertiesAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__JSONProperties__Group__5__Impl"


    // $ANTLR start "rule__JSONProperty__Group__0"
    // InternalDraft7.g:1156:1: rule__JSONProperty__Group__0 : rule__JSONProperty__Group__0__Impl rule__JSONProperty__Group__1 ;
    public final void rule__JSONProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1160:1: ( rule__JSONProperty__Group__0__Impl rule__JSONProperty__Group__1 )
            // InternalDraft7.g:1161:2: rule__JSONProperty__Group__0__Impl rule__JSONProperty__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__JSONProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONProperty__Group__1();

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
    // $ANTLR end "rule__JSONProperty__Group__0"


    // $ANTLR start "rule__JSONProperty__Group__0__Impl"
    // InternalDraft7.g:1168:1: rule__JSONProperty__Group__0__Impl : ( ( rule__JSONProperty__NameAssignment_0 ) ) ;
    public final void rule__JSONProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1172:1: ( ( ( rule__JSONProperty__NameAssignment_0 ) ) )
            // InternalDraft7.g:1173:1: ( ( rule__JSONProperty__NameAssignment_0 ) )
            {
            // InternalDraft7.g:1173:1: ( ( rule__JSONProperty__NameAssignment_0 ) )
            // InternalDraft7.g:1174:2: ( rule__JSONProperty__NameAssignment_0 )
            {
             before(grammarAccess.getJSONPropertyAccess().getNameAssignment_0()); 
            // InternalDraft7.g:1175:2: ( rule__JSONProperty__NameAssignment_0 )
            // InternalDraft7.g:1175:3: rule__JSONProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JSONProperty__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJSONPropertyAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__JSONProperty__Group__0__Impl"


    // $ANTLR start "rule__JSONProperty__Group__1"
    // InternalDraft7.g:1183:1: rule__JSONProperty__Group__1 : rule__JSONProperty__Group__1__Impl rule__JSONProperty__Group__2 ;
    public final void rule__JSONProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1187:1: ( rule__JSONProperty__Group__1__Impl rule__JSONProperty__Group__2 )
            // InternalDraft7.g:1188:2: rule__JSONProperty__Group__1__Impl rule__JSONProperty__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__JSONProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONProperty__Group__2();

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
    // $ANTLR end "rule__JSONProperty__Group__1"


    // $ANTLR start "rule__JSONProperty__Group__1__Impl"
    // InternalDraft7.g:1195:1: rule__JSONProperty__Group__1__Impl : ( ':' ) ;
    public final void rule__JSONProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1199:1: ( ( ':' ) )
            // InternalDraft7.g:1200:1: ( ':' )
            {
            // InternalDraft7.g:1200:1: ( ':' )
            // InternalDraft7.g:1201:2: ':'
            {
             before(grammarAccess.getJSONPropertyAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJSONPropertyAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__JSONProperty__Group__1__Impl"


    // $ANTLR start "rule__JSONProperty__Group__2"
    // InternalDraft7.g:1210:1: rule__JSONProperty__Group__2 : rule__JSONProperty__Group__2__Impl rule__JSONProperty__Group__3 ;
    public final void rule__JSONProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1214:1: ( rule__JSONProperty__Group__2__Impl rule__JSONProperty__Group__3 )
            // InternalDraft7.g:1215:2: rule__JSONProperty__Group__2__Impl rule__JSONProperty__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__JSONProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONProperty__Group__3();

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
    // $ANTLR end "rule__JSONProperty__Group__2"


    // $ANTLR start "rule__JSONProperty__Group__2__Impl"
    // InternalDraft7.g:1222:1: rule__JSONProperty__Group__2__Impl : ( '{' ) ;
    public final void rule__JSONProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1226:1: ( ( '{' ) )
            // InternalDraft7.g:1227:1: ( '{' )
            {
            // InternalDraft7.g:1227:1: ( '{' )
            // InternalDraft7.g:1228:2: '{'
            {
             before(grammarAccess.getJSONPropertyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJSONPropertyAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__JSONProperty__Group__2__Impl"


    // $ANTLR start "rule__JSONProperty__Group__3"
    // InternalDraft7.g:1237:1: rule__JSONProperty__Group__3 : rule__JSONProperty__Group__3__Impl rule__JSONProperty__Group__4 ;
    public final void rule__JSONProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1241:1: ( rule__JSONProperty__Group__3__Impl rule__JSONProperty__Group__4 )
            // InternalDraft7.g:1242:2: rule__JSONProperty__Group__3__Impl rule__JSONProperty__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__JSONProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONProperty__Group__4();

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
    // $ANTLR end "rule__JSONProperty__Group__3"


    // $ANTLR start "rule__JSONProperty__Group__3__Impl"
    // InternalDraft7.g:1249:1: rule__JSONProperty__Group__3__Impl : ( ( rule__JSONProperty__PropertyAssignment_3 ) ) ;
    public final void rule__JSONProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1253:1: ( ( ( rule__JSONProperty__PropertyAssignment_3 ) ) )
            // InternalDraft7.g:1254:1: ( ( rule__JSONProperty__PropertyAssignment_3 ) )
            {
            // InternalDraft7.g:1254:1: ( ( rule__JSONProperty__PropertyAssignment_3 ) )
            // InternalDraft7.g:1255:2: ( rule__JSONProperty__PropertyAssignment_3 )
            {
             before(grammarAccess.getJSONPropertyAccess().getPropertyAssignment_3()); 
            // InternalDraft7.g:1256:2: ( rule__JSONProperty__PropertyAssignment_3 )
            // InternalDraft7.g:1256:3: rule__JSONProperty__PropertyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__JSONProperty__PropertyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJSONPropertyAccess().getPropertyAssignment_3()); 

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
    // $ANTLR end "rule__JSONProperty__Group__3__Impl"


    // $ANTLR start "rule__JSONProperty__Group__4"
    // InternalDraft7.g:1264:1: rule__JSONProperty__Group__4 : rule__JSONProperty__Group__4__Impl ;
    public final void rule__JSONProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1268:1: ( rule__JSONProperty__Group__4__Impl )
            // InternalDraft7.g:1269:2: rule__JSONProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONProperty__Group__4__Impl();

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
    // $ANTLR end "rule__JSONProperty__Group__4"


    // $ANTLR start "rule__JSONProperty__Group__4__Impl"
    // InternalDraft7.g:1275:1: rule__JSONProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__JSONProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1279:1: ( ( '}' ) )
            // InternalDraft7.g:1280:1: ( '}' )
            {
            // InternalDraft7.g:1280:1: ( '}' )
            // InternalDraft7.g:1281:2: '}'
            {
             before(grammarAccess.getJSONPropertyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJSONPropertyAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__JSONProperty__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalDraft7.g:1291:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1295:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDraft7.g:1296:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalDraft7.g:1303:1: rule__Type__Group__0__Impl : ( '\"type\"' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1307:1: ( ( '\"type\"' ) )
            // InternalDraft7.g:1308:1: ( '\"type\"' )
            {
            // InternalDraft7.g:1308:1: ( '\"type\"' )
            // InternalDraft7.g:1309:2: '\"type\"'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalDraft7.g:1318:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1322:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalDraft7.g:1323:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalDraft7.g:1330:1: rule__Type__Group__1__Impl : ( ':' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1334:1: ( ( ':' ) )
            // InternalDraft7.g:1335:1: ( ':' )
            {
            // InternalDraft7.g:1335:1: ( ':' )
            // InternalDraft7.g:1336:2: ':'
            {
             before(grammarAccess.getTypeAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalDraft7.g:1345:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1349:1: ( rule__Type__Group__2__Impl )
            // InternalDraft7.g:1350:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__2__Impl();

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
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalDraft7.g:1356:1: rule__Type__Group__2__Impl : ( ( rule__Type__Alternatives_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1360:1: ( ( ( rule__Type__Alternatives_2 ) ) )
            // InternalDraft7.g:1361:1: ( ( rule__Type__Alternatives_2 ) )
            {
            // InternalDraft7.g:1361:1: ( ( rule__Type__Alternatives_2 ) )
            // InternalDraft7.g:1362:2: ( rule__Type__Alternatives_2 )
            {
             before(grammarAccess.getTypeAccess().getAlternatives_2()); 
            // InternalDraft7.g:1363:2: ( rule__Type__Alternatives_2 )
            // InternalDraft7.g:1363:3: rule__Type__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_2_0__0"
    // InternalDraft7.g:1372:1: rule__Type__Group_2_0__0 : rule__Type__Group_2_0__0__Impl rule__Type__Group_2_0__1 ;
    public final void rule__Type__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1376:1: ( rule__Type__Group_2_0__0__Impl rule__Type__Group_2_0__1 )
            // InternalDraft7.g:1377:2: rule__Type__Group_2_0__0__Impl rule__Type__Group_2_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Type__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2_0__1();

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
    // $ANTLR end "rule__Type__Group_2_0__0"


    // $ANTLR start "rule__Type__Group_2_0__0__Impl"
    // InternalDraft7.g:1384:1: rule__Type__Group_2_0__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1388:1: ( ( '[' ) )
            // InternalDraft7.g:1389:1: ( '[' )
            {
            // InternalDraft7.g:1389:1: ( '[' )
            // InternalDraft7.g:1390:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_2_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Type__Group_2_0__0__Impl"


    // $ANTLR start "rule__Type__Group_2_0__1"
    // InternalDraft7.g:1399:1: rule__Type__Group_2_0__1 : rule__Type__Group_2_0__1__Impl rule__Type__Group_2_0__2 ;
    public final void rule__Type__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1403:1: ( rule__Type__Group_2_0__1__Impl rule__Type__Group_2_0__2 )
            // InternalDraft7.g:1404:2: rule__Type__Group_2_0__1__Impl rule__Type__Group_2_0__2
            {
            pushFollow(FOLLOW_20);
            rule__Type__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2_0__2();

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
    // $ANTLR end "rule__Type__Group_2_0__1"


    // $ANTLR start "rule__Type__Group_2_0__1__Impl"
    // InternalDraft7.g:1411:1: rule__Type__Group_2_0__1__Impl : ( ( ( ruleJsonTypes ) ) ( ( ruleJsonTypes )* ) ) ;
    public final void rule__Type__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1415:1: ( ( ( ( ruleJsonTypes ) ) ( ( ruleJsonTypes )* ) ) )
            // InternalDraft7.g:1416:1: ( ( ( ruleJsonTypes ) ) ( ( ruleJsonTypes )* ) )
            {
            // InternalDraft7.g:1416:1: ( ( ( ruleJsonTypes ) ) ( ( ruleJsonTypes )* ) )
            // InternalDraft7.g:1417:2: ( ( ruleJsonTypes ) ) ( ( ruleJsonTypes )* )
            {
            // InternalDraft7.g:1417:2: ( ( ruleJsonTypes ) )
            // InternalDraft7.g:1418:3: ( ruleJsonTypes )
            {
             before(grammarAccess.getTypeAccess().getJsonTypesParserRuleCall_2_0_1()); 
            // InternalDraft7.g:1419:3: ( ruleJsonTypes )
            // InternalDraft7.g:1419:4: ruleJsonTypes
            {
            pushFollow(FOLLOW_21);
            ruleJsonTypes();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getJsonTypesParserRuleCall_2_0_1()); 

            }

            // InternalDraft7.g:1422:2: ( ( ruleJsonTypes )* )
            // InternalDraft7.g:1423:3: ( ruleJsonTypes )*
            {
             before(grammarAccess.getTypeAccess().getJsonTypesParserRuleCall_2_0_1()); 
            // InternalDraft7.g:1424:3: ( ruleJsonTypes )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDraft7.g:1424:4: ruleJsonTypes
            	    {
            	    pushFollow(FOLLOW_21);
            	    ruleJsonTypes();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getJsonTypesParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Type__Group_2_0__1__Impl"


    // $ANTLR start "rule__Type__Group_2_0__2"
    // InternalDraft7.g:1433:1: rule__Type__Group_2_0__2 : rule__Type__Group_2_0__2__Impl ;
    public final void rule__Type__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1437:1: ( rule__Type__Group_2_0__2__Impl )
            // InternalDraft7.g:1438:2: rule__Type__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__Type__Group_2_0__2"


    // $ANTLR start "rule__Type__Group_2_0__2__Impl"
    // InternalDraft7.g:1444:1: rule__Type__Group_2_0__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1448:1: ( ( ']' ) )
            // InternalDraft7.g:1449:1: ( ']' )
            {
            // InternalDraft7.g:1449:1: ( ']' )
            // InternalDraft7.g:1450:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_2_0_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_2_0_2()); 

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
    // $ANTLR end "rule__Type__Group_2_0__2__Impl"


    // $ANTLR start "rule__Multiples__Group__0"
    // InternalDraft7.g:1460:1: rule__Multiples__Group__0 : rule__Multiples__Group__0__Impl rule__Multiples__Group__1 ;
    public final void rule__Multiples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1464:1: ( rule__Multiples__Group__0__Impl rule__Multiples__Group__1 )
            // InternalDraft7.g:1465:2: rule__Multiples__Group__0__Impl rule__Multiples__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Multiples__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiples__Group__1();

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
    // $ANTLR end "rule__Multiples__Group__0"


    // $ANTLR start "rule__Multiples__Group__0__Impl"
    // InternalDraft7.g:1472:1: rule__Multiples__Group__0__Impl : ( '\"multiples\":' ) ;
    public final void rule__Multiples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1476:1: ( ( '\"multiples\":' ) )
            // InternalDraft7.g:1477:1: ( '\"multiples\":' )
            {
            // InternalDraft7.g:1477:1: ( '\"multiples\":' )
            // InternalDraft7.g:1478:2: '\"multiples\":'
            {
             before(grammarAccess.getMultiplesAccess().getMultiplesKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMultiplesAccess().getMultiplesKeyword_0()); 

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
    // $ANTLR end "rule__Multiples__Group__0__Impl"


    // $ANTLR start "rule__Multiples__Group__1"
    // InternalDraft7.g:1487:1: rule__Multiples__Group__1 : rule__Multiples__Group__1__Impl ;
    public final void rule__Multiples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1491:1: ( rule__Multiples__Group__1__Impl )
            // InternalDraft7.g:1492:2: rule__Multiples__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiples__Group__1__Impl();

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
    // $ANTLR end "rule__Multiples__Group__1"


    // $ANTLR start "rule__Multiples__Group__1__Impl"
    // InternalDraft7.g:1498:1: rule__Multiples__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Multiples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1502:1: ( ( RULE_INT ) )
            // InternalDraft7.g:1503:1: ( RULE_INT )
            {
            // InternalDraft7.g:1503:1: ( RULE_INT )
            // InternalDraft7.g:1504:2: RULE_INT
            {
             before(grammarAccess.getMultiplesAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplesAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Multiples__Group__1__Impl"


    // $ANTLR start "rule__Minimum__Group__0"
    // InternalDraft7.g:1514:1: rule__Minimum__Group__0 : rule__Minimum__Group__0__Impl rule__Minimum__Group__1 ;
    public final void rule__Minimum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1518:1: ( rule__Minimum__Group__0__Impl rule__Minimum__Group__1 )
            // InternalDraft7.g:1519:2: rule__Minimum__Group__0__Impl rule__Minimum__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Minimum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Minimum__Group__1();

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
    // $ANTLR end "rule__Minimum__Group__0"


    // $ANTLR start "rule__Minimum__Group__0__Impl"
    // InternalDraft7.g:1526:1: rule__Minimum__Group__0__Impl : ( '\"minimum\":' ) ;
    public final void rule__Minimum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1530:1: ( ( '\"minimum\":' ) )
            // InternalDraft7.g:1531:1: ( '\"minimum\":' )
            {
            // InternalDraft7.g:1531:1: ( '\"minimum\":' )
            // InternalDraft7.g:1532:2: '\"minimum\":'
            {
             before(grammarAccess.getMinimumAccess().getMinimumKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMinimumAccess().getMinimumKeyword_0()); 

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
    // $ANTLR end "rule__Minimum__Group__0__Impl"


    // $ANTLR start "rule__Minimum__Group__1"
    // InternalDraft7.g:1541:1: rule__Minimum__Group__1 : rule__Minimum__Group__1__Impl ;
    public final void rule__Minimum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1545:1: ( rule__Minimum__Group__1__Impl )
            // InternalDraft7.g:1546:2: rule__Minimum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minimum__Group__1__Impl();

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
    // $ANTLR end "rule__Minimum__Group__1"


    // $ANTLR start "rule__Minimum__Group__1__Impl"
    // InternalDraft7.g:1552:1: rule__Minimum__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Minimum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1556:1: ( ( RULE_INT ) )
            // InternalDraft7.g:1557:1: ( RULE_INT )
            {
            // InternalDraft7.g:1557:1: ( RULE_INT )
            // InternalDraft7.g:1558:2: RULE_INT
            {
             before(grammarAccess.getMinimumAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMinimumAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Minimum__Group__1__Impl"


    // $ANTLR start "rule__ExclusiveMinimum__Group__0"
    // InternalDraft7.g:1568:1: rule__ExclusiveMinimum__Group__0 : rule__ExclusiveMinimum__Group__0__Impl rule__ExclusiveMinimum__Group__1 ;
    public final void rule__ExclusiveMinimum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1572:1: ( rule__ExclusiveMinimum__Group__0__Impl rule__ExclusiveMinimum__Group__1 )
            // InternalDraft7.g:1573:2: rule__ExclusiveMinimum__Group__0__Impl rule__ExclusiveMinimum__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ExclusiveMinimum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimum__Group__1();

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
    // $ANTLR end "rule__ExclusiveMinimum__Group__0"


    // $ANTLR start "rule__ExclusiveMinimum__Group__0__Impl"
    // InternalDraft7.g:1580:1: rule__ExclusiveMinimum__Group__0__Impl : ( '\"exclusiveMinimum\":' ) ;
    public final void rule__ExclusiveMinimum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1584:1: ( ( '\"exclusiveMinimum\":' ) )
            // InternalDraft7.g:1585:1: ( '\"exclusiveMinimum\":' )
            {
            // InternalDraft7.g:1585:1: ( '\"exclusiveMinimum\":' )
            // InternalDraft7.g:1586:2: '\"exclusiveMinimum\":'
            {
             before(grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumKeyword_0()); 

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
    // $ANTLR end "rule__ExclusiveMinimum__Group__0__Impl"


    // $ANTLR start "rule__ExclusiveMinimum__Group__1"
    // InternalDraft7.g:1595:1: rule__ExclusiveMinimum__Group__1 : rule__ExclusiveMinimum__Group__1__Impl ;
    public final void rule__ExclusiveMinimum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1599:1: ( rule__ExclusiveMinimum__Group__1__Impl )
            // InternalDraft7.g:1600:2: rule__ExclusiveMinimum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimum__Group__1__Impl();

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
    // $ANTLR end "rule__ExclusiveMinimum__Group__1"


    // $ANTLR start "rule__ExclusiveMinimum__Group__1__Impl"
    // InternalDraft7.g:1606:1: rule__ExclusiveMinimum__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ExclusiveMinimum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1610:1: ( ( RULE_INT ) )
            // InternalDraft7.g:1611:1: ( RULE_INT )
            {
            // InternalDraft7.g:1611:1: ( RULE_INT )
            // InternalDraft7.g:1612:2: RULE_INT
            {
             before(grammarAccess.getExclusiveMinimumAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExclusiveMinimumAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ExclusiveMinimum__Group__1__Impl"


    // $ANTLR start "rule__Maximum__Group__0"
    // InternalDraft7.g:1622:1: rule__Maximum__Group__0 : rule__Maximum__Group__0__Impl rule__Maximum__Group__1 ;
    public final void rule__Maximum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1626:1: ( rule__Maximum__Group__0__Impl rule__Maximum__Group__1 )
            // InternalDraft7.g:1627:2: rule__Maximum__Group__0__Impl rule__Maximum__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Maximum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maximum__Group__1();

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
    // $ANTLR end "rule__Maximum__Group__0"


    // $ANTLR start "rule__Maximum__Group__0__Impl"
    // InternalDraft7.g:1634:1: rule__Maximum__Group__0__Impl : ( '\"maximum\":' ) ;
    public final void rule__Maximum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1638:1: ( ( '\"maximum\":' ) )
            // InternalDraft7.g:1639:1: ( '\"maximum\":' )
            {
            // InternalDraft7.g:1639:1: ( '\"maximum\":' )
            // InternalDraft7.g:1640:2: '\"maximum\":'
            {
             before(grammarAccess.getMaximumAccess().getMaximumKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMaximumAccess().getMaximumKeyword_0()); 

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
    // $ANTLR end "rule__Maximum__Group__0__Impl"


    // $ANTLR start "rule__Maximum__Group__1"
    // InternalDraft7.g:1649:1: rule__Maximum__Group__1 : rule__Maximum__Group__1__Impl ;
    public final void rule__Maximum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1653:1: ( rule__Maximum__Group__1__Impl )
            // InternalDraft7.g:1654:2: rule__Maximum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Maximum__Group__1__Impl();

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
    // $ANTLR end "rule__Maximum__Group__1"


    // $ANTLR start "rule__Maximum__Group__1__Impl"
    // InternalDraft7.g:1660:1: rule__Maximum__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Maximum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1664:1: ( ( RULE_INT ) )
            // InternalDraft7.g:1665:1: ( RULE_INT )
            {
            // InternalDraft7.g:1665:1: ( RULE_INT )
            // InternalDraft7.g:1666:2: RULE_INT
            {
             before(grammarAccess.getMaximumAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMaximumAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Maximum__Group__1__Impl"


    // $ANTLR start "rule__ExclusiveMaximum__Group__0"
    // InternalDraft7.g:1676:1: rule__ExclusiveMaximum__Group__0 : rule__ExclusiveMaximum__Group__0__Impl rule__ExclusiveMaximum__Group__1 ;
    public final void rule__ExclusiveMaximum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1680:1: ( rule__ExclusiveMaximum__Group__0__Impl rule__ExclusiveMaximum__Group__1 )
            // InternalDraft7.g:1681:2: rule__ExclusiveMaximum__Group__0__Impl rule__ExclusiveMaximum__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ExclusiveMaximum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximum__Group__1();

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
    // $ANTLR end "rule__ExclusiveMaximum__Group__0"


    // $ANTLR start "rule__ExclusiveMaximum__Group__0__Impl"
    // InternalDraft7.g:1688:1: rule__ExclusiveMaximum__Group__0__Impl : ( '\"exclusiveMaximum\":' ) ;
    public final void rule__ExclusiveMaximum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1692:1: ( ( '\"exclusiveMaximum\":' ) )
            // InternalDraft7.g:1693:1: ( '\"exclusiveMaximum\":' )
            {
            // InternalDraft7.g:1693:1: ( '\"exclusiveMaximum\":' )
            // InternalDraft7.g:1694:2: '\"exclusiveMaximum\":'
            {
             before(grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumKeyword_0()); 

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
    // $ANTLR end "rule__ExclusiveMaximum__Group__0__Impl"


    // $ANTLR start "rule__ExclusiveMaximum__Group__1"
    // InternalDraft7.g:1703:1: rule__ExclusiveMaximum__Group__1 : rule__ExclusiveMaximum__Group__1__Impl ;
    public final void rule__ExclusiveMaximum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1707:1: ( rule__ExclusiveMaximum__Group__1__Impl )
            // InternalDraft7.g:1708:2: rule__ExclusiveMaximum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximum__Group__1__Impl();

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
    // $ANTLR end "rule__ExclusiveMaximum__Group__1"


    // $ANTLR start "rule__ExclusiveMaximum__Group__1__Impl"
    // InternalDraft7.g:1714:1: rule__ExclusiveMaximum__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ExclusiveMaximum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1718:1: ( ( RULE_INT ) )
            // InternalDraft7.g:1719:1: ( RULE_INT )
            {
            // InternalDraft7.g:1719:1: ( RULE_INT )
            // InternalDraft7.g:1720:2: RULE_INT
            {
             before(grammarAccess.getExclusiveMaximumAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExclusiveMaximumAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ExclusiveMaximum__Group__1__Impl"


    // $ANTLR start "rule__Length__Group__0"
    // InternalDraft7.g:1730:1: rule__Length__Group__0 : rule__Length__Group__0__Impl rule__Length__Group__1 ;
    public final void rule__Length__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1734:1: ( rule__Length__Group__0__Impl rule__Length__Group__1 )
            // InternalDraft7.g:1735:2: rule__Length__Group__0__Impl rule__Length__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Length__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Length__Group__1();

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
    // $ANTLR end "rule__Length__Group__0"


    // $ANTLR start "rule__Length__Group__0__Impl"
    // InternalDraft7.g:1742:1: rule__Length__Group__0__Impl : ( '\"length\":' ) ;
    public final void rule__Length__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1746:1: ( ( '\"length\":' ) )
            // InternalDraft7.g:1747:1: ( '\"length\":' )
            {
            // InternalDraft7.g:1747:1: ( '\"length\":' )
            // InternalDraft7.g:1748:2: '\"length\":'
            {
             before(grammarAccess.getLengthAccess().getLengthKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLengthAccess().getLengthKeyword_0()); 

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
    // $ANTLR end "rule__Length__Group__0__Impl"


    // $ANTLR start "rule__Length__Group__1"
    // InternalDraft7.g:1757:1: rule__Length__Group__1 : rule__Length__Group__1__Impl ;
    public final void rule__Length__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1761:1: ( rule__Length__Group__1__Impl )
            // InternalDraft7.g:1762:2: rule__Length__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Length__Group__1__Impl();

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
    // $ANTLR end "rule__Length__Group__1"


    // $ANTLR start "rule__Length__Group__1__Impl"
    // InternalDraft7.g:1768:1: rule__Length__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Length__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1772:1: ( ( RULE_INT ) )
            // InternalDraft7.g:1773:1: ( RULE_INT )
            {
            // InternalDraft7.g:1773:1: ( RULE_INT )
            // InternalDraft7.g:1774:2: RULE_INT
            {
             before(grammarAccess.getLengthAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLengthAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Length__Group__1__Impl"


    // $ANTLR start "rule__Model__RootAssignment_1_0"
    // InternalDraft7.g:1784:1: rule__Model__RootAssignment_1_0 : ( ruleRoot ) ;
    public final void rule__Model__RootAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1788:1: ( ( ruleRoot ) )
            // InternalDraft7.g:1789:2: ( ruleRoot )
            {
            // InternalDraft7.g:1789:2: ( ruleRoot )
            // InternalDraft7.g:1790:3: ruleRoot
            {
             before(grammarAccess.getModelAccess().getRootRootParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRootRootParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Model__RootAssignment_1_0"


    // $ANTLR start "rule__JSONProperties__PropertiesAssignment_4"
    // InternalDraft7.g:1799:1: rule__JSONProperties__PropertiesAssignment_4 : ( ruleJSONProperty ) ;
    public final void rule__JSONProperties__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1803:1: ( ( ruleJSONProperty ) )
            // InternalDraft7.g:1804:2: ( ruleJSONProperty )
            {
            // InternalDraft7.g:1804:2: ( ruleJSONProperty )
            // InternalDraft7.g:1805:3: ruleJSONProperty
            {
             before(grammarAccess.getJSONPropertiesAccess().getPropertiesJSONPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONProperty();

            state._fsp--;

             after(grammarAccess.getJSONPropertiesAccess().getPropertiesJSONPropertyParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__JSONProperties__PropertiesAssignment_4"


    // $ANTLR start "rule__JSONProperty__NameAssignment_0"
    // InternalDraft7.g:1814:1: rule__JSONProperty__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__JSONProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1818:1: ( ( RULE_ID ) )
            // InternalDraft7.g:1819:2: ( RULE_ID )
            {
            // InternalDraft7.g:1819:2: ( RULE_ID )
            // InternalDraft7.g:1820:3: RULE_ID
            {
             before(grammarAccess.getJSONPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJSONPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__JSONProperty__NameAssignment_0"


    // $ANTLR start "rule__JSONProperty__PropertyAssignment_3"
    // InternalDraft7.g:1829:1: rule__JSONProperty__PropertyAssignment_3 : ( ruleRoot ) ;
    public final void rule__JSONProperty__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1833:1: ( ( ruleRoot ) )
            // InternalDraft7.g:1834:2: ( ruleRoot )
            {
            // InternalDraft7.g:1834:2: ( ruleRoot )
            // InternalDraft7.g:1835:3: ruleRoot
            {
             before(grammarAccess.getJSONPropertyAccess().getPropertyRootParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getJSONPropertyAccess().getPropertyRootParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__JSONProperty__PropertyAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000FCA80000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000FCA00002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000FCA00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000103F800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000103F802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});

}