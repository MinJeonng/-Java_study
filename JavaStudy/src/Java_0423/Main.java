package Java_0423;

public class Main {

	public static void main(String[] args) {
		DiabloGame game = new DiabloGame();

		game.up();
		game.left();
		game.down();
		game.right();
		game.spacebar();
		JavaInterface.print(); // static메소드는 이렇게 씀.

	}

}
