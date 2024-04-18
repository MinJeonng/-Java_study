package Java_0418;

public class BasicType {

	public static void main(String[] args) {
		int number = 10; //정수형 변수
		double pi = 3.14159; //실수형 변수
		boolean isActive = true; //논리형 변수 
		char initial = 'S'; //문자형 변수 
		//문자 하나는 홑따옴표 
		//문자열은 쌍따옴표 (하나이상) 
		
		
		System.out.println("Number"  + number);
		System.out.println("PI" + pi);
		System.out.println("Is Active ? " + isActive);
		System.out.println("Initial" + initial);
		
		
		////////////////////
		//형식지정자를 이용해서 출력 
		System.out.printf("%d * %d = %d", 10,5, 10*5);
		//%d : 정수
		//%f : 실수(%.숫자f : 숫자까지 소수점 출력 %.2f : 소수점 둘째자리까지)
		//%s : 문자열
		//%c : 문자
		//%b : boolean

	}

}
