package animals;

public class Eagle extends Bird implements Fly, MakeNoise {


	String type;


	public Eagle(int weight, String colour, int size, int wingSpan) {
		super(weight, colour, size, wingSpan);
	}
	
	public Eagle(int weight, String colour, int size, int wingSpan, String type) {
		super(weight, colour, size, wingSpan);
		this.type = type;
	}

	public void takeOff() {
		
		
	}


	public void inFlight() {
		
		
	}


	public void land() {
		
		
	}

	
	public String makeNoise() {
		return "Squark!";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}


}
