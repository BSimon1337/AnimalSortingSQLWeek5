package sorting;

import java.util.List;

public class AnimalSort {
	
	public static void main(String[] args) {
		new AnimalSort().run();
	}

	private void run() {
		List<Animal> lambdaAnimals = sortByLambda();
		System.out.println(lambdaAnimals);
	}

	private List<Animal> sortByLambda() {
		List<Animal> lambdaAnimals = Animal.getAnimals();
		lambdaAnimals.sort((a1, a2) -> Animal.compare(a1, a2));	
		return lambdaAnimals;
	}

}
