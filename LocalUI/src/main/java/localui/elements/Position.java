package localui.elements;

public class Position {
	private PositionType positionType;
	private int left; //px
	private int top;
	
	public Position(PositionType positionType, int left, int top){
		this.positionType = positionType;
		this.left = left;
		this.top = top;
	}

	public PositionType getPositionType() {
		return positionType;
	}

	public void setPositionType(PositionType positionType) {
		this.positionType = positionType;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
}
