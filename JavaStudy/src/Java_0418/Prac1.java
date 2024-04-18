package Java_0418;
import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age <= 7) {
			System.out.println("유아 ");
			
		}else if(age >= 8 && age <= 13) {
			System.out.println("초등학생 ");
		}else if (age >= 14 && age <= 16) {
			System.out.println("중학생 ");
		}else {
			System.out.println("성인 ");
		}
		scan.close();
	}

}

