package Java_0419;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// 0으로 숫자를 나눈 경우
		try {
			int num1 = 4;
			int num2 = 0;
			System.out.printf("num1/num2 = %d", num1/num2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0으로 나누어서 예외발생 ");
		
		}
		
		//index 범위를 벗어났을때
		int[] intArray = {1,2,3,4,5};
//		for(int i = 0; i < 6; i++) { //오류발생 
//			System.out.println(intArray[i]);
//		}
		try {
			for(int i = 0; i < 6; i++) { //오류발생 
				System.out.println(intArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스 범위가 벗어났습니다.");
		}
		
		
		//입력오류 발생시 
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 ");
	    try {
	    	int num = scan.nextInt();
			System.out.println("입력된 정수는 : "+ num);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("입력오류 ");
			
		}
	    
	    
	  
	   
		
	}

}
