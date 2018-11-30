package animals;

import java.util.*;
import java.util.stream.Collectors;

public class Zoo {

	Cat cat = new Cat(2, "Black", 3, 2);
	Dog dog = new Dog(4, "Black", 4, 3);
	Rabbit rabbit = new Rabbit(4, "Black", 1, 1);

	Penguin peguin = new Penguin(4, "Black", 2, 1);
	Eagle eagle = new Eagle(4, "Black", 3, 5, "Golden");

	List<Animal> zoo = new ArrayList<>();

	public List<Animal> addAnimals() {

		zoo.add(eagle);
		zoo.add(peguin);
		zoo.add(cat);
		zoo.add(dog);
		zoo.add(rabbit);

		return zoo;

	}

	public void printMammalNoise() {

		zoo.stream().filter(an -> an instanceof Mammal)
					.map(mammal -> (Mammal) mammal)
					.forEach(m -> System.out.println(m.typeToString() + " Type: " + m.getClass().getSimpleName() + " goes " + m.makeNoise()));

	}

	public void printBirdNoise() {

		zoo.stream().filter(an -> an instanceof Bird)
					.map(bird -> (Bird) bird)
					.forEach(b -> System.out.println(b.typeToString() + " Type: " + b.getClass().getSimpleName() + " goes " + b.makeNoise()));

	}

}
