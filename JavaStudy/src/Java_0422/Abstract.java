package Java_0422;

public abstract class Abstract {

	private String name;

	// 생성자 생
	public Abstract(String name) {
		this.name = name;
	}

	// 추상클래스란?
	// 멤버변수 할당 가능
	// 일반 메소드도 선언 및 정의 가능
	// 추상클래스는 인스턴스화 할 수 없음(Car car = new Car() ~~ 이게 안된다는 의미)
	// 상속가

	// 추상메소드란?
	// 구현이 없는 선언만 가능 ;(세미콜론)으로 끝나야함
	// 상속받은 클래스에서 구현되어야한다.
	// private를 사용하지 못함(상속받아서 실행되는 메소드기떄문에). public, protected 은 사용가능
	// 오버라이딩 필수

	public abstract void start();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
