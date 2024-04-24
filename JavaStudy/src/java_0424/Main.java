package java_0424;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// LinkedList : 데이터의 삽입 및 삭제가 빈번하게 일어나는 작업에 적합
		// ArrayList : 데이터의 접근이 많고, 삽입 및 삭제가 적게 일어나는경우에 적합

		List<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("A");
		linkedList.remove(1);
		System.out.println(linkedList); // 중복된 것 까지 다 출력

		///// Set
		// HashSet : 중복된 건 제외하고 출력됌, 요소의 순서를 보장하지 않는다.
		Set<String> hashSet = new HashSet<>();
		hashSet.add("bird");
		hashSet.add("snake");
		hashSet.add("rabbit");
		hashSet.add("bird");
		System.out.println(hashSet);

		// LinkedHashSet :중복제거, hashSet의 기능유지, 순서를 유지한다.
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("C");
		linkedHashSet.add("G");
		linkedHashSet.add("A");
		linkedHashSet.add("C");
		System.out.println(linkedHashSet);

		// TreeSet : 중복제거 + 순서 오름차순 + 시간복잡도 증가
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("B");
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("C");
		System.out.println(treeSet);

		////// Map
		// HashMap : 객체형태로 출력, key값은 고유해야
		Map<String, Integer> hashMap = new HashMap<>();
		// put으로삽입
		hashMap.put("one", 1);
		hashMap.put("two", 2);
		hashMap.put("three", 3);
		System.out.println(hashMap);

		// LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("three", 3);
		linkedHashMap.put("four", 4);
		linkedHashMap.put("two", 2);
		System.out.println(linkedHashMap);

	}

}
