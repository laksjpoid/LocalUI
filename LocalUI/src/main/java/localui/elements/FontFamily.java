package localui.elements;

public class FontFamily {
	private String fontName;
	
	public FontFamily(String fontName){
		this.fontName = fontName;
	}

	public String getFontName() {
		return fontName;
	}
	public void setFontName(String fontName) {
		this.fontName = fontName;
	}
	
	public static FontFamily Serif = new FontFamily("Serif");
	public static FontFamily Sans_serif = new FontFamily("Sans-serif");
	public static FontFamily Monospace = new FontFamily("Monospace");
	public static FontFamily Cursive = new FontFamily("Cursive");
	public static FontFamily Fantasy = new FontFamily("Fantasy");
}
