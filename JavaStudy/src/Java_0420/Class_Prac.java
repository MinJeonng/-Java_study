package Java_0420;

//final 실습 circle 클래스 만들기 
public class Class_Prac {

	// 반지름 radius필드
	private final double radius; // 멤버변수는 항상 프라이빗
	// 원주율 상수 선언
	static final double PI = Math.PI;

	// 생성자를 이용한 반지름 초기화
	public Class_Prac(double radius) {
		this.radius = radius;
	}

	// 원의 넓이를 계산하는 메소드
	public double calculatorArea() {
		return PI * radius * radius;
	}

	// 원의 반지름 가져오기 getter
	// getter, setter : 우측클릭 -> source -> Generate Getter and Setter
	public double getRadius() {
		return radius;
	}

}
