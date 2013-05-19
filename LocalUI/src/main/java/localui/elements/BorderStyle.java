package localui.elements;

public class BorderStyle {
	private String borderStyleName;
	
	public BorderStyle(String borderStyleName){
		this.borderStyleName = borderStyleName;
	}

	public String getBorderStyleName() {
		return borderStyleName;
	}
	public void setBorderStyleName(String borderStyleName) {
		this.borderStyleName = borderStyleName;
	}
	
	public String toString(){
		return borderStyleName;
	}
	
	public static BorderStyle NONE = new BorderStyle("none");
	public static BorderStyle HIDDEN = new BorderStyle("hidden");
	public static BorderStyle DOTTED = new BorderStyle("dotted");
	public static BorderStyle DASHED = new BorderStyle("dashed");
	public static BorderStyle SOLID = new BorderStyle("solid");
	public static BorderStyle DOUBLE = new BorderStyle("double");
	public static BorderStyle GROOVE = new BorderStyle("groove");
	public static BorderStyle RIDGE = new BorderStyle("ridge");
	public static BorderStyle INSET = new BorderStyle("inset");
	public static BorderStyle OUTSET = new BorderStyle("outset");
	public static BorderStyle INHERIT = new BorderStyle("inherit");
}
