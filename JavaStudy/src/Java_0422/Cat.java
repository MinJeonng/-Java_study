package Java_0422;

public class Cat extends Animal {
	private String favoriteToy;

	public Cat(String name, int age, String favoriteToy) {
		super("고양이", name, age);
		this.favoriteToy = favoriteToy;

	}

	public String makeSound() {
		return super.makeSound() + getSpecies() + "는 야옹";
	}

	public void playWithToy() {
		System.out.println(getName() + "가 가장 좋아하는 장난감은 " + favoriteToy);
	}

}
