package Java_0422;

public class Baek extends Student_Abstract {
	// 이거 한번에 하기 -> source - > generate constructor using fields
	public Baek(String name, int numberId, String schoolName, int age) {
		super(name, numberId, schoolName, age);
	}

	@Override
	public String todo() {
		return "백종원 김밥";
	}
}
