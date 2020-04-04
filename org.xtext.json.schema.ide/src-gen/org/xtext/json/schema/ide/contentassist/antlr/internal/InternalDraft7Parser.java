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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_JSON_ID", "RULE_INT", "RULE_JSON_STRING", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\"string\"'", "'\"integer\"'", "'\"number\"'", "'\"object\"'", "'\"array\"'", "'\"boolean\"'", "'\"null\"'", "'{'", "'}'", "','", "'\"type\"'", "':'", "'['", "']'", "'\"required\"'", "'\"properties\"'", "'\"length\"'", "'\"pattern\"'", "'\"multiples\"'", "'\"minimum\"'", "'\"exclusiveMinimum\"'", "'\"maximum\"'", "'\"exclusiveMaximum\"'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_JSON_ID=4;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_JSON_STRING=6;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
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


    // $ANTLR start "entryRuleJsonSchemaRoot"
    // InternalDraft7.g:78:1: entryRuleJsonSchemaRoot : ruleJsonSchemaRoot EOF ;
    public final void entryRuleJsonSchemaRoot() throws RecognitionException {
        try {
            // InternalDraft7.g:79:1: ( ruleJsonSchemaRoot EOF )
            // InternalDraft7.g:80:1: ruleJsonSchemaRoot EOF
            {
             before(grammarAccess.getJsonSchemaRootRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonSchemaRoot();

            state._fsp--;

             after(grammarAccess.getJsonSchemaRootRule()); 
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
    // $ANTLR end "entryRuleJsonSchemaRoot"


    // $ANTLR start "ruleJsonSchemaRoot"
    // InternalDraft7.g:87:1: ruleJsonSchemaRoot : ( ( rule__JsonSchemaRoot__Alternatives ) ) ;
    public final void ruleJsonSchemaRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:91:2: ( ( ( rule__JsonSchemaRoot__Alternatives ) ) )
            // InternalDraft7.g:92:2: ( ( rule__JsonSchemaRoot__Alternatives ) )
            {
            // InternalDraft7.g:92:2: ( ( rule__JsonSchemaRoot__Alternatives ) )
            // InternalDraft7.g:93:3: ( rule__JsonSchemaRoot__Alternatives )
            {
             before(grammarAccess.getJsonSchemaRootAccess().getAlternatives()); 
            // InternalDraft7.g:94:3: ( rule__JsonSchemaRoot__Alternatives )
            // InternalDraft7.g:94:4: rule__JsonSchemaRoot__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JsonSchemaRoot__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonSchemaRootAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJsonSchemaRoot"


    // $ANTLR start "entryRuleNumberProperties"
    // InternalDraft7.g:103:1: entryRuleNumberProperties : ruleNumberProperties EOF ;
    public final void entryRuleNumberProperties() throws RecognitionException {
        try {
            // InternalDraft7.g:104:1: ( ruleNumberProperties EOF )
            // InternalDraft7.g:105:1: ruleNumberProperties EOF
            {
             before(grammarAccess.getNumberPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberProperties();

            state._fsp--;

             after(grammarAccess.getNumberPropertiesRule()); 
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
    // $ANTLR end "entryRuleNumberProperties"


    // $ANTLR start "ruleNumberProperties"
    // InternalDraft7.g:112:1: ruleNumberProperties : ( ( rule__NumberProperties__Alternatives ) ) ;
    public final void ruleNumberProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:116:2: ( ( ( rule__NumberProperties__Alternatives ) ) )
            // InternalDraft7.g:117:2: ( ( rule__NumberProperties__Alternatives ) )
            {
            // InternalDraft7.g:117:2: ( ( rule__NumberProperties__Alternatives ) )
            // InternalDraft7.g:118:3: ( rule__NumberProperties__Alternatives )
            {
             before(grammarAccess.getNumberPropertiesAccess().getAlternatives()); 
            // InternalDraft7.g:119:3: ( rule__NumberProperties__Alternatives )
            // InternalDraft7.g:119:4: rule__NumberProperties__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberPropertiesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumberProperties"


    // $ANTLR start "entryRuleType"
    // InternalDraft7.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDraft7.g:129:1: ( ruleType EOF )
            // InternalDraft7.g:130:1: ruleType EOF
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
    // InternalDraft7.g:137:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:141:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalDraft7.g:142:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalDraft7.g:142:2: ( ( rule__Type__Group__0 ) )
            // InternalDraft7.g:143:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalDraft7.g:144:3: ( rule__Type__Group__0 )
            // InternalDraft7.g:144:4: rule__Type__Group__0
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
    // InternalDraft7.g:153:1: entryRuleJsonTypes : ruleJsonTypes EOF ;
    public final void entryRuleJsonTypes() throws RecognitionException {
        try {
            // InternalDraft7.g:154:1: ( ruleJsonTypes EOF )
            // InternalDraft7.g:155:1: ruleJsonTypes EOF
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
    // InternalDraft7.g:162:1: ruleJsonTypes : ( ( rule__JsonTypes__Alternatives ) ) ;
    public final void ruleJsonTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:166:2: ( ( ( rule__JsonTypes__Alternatives ) ) )
            // InternalDraft7.g:167:2: ( ( rule__JsonTypes__Alternatives ) )
            {
            // InternalDraft7.g:167:2: ( ( rule__JsonTypes__Alternatives ) )
            // InternalDraft7.g:168:3: ( rule__JsonTypes__Alternatives )
            {
             before(grammarAccess.getJsonTypesAccess().getAlternatives()); 
            // InternalDraft7.g:169:3: ( rule__JsonTypes__Alternatives )
            // InternalDraft7.g:169:4: rule__JsonTypes__Alternatives
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


    // $ANTLR start "entryRuleObjectProperties"
    // InternalDraft7.g:178:1: entryRuleObjectProperties : ruleObjectProperties EOF ;
    public final void entryRuleObjectProperties() throws RecognitionException {
        try {
            // InternalDraft7.g:179:1: ( ruleObjectProperties EOF )
            // InternalDraft7.g:180:1: ruleObjectProperties EOF
            {
             before(grammarAccess.getObjectPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectProperties();

            state._fsp--;

             after(grammarAccess.getObjectPropertiesRule()); 
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
    // $ANTLR end "entryRuleObjectProperties"


    // $ANTLR start "ruleObjectProperties"
    // InternalDraft7.g:187:1: ruleObjectProperties : ( ( rule__ObjectProperties__Alternatives ) ) ;
    public final void ruleObjectProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:191:2: ( ( ( rule__ObjectProperties__Alternatives ) ) )
            // InternalDraft7.g:192:2: ( ( rule__ObjectProperties__Alternatives ) )
            {
            // InternalDraft7.g:192:2: ( ( rule__ObjectProperties__Alternatives ) )
            // InternalDraft7.g:193:3: ( rule__ObjectProperties__Alternatives )
            {
             before(grammarAccess.getObjectPropertiesAccess().getAlternatives()); 
            // InternalDraft7.g:194:3: ( rule__ObjectProperties__Alternatives )
            // InternalDraft7.g:194:4: rule__ObjectProperties__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertiesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObjectProperties"


    // $ANTLR start "entryRuleRequiredProperties"
    // InternalDraft7.g:203:1: entryRuleRequiredProperties : ruleRequiredProperties EOF ;
    public final void entryRuleRequiredProperties() throws RecognitionException {
        try {
            // InternalDraft7.g:204:1: ( ruleRequiredProperties EOF )
            // InternalDraft7.g:205:1: ruleRequiredProperties EOF
            {
             before(grammarAccess.getRequiredPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredProperties();

            state._fsp--;

             after(grammarAccess.getRequiredPropertiesRule()); 
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
    // $ANTLR end "entryRuleRequiredProperties"


    // $ANTLR start "ruleRequiredProperties"
    // InternalDraft7.g:212:1: ruleRequiredProperties : ( ( rule__RequiredProperties__Group__0 ) ) ;
    public final void ruleRequiredProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:216:2: ( ( ( rule__RequiredProperties__Group__0 ) ) )
            // InternalDraft7.g:217:2: ( ( rule__RequiredProperties__Group__0 ) )
            {
            // InternalDraft7.g:217:2: ( ( rule__RequiredProperties__Group__0 ) )
            // InternalDraft7.g:218:3: ( rule__RequiredProperties__Group__0 )
            {
             before(grammarAccess.getRequiredPropertiesAccess().getGroup()); 
            // InternalDraft7.g:219:3: ( rule__RequiredProperties__Group__0 )
            // InternalDraft7.g:219:4: rule__RequiredProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPropertiesAccess().getGroup()); 

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
    // $ANTLR end "ruleRequiredProperties"


    // $ANTLR start "entryRuleRequiredPropertiesName"
    // InternalDraft7.g:228:1: entryRuleRequiredPropertiesName : ruleRequiredPropertiesName EOF ;
    public final void entryRuleRequiredPropertiesName() throws RecognitionException {
        try {
            // InternalDraft7.g:229:1: ( ruleRequiredPropertiesName EOF )
            // InternalDraft7.g:230:1: ruleRequiredPropertiesName EOF
            {
             before(grammarAccess.getRequiredPropertiesNameRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredPropertiesName();

            state._fsp--;

             after(grammarAccess.getRequiredPropertiesNameRule()); 
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
    // $ANTLR end "entryRuleRequiredPropertiesName"


    // $ANTLR start "ruleRequiredPropertiesName"
    // InternalDraft7.g:237:1: ruleRequiredPropertiesName : ( ( rule__RequiredPropertiesName__NameAssignment ) ) ;
    public final void ruleRequiredPropertiesName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:241:2: ( ( ( rule__RequiredPropertiesName__NameAssignment ) ) )
            // InternalDraft7.g:242:2: ( ( rule__RequiredPropertiesName__NameAssignment ) )
            {
            // InternalDraft7.g:242:2: ( ( rule__RequiredPropertiesName__NameAssignment ) )
            // InternalDraft7.g:243:3: ( rule__RequiredPropertiesName__NameAssignment )
            {
             before(grammarAccess.getRequiredPropertiesNameAccess().getNameAssignment()); 
            // InternalDraft7.g:244:3: ( rule__RequiredPropertiesName__NameAssignment )
            // InternalDraft7.g:244:4: rule__RequiredPropertiesName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RequiredPropertiesName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPropertiesNameAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleRequiredPropertiesName"


    // $ANTLR start "entryRuleProperties"
    // InternalDraft7.g:253:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // InternalDraft7.g:254:1: ( ruleProperties EOF )
            // InternalDraft7.g:255:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalDraft7.g:262:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:266:2: ( ( ( rule__Properties__Group__0 ) ) )
            // InternalDraft7.g:267:2: ( ( rule__Properties__Group__0 ) )
            {
            // InternalDraft7.g:267:2: ( ( rule__Properties__Group__0 ) )
            // InternalDraft7.g:268:3: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // InternalDraft7.g:269:3: ( rule__Properties__Group__0 )
            // InternalDraft7.g:269:4: rule__Properties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getGroup()); 

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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleProperty"
    // InternalDraft7.g:278:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalDraft7.g:279:1: ( ruleProperty EOF )
            // InternalDraft7.g:280:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDraft7.g:287:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:291:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalDraft7.g:292:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalDraft7.g:292:2: ( ( rule__Property__Group__0 ) )
            // InternalDraft7.g:293:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalDraft7.g:294:3: ( rule__Property__Group__0 )
            // InternalDraft7.g:294:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleStringProperties"
    // InternalDraft7.g:303:1: entryRuleStringProperties : ruleStringProperties EOF ;
    public final void entryRuleStringProperties() throws RecognitionException {
        try {
            // InternalDraft7.g:304:1: ( ruleStringProperties EOF )
            // InternalDraft7.g:305:1: ruleStringProperties EOF
            {
             before(grammarAccess.getStringPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleStringProperties();

            state._fsp--;

             after(grammarAccess.getStringPropertiesRule()); 
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
    // $ANTLR end "entryRuleStringProperties"


    // $ANTLR start "ruleStringProperties"
    // InternalDraft7.g:312:1: ruleStringProperties : ( ( rule__StringProperties__Alternatives ) ) ;
    public final void ruleStringProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:316:2: ( ( ( rule__StringProperties__Alternatives ) ) )
            // InternalDraft7.g:317:2: ( ( rule__StringProperties__Alternatives ) )
            {
            // InternalDraft7.g:317:2: ( ( rule__StringProperties__Alternatives ) )
            // InternalDraft7.g:318:3: ( rule__StringProperties__Alternatives )
            {
             before(grammarAccess.getStringPropertiesAccess().getAlternatives()); 
            // InternalDraft7.g:319:3: ( rule__StringProperties__Alternatives )
            // InternalDraft7.g:319:4: rule__StringProperties__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringPropertiesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStringProperties"


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


    // $ANTLR start "entryRulePattern"
    // InternalDraft7.g:353:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalDraft7.g:354:1: ( rulePattern EOF )
            // InternalDraft7.g:355:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalDraft7.g:362:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:366:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalDraft7.g:367:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalDraft7.g:367:2: ( ( rule__Pattern__Group__0 ) )
            // InternalDraft7.g:368:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalDraft7.g:369:3: ( rule__Pattern__Group__0 )
            // InternalDraft7.g:369:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleMultiples"
    // InternalDraft7.g:378:1: entryRuleMultiples : ruleMultiples EOF ;
    public final void entryRuleMultiples() throws RecognitionException {
        try {
            // InternalDraft7.g:379:1: ( ruleMultiples EOF )
            // InternalDraft7.g:380:1: ruleMultiples EOF
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
    // InternalDraft7.g:387:1: ruleMultiples : ( ( rule__Multiples__Group__0 ) ) ;
    public final void ruleMultiples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:391:2: ( ( ( rule__Multiples__Group__0 ) ) )
            // InternalDraft7.g:392:2: ( ( rule__Multiples__Group__0 ) )
            {
            // InternalDraft7.g:392:2: ( ( rule__Multiples__Group__0 ) )
            // InternalDraft7.g:393:3: ( rule__Multiples__Group__0 )
            {
             before(grammarAccess.getMultiplesAccess().getGroup()); 
            // InternalDraft7.g:394:3: ( rule__Multiples__Group__0 )
            // InternalDraft7.g:394:4: rule__Multiples__Group__0
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
    // InternalDraft7.g:403:1: entryRuleMinimum : ruleMinimum EOF ;
    public final void entryRuleMinimum() throws RecognitionException {
        try {
            // InternalDraft7.g:404:1: ( ruleMinimum EOF )
            // InternalDraft7.g:405:1: ruleMinimum EOF
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
    // InternalDraft7.g:412:1: ruleMinimum : ( ( rule__Minimum__Group__0 ) ) ;
    public final void ruleMinimum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:416:2: ( ( ( rule__Minimum__Group__0 ) ) )
            // InternalDraft7.g:417:2: ( ( rule__Minimum__Group__0 ) )
            {
            // InternalDraft7.g:417:2: ( ( rule__Minimum__Group__0 ) )
            // InternalDraft7.g:418:3: ( rule__Minimum__Group__0 )
            {
             before(grammarAccess.getMinimumAccess().getGroup()); 
            // InternalDraft7.g:419:3: ( rule__Minimum__Group__0 )
            // InternalDraft7.g:419:4: rule__Minimum__Group__0
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
    // InternalDraft7.g:428:1: entryRuleExclusiveMinimum : ruleExclusiveMinimum EOF ;
    public final void entryRuleExclusiveMinimum() throws RecognitionException {
        try {
            // InternalDraft7.g:429:1: ( ruleExclusiveMinimum EOF )
            // InternalDraft7.g:430:1: ruleExclusiveMinimum EOF
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
    // InternalDraft7.g:437:1: ruleExclusiveMinimum : ( ( rule__ExclusiveMinimum__Group__0 ) ) ;
    public final void ruleExclusiveMinimum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:441:2: ( ( ( rule__ExclusiveMinimum__Group__0 ) ) )
            // InternalDraft7.g:442:2: ( ( rule__ExclusiveMinimum__Group__0 ) )
            {
            // InternalDraft7.g:442:2: ( ( rule__ExclusiveMinimum__Group__0 ) )
            // InternalDraft7.g:443:3: ( rule__ExclusiveMinimum__Group__0 )
            {
             before(grammarAccess.getExclusiveMinimumAccess().getGroup()); 
            // InternalDraft7.g:444:3: ( rule__ExclusiveMinimum__Group__0 )
            // InternalDraft7.g:444:4: rule__ExclusiveMinimum__Group__0
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
    // InternalDraft7.g:453:1: entryRuleMaximum : ruleMaximum EOF ;
    public final void entryRuleMaximum() throws RecognitionException {
        try {
            // InternalDraft7.g:454:1: ( ruleMaximum EOF )
            // InternalDraft7.g:455:1: ruleMaximum EOF
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
    // InternalDraft7.g:462:1: ruleMaximum : ( ( rule__Maximum__Group__0 ) ) ;
    public final void ruleMaximum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:466:2: ( ( ( rule__Maximum__Group__0 ) ) )
            // InternalDraft7.g:467:2: ( ( rule__Maximum__Group__0 ) )
            {
            // InternalDraft7.g:467:2: ( ( rule__Maximum__Group__0 ) )
            // InternalDraft7.g:468:3: ( rule__Maximum__Group__0 )
            {
             before(grammarAccess.getMaximumAccess().getGroup()); 
            // InternalDraft7.g:469:3: ( rule__Maximum__Group__0 )
            // InternalDraft7.g:469:4: rule__Maximum__Group__0
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
    // InternalDraft7.g:478:1: entryRuleExclusiveMaximum : ruleExclusiveMaximum EOF ;
    public final void entryRuleExclusiveMaximum() throws RecognitionException {
        try {
            // InternalDraft7.g:479:1: ( ruleExclusiveMaximum EOF )
            // InternalDraft7.g:480:1: ruleExclusiveMaximum EOF
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
    // InternalDraft7.g:487:1: ruleExclusiveMaximum : ( ( rule__ExclusiveMaximum__Group__0 ) ) ;
    public final void ruleExclusiveMaximum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:491:2: ( ( ( rule__ExclusiveMaximum__Group__0 ) ) )
            // InternalDraft7.g:492:2: ( ( rule__ExclusiveMaximum__Group__0 ) )
            {
            // InternalDraft7.g:492:2: ( ( rule__ExclusiveMaximum__Group__0 ) )
            // InternalDraft7.g:493:3: ( rule__ExclusiveMaximum__Group__0 )
            {
             before(grammarAccess.getExclusiveMaximumAccess().getGroup()); 
            // InternalDraft7.g:494:3: ( rule__ExclusiveMaximum__Group__0 )
            // InternalDraft7.g:494:4: rule__ExclusiveMaximum__Group__0
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


    // $ANTLR start "rule__JsonSchemaRoot__Alternatives"
    // InternalDraft7.g:502:1: rule__JsonSchemaRoot__Alternatives : ( ( ( rule__JsonSchemaRoot__TypeAssignment_0 ) ) | ( ruleObjectProperties ) | ( ruleStringProperties ) | ( ruleNumberProperties ) );
    public final void rule__JsonSchemaRoot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:506:1: ( ( ( rule__JsonSchemaRoot__TypeAssignment_0 ) ) | ( ruleObjectProperties ) | ( ruleStringProperties ) | ( ruleNumberProperties ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 27:
            case 28:
                {
                alt1=2;
                }
                break;
            case 29:
            case 30:
                {
                alt1=3;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDraft7.g:507:2: ( ( rule__JsonSchemaRoot__TypeAssignment_0 ) )
                    {
                    // InternalDraft7.g:507:2: ( ( rule__JsonSchemaRoot__TypeAssignment_0 ) )
                    // InternalDraft7.g:508:3: ( rule__JsonSchemaRoot__TypeAssignment_0 )
                    {
                     before(grammarAccess.getJsonSchemaRootAccess().getTypeAssignment_0()); 
                    // InternalDraft7.g:509:3: ( rule__JsonSchemaRoot__TypeAssignment_0 )
                    // InternalDraft7.g:509:4: rule__JsonSchemaRoot__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonSchemaRoot__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonSchemaRootAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:513:2: ( ruleObjectProperties )
                    {
                    // InternalDraft7.g:513:2: ( ruleObjectProperties )
                    // InternalDraft7.g:514:3: ruleObjectProperties
                    {
                     before(grammarAccess.getJsonSchemaRootAccess().getObjectPropertiesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectProperties();

                    state._fsp--;

                     after(grammarAccess.getJsonSchemaRootAccess().getObjectPropertiesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:519:2: ( ruleStringProperties )
                    {
                    // InternalDraft7.g:519:2: ( ruleStringProperties )
                    // InternalDraft7.g:520:3: ruleStringProperties
                    {
                     before(grammarAccess.getJsonSchemaRootAccess().getStringPropertiesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStringProperties();

                    state._fsp--;

                     after(grammarAccess.getJsonSchemaRootAccess().getStringPropertiesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:525:2: ( ruleNumberProperties )
                    {
                    // InternalDraft7.g:525:2: ( ruleNumberProperties )
                    // InternalDraft7.g:526:3: ruleNumberProperties
                    {
                     before(grammarAccess.getJsonSchemaRootAccess().getNumberPropertiesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberProperties();

                    state._fsp--;

                     after(grammarAccess.getJsonSchemaRootAccess().getNumberPropertiesParserRuleCall_3()); 

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
    // $ANTLR end "rule__JsonSchemaRoot__Alternatives"


    // $ANTLR start "rule__NumberProperties__Alternatives"
    // InternalDraft7.g:535:1: rule__NumberProperties__Alternatives : ( ( ruleMultiples ) | ( ( rule__NumberProperties__MinimumAssignment_1 ) ) | ( ( rule__NumberProperties__ExclusiveMinimumAssignment_2 ) ) | ( ( rule__NumberProperties__MaximumAssignment_3 ) ) | ( ( rule__NumberProperties__ExclusiveMaximumAssignment_4 ) ) );
    public final void rule__NumberProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:539:1: ( ( ruleMultiples ) | ( ( rule__NumberProperties__MinimumAssignment_1 ) ) | ( ( rule__NumberProperties__ExclusiveMinimumAssignment_2 ) ) | ( ( rule__NumberProperties__MaximumAssignment_3 ) ) | ( ( rule__NumberProperties__ExclusiveMaximumAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDraft7.g:540:2: ( ruleMultiples )
                    {
                    // InternalDraft7.g:540:2: ( ruleMultiples )
                    // InternalDraft7.g:541:3: ruleMultiples
                    {
                     before(grammarAccess.getNumberPropertiesAccess().getMultiplesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiples();

                    state._fsp--;

                     after(grammarAccess.getNumberPropertiesAccess().getMultiplesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:546:2: ( ( rule__NumberProperties__MinimumAssignment_1 ) )
                    {
                    // InternalDraft7.g:546:2: ( ( rule__NumberProperties__MinimumAssignment_1 ) )
                    // InternalDraft7.g:547:3: ( rule__NumberProperties__MinimumAssignment_1 )
                    {
                     before(grammarAccess.getNumberPropertiesAccess().getMinimumAssignment_1()); 
                    // InternalDraft7.g:548:3: ( rule__NumberProperties__MinimumAssignment_1 )
                    // InternalDraft7.g:548:4: rule__NumberProperties__MinimumAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberProperties__MinimumAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberPropertiesAccess().getMinimumAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:552:2: ( ( rule__NumberProperties__ExclusiveMinimumAssignment_2 ) )
                    {
                    // InternalDraft7.g:552:2: ( ( rule__NumberProperties__ExclusiveMinimumAssignment_2 ) )
                    // InternalDraft7.g:553:3: ( rule__NumberProperties__ExclusiveMinimumAssignment_2 )
                    {
                     before(grammarAccess.getNumberPropertiesAccess().getExclusiveMinimumAssignment_2()); 
                    // InternalDraft7.g:554:3: ( rule__NumberProperties__ExclusiveMinimumAssignment_2 )
                    // InternalDraft7.g:554:4: rule__NumberProperties__ExclusiveMinimumAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberProperties__ExclusiveMinimumAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberPropertiesAccess().getExclusiveMinimumAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:558:2: ( ( rule__NumberProperties__MaximumAssignment_3 ) )
                    {
                    // InternalDraft7.g:558:2: ( ( rule__NumberProperties__MaximumAssignment_3 ) )
                    // InternalDraft7.g:559:3: ( rule__NumberProperties__MaximumAssignment_3 )
                    {
                     before(grammarAccess.getNumberPropertiesAccess().getMaximumAssignment_3()); 
                    // InternalDraft7.g:560:3: ( rule__NumberProperties__MaximumAssignment_3 )
                    // InternalDraft7.g:560:4: rule__NumberProperties__MaximumAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberProperties__MaximumAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberPropertiesAccess().getMaximumAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:564:2: ( ( rule__NumberProperties__ExclusiveMaximumAssignment_4 ) )
                    {
                    // InternalDraft7.g:564:2: ( ( rule__NumberProperties__ExclusiveMaximumAssignment_4 ) )
                    // InternalDraft7.g:565:3: ( rule__NumberProperties__ExclusiveMaximumAssignment_4 )
                    {
                     before(grammarAccess.getNumberPropertiesAccess().getExclusiveMaximumAssignment_4()); 
                    // InternalDraft7.g:566:3: ( rule__NumberProperties__ExclusiveMaximumAssignment_4 )
                    // InternalDraft7.g:566:4: rule__NumberProperties__ExclusiveMaximumAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberProperties__ExclusiveMaximumAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberPropertiesAccess().getExclusiveMaximumAssignment_4()); 

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
    // $ANTLR end "rule__NumberProperties__Alternatives"


    // $ANTLR start "rule__Type__Alternatives_2"
    // InternalDraft7.g:574:1: rule__Type__Alternatives_2 : ( ( ( rule__Type__Group_2_0__0 ) ) | ( ( rule__Type__TypeAssignment_2_1 ) ) );
    public final void rule__Type__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:578:1: ( ( ( rule__Type__Group_2_0__0 ) ) | ( ( rule__Type__TypeAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=13 && LA3_0<=19)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDraft7.g:579:2: ( ( rule__Type__Group_2_0__0 ) )
                    {
                    // InternalDraft7.g:579:2: ( ( rule__Type__Group_2_0__0 ) )
                    // InternalDraft7.g:580:3: ( rule__Type__Group_2_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2_0()); 
                    // InternalDraft7.g:581:3: ( rule__Type__Group_2_0__0 )
                    // InternalDraft7.g:581:4: rule__Type__Group_2_0__0
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
                    // InternalDraft7.g:585:2: ( ( rule__Type__TypeAssignment_2_1 ) )
                    {
                    // InternalDraft7.g:585:2: ( ( rule__Type__TypeAssignment_2_1 ) )
                    // InternalDraft7.g:586:3: ( rule__Type__TypeAssignment_2_1 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_2_1()); 
                    // InternalDraft7.g:587:3: ( rule__Type__TypeAssignment_2_1 )
                    // InternalDraft7.g:587:4: rule__Type__TypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_2_1()); 

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
    // InternalDraft7.g:595:1: rule__JsonTypes__Alternatives : ( ( '\"string\"' ) | ( '\"integer\"' ) | ( '\"number\"' ) | ( '\"object\"' ) | ( '\"array\"' ) | ( '\"boolean\"' ) | ( '\"null\"' ) );
    public final void rule__JsonTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:599:1: ( ( '\"string\"' ) | ( '\"integer\"' ) | ( '\"number\"' ) | ( '\"object\"' ) | ( '\"array\"' ) | ( '\"boolean\"' ) | ( '\"null\"' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDraft7.g:600:2: ( '\"string\"' )
                    {
                    // InternalDraft7.g:600:2: ( '\"string\"' )
                    // InternalDraft7.g:601:3: '\"string\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getStringKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:606:2: ( '\"integer\"' )
                    {
                    // InternalDraft7.g:606:2: ( '\"integer\"' )
                    // InternalDraft7.g:607:3: '\"integer\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getIntegerKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDraft7.g:612:2: ( '\"number\"' )
                    {
                    // InternalDraft7.g:612:2: ( '\"number\"' )
                    // InternalDraft7.g:613:3: '\"number\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getNumberKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getNumberKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDraft7.g:618:2: ( '\"object\"' )
                    {
                    // InternalDraft7.g:618:2: ( '\"object\"' )
                    // InternalDraft7.g:619:3: '\"object\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getObjectKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getObjectKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDraft7.g:624:2: ( '\"array\"' )
                    {
                    // InternalDraft7.g:624:2: ( '\"array\"' )
                    // InternalDraft7.g:625:3: '\"array\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getArrayKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getArrayKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDraft7.g:630:2: ( '\"boolean\"' )
                    {
                    // InternalDraft7.g:630:2: ( '\"boolean\"' )
                    // InternalDraft7.g:631:3: '\"boolean\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getBooleanKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getJsonTypesAccess().getBooleanKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDraft7.g:636:2: ( '\"null\"' )
                    {
                    // InternalDraft7.g:636:2: ( '\"null\"' )
                    // InternalDraft7.g:637:3: '\"null\"'
                    {
                     before(grammarAccess.getJsonTypesAccess().getNullKeyword_6()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__ObjectProperties__Alternatives"
    // InternalDraft7.g:646:1: rule__ObjectProperties__Alternatives : ( ( ( rule__ObjectProperties__PropertiesAssignment_0 ) ) | ( ( rule__ObjectProperties__RequiredPropertiesAssignment_1 ) ) );
    public final void rule__ObjectProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:650:1: ( ( ( rule__ObjectProperties__PropertiesAssignment_0 ) ) | ( ( rule__ObjectProperties__RequiredPropertiesAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDraft7.g:651:2: ( ( rule__ObjectProperties__PropertiesAssignment_0 ) )
                    {
                    // InternalDraft7.g:651:2: ( ( rule__ObjectProperties__PropertiesAssignment_0 ) )
                    // InternalDraft7.g:652:3: ( rule__ObjectProperties__PropertiesAssignment_0 )
                    {
                     before(grammarAccess.getObjectPropertiesAccess().getPropertiesAssignment_0()); 
                    // InternalDraft7.g:653:3: ( rule__ObjectProperties__PropertiesAssignment_0 )
                    // InternalDraft7.g:653:4: rule__ObjectProperties__PropertiesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectProperties__PropertiesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectPropertiesAccess().getPropertiesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:657:2: ( ( rule__ObjectProperties__RequiredPropertiesAssignment_1 ) )
                    {
                    // InternalDraft7.g:657:2: ( ( rule__ObjectProperties__RequiredPropertiesAssignment_1 ) )
                    // InternalDraft7.g:658:3: ( rule__ObjectProperties__RequiredPropertiesAssignment_1 )
                    {
                     before(grammarAccess.getObjectPropertiesAccess().getRequiredPropertiesAssignment_1()); 
                    // InternalDraft7.g:659:3: ( rule__ObjectProperties__RequiredPropertiesAssignment_1 )
                    // InternalDraft7.g:659:4: rule__ObjectProperties__RequiredPropertiesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectProperties__RequiredPropertiesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectPropertiesAccess().getRequiredPropertiesAssignment_1()); 

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
    // $ANTLR end "rule__ObjectProperties__Alternatives"


    // $ANTLR start "rule__StringProperties__Alternatives"
    // InternalDraft7.g:667:1: rule__StringProperties__Alternatives : ( ( ( rule__StringProperties__LengthAssignment_0 ) ) | ( ( rule__StringProperties__PatternAssignment_1 ) ) );
    public final void rule__StringProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:671:1: ( ( ( rule__StringProperties__LengthAssignment_0 ) ) | ( ( rule__StringProperties__PatternAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDraft7.g:672:2: ( ( rule__StringProperties__LengthAssignment_0 ) )
                    {
                    // InternalDraft7.g:672:2: ( ( rule__StringProperties__LengthAssignment_0 ) )
                    // InternalDraft7.g:673:3: ( rule__StringProperties__LengthAssignment_0 )
                    {
                     before(grammarAccess.getStringPropertiesAccess().getLengthAssignment_0()); 
                    // InternalDraft7.g:674:3: ( rule__StringProperties__LengthAssignment_0 )
                    // InternalDraft7.g:674:4: rule__StringProperties__LengthAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringProperties__LengthAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringPropertiesAccess().getLengthAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDraft7.g:678:2: ( ( rule__StringProperties__PatternAssignment_1 ) )
                    {
                    // InternalDraft7.g:678:2: ( ( rule__StringProperties__PatternAssignment_1 ) )
                    // InternalDraft7.g:679:3: ( rule__StringProperties__PatternAssignment_1 )
                    {
                     before(grammarAccess.getStringPropertiesAccess().getPatternAssignment_1()); 
                    // InternalDraft7.g:680:3: ( rule__StringProperties__PatternAssignment_1 )
                    // InternalDraft7.g:680:4: rule__StringProperties__PatternAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringProperties__PatternAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringPropertiesAccess().getPatternAssignment_1()); 

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
    // $ANTLR end "rule__StringProperties__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDraft7.g:688:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:692:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDraft7.g:693:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDraft7.g:700:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:704:1: ( ( () ) )
            // InternalDraft7.g:705:1: ( () )
            {
            // InternalDraft7.g:705:1: ( () )
            // InternalDraft7.g:706:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalDraft7.g:707:2: ()
            // InternalDraft7.g:707:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDraft7.g:715:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:719:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDraft7.g:720:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDraft7.g:727:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:731:1: ( ( '{' ) )
            // InternalDraft7.g:732:1: ( '{' )
            {
            // InternalDraft7.g:732:1: ( '{' )
            // InternalDraft7.g:733:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalDraft7.g:742:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:746:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalDraft7.g:747:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // InternalDraft7.g:754:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:758:1: ( ( ( rule__Model__Group_2__0 )* ) )
            // InternalDraft7.g:759:1: ( ( rule__Model__Group_2__0 )* )
            {
            // InternalDraft7.g:759:1: ( ( rule__Model__Group_2__0 )* )
            // InternalDraft7.g:760:2: ( rule__Model__Group_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalDraft7.g:761:2: ( rule__Model__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||(LA7_0>=27 && LA7_0<=35)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDraft7.g:761:3: rule__Model__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Model__Group__3"
    // InternalDraft7.g:769:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:773:1: ( rule__Model__Group__3__Impl )
            // InternalDraft7.g:774:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalDraft7.g:780:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:784:1: ( ( '}' ) )
            // InternalDraft7.g:785:1: ( '}' )
            {
            // InternalDraft7.g:785:1: ( '}' )
            // InternalDraft7.g:786:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalDraft7.g:796:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:800:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalDraft7.g:801:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1();

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
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalDraft7.g:808:1: rule__Model__Group_2__0__Impl : ( ( rule__Model__RootAssignment_2_0 ) ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:812:1: ( ( ( rule__Model__RootAssignment_2_0 ) ) )
            // InternalDraft7.g:813:1: ( ( rule__Model__RootAssignment_2_0 ) )
            {
            // InternalDraft7.g:813:1: ( ( rule__Model__RootAssignment_2_0 ) )
            // InternalDraft7.g:814:2: ( rule__Model__RootAssignment_2_0 )
            {
             before(grammarAccess.getModelAccess().getRootAssignment_2_0()); 
            // InternalDraft7.g:815:2: ( rule__Model__RootAssignment_2_0 )
            // InternalDraft7.g:815:3: rule__Model__RootAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__RootAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRootAssignment_2_0()); 

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
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // InternalDraft7.g:823:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:827:1: ( rule__Model__Group_2__1__Impl )
            // InternalDraft7.g:828:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1__Impl();

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
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // InternalDraft7.g:834:1: rule__Model__Group_2__1__Impl : ( ( ',' )? ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:838:1: ( ( ( ',' )? ) )
            // InternalDraft7.g:839:1: ( ( ',' )? )
            {
            // InternalDraft7.g:839:1: ( ( ',' )? )
            // InternalDraft7.g:840:2: ( ',' )?
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_2_1()); 
            // InternalDraft7.g:841:2: ( ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDraft7.g:841:3: ','
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getCommaKeyword_2_1()); 

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
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalDraft7.g:850:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:854:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDraft7.g:855:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDraft7.g:862:1: rule__Type__Group__0__Impl : ( '\"type\"' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:866:1: ( ( '\"type\"' ) )
            // InternalDraft7.g:867:1: ( '\"type\"' )
            {
            // InternalDraft7.g:867:1: ( '\"type\"' )
            // InternalDraft7.g:868:2: '\"type\"'
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
    // InternalDraft7.g:877:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:881:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalDraft7.g:882:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDraft7.g:889:1: rule__Type__Group__1__Impl : ( ':' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:893:1: ( ( ':' ) )
            // InternalDraft7.g:894:1: ( ':' )
            {
            // InternalDraft7.g:894:1: ( ':' )
            // InternalDraft7.g:895:2: ':'
            {
             before(grammarAccess.getTypeAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDraft7.g:904:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:908:1: ( rule__Type__Group__2__Impl )
            // InternalDraft7.g:909:2: rule__Type__Group__2__Impl
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
    // InternalDraft7.g:915:1: rule__Type__Group__2__Impl : ( ( rule__Type__Alternatives_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:919:1: ( ( ( rule__Type__Alternatives_2 ) ) )
            // InternalDraft7.g:920:1: ( ( rule__Type__Alternatives_2 ) )
            {
            // InternalDraft7.g:920:1: ( ( rule__Type__Alternatives_2 ) )
            // InternalDraft7.g:921:2: ( rule__Type__Alternatives_2 )
            {
             before(grammarAccess.getTypeAccess().getAlternatives_2()); 
            // InternalDraft7.g:922:2: ( rule__Type__Alternatives_2 )
            // InternalDraft7.g:922:3: rule__Type__Alternatives_2
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
    // InternalDraft7.g:931:1: rule__Type__Group_2_0__0 : rule__Type__Group_2_0__0__Impl rule__Type__Group_2_0__1 ;
    public final void rule__Type__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:935:1: ( rule__Type__Group_2_0__0__Impl rule__Type__Group_2_0__1 )
            // InternalDraft7.g:936:2: rule__Type__Group_2_0__0__Impl rule__Type__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDraft7.g:943:1: rule__Type__Group_2_0__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:947:1: ( ( '[' ) )
            // InternalDraft7.g:948:1: ( '[' )
            {
            // InternalDraft7.g:948:1: ( '[' )
            // InternalDraft7.g:949:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_2_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDraft7.g:958:1: rule__Type__Group_2_0__1 : rule__Type__Group_2_0__1__Impl rule__Type__Group_2_0__2 ;
    public final void rule__Type__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:962:1: ( rule__Type__Group_2_0__1__Impl rule__Type__Group_2_0__2 )
            // InternalDraft7.g:963:2: rule__Type__Group_2_0__1__Impl rule__Type__Group_2_0__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDraft7.g:970:1: rule__Type__Group_2_0__1__Impl : ( ( rule__Type__Group_2_0_1__0 ) ) ;
    public final void rule__Type__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:974:1: ( ( ( rule__Type__Group_2_0_1__0 ) ) )
            // InternalDraft7.g:975:1: ( ( rule__Type__Group_2_0_1__0 ) )
            {
            // InternalDraft7.g:975:1: ( ( rule__Type__Group_2_0_1__0 ) )
            // InternalDraft7.g:976:2: ( rule__Type__Group_2_0_1__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup_2_0_1()); 
            // InternalDraft7.g:977:2: ( rule__Type__Group_2_0_1__0 )
            // InternalDraft7.g:977:3: rule__Type__Group_2_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup_2_0_1()); 

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
    // InternalDraft7.g:985:1: rule__Type__Group_2_0__2 : rule__Type__Group_2_0__2__Impl ;
    public final void rule__Type__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:989:1: ( rule__Type__Group_2_0__2__Impl )
            // InternalDraft7.g:990:2: rule__Type__Group_2_0__2__Impl
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
    // InternalDraft7.g:996:1: rule__Type__Group_2_0__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1000:1: ( ( ']' ) )
            // InternalDraft7.g:1001:1: ( ']' )
            {
            // InternalDraft7.g:1001:1: ( ']' )
            // InternalDraft7.g:1002:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_2_0_2()); 
            match(input,26,FOLLOW_2); 
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


    // $ANTLR start "rule__Type__Group_2_0_1__0"
    // InternalDraft7.g:1012:1: rule__Type__Group_2_0_1__0 : rule__Type__Group_2_0_1__0__Impl rule__Type__Group_2_0_1__1 ;
    public final void rule__Type__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1016:1: ( rule__Type__Group_2_0_1__0__Impl rule__Type__Group_2_0_1__1 )
            // InternalDraft7.g:1017:2: rule__Type__Group_2_0_1__0__Impl rule__Type__Group_2_0_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Type__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2_0_1__1();

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
    // $ANTLR end "rule__Type__Group_2_0_1__0"


    // $ANTLR start "rule__Type__Group_2_0_1__0__Impl"
    // InternalDraft7.g:1024:1: rule__Type__Group_2_0_1__0__Impl : ( ( rule__Type__TypesAssignment_2_0_1_0 ) ) ;
    public final void rule__Type__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1028:1: ( ( ( rule__Type__TypesAssignment_2_0_1_0 ) ) )
            // InternalDraft7.g:1029:1: ( ( rule__Type__TypesAssignment_2_0_1_0 ) )
            {
            // InternalDraft7.g:1029:1: ( ( rule__Type__TypesAssignment_2_0_1_0 ) )
            // InternalDraft7.g:1030:2: ( rule__Type__TypesAssignment_2_0_1_0 )
            {
             before(grammarAccess.getTypeAccess().getTypesAssignment_2_0_1_0()); 
            // InternalDraft7.g:1031:2: ( rule__Type__TypesAssignment_2_0_1_0 )
            // InternalDraft7.g:1031:3: rule__Type__TypesAssignment_2_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypesAssignment_2_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypesAssignment_2_0_1_0()); 

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
    // $ANTLR end "rule__Type__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__Type__Group_2_0_1__1"
    // InternalDraft7.g:1039:1: rule__Type__Group_2_0_1__1 : rule__Type__Group_2_0_1__1__Impl ;
    public final void rule__Type__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1043:1: ( rule__Type__Group_2_0_1__1__Impl )
            // InternalDraft7.g:1044:2: rule__Type__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2_0_1__1__Impl();

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
    // $ANTLR end "rule__Type__Group_2_0_1__1"


    // $ANTLR start "rule__Type__Group_2_0_1__1__Impl"
    // InternalDraft7.g:1050:1: rule__Type__Group_2_0_1__1__Impl : ( ( rule__Type__Group_2_0_1_1__0 )* ) ;
    public final void rule__Type__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1054:1: ( ( ( rule__Type__Group_2_0_1_1__0 )* ) )
            // InternalDraft7.g:1055:1: ( ( rule__Type__Group_2_0_1_1__0 )* )
            {
            // InternalDraft7.g:1055:1: ( ( rule__Type__Group_2_0_1_1__0 )* )
            // InternalDraft7.g:1056:2: ( rule__Type__Group_2_0_1_1__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_2_0_1_1()); 
            // InternalDraft7.g:1057:2: ( rule__Type__Group_2_0_1_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDraft7.g:1057:3: rule__Type__Group_2_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Type__Group_2_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_2_0_1_1()); 

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
    // $ANTLR end "rule__Type__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2_0_1_1__0"
    // InternalDraft7.g:1066:1: rule__Type__Group_2_0_1_1__0 : rule__Type__Group_2_0_1_1__0__Impl rule__Type__Group_2_0_1_1__1 ;
    public final void rule__Type__Group_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1070:1: ( rule__Type__Group_2_0_1_1__0__Impl rule__Type__Group_2_0_1_1__1 )
            // InternalDraft7.g:1071:2: rule__Type__Group_2_0_1_1__0__Impl rule__Type__Group_2_0_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group_2_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2_0_1_1__1();

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
    // $ANTLR end "rule__Type__Group_2_0_1_1__0"


    // $ANTLR start "rule__Type__Group_2_0_1_1__0__Impl"
    // InternalDraft7.g:1078:1: rule__Type__Group_2_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__Type__Group_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1082:1: ( ( ',' ) )
            // InternalDraft7.g:1083:1: ( ',' )
            {
            // InternalDraft7.g:1083:1: ( ',' )
            // InternalDraft7.g:1084:2: ','
            {
             before(grammarAccess.getTypeAccess().getCommaKeyword_2_0_1_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCommaKeyword_2_0_1_1_0()); 

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
    // $ANTLR end "rule__Type__Group_2_0_1_1__0__Impl"


    // $ANTLR start "rule__Type__Group_2_0_1_1__1"
    // InternalDraft7.g:1093:1: rule__Type__Group_2_0_1_1__1 : rule__Type__Group_2_0_1_1__1__Impl ;
    public final void rule__Type__Group_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1097:1: ( rule__Type__Group_2_0_1_1__1__Impl )
            // InternalDraft7.g:1098:2: rule__Type__Group_2_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2_0_1_1__1__Impl();

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
    // $ANTLR end "rule__Type__Group_2_0_1_1__1"


    // $ANTLR start "rule__Type__Group_2_0_1_1__1__Impl"
    // InternalDraft7.g:1104:1: rule__Type__Group_2_0_1_1__1__Impl : ( ( rule__Type__TypesAssignment_2_0_1_1_1 ) ) ;
    public final void rule__Type__Group_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1108:1: ( ( ( rule__Type__TypesAssignment_2_0_1_1_1 ) ) )
            // InternalDraft7.g:1109:1: ( ( rule__Type__TypesAssignment_2_0_1_1_1 ) )
            {
            // InternalDraft7.g:1109:1: ( ( rule__Type__TypesAssignment_2_0_1_1_1 ) )
            // InternalDraft7.g:1110:2: ( rule__Type__TypesAssignment_2_0_1_1_1 )
            {
             before(grammarAccess.getTypeAccess().getTypesAssignment_2_0_1_1_1()); 
            // InternalDraft7.g:1111:2: ( rule__Type__TypesAssignment_2_0_1_1_1 )
            // InternalDraft7.g:1111:3: rule__Type__TypesAssignment_2_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypesAssignment_2_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypesAssignment_2_0_1_1_1()); 

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
    // $ANTLR end "rule__Type__Group_2_0_1_1__1__Impl"


    // $ANTLR start "rule__RequiredProperties__Group__0"
    // InternalDraft7.g:1120:1: rule__RequiredProperties__Group__0 : rule__RequiredProperties__Group__0__Impl rule__RequiredProperties__Group__1 ;
    public final void rule__RequiredProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1124:1: ( rule__RequiredProperties__Group__0__Impl rule__RequiredProperties__Group__1 )
            // InternalDraft7.g:1125:2: rule__RequiredProperties__Group__0__Impl rule__RequiredProperties__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RequiredProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredProperties__Group__1();

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
    // $ANTLR end "rule__RequiredProperties__Group__0"


    // $ANTLR start "rule__RequiredProperties__Group__0__Impl"
    // InternalDraft7.g:1132:1: rule__RequiredProperties__Group__0__Impl : ( '\"required\"' ) ;
    public final void rule__RequiredProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1136:1: ( ( '\"required\"' ) )
            // InternalDraft7.g:1137:1: ( '\"required\"' )
            {
            // InternalDraft7.g:1137:1: ( '\"required\"' )
            // InternalDraft7.g:1138:2: '\"required\"'
            {
             before(grammarAccess.getRequiredPropertiesAccess().getRequiredKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRequiredPropertiesAccess().getRequiredKeyword_0()); 

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
    // $ANTLR end "rule__RequiredProperties__Group__0__Impl"


    // $ANTLR start "rule__RequiredProperties__Group__1"
    // InternalDraft7.g:1147:1: rule__RequiredProperties__Group__1 : rule__RequiredProperties__Group__1__Impl rule__RequiredProperties__Group__2 ;
    public final void rule__RequiredProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1151:1: ( rule__RequiredProperties__Group__1__Impl rule__RequiredProperties__Group__2 )
            // InternalDraft7.g:1152:2: rule__RequiredProperties__Group__1__Impl rule__RequiredProperties__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RequiredProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredProperties__Group__2();

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
    // $ANTLR end "rule__RequiredProperties__Group__1"


    // $ANTLR start "rule__RequiredProperties__Group__1__Impl"
    // InternalDraft7.g:1159:1: rule__RequiredProperties__Group__1__Impl : ( ':' ) ;
    public final void rule__RequiredProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1163:1: ( ( ':' ) )
            // InternalDraft7.g:1164:1: ( ':' )
            {
            // InternalDraft7.g:1164:1: ( ':' )
            // InternalDraft7.g:1165:2: ':'
            {
             before(grammarAccess.getRequiredPropertiesAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRequiredPropertiesAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__RequiredProperties__Group__1__Impl"


    // $ANTLR start "rule__RequiredProperties__Group__2"
    // InternalDraft7.g:1174:1: rule__RequiredProperties__Group__2 : rule__RequiredProperties__Group__2__Impl rule__RequiredProperties__Group__3 ;
    public final void rule__RequiredProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1178:1: ( rule__RequiredProperties__Group__2__Impl rule__RequiredProperties__Group__3 )
            // InternalDraft7.g:1179:2: rule__RequiredProperties__Group__2__Impl rule__RequiredProperties__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RequiredProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredProperties__Group__3();

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
    // $ANTLR end "rule__RequiredProperties__Group__2"


    // $ANTLR start "rule__RequiredProperties__Group__2__Impl"
    // InternalDraft7.g:1186:1: rule__RequiredProperties__Group__2__Impl : ( '[' ) ;
    public final void rule__RequiredProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1190:1: ( ( '[' ) )
            // InternalDraft7.g:1191:1: ( '[' )
            {
            // InternalDraft7.g:1191:1: ( '[' )
            // InternalDraft7.g:1192:2: '['
            {
             before(grammarAccess.getRequiredPropertiesAccess().getLeftSquareBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRequiredPropertiesAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__RequiredProperties__Group__2__Impl"


    // $ANTLR start "rule__RequiredProperties__Group__3"
    // InternalDraft7.g:1201:1: rule__RequiredProperties__Group__3 : rule__RequiredProperties__Group__3__Impl rule__RequiredProperties__Group__4 ;
    public final void rule__RequiredProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1205:1: ( rule__RequiredProperties__Group__3__Impl rule__RequiredProperties__Group__4 )
            // InternalDraft7.g:1206:2: rule__RequiredProperties__Group__3__Impl rule__RequiredProperties__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RequiredProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredProperties__Group__4();

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
    // $ANTLR end "rule__RequiredProperties__Group__3"


    // $ANTLR start "rule__RequiredProperties__Group__3__Impl"
    // InternalDraft7.g:1213:1: rule__RequiredProperties__Group__3__Impl : ( ( rule__RequiredProperties__RequiredPropertiesAssignment_3 ) ) ;
    public final void rule__RequiredProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1217:1: ( ( ( rule__RequiredProperties__RequiredPropertiesAssignment_3 ) ) )
            // InternalDraft7.g:1218:1: ( ( rule__RequiredProperties__RequiredPropertiesAssignment_3 ) )
            {
            // InternalDraft7.g:1218:1: ( ( rule__RequiredProperties__RequiredPropertiesAssignment_3 ) )
            // InternalDraft7.g:1219:2: ( rule__RequiredProperties__RequiredPropertiesAssignment_3 )
            {
             before(grammarAccess.getRequiredPropertiesAccess().getRequiredPropertiesAssignment_3()); 
            // InternalDraft7.g:1220:2: ( rule__RequiredProperties__RequiredPropertiesAssignment_3 )
            // InternalDraft7.g:1220:3: rule__RequiredProperties__RequiredPropertiesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RequiredProperties__RequiredPropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPropertiesAccess().getRequiredPropertiesAssignment_3()); 

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
    // $ANTLR end "rule__RequiredProperties__Group__3__Impl"


    // $ANTLR start "rule__RequiredProperties__Group__4"
    // InternalDraft7.g:1228:1: rule__RequiredProperties__Group__4 : rule__RequiredProperties__Group__4__Impl ;
    public final void rule__RequiredProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1232:1: ( rule__RequiredProperties__Group__4__Impl )
            // InternalDraft7.g:1233:2: rule__RequiredProperties__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredProperties__Group__4__Impl();

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
    // $ANTLR end "rule__RequiredProperties__Group__4"


    // $ANTLR start "rule__RequiredProperties__Group__4__Impl"
    // InternalDraft7.g:1239:1: rule__RequiredProperties__Group__4__Impl : ( ']' ) ;
    public final void rule__RequiredProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1243:1: ( ( ']' ) )
            // InternalDraft7.g:1244:1: ( ']' )
            {
            // InternalDraft7.g:1244:1: ( ']' )
            // InternalDraft7.g:1245:2: ']'
            {
             before(grammarAccess.getRequiredPropertiesAccess().getRightSquareBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRequiredPropertiesAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__RequiredProperties__Group__4__Impl"


    // $ANTLR start "rule__Properties__Group__0"
    // InternalDraft7.g:1255:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1259:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // InternalDraft7.g:1260:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__1();

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
    // $ANTLR end "rule__Properties__Group__0"


    // $ANTLR start "rule__Properties__Group__0__Impl"
    // InternalDraft7.g:1267:1: rule__Properties__Group__0__Impl : ( () ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1271:1: ( ( () ) )
            // InternalDraft7.g:1272:1: ( () )
            {
            // InternalDraft7.g:1272:1: ( () )
            // InternalDraft7.g:1273:2: ()
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAction_0()); 
            // InternalDraft7.g:1274:2: ()
            // InternalDraft7.g:1274:3: 
            {
            }

             after(grammarAccess.getPropertiesAccess().getPropertiesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0__Impl"


    // $ANTLR start "rule__Properties__Group__1"
    // InternalDraft7.g:1282:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl rule__Properties__Group__2 ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1286:1: ( rule__Properties__Group__1__Impl rule__Properties__Group__2 )
            // InternalDraft7.g:1287:2: rule__Properties__Group__1__Impl rule__Properties__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Properties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__2();

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
    // $ANTLR end "rule__Properties__Group__1"


    // $ANTLR start "rule__Properties__Group__1__Impl"
    // InternalDraft7.g:1294:1: rule__Properties__Group__1__Impl : ( '\"properties\"' ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1298:1: ( ( '\"properties\"' ) )
            // InternalDraft7.g:1299:1: ( '\"properties\"' )
            {
            // InternalDraft7.g:1299:1: ( '\"properties\"' )
            // InternalDraft7.g:1300:2: '\"properties\"'
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getPropertiesKeyword_1()); 

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
    // $ANTLR end "rule__Properties__Group__1__Impl"


    // $ANTLR start "rule__Properties__Group__2"
    // InternalDraft7.g:1309:1: rule__Properties__Group__2 : rule__Properties__Group__2__Impl rule__Properties__Group__3 ;
    public final void rule__Properties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1313:1: ( rule__Properties__Group__2__Impl rule__Properties__Group__3 )
            // InternalDraft7.g:1314:2: rule__Properties__Group__2__Impl rule__Properties__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Properties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__3();

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
    // $ANTLR end "rule__Properties__Group__2"


    // $ANTLR start "rule__Properties__Group__2__Impl"
    // InternalDraft7.g:1321:1: rule__Properties__Group__2__Impl : ( ':' ) ;
    public final void rule__Properties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1325:1: ( ( ':' ) )
            // InternalDraft7.g:1326:1: ( ':' )
            {
            // InternalDraft7.g:1326:1: ( ':' )
            // InternalDraft7.g:1327:2: ':'
            {
             before(grammarAccess.getPropertiesAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Properties__Group__2__Impl"


    // $ANTLR start "rule__Properties__Group__3"
    // InternalDraft7.g:1336:1: rule__Properties__Group__3 : rule__Properties__Group__3__Impl rule__Properties__Group__4 ;
    public final void rule__Properties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1340:1: ( rule__Properties__Group__3__Impl rule__Properties__Group__4 )
            // InternalDraft7.g:1341:2: rule__Properties__Group__3__Impl rule__Properties__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Properties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__4();

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
    // $ANTLR end "rule__Properties__Group__3"


    // $ANTLR start "rule__Properties__Group__3__Impl"
    // InternalDraft7.g:1348:1: rule__Properties__Group__3__Impl : ( '{' ) ;
    public final void rule__Properties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1352:1: ( ( '{' ) )
            // InternalDraft7.g:1353:1: ( '{' )
            {
            // InternalDraft7.g:1353:1: ( '{' )
            // InternalDraft7.g:1354:2: '{'
            {
             before(grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Properties__Group__3__Impl"


    // $ANTLR start "rule__Properties__Group__4"
    // InternalDraft7.g:1363:1: rule__Properties__Group__4 : rule__Properties__Group__4__Impl rule__Properties__Group__5 ;
    public final void rule__Properties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1367:1: ( rule__Properties__Group__4__Impl rule__Properties__Group__5 )
            // InternalDraft7.g:1368:2: rule__Properties__Group__4__Impl rule__Properties__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Properties__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__5();

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
    // $ANTLR end "rule__Properties__Group__4"


    // $ANTLR start "rule__Properties__Group__4__Impl"
    // InternalDraft7.g:1375:1: rule__Properties__Group__4__Impl : ( ( rule__Properties__PropertiesAssignment_4 )* ) ;
    public final void rule__Properties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1379:1: ( ( ( rule__Properties__PropertiesAssignment_4 )* ) )
            // InternalDraft7.g:1380:1: ( ( rule__Properties__PropertiesAssignment_4 )* )
            {
            // InternalDraft7.g:1380:1: ( ( rule__Properties__PropertiesAssignment_4 )* )
            // InternalDraft7.g:1381:2: ( rule__Properties__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAssignment_4()); 
            // InternalDraft7.g:1382:2: ( rule__Properties__PropertiesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_JSON_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDraft7.g:1382:3: rule__Properties__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Properties__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPropertiesAccess().getPropertiesAssignment_4()); 

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
    // $ANTLR end "rule__Properties__Group__4__Impl"


    // $ANTLR start "rule__Properties__Group__5"
    // InternalDraft7.g:1390:1: rule__Properties__Group__5 : rule__Properties__Group__5__Impl ;
    public final void rule__Properties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1394:1: ( rule__Properties__Group__5__Impl )
            // InternalDraft7.g:1395:2: rule__Properties__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__5__Impl();

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
    // $ANTLR end "rule__Properties__Group__5"


    // $ANTLR start "rule__Properties__Group__5__Impl"
    // InternalDraft7.g:1401:1: rule__Properties__Group__5__Impl : ( '}' ) ;
    public final void rule__Properties__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1405:1: ( ( '}' ) )
            // InternalDraft7.g:1406:1: ( '}' )
            {
            // InternalDraft7.g:1406:1: ( '}' )
            // InternalDraft7.g:1407:2: '}'
            {
             before(grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Properties__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalDraft7.g:1417:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1421:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDraft7.g:1422:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalDraft7.g:1429:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1433:1: ( ( () ) )
            // InternalDraft7.g:1434:1: ( () )
            {
            // InternalDraft7.g:1434:1: ( () )
            // InternalDraft7.g:1435:2: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // InternalDraft7.g:1436:2: ()
            // InternalDraft7.g:1436:3: 
            {
            }

             after(grammarAccess.getPropertyAccess().getPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalDraft7.g:1444:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1448:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalDraft7.g:1449:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalDraft7.g:1456:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1460:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalDraft7.g:1461:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalDraft7.g:1461:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalDraft7.g:1462:2: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // InternalDraft7.g:1463:2: ( rule__Property__NameAssignment_1 )
            // InternalDraft7.g:1463:3: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalDraft7.g:1471:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1475:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalDraft7.g:1476:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalDraft7.g:1483:1: rule__Property__Group__2__Impl : ( ':' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1487:1: ( ( ':' ) )
            // InternalDraft7.g:1488:1: ( ':' )
            {
            // InternalDraft7.g:1488:1: ( ':' )
            // InternalDraft7.g:1489:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalDraft7.g:1498:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1502:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalDraft7.g:1503:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

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
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalDraft7.g:1510:1: rule__Property__Group__3__Impl : ( '{' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1514:1: ( ( '{' ) )
            // InternalDraft7.g:1515:1: ( '{' )
            {
            // InternalDraft7.g:1515:1: ( '{' )
            // InternalDraft7.g:1516:2: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalDraft7.g:1525:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1529:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalDraft7.g:1530:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__5();

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
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalDraft7.g:1537:1: rule__Property__Group__4__Impl : ( ( rule__Property__PropertiesAssignment_4 )* ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1541:1: ( ( ( rule__Property__PropertiesAssignment_4 )* ) )
            // InternalDraft7.g:1542:1: ( ( rule__Property__PropertiesAssignment_4 )* )
            {
            // InternalDraft7.g:1542:1: ( ( rule__Property__PropertiesAssignment_4 )* )
            // InternalDraft7.g:1543:2: ( rule__Property__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getPropertyAccess().getPropertiesAssignment_4()); 
            // InternalDraft7.g:1544:2: ( rule__Property__PropertiesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23||(LA11_0>=27 && LA11_0<=35)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDraft7.g:1544:3: rule__Property__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Property__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getPropertiesAssignment_4()); 

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
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // InternalDraft7.g:1552:1: rule__Property__Group__5 : rule__Property__Group__5__Impl ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1556:1: ( rule__Property__Group__5__Impl )
            // InternalDraft7.g:1557:2: rule__Property__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__5__Impl();

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
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // InternalDraft7.g:1563:1: rule__Property__Group__5__Impl : ( '}' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1567:1: ( ( '}' ) )
            // InternalDraft7.g:1568:1: ( '}' )
            {
            // InternalDraft7.g:1568:1: ( '}' )
            // InternalDraft7.g:1569:2: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Length__Group__0"
    // InternalDraft7.g:1579:1: rule__Length__Group__0 : rule__Length__Group__0__Impl rule__Length__Group__1 ;
    public final void rule__Length__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1583:1: ( rule__Length__Group__0__Impl rule__Length__Group__1 )
            // InternalDraft7.g:1584:2: rule__Length__Group__0__Impl rule__Length__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDraft7.g:1591:1: rule__Length__Group__0__Impl : ( '\"length\"' ) ;
    public final void rule__Length__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1595:1: ( ( '\"length\"' ) )
            // InternalDraft7.g:1596:1: ( '\"length\"' )
            {
            // InternalDraft7.g:1596:1: ( '\"length\"' )
            // InternalDraft7.g:1597:2: '\"length\"'
            {
             before(grammarAccess.getLengthAccess().getLengthKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDraft7.g:1606:1: rule__Length__Group__1 : rule__Length__Group__1__Impl rule__Length__Group__2 ;
    public final void rule__Length__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1610:1: ( rule__Length__Group__1__Impl rule__Length__Group__2 )
            // InternalDraft7.g:1611:2: rule__Length__Group__1__Impl rule__Length__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Length__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Length__Group__2();

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
    // InternalDraft7.g:1618:1: rule__Length__Group__1__Impl : ( ':' ) ;
    public final void rule__Length__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1622:1: ( ( ':' ) )
            // InternalDraft7.g:1623:1: ( ':' )
            {
            // InternalDraft7.g:1623:1: ( ':' )
            // InternalDraft7.g:1624:2: ':'
            {
             before(grammarAccess.getLengthAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLengthAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__Length__Group__2"
    // InternalDraft7.g:1633:1: rule__Length__Group__2 : rule__Length__Group__2__Impl ;
    public final void rule__Length__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1637:1: ( rule__Length__Group__2__Impl )
            // InternalDraft7.g:1638:2: rule__Length__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Length__Group__2__Impl();

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
    // $ANTLR end "rule__Length__Group__2"


    // $ANTLR start "rule__Length__Group__2__Impl"
    // InternalDraft7.g:1644:1: rule__Length__Group__2__Impl : ( ( rule__Length__LengthAssignment_2 ) ) ;
    public final void rule__Length__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1648:1: ( ( ( rule__Length__LengthAssignment_2 ) ) )
            // InternalDraft7.g:1649:1: ( ( rule__Length__LengthAssignment_2 ) )
            {
            // InternalDraft7.g:1649:1: ( ( rule__Length__LengthAssignment_2 ) )
            // InternalDraft7.g:1650:2: ( rule__Length__LengthAssignment_2 )
            {
             before(grammarAccess.getLengthAccess().getLengthAssignment_2()); 
            // InternalDraft7.g:1651:2: ( rule__Length__LengthAssignment_2 )
            // InternalDraft7.g:1651:3: rule__Length__LengthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Length__LengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLengthAccess().getLengthAssignment_2()); 

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
    // $ANTLR end "rule__Length__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalDraft7.g:1660:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1664:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalDraft7.g:1665:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

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
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalDraft7.g:1672:1: rule__Pattern__Group__0__Impl : ( '\"pattern\"' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1676:1: ( ( '\"pattern\"' ) )
            // InternalDraft7.g:1677:1: ( '\"pattern\"' )
            {
            // InternalDraft7.g:1677:1: ( '\"pattern\"' )
            // InternalDraft7.g:1678:2: '\"pattern\"'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_0()); 

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
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalDraft7.g:1687:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1691:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalDraft7.g:1692:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

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
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalDraft7.g:1699:1: rule__Pattern__Group__1__Impl : ( ':' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1703:1: ( ( ':' ) )
            // InternalDraft7.g:1704:1: ( ':' )
            {
            // InternalDraft7.g:1704:1: ( ':' )
            // InternalDraft7.g:1705:2: ':'
            {
             before(grammarAccess.getPatternAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalDraft7.g:1714:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1718:1: ( rule__Pattern__Group__2__Impl )
            // InternalDraft7.g:1719:2: rule__Pattern__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2__Impl();

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
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalDraft7.g:1725:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__PatternAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1729:1: ( ( ( rule__Pattern__PatternAssignment_2 ) ) )
            // InternalDraft7.g:1730:1: ( ( rule__Pattern__PatternAssignment_2 ) )
            {
            // InternalDraft7.g:1730:1: ( ( rule__Pattern__PatternAssignment_2 ) )
            // InternalDraft7.g:1731:2: ( rule__Pattern__PatternAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getPatternAssignment_2()); 
            // InternalDraft7.g:1732:2: ( rule__Pattern__PatternAssignment_2 )
            // InternalDraft7.g:1732:3: rule__Pattern__PatternAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__PatternAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getPatternAssignment_2()); 

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
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Multiples__Group__0"
    // InternalDraft7.g:1741:1: rule__Multiples__Group__0 : rule__Multiples__Group__0__Impl rule__Multiples__Group__1 ;
    public final void rule__Multiples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1745:1: ( rule__Multiples__Group__0__Impl rule__Multiples__Group__1 )
            // InternalDraft7.g:1746:2: rule__Multiples__Group__0__Impl rule__Multiples__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDraft7.g:1753:1: rule__Multiples__Group__0__Impl : ( '\"multiples\"' ) ;
    public final void rule__Multiples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1757:1: ( ( '\"multiples\"' ) )
            // InternalDraft7.g:1758:1: ( '\"multiples\"' )
            {
            // InternalDraft7.g:1758:1: ( '\"multiples\"' )
            // InternalDraft7.g:1759:2: '\"multiples\"'
            {
             before(grammarAccess.getMultiplesAccess().getMultiplesKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDraft7.g:1768:1: rule__Multiples__Group__1 : rule__Multiples__Group__1__Impl rule__Multiples__Group__2 ;
    public final void rule__Multiples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1772:1: ( rule__Multiples__Group__1__Impl rule__Multiples__Group__2 )
            // InternalDraft7.g:1773:2: rule__Multiples__Group__1__Impl rule__Multiples__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Multiples__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiples__Group__2();

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
    // InternalDraft7.g:1780:1: rule__Multiples__Group__1__Impl : ( ':' ) ;
    public final void rule__Multiples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1784:1: ( ( ':' ) )
            // InternalDraft7.g:1785:1: ( ':' )
            {
            // InternalDraft7.g:1785:1: ( ':' )
            // InternalDraft7.g:1786:2: ':'
            {
             before(grammarAccess.getMultiplesAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMultiplesAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__Multiples__Group__2"
    // InternalDraft7.g:1795:1: rule__Multiples__Group__2 : rule__Multiples__Group__2__Impl ;
    public final void rule__Multiples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1799:1: ( rule__Multiples__Group__2__Impl )
            // InternalDraft7.g:1800:2: rule__Multiples__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiples__Group__2__Impl();

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
    // $ANTLR end "rule__Multiples__Group__2"


    // $ANTLR start "rule__Multiples__Group__2__Impl"
    // InternalDraft7.g:1806:1: rule__Multiples__Group__2__Impl : ( ( rule__Multiples__MultipleOfAssignment_2 ) ) ;
    public final void rule__Multiples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1810:1: ( ( ( rule__Multiples__MultipleOfAssignment_2 ) ) )
            // InternalDraft7.g:1811:1: ( ( rule__Multiples__MultipleOfAssignment_2 ) )
            {
            // InternalDraft7.g:1811:1: ( ( rule__Multiples__MultipleOfAssignment_2 ) )
            // InternalDraft7.g:1812:2: ( rule__Multiples__MultipleOfAssignment_2 )
            {
             before(grammarAccess.getMultiplesAccess().getMultipleOfAssignment_2()); 
            // InternalDraft7.g:1813:2: ( rule__Multiples__MultipleOfAssignment_2 )
            // InternalDraft7.g:1813:3: rule__Multiples__MultipleOfAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiples__MultipleOfAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplesAccess().getMultipleOfAssignment_2()); 

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
    // $ANTLR end "rule__Multiples__Group__2__Impl"


    // $ANTLR start "rule__Minimum__Group__0"
    // InternalDraft7.g:1822:1: rule__Minimum__Group__0 : rule__Minimum__Group__0__Impl rule__Minimum__Group__1 ;
    public final void rule__Minimum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1826:1: ( rule__Minimum__Group__0__Impl rule__Minimum__Group__1 )
            // InternalDraft7.g:1827:2: rule__Minimum__Group__0__Impl rule__Minimum__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDraft7.g:1834:1: rule__Minimum__Group__0__Impl : ( '\"minimum\"' ) ;
    public final void rule__Minimum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1838:1: ( ( '\"minimum\"' ) )
            // InternalDraft7.g:1839:1: ( '\"minimum\"' )
            {
            // InternalDraft7.g:1839:1: ( '\"minimum\"' )
            // InternalDraft7.g:1840:2: '\"minimum\"'
            {
             before(grammarAccess.getMinimumAccess().getMinimumKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDraft7.g:1849:1: rule__Minimum__Group__1 : rule__Minimum__Group__1__Impl rule__Minimum__Group__2 ;
    public final void rule__Minimum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1853:1: ( rule__Minimum__Group__1__Impl rule__Minimum__Group__2 )
            // InternalDraft7.g:1854:2: rule__Minimum__Group__1__Impl rule__Minimum__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Minimum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Minimum__Group__2();

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
    // InternalDraft7.g:1861:1: rule__Minimum__Group__1__Impl : ( ':' ) ;
    public final void rule__Minimum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1865:1: ( ( ':' ) )
            // InternalDraft7.g:1866:1: ( ':' )
            {
            // InternalDraft7.g:1866:1: ( ':' )
            // InternalDraft7.g:1867:2: ':'
            {
             before(grammarAccess.getMinimumAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMinimumAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__Minimum__Group__2"
    // InternalDraft7.g:1876:1: rule__Minimum__Group__2 : rule__Minimum__Group__2__Impl ;
    public final void rule__Minimum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1880:1: ( rule__Minimum__Group__2__Impl )
            // InternalDraft7.g:1881:2: rule__Minimum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minimum__Group__2__Impl();

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
    // $ANTLR end "rule__Minimum__Group__2"


    // $ANTLR start "rule__Minimum__Group__2__Impl"
    // InternalDraft7.g:1887:1: rule__Minimum__Group__2__Impl : ( ( rule__Minimum__MinimumAssignment_2 ) ) ;
    public final void rule__Minimum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1891:1: ( ( ( rule__Minimum__MinimumAssignment_2 ) ) )
            // InternalDraft7.g:1892:1: ( ( rule__Minimum__MinimumAssignment_2 ) )
            {
            // InternalDraft7.g:1892:1: ( ( rule__Minimum__MinimumAssignment_2 ) )
            // InternalDraft7.g:1893:2: ( rule__Minimum__MinimumAssignment_2 )
            {
             before(grammarAccess.getMinimumAccess().getMinimumAssignment_2()); 
            // InternalDraft7.g:1894:2: ( rule__Minimum__MinimumAssignment_2 )
            // InternalDraft7.g:1894:3: rule__Minimum__MinimumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Minimum__MinimumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMinimumAccess().getMinimumAssignment_2()); 

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
    // $ANTLR end "rule__Minimum__Group__2__Impl"


    // $ANTLR start "rule__ExclusiveMinimum__Group__0"
    // InternalDraft7.g:1903:1: rule__ExclusiveMinimum__Group__0 : rule__ExclusiveMinimum__Group__0__Impl rule__ExclusiveMinimum__Group__1 ;
    public final void rule__ExclusiveMinimum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1907:1: ( rule__ExclusiveMinimum__Group__0__Impl rule__ExclusiveMinimum__Group__1 )
            // InternalDraft7.g:1908:2: rule__ExclusiveMinimum__Group__0__Impl rule__ExclusiveMinimum__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDraft7.g:1915:1: rule__ExclusiveMinimum__Group__0__Impl : ( '\"exclusiveMinimum\"' ) ;
    public final void rule__ExclusiveMinimum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1919:1: ( ( '\"exclusiveMinimum\"' ) )
            // InternalDraft7.g:1920:1: ( '\"exclusiveMinimum\"' )
            {
            // InternalDraft7.g:1920:1: ( '\"exclusiveMinimum\"' )
            // InternalDraft7.g:1921:2: '\"exclusiveMinimum\"'
            {
             before(grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDraft7.g:1930:1: rule__ExclusiveMinimum__Group__1 : rule__ExclusiveMinimum__Group__1__Impl rule__ExclusiveMinimum__Group__2 ;
    public final void rule__ExclusiveMinimum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1934:1: ( rule__ExclusiveMinimum__Group__1__Impl rule__ExclusiveMinimum__Group__2 )
            // InternalDraft7.g:1935:2: rule__ExclusiveMinimum__Group__1__Impl rule__ExclusiveMinimum__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ExclusiveMinimum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimum__Group__2();

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
    // InternalDraft7.g:1942:1: rule__ExclusiveMinimum__Group__1__Impl : ( ':' ) ;
    public final void rule__ExclusiveMinimum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1946:1: ( ( ':' ) )
            // InternalDraft7.g:1947:1: ( ':' )
            {
            // InternalDraft7.g:1947:1: ( ':' )
            // InternalDraft7.g:1948:2: ':'
            {
             before(grammarAccess.getExclusiveMinimumAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExclusiveMinimumAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__ExclusiveMinimum__Group__2"
    // InternalDraft7.g:1957:1: rule__ExclusiveMinimum__Group__2 : rule__ExclusiveMinimum__Group__2__Impl ;
    public final void rule__ExclusiveMinimum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1961:1: ( rule__ExclusiveMinimum__Group__2__Impl )
            // InternalDraft7.g:1962:2: rule__ExclusiveMinimum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimum__Group__2__Impl();

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
    // $ANTLR end "rule__ExclusiveMinimum__Group__2"


    // $ANTLR start "rule__ExclusiveMinimum__Group__2__Impl"
    // InternalDraft7.g:1968:1: rule__ExclusiveMinimum__Group__2__Impl : ( ( rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2 ) ) ;
    public final void rule__ExclusiveMinimum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1972:1: ( ( ( rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2 ) ) )
            // InternalDraft7.g:1973:1: ( ( rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2 ) )
            {
            // InternalDraft7.g:1973:1: ( ( rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2 ) )
            // InternalDraft7.g:1974:2: ( rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2 )
            {
             before(grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumAssignment_2()); 
            // InternalDraft7.g:1975:2: ( rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2 )
            // InternalDraft7.g:1975:3: rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumAssignment_2()); 

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
    // $ANTLR end "rule__ExclusiveMinimum__Group__2__Impl"


    // $ANTLR start "rule__Maximum__Group__0"
    // InternalDraft7.g:1984:1: rule__Maximum__Group__0 : rule__Maximum__Group__0__Impl rule__Maximum__Group__1 ;
    public final void rule__Maximum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:1988:1: ( rule__Maximum__Group__0__Impl rule__Maximum__Group__1 )
            // InternalDraft7.g:1989:2: rule__Maximum__Group__0__Impl rule__Maximum__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDraft7.g:1996:1: rule__Maximum__Group__0__Impl : ( '\"maximum\"' ) ;
    public final void rule__Maximum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2000:1: ( ( '\"maximum\"' ) )
            // InternalDraft7.g:2001:1: ( '\"maximum\"' )
            {
            // InternalDraft7.g:2001:1: ( '\"maximum\"' )
            // InternalDraft7.g:2002:2: '\"maximum\"'
            {
             before(grammarAccess.getMaximumAccess().getMaximumKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDraft7.g:2011:1: rule__Maximum__Group__1 : rule__Maximum__Group__1__Impl rule__Maximum__Group__2 ;
    public final void rule__Maximum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2015:1: ( rule__Maximum__Group__1__Impl rule__Maximum__Group__2 )
            // InternalDraft7.g:2016:2: rule__Maximum__Group__1__Impl rule__Maximum__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Maximum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maximum__Group__2();

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
    // InternalDraft7.g:2023:1: rule__Maximum__Group__1__Impl : ( ':' ) ;
    public final void rule__Maximum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2027:1: ( ( ':' ) )
            // InternalDraft7.g:2028:1: ( ':' )
            {
            // InternalDraft7.g:2028:1: ( ':' )
            // InternalDraft7.g:2029:2: ':'
            {
             before(grammarAccess.getMaximumAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMaximumAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__Maximum__Group__2"
    // InternalDraft7.g:2038:1: rule__Maximum__Group__2 : rule__Maximum__Group__2__Impl ;
    public final void rule__Maximum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2042:1: ( rule__Maximum__Group__2__Impl )
            // InternalDraft7.g:2043:2: rule__Maximum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Maximum__Group__2__Impl();

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
    // $ANTLR end "rule__Maximum__Group__2"


    // $ANTLR start "rule__Maximum__Group__2__Impl"
    // InternalDraft7.g:2049:1: rule__Maximum__Group__2__Impl : ( ( rule__Maximum__MaximumAssignment_2 ) ) ;
    public final void rule__Maximum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2053:1: ( ( ( rule__Maximum__MaximumAssignment_2 ) ) )
            // InternalDraft7.g:2054:1: ( ( rule__Maximum__MaximumAssignment_2 ) )
            {
            // InternalDraft7.g:2054:1: ( ( rule__Maximum__MaximumAssignment_2 ) )
            // InternalDraft7.g:2055:2: ( rule__Maximum__MaximumAssignment_2 )
            {
             before(grammarAccess.getMaximumAccess().getMaximumAssignment_2()); 
            // InternalDraft7.g:2056:2: ( rule__Maximum__MaximumAssignment_2 )
            // InternalDraft7.g:2056:3: rule__Maximum__MaximumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Maximum__MaximumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaximumAccess().getMaximumAssignment_2()); 

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
    // $ANTLR end "rule__Maximum__Group__2__Impl"


    // $ANTLR start "rule__ExclusiveMaximum__Group__0"
    // InternalDraft7.g:2065:1: rule__ExclusiveMaximum__Group__0 : rule__ExclusiveMaximum__Group__0__Impl rule__ExclusiveMaximum__Group__1 ;
    public final void rule__ExclusiveMaximum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2069:1: ( rule__ExclusiveMaximum__Group__0__Impl rule__ExclusiveMaximum__Group__1 )
            // InternalDraft7.g:2070:2: rule__ExclusiveMaximum__Group__0__Impl rule__ExclusiveMaximum__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDraft7.g:2077:1: rule__ExclusiveMaximum__Group__0__Impl : ( '\"exclusiveMaximum\"' ) ;
    public final void rule__ExclusiveMaximum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2081:1: ( ( '\"exclusiveMaximum\"' ) )
            // InternalDraft7.g:2082:1: ( '\"exclusiveMaximum\"' )
            {
            // InternalDraft7.g:2082:1: ( '\"exclusiveMaximum\"' )
            // InternalDraft7.g:2083:2: '\"exclusiveMaximum\"'
            {
             before(grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDraft7.g:2092:1: rule__ExclusiveMaximum__Group__1 : rule__ExclusiveMaximum__Group__1__Impl rule__ExclusiveMaximum__Group__2 ;
    public final void rule__ExclusiveMaximum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2096:1: ( rule__ExclusiveMaximum__Group__1__Impl rule__ExclusiveMaximum__Group__2 )
            // InternalDraft7.g:2097:2: rule__ExclusiveMaximum__Group__1__Impl rule__ExclusiveMaximum__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ExclusiveMaximum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximum__Group__2();

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
    // InternalDraft7.g:2104:1: rule__ExclusiveMaximum__Group__1__Impl : ( ':' ) ;
    public final void rule__ExclusiveMaximum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2108:1: ( ( ':' ) )
            // InternalDraft7.g:2109:1: ( ':' )
            {
            // InternalDraft7.g:2109:1: ( ':' )
            // InternalDraft7.g:2110:2: ':'
            {
             before(grammarAccess.getExclusiveMaximumAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExclusiveMaximumAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__ExclusiveMaximum__Group__2"
    // InternalDraft7.g:2119:1: rule__ExclusiveMaximum__Group__2 : rule__ExclusiveMaximum__Group__2__Impl ;
    public final void rule__ExclusiveMaximum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2123:1: ( rule__ExclusiveMaximum__Group__2__Impl )
            // InternalDraft7.g:2124:2: rule__ExclusiveMaximum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximum__Group__2__Impl();

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
    // $ANTLR end "rule__ExclusiveMaximum__Group__2"


    // $ANTLR start "rule__ExclusiveMaximum__Group__2__Impl"
    // InternalDraft7.g:2130:1: rule__ExclusiveMaximum__Group__2__Impl : ( ( rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2 ) ) ;
    public final void rule__ExclusiveMaximum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2134:1: ( ( ( rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2 ) ) )
            // InternalDraft7.g:2135:1: ( ( rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2 ) )
            {
            // InternalDraft7.g:2135:1: ( ( rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2 ) )
            // InternalDraft7.g:2136:2: ( rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2 )
            {
             before(grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumAssignment_2()); 
            // InternalDraft7.g:2137:2: ( rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2 )
            // InternalDraft7.g:2137:3: rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumAssignment_2()); 

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
    // $ANTLR end "rule__ExclusiveMaximum__Group__2__Impl"


    // $ANTLR start "rule__Model__RootAssignment_2_0"
    // InternalDraft7.g:2146:1: rule__Model__RootAssignment_2_0 : ( ruleJsonSchemaRoot ) ;
    public final void rule__Model__RootAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2150:1: ( ( ruleJsonSchemaRoot ) )
            // InternalDraft7.g:2151:2: ( ruleJsonSchemaRoot )
            {
            // InternalDraft7.g:2151:2: ( ruleJsonSchemaRoot )
            // InternalDraft7.g:2152:3: ruleJsonSchemaRoot
            {
             before(grammarAccess.getModelAccess().getRootJsonSchemaRootParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonSchemaRoot();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRootJsonSchemaRootParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Model__RootAssignment_2_0"


    // $ANTLR start "rule__JsonSchemaRoot__TypeAssignment_0"
    // InternalDraft7.g:2161:1: rule__JsonSchemaRoot__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__JsonSchemaRoot__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2165:1: ( ( ruleType ) )
            // InternalDraft7.g:2166:2: ( ruleType )
            {
            // InternalDraft7.g:2166:2: ( ruleType )
            // InternalDraft7.g:2167:3: ruleType
            {
             before(grammarAccess.getJsonSchemaRootAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getJsonSchemaRootAccess().getTypeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__JsonSchemaRoot__TypeAssignment_0"


    // $ANTLR start "rule__NumberProperties__MinimumAssignment_1"
    // InternalDraft7.g:2176:1: rule__NumberProperties__MinimumAssignment_1 : ( ruleMinimum ) ;
    public final void rule__NumberProperties__MinimumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2180:1: ( ( ruleMinimum ) )
            // InternalDraft7.g:2181:2: ( ruleMinimum )
            {
            // InternalDraft7.g:2181:2: ( ruleMinimum )
            // InternalDraft7.g:2182:3: ruleMinimum
            {
             before(grammarAccess.getNumberPropertiesAccess().getMinimumMinimumParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMinimum();

            state._fsp--;

             after(grammarAccess.getNumberPropertiesAccess().getMinimumMinimumParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumberProperties__MinimumAssignment_1"


    // $ANTLR start "rule__NumberProperties__ExclusiveMinimumAssignment_2"
    // InternalDraft7.g:2191:1: rule__NumberProperties__ExclusiveMinimumAssignment_2 : ( ruleExclusiveMinimum ) ;
    public final void rule__NumberProperties__ExclusiveMinimumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2195:1: ( ( ruleExclusiveMinimum ) )
            // InternalDraft7.g:2196:2: ( ruleExclusiveMinimum )
            {
            // InternalDraft7.g:2196:2: ( ruleExclusiveMinimum )
            // InternalDraft7.g:2197:3: ruleExclusiveMinimum
            {
             before(grammarAccess.getNumberPropertiesAccess().getExclusiveMinimumExclusiveMinimumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExclusiveMinimum();

            state._fsp--;

             after(grammarAccess.getNumberPropertiesAccess().getExclusiveMinimumExclusiveMinimumParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NumberProperties__ExclusiveMinimumAssignment_2"


    // $ANTLR start "rule__NumberProperties__MaximumAssignment_3"
    // InternalDraft7.g:2206:1: rule__NumberProperties__MaximumAssignment_3 : ( ruleMaximum ) ;
    public final void rule__NumberProperties__MaximumAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2210:1: ( ( ruleMaximum ) )
            // InternalDraft7.g:2211:2: ( ruleMaximum )
            {
            // InternalDraft7.g:2211:2: ( ruleMaximum )
            // InternalDraft7.g:2212:3: ruleMaximum
            {
             before(grammarAccess.getNumberPropertiesAccess().getMaximumMaximumParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMaximum();

            state._fsp--;

             after(grammarAccess.getNumberPropertiesAccess().getMaximumMaximumParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__NumberProperties__MaximumAssignment_3"


    // $ANTLR start "rule__NumberProperties__ExclusiveMaximumAssignment_4"
    // InternalDraft7.g:2221:1: rule__NumberProperties__ExclusiveMaximumAssignment_4 : ( ruleExclusiveMaximum ) ;
    public final void rule__NumberProperties__ExclusiveMaximumAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2225:1: ( ( ruleExclusiveMaximum ) )
            // InternalDraft7.g:2226:2: ( ruleExclusiveMaximum )
            {
            // InternalDraft7.g:2226:2: ( ruleExclusiveMaximum )
            // InternalDraft7.g:2227:3: ruleExclusiveMaximum
            {
             before(grammarAccess.getNumberPropertiesAccess().getExclusiveMaximumExclusiveMaximumParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExclusiveMaximum();

            state._fsp--;

             after(grammarAccess.getNumberPropertiesAccess().getExclusiveMaximumExclusiveMaximumParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__NumberProperties__ExclusiveMaximumAssignment_4"


    // $ANTLR start "rule__Type__TypesAssignment_2_0_1_0"
    // InternalDraft7.g:2236:1: rule__Type__TypesAssignment_2_0_1_0 : ( ruleJsonTypes ) ;
    public final void rule__Type__TypesAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2240:1: ( ( ruleJsonTypes ) )
            // InternalDraft7.g:2241:2: ( ruleJsonTypes )
            {
            // InternalDraft7.g:2241:2: ( ruleJsonTypes )
            // InternalDraft7.g:2242:3: ruleJsonTypes
            {
             before(grammarAccess.getTypeAccess().getTypesJsonTypesParserRuleCall_2_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonTypes();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypesJsonTypesParserRuleCall_2_0_1_0_0()); 

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
    // $ANTLR end "rule__Type__TypesAssignment_2_0_1_0"


    // $ANTLR start "rule__Type__TypesAssignment_2_0_1_1_1"
    // InternalDraft7.g:2251:1: rule__Type__TypesAssignment_2_0_1_1_1 : ( ruleJsonTypes ) ;
    public final void rule__Type__TypesAssignment_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2255:1: ( ( ruleJsonTypes ) )
            // InternalDraft7.g:2256:2: ( ruleJsonTypes )
            {
            // InternalDraft7.g:2256:2: ( ruleJsonTypes )
            // InternalDraft7.g:2257:3: ruleJsonTypes
            {
             before(grammarAccess.getTypeAccess().getTypesJsonTypesParserRuleCall_2_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonTypes();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypesJsonTypesParserRuleCall_2_0_1_1_1_0()); 

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
    // $ANTLR end "rule__Type__TypesAssignment_2_0_1_1_1"


    // $ANTLR start "rule__Type__TypeAssignment_2_1"
    // InternalDraft7.g:2266:1: rule__Type__TypeAssignment_2_1 : ( ruleJsonTypes ) ;
    public final void rule__Type__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2270:1: ( ( ruleJsonTypes ) )
            // InternalDraft7.g:2271:2: ( ruleJsonTypes )
            {
            // InternalDraft7.g:2271:2: ( ruleJsonTypes )
            // InternalDraft7.g:2272:3: ruleJsonTypes
            {
             before(grammarAccess.getTypeAccess().getTypeJsonTypesParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonTypes();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeJsonTypesParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Type__TypeAssignment_2_1"


    // $ANTLR start "rule__ObjectProperties__PropertiesAssignment_0"
    // InternalDraft7.g:2281:1: rule__ObjectProperties__PropertiesAssignment_0 : ( ruleProperties ) ;
    public final void rule__ObjectProperties__PropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2285:1: ( ( ruleProperties ) )
            // InternalDraft7.g:2286:2: ( ruleProperties )
            {
            // InternalDraft7.g:2286:2: ( ruleProperties )
            // InternalDraft7.g:2287:3: ruleProperties
            {
             before(grammarAccess.getObjectPropertiesAccess().getPropertiesPropertiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getObjectPropertiesAccess().getPropertiesPropertiesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjectProperties__PropertiesAssignment_0"


    // $ANTLR start "rule__ObjectProperties__RequiredPropertiesAssignment_1"
    // InternalDraft7.g:2296:1: rule__ObjectProperties__RequiredPropertiesAssignment_1 : ( ruleRequiredProperties ) ;
    public final void rule__ObjectProperties__RequiredPropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2300:1: ( ( ruleRequiredProperties ) )
            // InternalDraft7.g:2301:2: ( ruleRequiredProperties )
            {
            // InternalDraft7.g:2301:2: ( ruleRequiredProperties )
            // InternalDraft7.g:2302:3: ruleRequiredProperties
            {
             before(grammarAccess.getObjectPropertiesAccess().getRequiredPropertiesRequiredPropertiesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredProperties();

            state._fsp--;

             after(grammarAccess.getObjectPropertiesAccess().getRequiredPropertiesRequiredPropertiesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectProperties__RequiredPropertiesAssignment_1"


    // $ANTLR start "rule__RequiredProperties__RequiredPropertiesAssignment_3"
    // InternalDraft7.g:2311:1: rule__RequiredProperties__RequiredPropertiesAssignment_3 : ( ruleRequiredPropertiesName ) ;
    public final void rule__RequiredProperties__RequiredPropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2315:1: ( ( ruleRequiredPropertiesName ) )
            // InternalDraft7.g:2316:2: ( ruleRequiredPropertiesName )
            {
            // InternalDraft7.g:2316:2: ( ruleRequiredPropertiesName )
            // InternalDraft7.g:2317:3: ruleRequiredPropertiesName
            {
             before(grammarAccess.getRequiredPropertiesAccess().getRequiredPropertiesRequiredPropertiesNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredPropertiesName();

            state._fsp--;

             after(grammarAccess.getRequiredPropertiesAccess().getRequiredPropertiesRequiredPropertiesNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RequiredProperties__RequiredPropertiesAssignment_3"


    // $ANTLR start "rule__RequiredPropertiesName__NameAssignment"
    // InternalDraft7.g:2326:1: rule__RequiredPropertiesName__NameAssignment : ( RULE_JSON_ID ) ;
    public final void rule__RequiredPropertiesName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2330:1: ( ( RULE_JSON_ID ) )
            // InternalDraft7.g:2331:2: ( RULE_JSON_ID )
            {
            // InternalDraft7.g:2331:2: ( RULE_JSON_ID )
            // InternalDraft7.g:2332:3: RULE_JSON_ID
            {
             before(grammarAccess.getRequiredPropertiesNameAccess().getNameJSON_IDTerminalRuleCall_0()); 
            match(input,RULE_JSON_ID,FOLLOW_2); 
             after(grammarAccess.getRequiredPropertiesNameAccess().getNameJSON_IDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__RequiredPropertiesName__NameAssignment"


    // $ANTLR start "rule__Properties__PropertiesAssignment_4"
    // InternalDraft7.g:2341:1: rule__Properties__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Properties__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2345:1: ( ( ruleProperty ) )
            // InternalDraft7.g:2346:2: ( ruleProperty )
            {
            // InternalDraft7.g:2346:2: ( ruleProperty )
            // InternalDraft7.g:2347:3: ruleProperty
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getPropertiesPropertyParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Properties__PropertiesAssignment_4"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalDraft7.g:2356:1: rule__Property__NameAssignment_1 : ( RULE_JSON_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2360:1: ( ( RULE_JSON_ID ) )
            // InternalDraft7.g:2361:2: ( RULE_JSON_ID )
            {
            // InternalDraft7.g:2361:2: ( RULE_JSON_ID )
            // InternalDraft7.g:2362:3: RULE_JSON_ID
            {
             before(grammarAccess.getPropertyAccess().getNameJSON_IDTerminalRuleCall_1_0()); 
            match(input,RULE_JSON_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameJSON_IDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Property__PropertiesAssignment_4"
    // InternalDraft7.g:2371:1: rule__Property__PropertiesAssignment_4 : ( ruleJsonSchemaRoot ) ;
    public final void rule__Property__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2375:1: ( ( ruleJsonSchemaRoot ) )
            // InternalDraft7.g:2376:2: ( ruleJsonSchemaRoot )
            {
            // InternalDraft7.g:2376:2: ( ruleJsonSchemaRoot )
            // InternalDraft7.g:2377:3: ruleJsonSchemaRoot
            {
             before(grammarAccess.getPropertyAccess().getPropertiesJsonSchemaRootParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonSchemaRoot();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPropertiesJsonSchemaRootParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Property__PropertiesAssignment_4"


    // $ANTLR start "rule__StringProperties__LengthAssignment_0"
    // InternalDraft7.g:2386:1: rule__StringProperties__LengthAssignment_0 : ( ruleLength ) ;
    public final void rule__StringProperties__LengthAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2390:1: ( ( ruleLength ) )
            // InternalDraft7.g:2391:2: ( ruleLength )
            {
            // InternalDraft7.g:2391:2: ( ruleLength )
            // InternalDraft7.g:2392:3: ruleLength
            {
             before(grammarAccess.getStringPropertiesAccess().getLengthLengthParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLength();

            state._fsp--;

             after(grammarAccess.getStringPropertiesAccess().getLengthLengthParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__StringProperties__LengthAssignment_0"


    // $ANTLR start "rule__StringProperties__PatternAssignment_1"
    // InternalDraft7.g:2401:1: rule__StringProperties__PatternAssignment_1 : ( rulePattern ) ;
    public final void rule__StringProperties__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2405:1: ( ( rulePattern ) )
            // InternalDraft7.g:2406:2: ( rulePattern )
            {
            // InternalDraft7.g:2406:2: ( rulePattern )
            // InternalDraft7.g:2407:3: rulePattern
            {
             before(grammarAccess.getStringPropertiesAccess().getPatternPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getStringPropertiesAccess().getPatternPatternParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringProperties__PatternAssignment_1"


    // $ANTLR start "rule__Length__LengthAssignment_2"
    // InternalDraft7.g:2416:1: rule__Length__LengthAssignment_2 : ( RULE_INT ) ;
    public final void rule__Length__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2420:1: ( ( RULE_INT ) )
            // InternalDraft7.g:2421:2: ( RULE_INT )
            {
            // InternalDraft7.g:2421:2: ( RULE_INT )
            // InternalDraft7.g:2422:3: RULE_INT
            {
             before(grammarAccess.getLengthAccess().getLengthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLengthAccess().getLengthINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Length__LengthAssignment_2"


    // $ANTLR start "rule__Pattern__PatternAssignment_2"
    // InternalDraft7.g:2431:1: rule__Pattern__PatternAssignment_2 : ( RULE_JSON_STRING ) ;
    public final void rule__Pattern__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2435:1: ( ( RULE_JSON_STRING ) )
            // InternalDraft7.g:2436:2: ( RULE_JSON_STRING )
            {
            // InternalDraft7.g:2436:2: ( RULE_JSON_STRING )
            // InternalDraft7.g:2437:3: RULE_JSON_STRING
            {
             before(grammarAccess.getPatternAccess().getPatternJSON_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_JSON_STRING,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternJSON_STRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Pattern__PatternAssignment_2"


    // $ANTLR start "rule__Multiples__MultipleOfAssignment_2"
    // InternalDraft7.g:2446:1: rule__Multiples__MultipleOfAssignment_2 : ( RULE_INT ) ;
    public final void rule__Multiples__MultipleOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2450:1: ( ( RULE_INT ) )
            // InternalDraft7.g:2451:2: ( RULE_INT )
            {
            // InternalDraft7.g:2451:2: ( RULE_INT )
            // InternalDraft7.g:2452:3: RULE_INT
            {
             before(grammarAccess.getMultiplesAccess().getMultipleOfINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplesAccess().getMultipleOfINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Multiples__MultipleOfAssignment_2"


    // $ANTLR start "rule__Minimum__MinimumAssignment_2"
    // InternalDraft7.g:2461:1: rule__Minimum__MinimumAssignment_2 : ( RULE_INT ) ;
    public final void rule__Minimum__MinimumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2465:1: ( ( RULE_INT ) )
            // InternalDraft7.g:2466:2: ( RULE_INT )
            {
            // InternalDraft7.g:2466:2: ( RULE_INT )
            // InternalDraft7.g:2467:3: RULE_INT
            {
             before(grammarAccess.getMinimumAccess().getMinimumINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMinimumAccess().getMinimumINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Minimum__MinimumAssignment_2"


    // $ANTLR start "rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2"
    // InternalDraft7.g:2476:1: rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2 : ( RULE_INT ) ;
    public final void rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2480:1: ( ( RULE_INT ) )
            // InternalDraft7.g:2481:2: ( RULE_INT )
            {
            // InternalDraft7.g:2481:2: ( RULE_INT )
            // InternalDraft7.g:2482:3: RULE_INT
            {
             before(grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExclusiveMinimumAccess().getExclusiveMinimumINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExclusiveMinimum__ExclusiveMinimumAssignment_2"


    // $ANTLR start "rule__Maximum__MaximumAssignment_2"
    // InternalDraft7.g:2491:1: rule__Maximum__MaximumAssignment_2 : ( RULE_INT ) ;
    public final void rule__Maximum__MaximumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2495:1: ( ( RULE_INT ) )
            // InternalDraft7.g:2496:2: ( RULE_INT )
            {
            // InternalDraft7.g:2496:2: ( RULE_INT )
            // InternalDraft7.g:2497:3: RULE_INT
            {
             before(grammarAccess.getMaximumAccess().getMaximumINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMaximumAccess().getMaximumINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Maximum__MaximumAssignment_2"


    // $ANTLR start "rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2"
    // InternalDraft7.g:2506:1: rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2 : ( RULE_INT ) ;
    public final void rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDraft7.g:2510:1: ( ( RULE_INT ) )
            // InternalDraft7.g:2511:2: ( RULE_INT )
            {
            // InternalDraft7.g:2511:2: ( RULE_INT )
            // InternalDraft7.g:2512:3: RULE_INT
            {
             before(grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExclusiveMaximumAccess().getExclusiveMaximumINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExclusiveMaximum__ExclusiveMaximumAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000FF8A00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000FF8800002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000020FE000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});

}