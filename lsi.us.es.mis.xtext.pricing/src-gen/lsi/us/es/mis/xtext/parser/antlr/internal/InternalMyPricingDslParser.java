package lsi.us.es.mis.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lsi.us.es.mis.xtext.services.MyPricingDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyPricingDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pricing'", "'{'", "'saasName'", "'version'", "'currency'", "'url'", "'createdAt'", "'}'", "'AddOn'", "'description'", "'price'", "'usageLimits'", "'('", "','", "')'", "'availableFor'", "'dependsOn'", "'excludes'", "'features'", "'-'", "'.'", "'E'", "'e'", "'Feature'", "'value'", "'expression'", "'serverExpression'", "'defaultValue'", "'valueType'", "'Plan'", "'Renewable'", "'unit'", "'limit'", "'linkedTo'", "'period'", "'trackable'", "'NonRenewable'", "'Period'", "'NUMERIC'", "'BOOLEAN'", "'TEXT'", "'SEC'", "'MIN'", "'HOUR'", "'DAY'", "'MONTH'", "'YEAR'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyPricingDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyPricingDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyPricingDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyPricingDsl.g"; }



     	private MyPricingDslGrammarAccess grammarAccess;

        public InternalMyPricingDslParser(TokenStream input, MyPricingDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pricing";
       	}

       	@Override
       	protected MyPricingDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePricing"
    // InternalMyPricingDsl.g:65:1: entryRulePricing returns [EObject current=null] : iv_rulePricing= rulePricing EOF ;
    public final EObject entryRulePricing() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePricing = null;


        try {
            // InternalMyPricingDsl.g:65:48: (iv_rulePricing= rulePricing EOF )
            // InternalMyPricingDsl.g:66:2: iv_rulePricing= rulePricing EOF
            {
             newCompositeNode(grammarAccess.getPricingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePricing=rulePricing();

            state._fsp--;

             current =iv_rulePricing; 
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
    // $ANTLR end "entryRulePricing"


    // $ANTLR start "rulePricing"
    // InternalMyPricingDsl.g:72:1: rulePricing returns [EObject current=null] : ( () otherlv_1= 'Pricing' otherlv_2= '{' (otherlv_3= 'saasName' ( (lv_saasName_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'currency' ( (lv_currency_8_0= ruleEString ) ) )? (otherlv_9= 'url' ( (lv_url_10_0= ruleEString ) ) )? (otherlv_11= 'createdAt' ( (lv_createdAt_12_0= ruleEString ) ) )? ( (lv_plans_13_0= rulePlan ) )* ( (lv_addOns_14_0= ruleAddOn ) )* otherlv_15= '}' ) ;
    public final EObject rulePricing() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_saasName_4_0 = null;

        AntlrDatatypeRuleToken lv_version_6_0 = null;

        AntlrDatatypeRuleToken lv_currency_8_0 = null;

        AntlrDatatypeRuleToken lv_url_10_0 = null;

        AntlrDatatypeRuleToken lv_createdAt_12_0 = null;

        EObject lv_plans_13_0 = null;

        EObject lv_addOns_14_0 = null;



        	enterRule();

        try {
            // InternalMyPricingDsl.g:78:2: ( ( () otherlv_1= 'Pricing' otherlv_2= '{' (otherlv_3= 'saasName' ( (lv_saasName_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'currency' ( (lv_currency_8_0= ruleEString ) ) )? (otherlv_9= 'url' ( (lv_url_10_0= ruleEString ) ) )? (otherlv_11= 'createdAt' ( (lv_createdAt_12_0= ruleEString ) ) )? ( (lv_plans_13_0= rulePlan ) )* ( (lv_addOns_14_0= ruleAddOn ) )* otherlv_15= '}' ) )
            // InternalMyPricingDsl.g:79:2: ( () otherlv_1= 'Pricing' otherlv_2= '{' (otherlv_3= 'saasName' ( (lv_saasName_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'currency' ( (lv_currency_8_0= ruleEString ) ) )? (otherlv_9= 'url' ( (lv_url_10_0= ruleEString ) ) )? (otherlv_11= 'createdAt' ( (lv_createdAt_12_0= ruleEString ) ) )? ( (lv_plans_13_0= rulePlan ) )* ( (lv_addOns_14_0= ruleAddOn ) )* otherlv_15= '}' )
            {
            // InternalMyPricingDsl.g:79:2: ( () otherlv_1= 'Pricing' otherlv_2= '{' (otherlv_3= 'saasName' ( (lv_saasName_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'currency' ( (lv_currency_8_0= ruleEString ) ) )? (otherlv_9= 'url' ( (lv_url_10_0= ruleEString ) ) )? (otherlv_11= 'createdAt' ( (lv_createdAt_12_0= ruleEString ) ) )? ( (lv_plans_13_0= rulePlan ) )* ( (lv_addOns_14_0= ruleAddOn ) )* otherlv_15= '}' )
            // InternalMyPricingDsl.g:80:3: () otherlv_1= 'Pricing' otherlv_2= '{' (otherlv_3= 'saasName' ( (lv_saasName_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'currency' ( (lv_currency_8_0= ruleEString ) ) )? (otherlv_9= 'url' ( (lv_url_10_0= ruleEString ) ) )? (otherlv_11= 'createdAt' ( (lv_createdAt_12_0= ruleEString ) ) )? ( (lv_plans_13_0= rulePlan ) )* ( (lv_addOns_14_0= ruleAddOn ) )* otherlv_15= '}'
            {
            // InternalMyPricingDsl.g:80:3: ()
            // InternalMyPricingDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPricingAccess().getPricingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPricingAccess().getPricingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPricingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyPricingDsl.g:95:3: (otherlv_3= 'saasName' ( (lv_saasName_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyPricingDsl.g:96:4: otherlv_3= 'saasName' ( (lv_saasName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPricingAccess().getSaasNameKeyword_3_0());
                    			
                    // InternalMyPricingDsl.g:100:4: ( (lv_saasName_4_0= ruleEString ) )
                    // InternalMyPricingDsl.g:101:5: (lv_saasName_4_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:101:5: (lv_saasName_4_0= ruleEString )
                    // InternalMyPricingDsl.g:102:6: lv_saasName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPricingAccess().getSaasNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_saasName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPricingRule());
                    						}
                    						set(
                    							current,
                    							"saasName",
                    							lv_saasName_4_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:120:3: (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyPricingDsl.g:121:4: otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPricingAccess().getVersionKeyword_4_0());
                    			
                    // InternalMyPricingDsl.g:125:4: ( (lv_version_6_0= ruleEString ) )
                    // InternalMyPricingDsl.g:126:5: (lv_version_6_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:126:5: (lv_version_6_0= ruleEString )
                    // InternalMyPricingDsl.g:127:6: lv_version_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPricingAccess().getVersionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_version_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPricingRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_6_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:145:3: (otherlv_7= 'currency' ( (lv_currency_8_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyPricingDsl.g:146:4: otherlv_7= 'currency' ( (lv_currency_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getPricingAccess().getCurrencyKeyword_5_0());
                    			
                    // InternalMyPricingDsl.g:150:4: ( (lv_currency_8_0= ruleEString ) )
                    // InternalMyPricingDsl.g:151:5: (lv_currency_8_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:151:5: (lv_currency_8_0= ruleEString )
                    // InternalMyPricingDsl.g:152:6: lv_currency_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPricingAccess().getCurrencyEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_currency_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPricingRule());
                    						}
                    						set(
                    							current,
                    							"currency",
                    							lv_currency_8_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:170:3: (otherlv_9= 'url' ( (lv_url_10_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyPricingDsl.g:171:4: otherlv_9= 'url' ( (lv_url_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getPricingAccess().getUrlKeyword_6_0());
                    			
                    // InternalMyPricingDsl.g:175:4: ( (lv_url_10_0= ruleEString ) )
                    // InternalMyPricingDsl.g:176:5: (lv_url_10_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:176:5: (lv_url_10_0= ruleEString )
                    // InternalMyPricingDsl.g:177:6: lv_url_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPricingAccess().getUrlEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_url_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPricingRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_10_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:195:3: (otherlv_11= 'createdAt' ( (lv_createdAt_12_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyPricingDsl.g:196:4: otherlv_11= 'createdAt' ( (lv_createdAt_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getPricingAccess().getCreatedAtKeyword_7_0());
                    			
                    // InternalMyPricingDsl.g:200:4: ( (lv_createdAt_12_0= ruleEString ) )
                    // InternalMyPricingDsl.g:201:5: (lv_createdAt_12_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:201:5: (lv_createdAt_12_0= ruleEString )
                    // InternalMyPricingDsl.g:202:6: lv_createdAt_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPricingAccess().getCreatedAtEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_createdAt_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPricingRule());
                    						}
                    						set(
                    							current,
                    							"createdAt",
                    							lv_createdAt_12_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:220:3: ( (lv_plans_13_0= rulePlan ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==40) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyPricingDsl.g:221:4: (lv_plans_13_0= rulePlan )
            	    {
            	    // InternalMyPricingDsl.g:221:4: (lv_plans_13_0= rulePlan )
            	    // InternalMyPricingDsl.g:222:5: lv_plans_13_0= rulePlan
            	    {

            	    					newCompositeNode(grammarAccess.getPricingAccess().getPlansPlanParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_plans_13_0=rulePlan();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPricingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"plans",
            	    						lv_plans_13_0,
            	    						"lsi.us.es.mis.xtext.MyPricingDsl.Plan");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMyPricingDsl.g:239:3: ( (lv_addOns_14_0= ruleAddOn ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyPricingDsl.g:240:4: (lv_addOns_14_0= ruleAddOn )
            	    {
            	    // InternalMyPricingDsl.g:240:4: (lv_addOns_14_0= ruleAddOn )
            	    // InternalMyPricingDsl.g:241:5: lv_addOns_14_0= ruleAddOn
            	    {

            	    					newCompositeNode(grammarAccess.getPricingAccess().getAddOnsAddOnParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_addOns_14_0=ruleAddOn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPricingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"addOns",
            	    						lv_addOns_14_0,
            	    						"lsi.us.es.mis.xtext.MyPricingDsl.AddOn");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPricingAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "rulePricing"


    // $ANTLR start "entryRuleAddOn"
    // InternalMyPricingDsl.g:266:1: entryRuleAddOn returns [EObject current=null] : iv_ruleAddOn= ruleAddOn EOF ;
    public final EObject entryRuleAddOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOn = null;


        try {
            // InternalMyPricingDsl.g:266:46: (iv_ruleAddOn= ruleAddOn EOF )
            // InternalMyPricingDsl.g:267:2: iv_ruleAddOn= ruleAddOn EOF
            {
             newCompositeNode(grammarAccess.getAddOnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddOn=ruleAddOn();

            state._fsp--;

             current =iv_ruleAddOn; 
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
    // $ANTLR end "entryRuleAddOn"


    // $ANTLR start "ruleAddOn"
    // InternalMyPricingDsl.g:273:1: ruleAddOn returns [EObject current=null] : ( () otherlv_1= 'AddOn' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'usageLimits' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'availableFor' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'dependsOn' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? (otherlv_26= 'excludes' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'features' otherlv_33= '{' ( (lv_features_34_0= ruleFeature ) ) (otherlv_35= ',' ( (lv_features_36_0= ruleFeature ) ) )* otherlv_37= '}' )? otherlv_38= '}' ) ;
    public final EObject ruleAddOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_price_7_0 = null;

        EObject lv_features_34_0 = null;

        EObject lv_features_36_0 = null;



        	enterRule();

        try {
            // InternalMyPricingDsl.g:279:2: ( ( () otherlv_1= 'AddOn' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'usageLimits' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'availableFor' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'dependsOn' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? (otherlv_26= 'excludes' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'features' otherlv_33= '{' ( (lv_features_34_0= ruleFeature ) ) (otherlv_35= ',' ( (lv_features_36_0= ruleFeature ) ) )* otherlv_37= '}' )? otherlv_38= '}' ) )
            // InternalMyPricingDsl.g:280:2: ( () otherlv_1= 'AddOn' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'usageLimits' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'availableFor' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'dependsOn' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? (otherlv_26= 'excludes' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'features' otherlv_33= '{' ( (lv_features_34_0= ruleFeature ) ) (otherlv_35= ',' ( (lv_features_36_0= ruleFeature ) ) )* otherlv_37= '}' )? otherlv_38= '}' )
            {
            // InternalMyPricingDsl.g:280:2: ( () otherlv_1= 'AddOn' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'usageLimits' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'availableFor' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'dependsOn' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? (otherlv_26= 'excludes' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'features' otherlv_33= '{' ( (lv_features_34_0= ruleFeature ) ) (otherlv_35= ',' ( (lv_features_36_0= ruleFeature ) ) )* otherlv_37= '}' )? otherlv_38= '}' )
            // InternalMyPricingDsl.g:281:3: () otherlv_1= 'AddOn' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'usageLimits' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'availableFor' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'dependsOn' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? (otherlv_26= 'excludes' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'features' otherlv_33= '{' ( (lv_features_34_0= ruleFeature ) ) (otherlv_35= ',' ( (lv_features_36_0= ruleFeature ) ) )* otherlv_37= '}' )? otherlv_38= '}'
            {
            // InternalMyPricingDsl.g:281:3: ()
            // InternalMyPricingDsl.g:282:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddOnAccess().getAddOnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddOnAccess().getAddOnKeyword_1());
            		
            // InternalMyPricingDsl.g:292:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyPricingDsl.g:293:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyPricingDsl.g:293:4: (lv_name_2_0= ruleEString )
            // InternalMyPricingDsl.g:294:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddOnAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddOnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"lsi.us.es.mis.xtext.MyPricingDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAddOnAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyPricingDsl.g:315:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyPricingDsl.g:316:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddOnAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalMyPricingDsl.g:320:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalMyPricingDsl.g:321:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:321:5: (lv_description_5_0= ruleEString )
                    // InternalMyPricingDsl.g:322:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddOnAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddOnRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:340:3: (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyPricingDsl.g:341:4: otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddOnAccess().getPriceKeyword_5_0());
                    			
                    // InternalMyPricingDsl.g:345:4: ( (lv_price_7_0= ruleEDouble ) )
                    // InternalMyPricingDsl.g:346:5: (lv_price_7_0= ruleEDouble )
                    {
                    // InternalMyPricingDsl.g:346:5: (lv_price_7_0= ruleEDouble )
                    // InternalMyPricingDsl.g:347:6: lv_price_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAddOnAccess().getPriceEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_price_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddOnRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_7_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:365:3: (otherlv_8= 'usageLimits' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyPricingDsl.g:366:4: otherlv_8= 'usageLimits' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getAddOnAccess().getUsageLimitsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getAddOnAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMyPricingDsl.g:374:4: ( ( ruleEString ) )
                    // InternalMyPricingDsl.g:375:5: ( ruleEString )
                    {
                    // InternalMyPricingDsl.g:375:5: ( ruleEString )
                    // InternalMyPricingDsl.g:376:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddOnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddOnAccess().getUsageLimitsUsageLimitCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyPricingDsl.g:390:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyPricingDsl.g:391:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_5); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getAddOnAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyPricingDsl.g:395:5: ( ( ruleEString ) )
                    	    // InternalMyPricingDsl.g:396:6: ( ruleEString )
                    	    {
                    	    // InternalMyPricingDsl.g:396:6: ( ruleEString )
                    	    // InternalMyPricingDsl.g:397:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAddOnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAddOnAccess().getUsageLimitsUsageLimitCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getAddOnAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyPricingDsl.g:417:3: (otherlv_14= 'availableFor' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyPricingDsl.g:418:4: otherlv_14= 'availableFor' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getAddOnAccess().getAvailableForKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getAddOnAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalMyPricingDsl.g:426:4: ( ( ruleEString ) )
                    // InternalMyPricingDsl.g:427:5: ( ruleEString )
                    {
                    // InternalMyPricingDsl.g:427:5: ( ruleEString )
                    // InternalMyPricingDsl.g:428:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddOnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddOnAccess().getAvailableForPlanCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyPricingDsl.g:442:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==24) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyPricingDsl.g:443:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,24,FOLLOW_5); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getAddOnAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyPricingDsl.g:447:5: ( ( ruleEString ) )
                    	    // InternalMyPricingDsl.g:448:6: ( ruleEString )
                    	    {
                    	    // InternalMyPricingDsl.g:448:6: ( ruleEString )
                    	    // InternalMyPricingDsl.g:449:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAddOnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAddOnAccess().getAvailableForPlanCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_19, grammarAccess.getAddOnAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMyPricingDsl.g:469:3: (otherlv_20= 'dependsOn' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyPricingDsl.g:470:4: otherlv_20= 'dependsOn' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')'
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_20, grammarAccess.getAddOnAccess().getDependsOnKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getAddOnAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalMyPricingDsl.g:478:4: ( ( ruleEString ) )
                    // InternalMyPricingDsl.g:479:5: ( ruleEString )
                    {
                    // InternalMyPricingDsl.g:479:5: ( ruleEString )
                    // InternalMyPricingDsl.g:480:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddOnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddOnAccess().getDependsOnAddOnCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyPricingDsl.g:494:4: (otherlv_23= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyPricingDsl.g:495:5: otherlv_23= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,24,FOLLOW_5); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getAddOnAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyPricingDsl.g:499:5: ( ( ruleEString ) )
                    	    // InternalMyPricingDsl.g:500:6: ( ruleEString )
                    	    {
                    	    // InternalMyPricingDsl.g:500:6: ( ruleEString )
                    	    // InternalMyPricingDsl.g:501:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAddOnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAddOnAccess().getDependsOnAddOnCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_25, grammarAccess.getAddOnAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMyPricingDsl.g:521:3: (otherlv_26= 'excludes' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyPricingDsl.g:522:4: otherlv_26= 'excludes' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')'
                    {
                    otherlv_26=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_26, grammarAccess.getAddOnAccess().getExcludesKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_27, grammarAccess.getAddOnAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalMyPricingDsl.g:530:4: ( ( ruleEString ) )
                    // InternalMyPricingDsl.g:531:5: ( ruleEString )
                    {
                    // InternalMyPricingDsl.g:531:5: ( ruleEString )
                    // InternalMyPricingDsl.g:532:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddOnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddOnAccess().getExcludesAddOnCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyPricingDsl.g:546:4: (otherlv_29= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==24) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyPricingDsl.g:547:5: otherlv_29= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_29=(Token)match(input,24,FOLLOW_5); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getAddOnAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyPricingDsl.g:551:5: ( ( ruleEString ) )
                    	    // InternalMyPricingDsl.g:552:6: ( ruleEString )
                    	    {
                    	    // InternalMyPricingDsl.g:552:6: ( ruleEString )
                    	    // InternalMyPricingDsl.g:553:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAddOnRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAddOnAccess().getExcludesAddOnCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_31, grammarAccess.getAddOnAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMyPricingDsl.g:573:3: (otherlv_32= 'features' otherlv_33= '{' ( (lv_features_34_0= ruleFeature ) ) (otherlv_35= ',' ( (lv_features_36_0= ruleFeature ) ) )* otherlv_37= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyPricingDsl.g:574:4: otherlv_32= 'features' otherlv_33= '{' ( (lv_features_34_0= ruleFeature ) ) (otherlv_35= ',' ( (lv_features_36_0= ruleFeature ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_32, grammarAccess.getAddOnAccess().getFeaturesKeyword_10_0());
                    			
                    otherlv_33=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_33, grammarAccess.getAddOnAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyPricingDsl.g:582:4: ( (lv_features_34_0= ruleFeature ) )
                    // InternalMyPricingDsl.g:583:5: (lv_features_34_0= ruleFeature )
                    {
                    // InternalMyPricingDsl.g:583:5: (lv_features_34_0= ruleFeature )
                    // InternalMyPricingDsl.g:584:6: lv_features_34_0= ruleFeature
                    {

                    						newCompositeNode(grammarAccess.getAddOnAccess().getFeaturesFeatureParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_features_34_0=ruleFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddOnRule());
                    						}
                    						add(
                    							current,
                    							"features",
                    							lv_features_34_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.Feature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyPricingDsl.g:601:4: (otherlv_35= ',' ( (lv_features_36_0= ruleFeature ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyPricingDsl.g:602:5: otherlv_35= ',' ( (lv_features_36_0= ruleFeature ) )
                    	    {
                    	    otherlv_35=(Token)match(input,24,FOLLOW_22); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getAddOnAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMyPricingDsl.g:606:5: ( (lv_features_36_0= ruleFeature ) )
                    	    // InternalMyPricingDsl.g:607:6: (lv_features_36_0= ruleFeature )
                    	    {
                    	    // InternalMyPricingDsl.g:607:6: (lv_features_36_0= ruleFeature )
                    	    // InternalMyPricingDsl.g:608:7: lv_features_36_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddOnAccess().getFeaturesFeatureParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_features_36_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddOnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"features",
                    	    								lv_features_36_0,
                    	    								"lsi.us.es.mis.xtext.MyPricingDsl.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_37, grammarAccess.getAddOnAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_38=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getAddOnAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleAddOn"


    // $ANTLR start "entryRuleUsageLimit"
    // InternalMyPricingDsl.g:639:1: entryRuleUsageLimit returns [EObject current=null] : iv_ruleUsageLimit= ruleUsageLimit EOF ;
    public final EObject entryRuleUsageLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageLimit = null;


        try {
            // InternalMyPricingDsl.g:639:51: (iv_ruleUsageLimit= ruleUsageLimit EOF )
            // InternalMyPricingDsl.g:640:2: iv_ruleUsageLimit= ruleUsageLimit EOF
            {
             newCompositeNode(grammarAccess.getUsageLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsageLimit=ruleUsageLimit();

            state._fsp--;

             current =iv_ruleUsageLimit; 
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
    // $ANTLR end "entryRuleUsageLimit"


    // $ANTLR start "ruleUsageLimit"
    // InternalMyPricingDsl.g:646:1: ruleUsageLimit returns [EObject current=null] : (this_Renewable_0= ruleRenewable | this_NonRenewable_1= ruleNonRenewable ) ;
    public final EObject ruleUsageLimit() throws RecognitionException {
        EObject current = null;

        EObject this_Renewable_0 = null;

        EObject this_NonRenewable_1 = null;



        	enterRule();

        try {
            // InternalMyPricingDsl.g:652:2: ( (this_Renewable_0= ruleRenewable | this_NonRenewable_1= ruleNonRenewable ) )
            // InternalMyPricingDsl.g:653:2: (this_Renewable_0= ruleRenewable | this_NonRenewable_1= ruleNonRenewable )
            {
            // InternalMyPricingDsl.g:653:2: (this_Renewable_0= ruleRenewable | this_NonRenewable_1= ruleNonRenewable )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=46 && LA20_0<=47)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyPricingDsl.g:654:3: this_Renewable_0= ruleRenewable
                    {

                    			newCompositeNode(grammarAccess.getUsageLimitAccess().getRenewableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Renewable_0=ruleRenewable();

                    state._fsp--;


                    			current = this_Renewable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyPricingDsl.g:663:3: this_NonRenewable_1= ruleNonRenewable
                    {

                    			newCompositeNode(grammarAccess.getUsageLimitAccess().getNonRenewableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonRenewable_1=ruleNonRenewable();

                    state._fsp--;


                    			current = this_NonRenewable_1;
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
    // $ANTLR end "ruleUsageLimit"


    // $ANTLR start "entryRuleEString"
    // InternalMyPricingDsl.g:675:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyPricingDsl.g:675:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyPricingDsl.g:676:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyPricingDsl.g:682:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyPricingDsl.g:688:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyPricingDsl.g:689:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyPricingDsl.g:689:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyPricingDsl.g:690:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyPricingDsl.g:698:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyPricingDsl.g:709:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyPricingDsl.g:709:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyPricingDsl.g:710:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyPricingDsl.g:716:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyPricingDsl.g:722:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyPricingDsl.g:723:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyPricingDsl.g:723:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyPricingDsl.g:724:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyPricingDsl.g:724:3: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyPricingDsl.g:725:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyPricingDsl.g:731:3: (this_INT_1= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyPricingDsl.g:732:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_26); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_28); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyPricingDsl.g:752:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=32 && LA26_0<=33)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyPricingDsl.g:753:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyPricingDsl.g:753:4: (kw= 'E' | kw= 'e' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==32) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==33) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyPricingDsl.g:754:5: kw= 'E'
                            {
                            kw=(Token)match(input,32,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyPricingDsl.g:760:5: kw= 'e'
                            {
                            kw=(Token)match(input,33,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyPricingDsl.g:766:4: (kw= '-' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==30) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalMyPricingDsl.g:767:5: kw= '-'
                            {
                            kw=(Token)match(input,30,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleFeature"
    // InternalMyPricingDsl.g:785:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalMyPricingDsl.g:785:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalMyPricingDsl.g:786:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalMyPricingDsl.g:792:1: ruleFeature returns [EObject current=null] : ( () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'expression' ( (lv_expression_9_0= ruleEString ) ) )? (otherlv_10= 'serverExpression' ( (lv_serverExpression_11_0= ruleEString ) ) )? (otherlv_12= 'defaultValue' ( (lv_defaultValue_13_0= ruleEString ) ) )? (otherlv_14= 'valueType' ( (lv_valueType_15_0= ruleValueType ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;

        AntlrDatatypeRuleToken lv_expression_9_0 = null;

        AntlrDatatypeRuleToken lv_serverExpression_11_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_13_0 = null;

        Enumerator lv_valueType_15_0 = null;



        	enterRule();

        try {
            // InternalMyPricingDsl.g:798:2: ( ( () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'expression' ( (lv_expression_9_0= ruleEString ) ) )? (otherlv_10= 'serverExpression' ( (lv_serverExpression_11_0= ruleEString ) ) )? (otherlv_12= 'defaultValue' ( (lv_defaultValue_13_0= ruleEString ) ) )? (otherlv_14= 'valueType' ( (lv_valueType_15_0= ruleValueType ) ) )? otherlv_16= '}' ) )
            // InternalMyPricingDsl.g:799:2: ( () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'expression' ( (lv_expression_9_0= ruleEString ) ) )? (otherlv_10= 'serverExpression' ( (lv_serverExpression_11_0= ruleEString ) ) )? (otherlv_12= 'defaultValue' ( (lv_defaultValue_13_0= ruleEString ) ) )? (otherlv_14= 'valueType' ( (lv_valueType_15_0= ruleValueType ) ) )? otherlv_16= '}' )
            {
            // InternalMyPricingDsl.g:799:2: ( () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'expression' ( (lv_expression_9_0= ruleEString ) ) )? (otherlv_10= 'serverExpression' ( (lv_serverExpression_11_0= ruleEString ) ) )? (otherlv_12= 'defaultValue' ( (lv_defaultValue_13_0= ruleEString ) ) )? (otherlv_14= 'valueType' ( (lv_valueType_15_0= ruleValueType ) ) )? otherlv_16= '}' )
            // InternalMyPricingDsl.g:800:3: () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'expression' ( (lv_expression_9_0= ruleEString ) ) )? (otherlv_10= 'serverExpression' ( (lv_serverExpression_11_0= ruleEString ) ) )? (otherlv_12= 'defaultValue' ( (lv_defaultValue_13_0= ruleEString ) ) )? (otherlv_14= 'valueType' ( (lv_valueType_15_0= ruleValueType ) ) )? otherlv_16= '}'
            {
            // InternalMyPricingDsl.g:800:3: ()
            // InternalMyPricingDsl.g:801:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureAccess().getFeatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
            		
            // InternalMyPricingDsl.g:811:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyPricingDsl.g:812:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyPricingDsl.g:812:4: (lv_name_2_0= ruleEString )
            // InternalMyPricingDsl.g:813:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"lsi.us.es.mis.xtext.MyPricingDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyPricingDsl.g:834:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyPricingDsl.g:835:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalMyPricingDsl.g:839:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalMyPricingDsl.g:840:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:840:5: (lv_description_5_0= ruleEString )
                    // InternalMyPricingDsl.g:841:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:859:3: (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyPricingDsl.g:860:4: otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getValueKeyword_5_0());
                    			
                    // InternalMyPricingDsl.g:864:4: ( (lv_value_7_0= ruleEString ) )
                    // InternalMyPricingDsl.g:865:5: (lv_value_7_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:865:5: (lv_value_7_0= ruleEString )
                    // InternalMyPricingDsl.g:866:6: lv_value_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccess().getValueEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_value_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:884:3: (otherlv_8= 'expression' ( (lv_expression_9_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyPricingDsl.g:885:4: otherlv_8= 'expression' ( (lv_expression_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeatureAccess().getExpressionKeyword_6_0());
                    			
                    // InternalMyPricingDsl.g:889:4: ( (lv_expression_9_0= ruleEString ) )
                    // InternalMyPricingDsl.g:890:5: (lv_expression_9_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:890:5: (lv_expression_9_0= ruleEString )
                    // InternalMyPricingDsl.g:891:6: lv_expression_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccess().getExpressionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_expression_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_9_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:909:3: (otherlv_10= 'serverExpression' ( (lv_serverExpression_11_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyPricingDsl.g:910:4: otherlv_10= 'serverExpression' ( (lv_serverExpression_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getFeatureAccess().getServerExpressionKeyword_7_0());
                    			
                    // InternalMyPricingDsl.g:914:4: ( (lv_serverExpression_11_0= ruleEString ) )
                    // InternalMyPricingDsl.g:915:5: (lv_serverExpression_11_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:915:5: (lv_serverExpression_11_0= ruleEString )
                    // InternalMyPricingDsl.g:916:6: lv_serverExpression_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccess().getServerExpressionEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_serverExpression_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    						}
                    						set(
                    							current,
                    							"serverExpression",
                    							lv_serverExpression_11_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:934:3: (otherlv_12= 'defaultValue' ( (lv_defaultValue_13_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyPricingDsl.g:935:4: otherlv_12= 'defaultValue' ( (lv_defaultValue_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getFeatureAccess().getDefaultValueKeyword_8_0());
                    			
                    // InternalMyPricingDsl.g:939:4: ( (lv_defaultValue_13_0= ruleEString ) )
                    // InternalMyPricingDsl.g:940:5: (lv_defaultValue_13_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:940:5: (lv_defaultValue_13_0= ruleEString )
                    // InternalMyPricingDsl.g:941:6: lv_defaultValue_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccess().getDefaultValueEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_defaultValue_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    						}
                    						set(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_13_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:959:3: (otherlv_14= 'valueType' ( (lv_valueType_15_0= ruleValueType ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyPricingDsl.g:960:4: otherlv_14= 'valueType' ( (lv_valueType_15_0= ruleValueType ) )
                    {
                    otherlv_14=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_14, grammarAccess.getFeatureAccess().getValueTypeKeyword_9_0());
                    			
                    // InternalMyPricingDsl.g:964:4: ( (lv_valueType_15_0= ruleValueType ) )
                    // InternalMyPricingDsl.g:965:5: (lv_valueType_15_0= ruleValueType )
                    {
                    // InternalMyPricingDsl.g:965:5: (lv_valueType_15_0= ruleValueType )
                    // InternalMyPricingDsl.g:966:6: lv_valueType_15_0= ruleValueType
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccess().getValueTypeValueTypeEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_valueType_15_0=ruleValueType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    						}
                    						set(
                    							current,
                    							"valueType",
                    							lv_valueType_15_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.ValueType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRulePlan"
    // InternalMyPricingDsl.g:992:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // InternalMyPricingDsl.g:992:45: (iv_rulePlan= rulePlan EOF )
            // InternalMyPricingDsl.g:993:2: iv_rulePlan= rulePlan EOF
            {
             newCompositeNode(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlan=rulePlan();

            state._fsp--;

             current =iv_rulePlan; 
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
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // InternalMyPricingDsl.g:999:1: rulePlan returns [EObject current=null] : ( () otherlv_1= 'Plan' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'features' otherlv_9= '{' ( (lv_features_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? (otherlv_14= 'usageLimits' otherlv_15= '{' ( (lv_usageLimits_16_0= ruleUsageLimit ) ) (otherlv_17= ',' ( (lv_usageLimits_18_0= ruleUsageLimit ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_price_7_0 = null;

        EObject lv_features_10_0 = null;

        EObject lv_features_12_0 = null;

        EObject lv_usageLimits_16_0 = null;

        EObject lv_usageLimits_18_0 = null;



        	enterRule();

        try {
            // InternalMyPricingDsl.g:1005:2: ( ( () otherlv_1= 'Plan' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'features' otherlv_9= '{' ( (lv_features_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? (otherlv_14= 'usageLimits' otherlv_15= '{' ( (lv_usageLimits_16_0= ruleUsageLimit ) ) (otherlv_17= ',' ( (lv_usageLimits_18_0= ruleUsageLimit ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalMyPricingDsl.g:1006:2: ( () otherlv_1= 'Plan' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'features' otherlv_9= '{' ( (lv_features_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? (otherlv_14= 'usageLimits' otherlv_15= '{' ( (lv_usageLimits_16_0= ruleUsageLimit ) ) (otherlv_17= ',' ( (lv_usageLimits_18_0= ruleUsageLimit ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalMyPricingDsl.g:1006:2: ( () otherlv_1= 'Plan' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'features' otherlv_9= '{' ( (lv_features_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? (otherlv_14= 'usageLimits' otherlv_15= '{' ( (lv_usageLimits_16_0= ruleUsageLimit ) ) (otherlv_17= ',' ( (lv_usageLimits_18_0= ruleUsageLimit ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalMyPricingDsl.g:1007:3: () otherlv_1= 'Plan' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )? (otherlv_8= 'features' otherlv_9= '{' ( (lv_features_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )? (otherlv_14= 'usageLimits' otherlv_15= '{' ( (lv_usageLimits_16_0= ruleUsageLimit ) ) (otherlv_17= ',' ( (lv_usageLimits_18_0= ruleUsageLimit ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalMyPricingDsl.g:1007:3: ()
            // InternalMyPricingDsl.g:1008:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlanAccess().getPlanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPlanAccess().getPlanKeyword_1());
            		
            // InternalMyPricingDsl.g:1018:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyPricingDsl.g:1019:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyPricingDsl.g:1019:4: (lv_name_2_0= ruleEString )
            // InternalMyPricingDsl.g:1020:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlanAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlanRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"lsi.us.es.mis.xtext.MyPricingDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyPricingDsl.g:1041:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyPricingDsl.g:1042:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlanAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalMyPricingDsl.g:1046:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalMyPricingDsl.g:1047:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:1047:5: (lv_description_5_0= ruleEString )
                    // InternalMyPricingDsl.g:1048:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPlanAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlanRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1066:3: (otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyPricingDsl.g:1067:4: otherlv_6= 'price' ( (lv_price_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getPlanAccess().getPriceKeyword_5_0());
                    			
                    // InternalMyPricingDsl.g:1071:4: ( (lv_price_7_0= ruleEDouble ) )
                    // InternalMyPricingDsl.g:1072:5: (lv_price_7_0= ruleEDouble )
                    {
                    // InternalMyPricingDsl.g:1072:5: (lv_price_7_0= ruleEDouble )
                    // InternalMyPricingDsl.g:1073:6: lv_price_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPlanAccess().getPriceEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_price_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlanRule());
                    						}
                    						set(
                    							current,
                    							"price",
                    							lv_price_7_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1091:3: (otherlv_8= 'features' otherlv_9= '{' ( (lv_features_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyPricingDsl.g:1092:4: otherlv_8= 'features' otherlv_9= '{' ( (lv_features_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPlanAccess().getFeaturesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyPricingDsl.g:1100:4: ( (lv_features_10_0= ruleFeature ) )
                    // InternalMyPricingDsl.g:1101:5: (lv_features_10_0= ruleFeature )
                    {
                    // InternalMyPricingDsl.g:1101:5: (lv_features_10_0= ruleFeature )
                    // InternalMyPricingDsl.g:1102:6: lv_features_10_0= ruleFeature
                    {

                    						newCompositeNode(grammarAccess.getPlanAccess().getFeaturesFeatureParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_features_10_0=ruleFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlanRule());
                    						}
                    						add(
                    							current,
                    							"features",
                    							lv_features_10_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.Feature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyPricingDsl.g:1119:4: (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==24) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMyPricingDsl.g:1120:5: otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_22); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPlanAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyPricingDsl.g:1124:5: ( (lv_features_12_0= ruleFeature ) )
                    	    // InternalMyPricingDsl.g:1125:6: (lv_features_12_0= ruleFeature )
                    	    {
                    	    // InternalMyPricingDsl.g:1125:6: (lv_features_12_0= ruleFeature )
                    	    // InternalMyPricingDsl.g:1126:7: lv_features_12_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlanAccess().getFeaturesFeatureParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_features_12_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlanRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"features",
                    	    								lv_features_12_0,
                    	    								"lsi.us.es.mis.xtext.MyPricingDsl.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_40); 

                    				newLeafNode(otherlv_13, grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyPricingDsl.g:1149:3: (otherlv_14= 'usageLimits' otherlv_15= '{' ( (lv_usageLimits_16_0= ruleUsageLimit ) ) (otherlv_17= ',' ( (lv_usageLimits_18_0= ruleUsageLimit ) ) )* otherlv_19= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyPricingDsl.g:1150:4: otherlv_14= 'usageLimits' otherlv_15= '{' ( (lv_usageLimits_16_0= ruleUsageLimit ) ) (otherlv_17= ',' ( (lv_usageLimits_18_0= ruleUsageLimit ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getPlanAccess().getUsageLimitsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_15, grammarAccess.getPlanAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyPricingDsl.g:1158:4: ( (lv_usageLimits_16_0= ruleUsageLimit ) )
                    // InternalMyPricingDsl.g:1159:5: (lv_usageLimits_16_0= ruleUsageLimit )
                    {
                    // InternalMyPricingDsl.g:1159:5: (lv_usageLimits_16_0= ruleUsageLimit )
                    // InternalMyPricingDsl.g:1160:6: lv_usageLimits_16_0= ruleUsageLimit
                    {

                    						newCompositeNode(grammarAccess.getPlanAccess().getUsageLimitsUsageLimitParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_usageLimits_16_0=ruleUsageLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlanRule());
                    						}
                    						add(
                    							current,
                    							"usageLimits",
                    							lv_usageLimits_16_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.UsageLimit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyPricingDsl.g:1177:4: (otherlv_17= ',' ( (lv_usageLimits_18_0= ruleUsageLimit ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==24) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMyPricingDsl.g:1178:5: otherlv_17= ',' ( (lv_usageLimits_18_0= ruleUsageLimit ) )
                    	    {
                    	    otherlv_17=(Token)match(input,24,FOLLOW_41); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPlanAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyPricingDsl.g:1182:5: ( (lv_usageLimits_18_0= ruleUsageLimit ) )
                    	    // InternalMyPricingDsl.g:1183:6: (lv_usageLimits_18_0= ruleUsageLimit )
                    	    {
                    	    // InternalMyPricingDsl.g:1183:6: (lv_usageLimits_18_0= ruleUsageLimit )
                    	    // InternalMyPricingDsl.g:1184:7: lv_usageLimits_18_0= ruleUsageLimit
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlanAccess().getUsageLimitsUsageLimitParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_usageLimits_18_0=ruleUsageLimit();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlanRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"usageLimits",
                    	    								lv_usageLimits_18_0,
                    	    								"lsi.us.es.mis.xtext.MyPricingDsl.UsageLimit");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getPlanAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRuleRenewable"
    // InternalMyPricingDsl.g:1215:1: entryRuleRenewable returns [EObject current=null] : iv_ruleRenewable= ruleRenewable EOF ;
    public final EObject entryRuleRenewable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenewable = null;


        try {
            // InternalMyPricingDsl.g:1215:50: (iv_ruleRenewable= ruleRenewable EOF )
            // InternalMyPricingDsl.g:1216:2: iv_ruleRenewable= ruleRenewable EOF
            {
             newCompositeNode(grammarAccess.getRenewableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenewable=ruleRenewable();

            state._fsp--;

             current =iv_ruleRenewable; 
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
    // $ANTLR end "entryRuleRenewable"


    // $ANTLR start "ruleRenewable"
    // InternalMyPricingDsl.g:1222:1: ruleRenewable returns [EObject current=null] : ( () otherlv_1= 'Renewable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'defaultValue' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'valueType' ( (lv_valueType_13_0= ruleValueType ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleEDouble ) ) )? (otherlv_16= 'linkedTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= 'period' ( (lv_period_23_0= rulePeriod ) ) otherlv_24= '}' ) ;
    public final EObject ruleRenewable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        AntlrDatatypeRuleToken lv_unit_11_0 = null;

        Enumerator lv_valueType_13_0 = null;

        AntlrDatatypeRuleToken lv_limit_15_0 = null;

        EObject lv_period_23_0 = null;



        	enterRule();

        try {
            // InternalMyPricingDsl.g:1228:2: ( ( () otherlv_1= 'Renewable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'defaultValue' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'valueType' ( (lv_valueType_13_0= ruleValueType ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleEDouble ) ) )? (otherlv_16= 'linkedTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= 'period' ( (lv_period_23_0= rulePeriod ) ) otherlv_24= '}' ) )
            // InternalMyPricingDsl.g:1229:2: ( () otherlv_1= 'Renewable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'defaultValue' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'valueType' ( (lv_valueType_13_0= ruleValueType ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleEDouble ) ) )? (otherlv_16= 'linkedTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= 'period' ( (lv_period_23_0= rulePeriod ) ) otherlv_24= '}' )
            {
            // InternalMyPricingDsl.g:1229:2: ( () otherlv_1= 'Renewable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'defaultValue' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'valueType' ( (lv_valueType_13_0= ruleValueType ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleEDouble ) ) )? (otherlv_16= 'linkedTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= 'period' ( (lv_period_23_0= rulePeriod ) ) otherlv_24= '}' )
            // InternalMyPricingDsl.g:1230:3: () otherlv_1= 'Renewable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'defaultValue' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )? (otherlv_12= 'valueType' ( (lv_valueType_13_0= ruleValueType ) ) )? (otherlv_14= 'limit' ( (lv_limit_15_0= ruleEDouble ) ) )? (otherlv_16= 'linkedTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= 'period' ( (lv_period_23_0= rulePeriod ) ) otherlv_24= '}'
            {
            // InternalMyPricingDsl.g:1230:3: ()
            // InternalMyPricingDsl.g:1231:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRenewableAccess().getRenewableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRenewableAccess().getRenewableKeyword_1());
            		
            // InternalMyPricingDsl.g:1241:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyPricingDsl.g:1242:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyPricingDsl.g:1242:4: (lv_name_2_0= ruleEString )
            // InternalMyPricingDsl.g:1243:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRenewableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenewableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"lsi.us.es.mis.xtext.MyPricingDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getRenewableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyPricingDsl.g:1264:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyPricingDsl.g:1265:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRenewableAccess().getValueKeyword_4_0());
                    			
                    // InternalMyPricingDsl.g:1269:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalMyPricingDsl.g:1270:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:1270:5: (lv_value_5_0= ruleEString )
                    // InternalMyPricingDsl.g:1271:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRenewableAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRenewableRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1289:3: (otherlv_6= 'defaultValue' ( (lv_defaultValue_7_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyPricingDsl.g:1290:4: otherlv_6= 'defaultValue' ( (lv_defaultValue_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRenewableAccess().getDefaultValueKeyword_5_0());
                    			
                    // InternalMyPricingDsl.g:1294:4: ( (lv_defaultValue_7_0= ruleEString ) )
                    // InternalMyPricingDsl.g:1295:5: (lv_defaultValue_7_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:1295:5: (lv_defaultValue_7_0= ruleEString )
                    // InternalMyPricingDsl.g:1296:6: lv_defaultValue_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRenewableAccess().getDefaultValueEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_defaultValue_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRenewableRule());
                    						}
                    						set(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_7_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1314:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyPricingDsl.g:1315:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getRenewableAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalMyPricingDsl.g:1319:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalMyPricingDsl.g:1320:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:1320:5: (lv_description_9_0= ruleEString )
                    // InternalMyPricingDsl.g:1321:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRenewableAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRenewableRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1339:3: (otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyPricingDsl.g:1340:4: otherlv_10= 'unit' ( (lv_unit_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getRenewableAccess().getUnitKeyword_7_0());
                    			
                    // InternalMyPricingDsl.g:1344:4: ( (lv_unit_11_0= ruleEString ) )
                    // InternalMyPricingDsl.g:1345:5: (lv_unit_11_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:1345:5: (lv_unit_11_0= ruleEString )
                    // InternalMyPricingDsl.g:1346:6: lv_unit_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRenewableAccess().getUnitEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_unit_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRenewableRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_11_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1364:3: (otherlv_12= 'valueType' ( (lv_valueType_13_0= ruleValueType ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyPricingDsl.g:1365:4: otherlv_12= 'valueType' ( (lv_valueType_13_0= ruleValueType ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_12, grammarAccess.getRenewableAccess().getValueTypeKeyword_8_0());
                    			
                    // InternalMyPricingDsl.g:1369:4: ( (lv_valueType_13_0= ruleValueType ) )
                    // InternalMyPricingDsl.g:1370:5: (lv_valueType_13_0= ruleValueType )
                    {
                    // InternalMyPricingDsl.g:1370:5: (lv_valueType_13_0= ruleValueType )
                    // InternalMyPricingDsl.g:1371:6: lv_valueType_13_0= ruleValueType
                    {

                    						newCompositeNode(grammarAccess.getRenewableAccess().getValueTypeValueTypeEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_valueType_13_0=ruleValueType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRenewableRule());
                    						}
                    						set(
                    							current,
                    							"valueType",
                    							lv_valueType_13_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.ValueType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1389:3: (otherlv_14= 'limit' ( (lv_limit_15_0= ruleEDouble ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyPricingDsl.g:1390:4: otherlv_14= 'limit' ( (lv_limit_15_0= ruleEDouble ) )
                    {
                    otherlv_14=(Token)match(input,43,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getRenewableAccess().getLimitKeyword_9_0());
                    			
                    // InternalMyPricingDsl.g:1394:4: ( (lv_limit_15_0= ruleEDouble ) )
                    // InternalMyPricingDsl.g:1395:5: (lv_limit_15_0= ruleEDouble )
                    {
                    // InternalMyPricingDsl.g:1395:5: (lv_limit_15_0= ruleEDouble )
                    // InternalMyPricingDsl.g:1396:6: lv_limit_15_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRenewableAccess().getLimitEDoubleParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_limit_15_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRenewableRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_15_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1414:3: (otherlv_16= 'linkedTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyPricingDsl.g:1415:4: otherlv_16= 'linkedTo' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,44,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getRenewableAccess().getLinkedToKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getRenewableAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalMyPricingDsl.g:1423:4: ( ( ruleEString ) )
                    // InternalMyPricingDsl.g:1424:5: ( ruleEString )
                    {
                    // InternalMyPricingDsl.g:1424:5: ( ruleEString )
                    // InternalMyPricingDsl.g:1425:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRenewableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRenewableAccess().getLinkedToFeatureCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyPricingDsl.g:1439:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==24) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMyPricingDsl.g:1440:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,24,FOLLOW_5); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getRenewableAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMyPricingDsl.g:1444:5: ( ( ruleEString ) )
                    	    // InternalMyPricingDsl.g:1445:6: ( ruleEString )
                    	    {
                    	    // InternalMyPricingDsl.g:1445:6: ( ruleEString )
                    	    // InternalMyPricingDsl.g:1446:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRenewableRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRenewableAccess().getLinkedToFeatureCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,25,FOLLOW_49); 

                    				newLeafNode(otherlv_21, grammarAccess.getRenewableAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,45,FOLLOW_50); 

            			newLeafNode(otherlv_22, grammarAccess.getRenewableAccess().getPeriodKeyword_11());
            		
            // InternalMyPricingDsl.g:1470:3: ( (lv_period_23_0= rulePeriod ) )
            // InternalMyPricingDsl.g:1471:4: (lv_period_23_0= rulePeriod )
            {
            // InternalMyPricingDsl.g:1471:4: (lv_period_23_0= rulePeriod )
            // InternalMyPricingDsl.g:1472:5: lv_period_23_0= rulePeriod
            {

            					newCompositeNode(grammarAccess.getRenewableAccess().getPeriodPeriodParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_24);
            lv_period_23_0=rulePeriod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenewableRule());
            					}
            					set(
            						current,
            						"period",
            						lv_period_23_0,
            						"lsi.us.es.mis.xtext.MyPricingDsl.Period");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_24=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getRenewableAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleRenewable"


    // $ANTLR start "entryRuleNonRenewable"
    // InternalMyPricingDsl.g:1497:1: entryRuleNonRenewable returns [EObject current=null] : iv_ruleNonRenewable= ruleNonRenewable EOF ;
    public final EObject entryRuleNonRenewable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonRenewable = null;


        try {
            // InternalMyPricingDsl.g:1497:53: (iv_ruleNonRenewable= ruleNonRenewable EOF )
            // InternalMyPricingDsl.g:1498:2: iv_ruleNonRenewable= ruleNonRenewable EOF
            {
             newCompositeNode(grammarAccess.getNonRenewableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonRenewable=ruleNonRenewable();

            state._fsp--;

             current =iv_ruleNonRenewable; 
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
    // $ANTLR end "entryRuleNonRenewable"


    // $ANTLR start "ruleNonRenewable"
    // InternalMyPricingDsl.g:1504:1: ruleNonRenewable returns [EObject current=null] : ( () ( (lv_trackable_1_0= 'trackable' ) )? otherlv_2= 'NonRenewable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'defaultValue' ( (lv_defaultValue_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? (otherlv_13= 'valueType' ( (lv_valueType_14_0= ruleValueType ) ) )? (otherlv_15= 'limit' ( (lv_limit_16_0= ruleEDouble ) ) )? (otherlv_17= 'linkedTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) ;
    public final EObject ruleNonRenewable() throws RecognitionException {
        EObject current = null;

        Token lv_trackable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_8_0 = null;

        AntlrDatatypeRuleToken lv_description_10_0 = null;

        AntlrDatatypeRuleToken lv_unit_12_0 = null;

        Enumerator lv_valueType_14_0 = null;

        AntlrDatatypeRuleToken lv_limit_16_0 = null;



        	enterRule();

        try {
            // InternalMyPricingDsl.g:1510:2: ( ( () ( (lv_trackable_1_0= 'trackable' ) )? otherlv_2= 'NonRenewable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'defaultValue' ( (lv_defaultValue_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? (otherlv_13= 'valueType' ( (lv_valueType_14_0= ruleValueType ) ) )? (otherlv_15= 'limit' ( (lv_limit_16_0= ruleEDouble ) ) )? (otherlv_17= 'linkedTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) )
            // InternalMyPricingDsl.g:1511:2: ( () ( (lv_trackable_1_0= 'trackable' ) )? otherlv_2= 'NonRenewable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'defaultValue' ( (lv_defaultValue_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? (otherlv_13= 'valueType' ( (lv_valueType_14_0= ruleValueType ) ) )? (otherlv_15= 'limit' ( (lv_limit_16_0= ruleEDouble ) ) )? (otherlv_17= 'linkedTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            {
            // InternalMyPricingDsl.g:1511:2: ( () ( (lv_trackable_1_0= 'trackable' ) )? otherlv_2= 'NonRenewable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'defaultValue' ( (lv_defaultValue_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? (otherlv_13= 'valueType' ( (lv_valueType_14_0= ruleValueType ) ) )? (otherlv_15= 'limit' ( (lv_limit_16_0= ruleEDouble ) ) )? (otherlv_17= 'linkedTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            // InternalMyPricingDsl.g:1512:3: () ( (lv_trackable_1_0= 'trackable' ) )? otherlv_2= 'NonRenewable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? (otherlv_7= 'defaultValue' ( (lv_defaultValue_8_0= ruleEString ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )? (otherlv_13= 'valueType' ( (lv_valueType_14_0= ruleValueType ) ) )? (otherlv_15= 'limit' ( (lv_limit_16_0= ruleEDouble ) ) )? (otherlv_17= 'linkedTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}'
            {
            // InternalMyPricingDsl.g:1512:3: ()
            // InternalMyPricingDsl.g:1513:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNonRenewableAccess().getNonRenewableAction_0(),
            					current);
            			

            }

            // InternalMyPricingDsl.g:1519:3: ( (lv_trackable_1_0= 'trackable' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyPricingDsl.g:1520:4: (lv_trackable_1_0= 'trackable' )
                    {
                    // InternalMyPricingDsl.g:1520:4: (lv_trackable_1_0= 'trackable' )
                    // InternalMyPricingDsl.g:1521:5: lv_trackable_1_0= 'trackable'
                    {
                    lv_trackable_1_0=(Token)match(input,46,FOLLOW_51); 

                    					newLeafNode(lv_trackable_1_0, grammarAccess.getNonRenewableAccess().getTrackableTrackableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNonRenewableRule());
                    					}
                    					setWithLastConsumed(current, "trackable", lv_trackable_1_0 != null, "trackable");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNonRenewableAccess().getNonRenewableKeyword_2());
            		
            // InternalMyPricingDsl.g:1537:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyPricingDsl.g:1538:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyPricingDsl.g:1538:4: (lv_name_3_0= ruleEString )
            // InternalMyPricingDsl.g:1539:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNonRenewableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNonRenewableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"lsi.us.es.mis.xtext.MyPricingDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getNonRenewableAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyPricingDsl.g:1560:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==35) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyPricingDsl.g:1561:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getNonRenewableAccess().getValueKeyword_5_0());
                    			
                    // InternalMyPricingDsl.g:1565:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalMyPricingDsl.g:1566:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:1566:5: (lv_value_6_0= ruleEString )
                    // InternalMyPricingDsl.g:1567:6: lv_value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNonRenewableAccess().getValueEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonRenewableRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1585:3: (otherlv_7= 'defaultValue' ( (lv_defaultValue_8_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==38) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyPricingDsl.g:1586:4: otherlv_7= 'defaultValue' ( (lv_defaultValue_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getNonRenewableAccess().getDefaultValueKeyword_6_0());
                    			
                    // InternalMyPricingDsl.g:1590:4: ( (lv_defaultValue_8_0= ruleEString ) )
                    // InternalMyPricingDsl.g:1591:5: (lv_defaultValue_8_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:1591:5: (lv_defaultValue_8_0= ruleEString )
                    // InternalMyPricingDsl.g:1592:6: lv_defaultValue_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNonRenewableAccess().getDefaultValueEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_defaultValue_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonRenewableRule());
                    						}
                    						set(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_8_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1610:3: (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==20) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyPricingDsl.g:1611:4: otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getNonRenewableAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalMyPricingDsl.g:1615:4: ( (lv_description_10_0= ruleEString ) )
                    // InternalMyPricingDsl.g:1616:5: (lv_description_10_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:1616:5: (lv_description_10_0= ruleEString )
                    // InternalMyPricingDsl.g:1617:6: lv_description_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNonRenewableAccess().getDescriptionEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_description_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonRenewableRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_10_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1635:3: (otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==42) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyPricingDsl.g:1636:4: otherlv_11= 'unit' ( (lv_unit_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getNonRenewableAccess().getUnitKeyword_8_0());
                    			
                    // InternalMyPricingDsl.g:1640:4: ( (lv_unit_12_0= ruleEString ) )
                    // InternalMyPricingDsl.g:1641:5: (lv_unit_12_0= ruleEString )
                    {
                    // InternalMyPricingDsl.g:1641:5: (lv_unit_12_0= ruleEString )
                    // InternalMyPricingDsl.g:1642:6: lv_unit_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNonRenewableAccess().getUnitEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_unit_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonRenewableRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_12_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1660:3: (otherlv_13= 'valueType' ( (lv_valueType_14_0= ruleValueType ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyPricingDsl.g:1661:4: otherlv_13= 'valueType' ( (lv_valueType_14_0= ruleValueType ) )
                    {
                    otherlv_13=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_13, grammarAccess.getNonRenewableAccess().getValueTypeKeyword_9_0());
                    			
                    // InternalMyPricingDsl.g:1665:4: ( (lv_valueType_14_0= ruleValueType ) )
                    // InternalMyPricingDsl.g:1666:5: (lv_valueType_14_0= ruleValueType )
                    {
                    // InternalMyPricingDsl.g:1666:5: (lv_valueType_14_0= ruleValueType )
                    // InternalMyPricingDsl.g:1667:6: lv_valueType_14_0= ruleValueType
                    {

                    						newCompositeNode(grammarAccess.getNonRenewableAccess().getValueTypeValueTypeEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_valueType_14_0=ruleValueType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonRenewableRule());
                    						}
                    						set(
                    							current,
                    							"valueType",
                    							lv_valueType_14_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.ValueType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1685:3: (otherlv_15= 'limit' ( (lv_limit_16_0= ruleEDouble ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==43) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyPricingDsl.g:1686:4: otherlv_15= 'limit' ( (lv_limit_16_0= ruleEDouble ) )
                    {
                    otherlv_15=(Token)match(input,43,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getNonRenewableAccess().getLimitKeyword_10_0());
                    			
                    // InternalMyPricingDsl.g:1690:4: ( (lv_limit_16_0= ruleEDouble ) )
                    // InternalMyPricingDsl.g:1691:5: (lv_limit_16_0= ruleEDouble )
                    {
                    // InternalMyPricingDsl.g:1691:5: (lv_limit_16_0= ruleEDouble )
                    // InternalMyPricingDsl.g:1692:6: lv_limit_16_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getNonRenewableAccess().getLimitEDoubleParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_limit_16_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonRenewableRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_16_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1710:3: (otherlv_17= 'linkedTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==44) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyPricingDsl.g:1711:4: otherlv_17= 'linkedTo' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,44,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getNonRenewableAccess().getLinkedToKeyword_11_0());
                    			
                    otherlv_18=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_18, grammarAccess.getNonRenewableAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalMyPricingDsl.g:1719:4: ( ( ruleEString ) )
                    // InternalMyPricingDsl.g:1720:5: ( ruleEString )
                    {
                    // InternalMyPricingDsl.g:1720:5: ( ruleEString )
                    // InternalMyPricingDsl.g:1721:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonRenewableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonRenewableAccess().getLinkedToFeatureCrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyPricingDsl.g:1735:4: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==24) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalMyPricingDsl.g:1736:5: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,24,FOLLOW_5); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getNonRenewableAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalMyPricingDsl.g:1740:5: ( ( ruleEString ) )
                    	    // InternalMyPricingDsl.g:1741:6: ( ruleEString )
                    	    {
                    	    // InternalMyPricingDsl.g:1741:6: ( ruleEString )
                    	    // InternalMyPricingDsl.g:1742:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNonRenewableRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNonRenewableAccess().getLinkedToFeatureCrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_22, grammarAccess.getNonRenewableAccess().getRightParenthesisKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getNonRenewableAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleNonRenewable"


    // $ANTLR start "entryRulePeriod"
    // InternalMyPricingDsl.g:1770:1: entryRulePeriod returns [EObject current=null] : iv_rulePeriod= rulePeriod EOF ;
    public final EObject entryRulePeriod() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriod = null;


        try {
            // InternalMyPricingDsl.g:1770:47: (iv_rulePeriod= rulePeriod EOF )
            // InternalMyPricingDsl.g:1771:2: iv_rulePeriod= rulePeriod EOF
            {
             newCompositeNode(grammarAccess.getPeriodRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeriod=rulePeriod();

            state._fsp--;

             current =iv_rulePeriod; 
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
    // $ANTLR end "entryRulePeriod"


    // $ANTLR start "rulePeriod"
    // InternalMyPricingDsl.g:1777:1: rulePeriod returns [EObject current=null] : ( () otherlv_1= 'Period' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'unit' ( (lv_unit_6_0= ruleTimeUnit ) ) )? otherlv_7= '}' ) ;
    public final EObject rulePeriod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        Enumerator lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalMyPricingDsl.g:1783:2: ( ( () otherlv_1= 'Period' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'unit' ( (lv_unit_6_0= ruleTimeUnit ) ) )? otherlv_7= '}' ) )
            // InternalMyPricingDsl.g:1784:2: ( () otherlv_1= 'Period' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'unit' ( (lv_unit_6_0= ruleTimeUnit ) ) )? otherlv_7= '}' )
            {
            // InternalMyPricingDsl.g:1784:2: ( () otherlv_1= 'Period' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'unit' ( (lv_unit_6_0= ruleTimeUnit ) ) )? otherlv_7= '}' )
            // InternalMyPricingDsl.g:1785:3: () otherlv_1= 'Period' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? (otherlv_5= 'unit' ( (lv_unit_6_0= ruleTimeUnit ) ) )? otherlv_7= '}'
            {
            // InternalMyPricingDsl.g:1785:3: ()
            // InternalMyPricingDsl.g:1786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPeriodAccess().getPeriodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPeriodAccess().getPeriodKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getPeriodAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyPricingDsl.g:1800:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==35) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyPricingDsl.g:1801:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getPeriodAccess().getValueKeyword_3_0());
                    			
                    // InternalMyPricingDsl.g:1805:4: ( (lv_value_4_0= ruleEInt ) )
                    // InternalMyPricingDsl.g:1806:5: (lv_value_4_0= ruleEInt )
                    {
                    // InternalMyPricingDsl.g:1806:5: (lv_value_4_0= ruleEInt )
                    // InternalMyPricingDsl.g:1807:6: lv_value_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPeriodAccess().getValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_value_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPeriodRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyPricingDsl.g:1825:3: (otherlv_5= 'unit' ( (lv_unit_6_0= ruleTimeUnit ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==42) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyPricingDsl.g:1826:4: otherlv_5= 'unit' ( (lv_unit_6_0= ruleTimeUnit ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_61); 

                    				newLeafNode(otherlv_5, grammarAccess.getPeriodAccess().getUnitKeyword_4_0());
                    			
                    // InternalMyPricingDsl.g:1830:4: ( (lv_unit_6_0= ruleTimeUnit ) )
                    // InternalMyPricingDsl.g:1831:5: (lv_unit_6_0= ruleTimeUnit )
                    {
                    // InternalMyPricingDsl.g:1831:5: (lv_unit_6_0= ruleTimeUnit )
                    // InternalMyPricingDsl.g:1832:6: lv_unit_6_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getPeriodAccess().getUnitTimeUnitEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_unit_6_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPeriodRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_6_0,
                    							"lsi.us.es.mis.xtext.MyPricingDsl.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPeriodAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePeriod"


    // $ANTLR start "entryRuleEInt"
    // InternalMyPricingDsl.g:1858:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyPricingDsl.g:1858:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyPricingDsl.g:1859:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyPricingDsl.g:1865:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyPricingDsl.g:1871:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyPricingDsl.g:1872:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyPricingDsl.g:1872:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyPricingDsl.g:1873:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyPricingDsl.g:1873:3: (kw= '-' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==30) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyPricingDsl.g:1874:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleValueType"
    // InternalMyPricingDsl.g:1891:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'NUMERIC' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'TEXT' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyPricingDsl.g:1897:2: ( ( (enumLiteral_0= 'NUMERIC' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'TEXT' ) ) )
            // InternalMyPricingDsl.g:1898:2: ( (enumLiteral_0= 'NUMERIC' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'TEXT' ) )
            {
            // InternalMyPricingDsl.g:1898:2: ( (enumLiteral_0= 'NUMERIC' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'TEXT' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt59=1;
                }
                break;
            case 50:
                {
                alt59=2;
                }
                break;
            case 51:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalMyPricingDsl.g:1899:3: (enumLiteral_0= 'NUMERIC' )
                    {
                    // InternalMyPricingDsl.g:1899:3: (enumLiteral_0= 'NUMERIC' )
                    // InternalMyPricingDsl.g:1900:4: enumLiteral_0= 'NUMERIC'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getValueTypeAccess().getNUMERICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getNUMERICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyPricingDsl.g:1907:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalMyPricingDsl.g:1907:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalMyPricingDsl.g:1908:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getValueTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyPricingDsl.g:1915:3: (enumLiteral_2= 'TEXT' )
                    {
                    // InternalMyPricingDsl.g:1915:3: (enumLiteral_2= 'TEXT' )
                    // InternalMyPricingDsl.g:1916:4: enumLiteral_2= 'TEXT'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getValueTypeAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getTEXTEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleTimeUnit"
    // InternalMyPricingDsl.g:1926:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'SEC' ) | (enumLiteral_1= 'MIN' ) | (enumLiteral_2= 'HOUR' ) | (enumLiteral_3= 'DAY' ) | (enumLiteral_4= 'MONTH' ) | (enumLiteral_5= 'YEAR' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMyPricingDsl.g:1932:2: ( ( (enumLiteral_0= 'SEC' ) | (enumLiteral_1= 'MIN' ) | (enumLiteral_2= 'HOUR' ) | (enumLiteral_3= 'DAY' ) | (enumLiteral_4= 'MONTH' ) | (enumLiteral_5= 'YEAR' ) ) )
            // InternalMyPricingDsl.g:1933:2: ( (enumLiteral_0= 'SEC' ) | (enumLiteral_1= 'MIN' ) | (enumLiteral_2= 'HOUR' ) | (enumLiteral_3= 'DAY' ) | (enumLiteral_4= 'MONTH' ) | (enumLiteral_5= 'YEAR' ) )
            {
            // InternalMyPricingDsl.g:1933:2: ( (enumLiteral_0= 'SEC' ) | (enumLiteral_1= 'MIN' ) | (enumLiteral_2= 'HOUR' ) | (enumLiteral_3= 'DAY' ) | (enumLiteral_4= 'MONTH' ) | (enumLiteral_5= 'YEAR' ) )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt60=1;
                }
                break;
            case 53:
                {
                alt60=2;
                }
                break;
            case 54:
                {
                alt60=3;
                }
                break;
            case 55:
                {
                alt60=4;
                }
                break;
            case 56:
                {
                alt60=5;
                }
                break;
            case 57:
                {
                alt60=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalMyPricingDsl.g:1934:3: (enumLiteral_0= 'SEC' )
                    {
                    // InternalMyPricingDsl.g:1934:3: (enumLiteral_0= 'SEC' )
                    // InternalMyPricingDsl.g:1935:4: enumLiteral_0= 'SEC'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyPricingDsl.g:1942:3: (enumLiteral_1= 'MIN' )
                    {
                    // InternalMyPricingDsl.g:1942:3: (enumLiteral_1= 'MIN' )
                    // InternalMyPricingDsl.g:1943:4: enumLiteral_1= 'MIN'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyPricingDsl.g:1950:3: (enumLiteral_2= 'HOUR' )
                    {
                    // InternalMyPricingDsl.g:1950:3: (enumLiteral_2= 'HOUR' )
                    // InternalMyPricingDsl.g:1951:4: enumLiteral_2= 'HOUR'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyPricingDsl.g:1958:3: (enumLiteral_3= 'DAY' )
                    {
                    // InternalMyPricingDsl.g:1958:3: (enumLiteral_3= 'DAY' )
                    // InternalMyPricingDsl.g:1959:4: enumLiteral_3= 'DAY'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyPricingDsl.g:1966:3: (enumLiteral_4= 'MONTH' )
                    {
                    // InternalMyPricingDsl.g:1966:3: (enumLiteral_4= 'MONTH' )
                    // InternalMyPricingDsl.g:1967:4: enumLiteral_4= 'MONTH'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyPricingDsl.g:1974:3: (enumLiteral_5= 'YEAR' )
                    {
                    // InternalMyPricingDsl.g:1974:3: (enumLiteral_5= 'YEAR' )
                    // InternalMyPricingDsl.g:1975:4: enumLiteral_5= 'YEAR'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getYEAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getYEAREnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleTimeUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000100000FE000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000100000FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000100000F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000100000F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000100000E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000100000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000003C740000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000003C640000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000C0000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003C440000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003C040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000038040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000F800140000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000F800040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000F000040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000E000040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000020740000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000020640000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000020440000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000C20000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00003CC800100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00003CC000100000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00003C8000100000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00003C8000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000388000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00001CC800140000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00001CC000140000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00001C8000140000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00001C8000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000188000040000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000180000040000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000040800040000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x03F0000000000000L});

}