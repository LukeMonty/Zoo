package animals;

public class Cat extends Mammal implements MakeNoise {

	
	public Cat(int weight, String colour, int size, int paw) {
		super(weight, colour, size, paw);
	}

	@Override
	public String makeNoise() {
		return "Meow!";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}


}
