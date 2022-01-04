package decorator;

public class FloorDecorator extends Decorator {

	@Override
	public void makeHouse() {

		super.makeHouse();
		addFloor();

	}

	private void addFloor() {
		
		System.out.println("I am making an additional floor on top of it.");
	}
}
