package Java_0419;
import  java.util.Arrays; 

public class Array {

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
	}

}
