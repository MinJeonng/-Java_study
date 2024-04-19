package Java_0419;
import java.util.ArrayList;
 
public class ArraysList {

	public static void main(String[] args) {
		// 동적 배열 
		ArrayList<String> list = new ArrayList<>();
		
		// add : 요소 추가
		list.add("Google");
		list.add("Samsung");
		list.add(1,"Amazon");
		
		System.out.println(list); //[Google, Amazon, Samsung]
		
		//addAll : 여러 요소 일괄적으로 추가
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("Toss");
		list.addAll(list2);
		System.out.println(list); 
		
		//size : 크기확인
		System.out.println(list.size());
		
		//contains(params) : ArrayList가 params를 포함하고 있는지 여부
		System.out.println(list.contains("Hyundai"));
		
		//get : 특정 요소에 접근
		System.out.println(list.get(2));
		
		//set(index,element) :인덱스에 위치한 값을 교체
		list.set(2, "Hyundai");
		System.out.println(list);
		
		
		//indexOf : 요소의 인덱스값 찾기
		System.out.println(list.indexOf("Samsung"));// 있으면 index값, 없으면 -1
		
		//remove : 요소 삭제
		list.remove("Apple");
		System.out.println(list);

		//isEmpty : ArrayList가비어있는지 확인
		
		//clear ; 모든 요소 삭제
		
	}

}
