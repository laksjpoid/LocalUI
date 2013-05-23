package localui.css;

public class CSSSelector {
	private String selector;
	/**
	 * create a CSS selector using a string.
	 * @param selector
	 */
	public CSSSelector(String selector){
		this.selector = selector;
	}
	
	public String getSelector() {
		return selector;
	}
	
	public void setSelector(String selector) {
		this.selector = selector;
	}
	
}
