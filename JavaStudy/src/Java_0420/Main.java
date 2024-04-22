package Java_0420;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Prac circle = new Class_Prac(10);

		double area = circle.calculatorArea();

		System.out.println("원의 반지름을 입력하세요 : " + 10);
		System.out.println("원의 반지름 : " + circle.getRadius());
		System.out.println("원의 넓이 : " + area);
	}

}
