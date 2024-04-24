package Class;

public class Main {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[2];

		vehicles[0] = new Car("myCar", 100);
		vehicles[1] = new Airplane("myAirplane", 900);

		for (Vehicle vehicle : vehicles) {
			vehicle.move(); // airplane, car에 있는 공통적인 추상 메서드
			if (vehicle instanceof Flyable) {
				// instanceof : 객체가 지정된 유형의 인스턴스인지 여부를 확인하는데 사용하는 비교 연산
				((Flyable) vehicle).fly();
			}
		}
	}
}
