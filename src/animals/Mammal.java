package animals;

public abstract class Mammal extends Animal {
	
	int pawSize;
	
	public Mammal(int weight, String colour, int size, int paw) {
		super(weight, colour, size);
		this.pawSize = paw;
	}

	

}
