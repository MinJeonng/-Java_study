package Java_0422;

public abstract class Shape {
	private String color;
	private String type;

	public Shape(String color, String type) {
		this.color = color;
		// type은 set,get 사용함!!
		this.setType(type);
	}

	public abstract double calculateArea();

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	};

}
