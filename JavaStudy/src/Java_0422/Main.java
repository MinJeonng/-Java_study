package Java_0422;

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
		ExpressBus bus = new ExpressBus("고속버스", 120, 50, true);
		Truck truck = new Truck("트럭", 90, 5, 1500);
		Car car = new Car("x2", 220, 5, "blue");

		bus.displayInfo();
		truck.displayInfo();
		car.displayInfo();

	}

}
