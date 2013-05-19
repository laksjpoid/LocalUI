package localui.elements;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

abstract class AbstractElement {
	//box model of current element
	private BoxModel boxModel;
	
	private Position position;

	private Image backgroundImage;
	private Color backgroundColor;
	private BackgroundPosition backgroundPosition;
	private BackgroundRepeat backgroundRepeat;
	private BackgroundAttachment backgroundAttachment;
	
	//text color
	private Color color;
	private Font font;
	
	public BoxModel getBoxModel() {
		return boxModel;
	}

	public void setBoxModel(BoxModel boxModel) {
		this.boxModel = boxModel;
	}
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}


	public Image getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(Image backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public BackgroundPosition getBackgroundPosition() {
		return backgroundPosition;
	}

	public void setBackgroundPosition(BackgroundPosition backgroundPosition) {
		this.backgroundPosition = backgroundPosition;
	}

	public BackgroundRepeat getBackgroundRepeat() {
		return backgroundRepeat;
	}

	public void setBackgroundRepeat(BackgroundRepeat backgroundRepeat) {
		this.backgroundRepeat = backgroundRepeat;
	}

	public BackgroundAttachment getBackgroundAttachment() {
		return backgroundAttachment;
	}

	public void setBackgroundAttachment(BackgroundAttachment backgroundAttachment) {
		this.backgroundAttachment = backgroundAttachment;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}
}
