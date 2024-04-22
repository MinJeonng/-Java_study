package Java_0422;

public class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.printf("제 이름은 %s이고, 나이는 %d입니다.", name, age).println();

	}
}
