package Java_0422;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// 1번째실습bookstore 실습
//		Bookstore bookstore = new Bookstore("교보문고", 1000);
//		bookstore.print();
//
//		Class_Prac circle = new Class_Prac(40);
//		System.out.println(circle.getRadius());

		// student, classroom 실
//		Student s1 = new Student("루미", 19);
//		Student s2 = new Student("루미컨", 20);
//		Student s3 = new Student("랄리", 17);
//
//		Student[] students = { s1, s2, s3 };
//		Classroom seocho = new Classroom("동창22", students);
//
//		seocho.print();

		// inherit 실습
//		Inherit_Student student = new Inherit_Student("코딩온", 22, "홍길동");
//		System.out.println(student);

		// 상속 첫번째 실습
//		Cat cat = new Cat("이브", 3, "딸랑이");
//		Dog dog = new Dog("베키", 9, "닭가슴살 ");
//
//		System.out.println(cat.makeSound());
//		cat.playWithToy();
//
//		System.out.println(dog.makeSound());
//		dog.eatFood();

		// 상속 두번째 실습
//		ExpressBus bus = new ExpressBus("고속버스", 120, 50, true);
//		Truck truck = new Truck("트럭", 90, 5, 1500);
//		Car car = new Car("x2", 220, 5, "blue");
//
//		bus.displayInfo();
//		truck.displayInfo();
//		car.displayInfo();

		// 추상클래스 실습
//		Motorcyle_Abstract car = new Motorcyle_Abstract("부가티");
//		car.start();

		// 추상클래스 실습 1
//		Student_Abstract kim = new Kim("김철수", 20220001, "ABC고등학교", 17);
//		Student_Abstract baek = new Baek("백영희", 20220002, "msk고등학교", 18);
//
//		kim.print();
//		baek.print();

		// 추상클래스 실습2
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle("Red", "circle", 2.5));
		shapes.add(new Rectangle("Blue", "rectangle", 3, 12));

		for (Shape shape : shapes) {
			System.out.println("=====" + shape.getType() + " 도형의 정보입니다. =====");
			System.out.printf("도형의 색상 : %s\n", shape.getColor());
			System.out.printf("도형의 넓이 : %.3f\n ", shape.calculateArea());
		}
	}

}
