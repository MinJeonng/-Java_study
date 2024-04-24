package java_0424;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 , -1을 입력하면 종료됩니다.");
		while (true) {
			System.out.println("정수입력 :");
			Integer textString = scan.nextInt();
			if (textString.equals(-1)) {
				break;
			}
			hashSet.add(textString);
		}

		System.out.println("중복 제거된 정수 목록 : " + hashSet);
		scan.close();

	}

}
