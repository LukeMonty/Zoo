package animals;

public class Dog extends Mammal implements MakeNoise {

	
	
	public Dog(int weight, String colour, int size, int paw) {
		super(weight, colour, size, paw);
	}

	public String makeNoise() {
		return "Bark!";
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}


}
