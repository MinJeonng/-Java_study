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

	// extends키워드 : 읽기 전용 주로 사용
	public <T extends Number> double sum(T[] arr) {
		int sum = 0;
		for (T num : arr) {
			sum += num.doubleValue(); // int면 Intvalue....
		}
		return sum;
	}

	public void wildList(ArrayList<? extends Number> list) {
		// list.add(1); 불가능 , 읽기전용이라 쓸 수가 없음
	}

	// super 키워드 : 쓰기 전용으로 주로 사용
	public <T> void addList(ArrayList<? super T> list, T value) {
		// T 타입 또는 T 타입의 슈퍼타입을 포함하는 객체를 나타내는 데 사용.
		// 즉, 이 메소드는 T 타입의 객체 또는 T 타입의 슈퍼클래스 객체들을 포함할 수 있는 리스트를 매개변수로 받을 수 있다는 것을 의미
		list.add(value);
		System.out.println(list);
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
//		ArrayList<Number> numList = new ArrayList<>();
//		examplEx.addList(numList, 10);
//		examplEx.addList(numList, 3.23); // Number가 상속하는 것들을 넣어주면 된다. (Double, Int, ----등)

		ArrayList<Integer> numList = new ArrayList<>();
		examplEx.addList(numList, 10); // Integer니까 3.23과 같은 것 들이 안들어간다.

		// 와일드카드 주의사항

		// 1. 복잡성 : 와일드 카드를 과도하게 사용하게 되면 복잡성이 증가하여 협업에 적합하지 않음.
		// 2. 제한된 작업 : '? extends T' 같은 경우 새로운 요소 추가 불가능

	}

}
