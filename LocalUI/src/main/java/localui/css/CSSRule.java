package localui.css;

import java.util.ArrayList;

public class CSSRule {
	private CSSSelector selector;
	private ArrayList<CSSAttribute> attributes;
	
	public CSSRule(){
		attributes = new ArrayList<CSSAttribute>();
	}
	
	public CSSRule(CSSSelector selector){
		this.selector = selector;
		attributes = new ArrayList<CSSAttribute>();
	}
	
	public CSSRule(CSSSelector selector, ArrayList<CSSAttribute> attributes){
		this.selector = selector;
		this.attributes = attributes;
	}

	public CSSSelector getSelector() {
		return selector;
	}

	public void setSelector(CSSSelector selector) {
		this.selector = selector;
	}
	
	/**
	 * if the CSS Rule does not contain the attribute specified, then add it in the rule. otherwise, change the contained
	 * attribute with the new one
	 * @param attribute
	 */
	public void addCSSAttribute(CSSAttribute attribute){
		if(attributes.contains(attribute)){
			attributes.get(attributes.indexOf(attribute)).setValue(attribute.getValue());
		}else{
			attributes.add(attribute);
		}
	}

	/**
	 * if the CSS Rule contains the attribute specified, then remove it from the rule.
	 * @param attribute
	 */
	public void removeCSSAttribute(CSSAttribute attribute){
		attributes.remove(attribute);
	}
}
