package Java_0422;

public class ExpressBus extends Vehicle {
	private boolean hasToilet;

	public ExpressBus(String name, int maxSpeed, int seats, boolean hasToilet) {
		super(name, maxSpeed, seats);
		this.hasToilet = hasToilet;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("화장실 유무: " + (hasToilet ? "있음" : "없음"));
	}
}