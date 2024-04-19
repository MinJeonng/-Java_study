package Java_0419;
import java.util.Scanner;

public class Array_Prac {
	
	public static void main(String[] args) {
		System.out.println("5개의 정수 입력하세요  ");
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		double average =  (double) sum / arr.length;
		System.out.println("평균은 " + average);
		
		scan.close();
		

	}

}
