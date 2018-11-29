package animals;

public abstract class Bird extends Animal {

	int wingSpan;
	
	public Bird(int weight, String colour, int size, int wingSpan) {
		super(weight, colour, size);
		this.wingSpan = wingSpan;
	}
	
}
