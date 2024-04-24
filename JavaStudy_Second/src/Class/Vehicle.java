package Class;

//추상클래스 생성 
public abstract class Vehicle {
	private String name;
	private int maxSpeed;

	public Vehicle(String name, int maxSpeed) {
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	// 추상메소드
	public abstract void move();

}
