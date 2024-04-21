package Java_0418;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 숫자 예
//		System.out.println("수를 입력하세요");
//		int num = scan.nextInt();

		// if-else문
//	   if(num % 3 == 0) {
//		   System.out.println("3의배수입니다.");
//		   
//	   }else {
//		   System.out.println("3의 배수가 아닙니다.");
//		   
//	   }

		// switch 문
//		switch(num%3) {
//		case 0 :
//			System.out.println("3의 배수입니다.");
//			break;
//		default:
//			System.out.println("3의 배수가 아닙니다.");
//		}

		// 문자열 비교
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine(); // 엔터이전까지 문자열 읽음

		if (name.equals("홍길동")) {
			System.out.println("홍길동님 환영합니다.");

		} else {
			System.out.printf("%s님 환영합니다.", name);
		}
		scan.close();

	}

}
