package sorting;

import java.util.stream.Collectors;

public class AnimalStream {

	public static void main(String[] args) {
		new AnimalStream().run();

	}

	private void run() {
		//@formatter:off
		String animals = Animal.getAnimals().stream()
		.map(Animal::toString)
		.sorted()
		.collect(Collectors.joining(", "));
		//@formatter:on
		
		System.out.println(animals);
		
	}

}
