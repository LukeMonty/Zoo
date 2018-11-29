package animals;

public abstract class Animal implements MakeNoise{
	int weight;	
	String colour;
	int size;
	
	public Animal(int weight, String colour, int size) {
		this.weight = weight;
		this.colour = colour;
		this.size = size;
	}
	
	public abstract void eat();
	
}
