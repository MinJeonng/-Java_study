package Generic;

public class Pair<k, v> {
	private k key;
	private v value;

	public Pair(k key, v value) {
		this.key = key;
		this.value = value;
	}

	public k getKey() {
		return key;
	}

	public v getValue() {
		return value;
	}

	public static void main(String[] args) {
		Pair<String, Integer> pair1 = new Pair<>("One", 1);
		Pair<Integer, String> pair2 = new Pair<>(2, "Two");

		System.out.println("key : " + pair1.getKey() + ", value : " + pair1.getValue());
		System.out.println("key : " + pair2.getKey() + ", value : " + pair2.getValue());

	}

}
