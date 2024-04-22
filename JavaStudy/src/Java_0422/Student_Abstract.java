package Java_0422;

public abstract class Student_Abstract {
	private String name;
	private int numberId;
	private String schoolName;
	private int age;

	public Student_Abstract(String name, int numberId, String schoolName, int age) {
		this.name = name;
		this.numberId = numberId;
		this.schoolName = schoolName;
		this.age = age;
	}

	public abstract String todo();

	public void print() {
		System.out.println("=====" + name + " 학생의 정보 =====");
		System.out.println("학교 : " + schoolName);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + numberId);
		System.out.printf("점심은 %s\n", todo());
	}

}
