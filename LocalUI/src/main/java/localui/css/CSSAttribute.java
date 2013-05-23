package localui.css;

public class CSSAttribute {
	private String name;
	private String value;
	
	public CSSAttribute(String name){
		this.name = name;
	}
	
	public CSSAttribute(String name, String value){
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public int hashCode(){
		return name.hashCode();
	}
	
	/**
	 * consider the attribute to be the same if they have same name.
	 */
	public boolean equals(Object o){
		if(o instanceof CSSAttribute){
			if(((CSSAttribute) o).getName().equalsIgnoreCase(name)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
