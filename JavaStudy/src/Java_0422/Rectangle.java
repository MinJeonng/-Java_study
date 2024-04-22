package Java_0422;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(String color, String type, double width, double height) {
		super(color, type);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

}
