package Java_0422;

public class Truck extends Vehicle {
	private int loadCapacity;

	public Truck(String model, int maxSpeed, int seats, int loadCapacity) {
		super(model, maxSpeed, seats);
		this.loadCapacity = loadCapacity;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("적재 용량: " + loadCapacity + "kg");
	}
}
