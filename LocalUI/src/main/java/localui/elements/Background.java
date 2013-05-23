package localui.elements;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

public class Background {
	//background image
	private Image image;
	
	//background color
	private Color color;
	
	//background position
	private BackgroundPosition position;
	
	//background repeat
	private BackgroundRepeat repeat;
	
	//background attachment
	private BackgroundAttachment attachment;

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public BackgroundPosition getPosition() {
		return position;
	}

	public void setPosition(BackgroundPosition position) {
		this.position = position;
	}

	public BackgroundRepeat getRepeat() {
		return repeat;
	}

	public void setRepeat(BackgroundRepeat repeat) {
		this.repeat = repeat;
	}

	public BackgroundAttachment getAttachment() {
		return attachment;
	}

	public void setAttachment(BackgroundAttachment attachment) {
		this.attachment = attachment;
	}
}
