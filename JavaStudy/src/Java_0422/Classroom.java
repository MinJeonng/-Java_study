package Java_0422;

public class Classroom {
	// 멤버변수 이름
	private String roomName;
	private Student[] students; // 학생이 여러명이니까 배열로

	// 생성자에서 받아오는 값, 4행이랑 다른것임. 생성자의 매개변수이름임
	public Classroom(String roomName, Student[] stud) {
		this.roomName = roomName;
		this.students = stud;
	}

	public void print() {
		System.out.println("우리는 서초고등학교 " + roomName + "기 입니다.");
		for (Student student : students) {
			student.print();
		}
	}

}
