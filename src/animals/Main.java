package animals;

public class Main {
	
	static Zoo zoo = new Zoo();
	
	
	public static void main(String[] args) {
		zoo.addAnimals();
		zoo.sortMammals();
		zoo.sortBirds();
		zoo.printMammalNoise();
		zoo.printBirdNoise();
		
	}

}
