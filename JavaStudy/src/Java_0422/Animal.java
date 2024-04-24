package Java_0422;

public class Animal {
	private String species;
	private String name;
	private int age;

	public Animal(String species, String name, int age) {
		this.species = species;
		this.setName(name);
		this.age = age;
	}

	public String makeSound() {
		return "동물이 소리를 내요";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

}
