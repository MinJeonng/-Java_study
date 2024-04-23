package Java_0423;

import java.util.ArrayList;

//extends : ~을 상속하는
//super : ~이 상속하는 

public class MethodEx {

	// 타입 파라미터를 사용하는 메소드 : 데이터타입을 매개변수처럼 다루게 해준다
	public <T> void print(T value) {
		System.out.println(value);
	}

	// 리턴이 있는 메소드
	public <T> T returnTypeMethod(T[] arr) {
		return arr[0];
	}

	// extends키워드
	public <T extends Number> double sum(T[] arr) {
		double sum = 0.0;
		for (T num : arr) {
			sum += num.doubleValue(); // int면 Intvalue....
		}
		return sum;
	}

	// super 키워드
	public <T> void addList(ArrayList<? super T> list, T value) {
		list.add(value);
	}

	public static void main(String[] args) {
		MethodEx examplEx = new MethodEx();

		// 타입파라미터 사용 메소드
		examplEx.print("Hi");

		// 리턴타입이 ㅣ있는 메소드
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] doubsDoubles = { 2.3, 13.3, 12.4, 1.2 };
		System.out.println(examplEx.returnTypeMethod(ints));
		System.out.println(examplEx.returnTypeMethod(doubsDoubles));

		// extends 키워드
		System.out.println(examplEx.sum(ints));

		// super 키워드
		ArrayList<Number> numList = new ArrayList<>();
		examplEx.addList(numList, 10);
		examplEx.addList(numList, 3.23); // Number가 상속하는 것들을 넣어주면 된다. (Double, Int, ----등)
	}

}
