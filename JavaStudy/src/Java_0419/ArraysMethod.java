package Java_0419;

import java.util.Arrays;

public class ArraysMethod {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; //배열 초기화
		
		//copyof :특정 길이 만큼 복사한 새 배열을 반환
		int[] copyOfArr = Arrays.copyOf(arr, 4);
		System.out.println(Arrays.toString(copyOfArr));
		
		//copyOfRange : 시작 인덱스부터 종료 인덱스 전까지의 부분을 복사한 새 배열을 반환
		int[] copyOfRangeArr = Arrays.copyOfRange(arr, 1, 3); //[2,3]
		System.out.println(Arrays.toString(copyOfRangeArr));
		
		//fill : 배열의 모든 요소를 주어진 값으로 채움
		Arrays.fill(arr, 10); //원본값이 달라짐 
		System.out.println(Arrays.toString(arr)); 
		
		//fill로 부분 요소 채움
		int[] arr2 = new int[10];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		Arrays.fill(arr2, 3,arr2.length,100); //(해당배열을, 3부터(시작),~까지, 이값으로 채운다)
		System.out.println(Arrays.toString(arr2));
		
		//sort : 배열을 오름차순으로 정렬
		int[] arr3 = {3,7,2,8,10};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		//equals : 두 배열이 같은지 여부 확인
		int[] arr4 = {1,2,3,4,5};
		System.out.println(Arrays.equals(arr3, arr4));
		
		//deepEquals : 다차원 배열 비교
		int[][] arrs1 = {{1,2},{5,6}};
		int[][] arrs2 = {{5,2},{8,9}};
		
		System.out.println(Arrays.deepEquals(arrs1, arrs2));
		
		//binarySearch : 특정값의 인덱스값 찾기,  항상 정렬이 되어 있어야함 
		int index = Arrays.binarySearch(arr3, 10); //(이 배열에, 이 값이 어디있는지?)
		System.out.println(index);

}
}
