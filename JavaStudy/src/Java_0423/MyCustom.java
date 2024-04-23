package Java_0423;

import java.util.ArrayList;

//제너릭을 사용하면 main과 같이 출력하는 코드에 따라 타입을 변경해서 쓸 수 잇음 
public class MyCustom<T> {

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T elem) {
		list.add(elem);
	}

}
