package Java_0419;
import  java.util.Arrays;

import javax.print.attribute.IntegerSyntax; 

public class Array {
	//가변적 매개변수
	public static int addNumber(int... nums) { //배열의 개수를 정하지 않고, 그거에 상관없이 어떤 값이든 + 하게 만들어 줌, 그리고 스프레드는 매개변수 중에서 항상 맨 뒤에 잇어야한다.
		int total = 0;
		for(int num : nums) {
			total += num;
			
		}
		return total;
	}

	public static void main(String[] args) {
		//자바의 배열은 정적 할당 : 숫자가 먼저 정해져야한다는 의미 
		//배열의 선언
		int[] arr1 = new int[10]; //정수 10개를 저장하는 배열(10이 10개가 아님)	
		int[] arr2 = {1,2,3,4,5}; //대괄호 : 개수, 중괄호 : 배열안의 값  // 초기값을 가지는 배열
		int[] arr3;
		arr3 = new int[5]; //나중에 배열을 초기화
		
		//배열안에 값넣기
		arr1[5] = 300;
		System.out.println(arr1); // 이렇게 하면 출력값의 주석만 나오게  //[I@7ad041f3
		System.out.println(Arrays.toString(arr1));
		
		////배열 출력
		for(int var : arr2) {
			System.out.printf(var + " ").println();; 
		}
		
		//2차원 배열
		//선언
		int[][] matrix = {
				{1,2,3},
				{100,200,300},
				{8,8,10}
		};
		//첫번째 출력
		for(int[] row :matrix) {
			for(int num : row) { //배열안의 배열을 출력해야하니까 
				System.out.print(num + " ");
			}
		}
		// 두번째 출력방법 
		for (int i = 0; i< matrix.length; i++) { //1행에 [0,1] [0,2] 이렇게 돌아가서 배열이 출력되는 
			for(int j = 0; j < matrix[0].length; j++) { //여기서 1,2 이렇게 적
				System.out.print(matrix[i][j]+ " ");
			}
		}
		
		
		//가변적 매개변수 
		int sum = addNumber(3,4,52,8,4,5,1,4);
		System.out.println("가변적 매개변수: "+ sum);
	}

}
