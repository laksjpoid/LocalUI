package localui.css;

import java.io.File;
import java.util.ArrayList;

public class CSSRuleSet {
	private ArrayList<CSSRule> ruleSet;
	
	public CSSRuleSet(ArrayList<CSSRule> ruleSet){
		this.ruleSet = ruleSet;
	}
	
	public CSSRuleSet(String path){
		ruleSet = new ArrayList<CSSRule>();
		//TODO
	}
	
	public CSSRuleSet(File file){
		ruleSet = new ArrayList<CSSRule>();
		//TODO
	}
	
	/**
	 * add rules to ruleset.
	 * @param ruleSet
	 */
	public void addRules(String path){
		//TODO
	}
	
	/**
	 * add rules to ruleset.
	 * @param ruleSet
	 */
	public void addRules(File file){
		
	}
	
	/**
	 * add rules to ruleset.
	 * @param ruleSet
	 */
	public void addRules(ArrayList<CSSRule> ruleSet){
		
	}
	
	public ArrayList<CSSRule> getRuleSet(){
		return ruleSet;
	}
	
	/**
	 * sort the rule set.
	 */
	public void sort(){
		
	}
}
