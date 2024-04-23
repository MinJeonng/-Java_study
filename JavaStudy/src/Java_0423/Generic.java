package Java_0423;

import java.util.ArrayList;

//이 방법은 따로 타입을 제한하기 떄문에 일일히 타입이수정되면 바꿔야함 
public class Generic {

	ArrayList<String> list = new ArrayList<>();

	public void addElement(String elem) {
		list.add(elem);
	}

}
