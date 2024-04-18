package Java_0418;

public class Prac1 {
	public double circle(int radius){
		return radius * Math.PI * radius;
	}
	public int square(int vertical, int horizontal) {
		return vertical * horizontal;
	}
	public int triangle(int height, int base) {
		return height * base * 1/2;
	}
	
	public static void main(String[] args) {
		Prac1 calc = new Prac1();
		
		System.out.printf("반지름이 %d인 원의 넓이 : %f", 5, calc.circle(5)).println();
		System.out.printf("가로 %d,세로 %d인 직사각형의 넓이 : %d", 4,7,calc.square(4, 7)).println();
		System.out.printf("밑변 %d,높이 %d인 삼각형의 넓이 : %d", 6,3,calc.triangle(6, 3));
		

	}

}

