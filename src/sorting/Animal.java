package sorting;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private String name;
	
	private static List<Animal> animals = List.of(
		new Animal("Giraffe"),
		new Animal("Cow"),
		new Animal("Dog"),
		new Animal("Cat"),
		new Animal("Iguana"),
		new Animal("Mouse"));
			
	
	public Animal(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	
	public static int compare(Animal a1, Animal a2) {
		return a1.name.compareTo(a2.name);
	}

	public static List<Animal> getAnimals() {
		return new ArrayList<>(animals);
	}
	
}
