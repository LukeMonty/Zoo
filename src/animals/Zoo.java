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
	List<Animal> mammals = new ArrayList<>();
	List<Animal> birds = new ArrayList<>();

	public List<Animal> addAnimals() {

		zoo.add(eagle);
		zoo.add(peguin);
		zoo.add(cat);
		zoo.add(dog);
		zoo.add(rabbit);

		return zoo;

	}

	public List<Animal> sortMammals() {
		return mammals = zoo.stream().filter(an -> an instanceof Mammal).collect(Collectors.toList());
	}

	public List<Animal> sortBirds() {
		return birds = zoo.stream().filter(an -> an instanceof Bird).collect(Collectors.toList());
	}

	public void printMammalNoise() {
		for (Animal animal : mammals) {
			System.out.println(animal.makeNoise());
		}

	}
	public void printBirdNoise() {
		for (Animal animal : birds) {
			System.out.println(animal.makeNoise());
		}

	}

}
