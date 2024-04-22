package Java_0422;

public class Dog extends Animal {
	private String favoriteFood;

	public Dog(String name, int age, String favoriteFood) {
		super("강아지", name, age);
		this.favoriteFood = favoriteFood;
	}

	public String makeSound() {
		return super.makeSound() + getSpecies() + "는 멍멍";
	}

	public void eatFood() {
		System.out.println(getName() + "가 가장 좋아하는 음식은 " + favoriteFood);
	}

}
