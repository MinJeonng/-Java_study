package Java_0418;
import java.util.Scanner;

//아직하는
public class Prac1 {
	public double circle(double radius){
		return radius * Math.PI * radius;
	}

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		
		scan.close();
	}

}

