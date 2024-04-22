package Java_0422;

public class Kim extends Student_Abstract {
	public Kim(String name, int numberId, String schoolName, int age) {
		super(name, numberId, schoolName, age);
	}

	@Override
	public String todo() {
		return "김정희 김밥 ";
	}
}
