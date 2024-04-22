package Java_0422;

public class Car extends Vehicle {
	private String color;

	public Car(String model, int maxSpeed, int seats, String color) {
		super(model, maxSpeed, seats);
		this.color = color;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("색상 : " + color);
	}
}
