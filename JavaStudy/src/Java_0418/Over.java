package Java_0418;

public class Over {
	
	//메소드 오버로딩
	//정수 두개를 더하는 오버로딩
	public int add(int a, int b) {
		return a + b;
		
	}
	//실수 두개를 더하는 메소드
	public double add(double a, double b) {
		return a+ b;
		
	}
	//정수 세개를 더하는 메소드
	public int add(int a, int b, int c) {
		return a + b+ c;
		
	}

	public static void main(String[] args) {
		//실행되는건 main 아래
		Over calc = new Over();
		System.out.println(calc.add(10, 30));
		System.out.println(calc.add(5.3, 7.2));
		System.out.println(calc.add(10, 100,1000));
		
		

	}

}