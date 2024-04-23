package Java_0423;

import java.util.ArrayList;

//제너릭을 사용하면 main과 같이 출력하는 코드에 따라 타입을 변경해서 쓸 수 잇음 
public class MyCustom<T> {

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T elem) {
		list.add(elem);
	}

}
//public class MyCuston<T extends Number> -> 이렇게 시작되면 넘버만(이게 정수만있다기 보다 오른쪽 클릭 -> type hiercy? 거기 누르면 뭐뭐 있는지 확인가능) 들어올 수 있다고 제한