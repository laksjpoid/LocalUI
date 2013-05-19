package localui.elements;

public class FontWeight {
	private int weight;
	
	public FontWeight(int weight){
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public static FontWeight NORMAL = new FontWeight(400);
	public static FontWeight BOLD = new FontWeight(700);
}
