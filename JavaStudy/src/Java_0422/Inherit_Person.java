package Java_0422;

public class Inherit_Person {
	private int age;
	private String name;

	// 생성자
	public Inherit_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Override annotation : 상속 받았다는 것을 명시적으로 알려주기 위해 작성
	public String toString() {
		return "이름은 " + name + ",나이는 " + age + "입니다.";
	}

}
