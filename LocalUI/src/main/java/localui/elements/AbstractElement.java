package localui.elements;

abstract class AbstractElement {
	//box model of current element
	private BoxModel boxModel;
	
	private Position position;

	private Background background;

	
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

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}


}
