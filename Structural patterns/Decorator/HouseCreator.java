package decorator;

public class HouseCreator implements Creator {

	@Override
	public void makeHouse() {

		System.out.println("Original House is complete. It is closed for modification.");

	}

}
