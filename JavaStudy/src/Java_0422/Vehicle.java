package Java_0422;

public class Vehicle {
	private String model;
	private int maxSpeed;
	private int seats;

	public Vehicle(String model, int maxSpeed, int seats) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.seats = seats;
	}

	public void displayInfo() {
		System.out.println("=======" + model + "=======");
		System.out.print("최대속도: " + maxSpeed + "km/h, 좌석 수: " + seats);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
