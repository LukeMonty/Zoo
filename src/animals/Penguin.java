package animals;

public class Penguin extends Bird implements MakeNoise{

	public Penguin(int weight, String colour, int size, int wingSpan) {
		super(weight, colour, size, wingSpan);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Hi";
	}
	
	

}
