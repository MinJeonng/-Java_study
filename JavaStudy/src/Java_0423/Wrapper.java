package Java_0423;

public class Wrapper {
	public static void main(String[] args) {
		// 오토박싱 : 기본 데이터타입을 클래스 객체로 바꿔줌
		Integer integerValue = 5;
		// 같은 의미
		// Interger integerValue = Integer.valueOf(5);

		// 오토언박싱 :클래스 객체를 기본 데이터타입으로 바꿔줌
		int intValue = integerValue;

		Integer parseInt = Integer.parseInt("12341234");
		System.out.println(parseInt);

		Integer maxInteger = Integer.max(10, 50);
		System.out.println(maxInteger);
	}
}
