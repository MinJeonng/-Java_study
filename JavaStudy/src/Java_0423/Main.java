package Java_0423;

public class Main {

	public static void main(String[] args) {

//		DiabloGame game = new DiabloGame();
//
//		game.up();
//		game.left();
//		game.down();
//		game.right();
//		game.spacebar();
//		JavaInterface.print(); // static메소드는 이렇게 씀.

		// 기본방
		Generic listGeneric = new Generic();
		listGeneric.addElement("Apple");
		listGeneric.addElement("Amazon");
		System.out.println(listGeneric.list.toString());

		// gerneric 사용
		MyCustom<Integer> listCustom = new MyCustom<>();

		listCustom.addElement(3);
		listCustom.addElement(3234);

		System.out.println(listCustom.list.toString());

	}

}
