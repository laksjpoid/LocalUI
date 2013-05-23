package localui.elements;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

public class AbstractTextElement extends AbstractElement{
	private Font font;
	
	//text color
	private Color color;

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
