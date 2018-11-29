package testAnimals;
 
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import animals.*;

public class TestAnimal {
	
	@Test
	public void testAnimalConstructor() {
		Animal thing = new Cat(4, "Black", 2, 1);
		assertNotNull(thing);
		
	}
	@Test
	public void testDogNoise() {
		Dog thing = new Dog(4, "Black", 2, 1);
		assertEquals("Bark!", thing.makeNoise());
	}
	@Test
	public void testEagleNoise() {
		Eagle thing = new Eagle(4, "Black", 2, 4);
		assertEquals("Squark!", thing.makeNoise());
	}
	@Test
	public void testEagleSecondConstructors() {
		Eagle thing = new Eagle(4, "Golden", 2, 5, "Golden");
		assertNotNull(thing);
	}
	@Test
	public void testPenguinNoise() {
		Penguin thing = new Penguin(4, "Black", 2, 1);
		assertEquals("Hi", thing.makeNoise());
	}
	@Test
	public void testCatNoise() {
		Cat thing = new Cat(4, "Black", 2, 1);
		assertEquals("Meow!", thing.makeNoise());
	}
	@Test
	public void testRabbitNoise() {
		Rabbit thing = new Rabbit(4, "Black", 2, 1);
		assertEquals("", thing.makeNoise());
	}
	
	@Test
	public void testRabbitConstuctor() {
		Rabbit rabbit = new Rabbit(4, "White", 1, 1);
		assertNotNull(rabbit);
	}
	
	@Test
	public void testZooList() {
		Zoo newZoo = new Zoo();
		assertNotNull(newZoo.addAnimals());
	}
	@Test
	public void testSortAnimals() {
		Zoo newZoo = new Zoo();
		assertNotNull(newZoo);
		
	}
	
	@Test
	public void testSortBirds() {
		Zoo newZoo = new Zoo();
		newZoo.addAnimals();
		assertNotNull(newZoo.sortBirds());
	}
	@Test
	public void testSortMammals() {
		Zoo newZoo = new Zoo();
		newZoo.addAnimals();
		assertNotNull(newZoo.sortMammals());
	}
}
