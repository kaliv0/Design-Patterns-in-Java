package facade;

public class RobotBody {

	// methods for creating robots

	public void createBody() { 
		System.out.println("Creating robot's body.");
	}

	public void createHands() {
		System.out.println("Hands manufactured.");
	}

	public void createRemainingParts() {
		System.out.println("Remaining parts created.");
	}

	// methods for destruction

	public void destroyBody() { 
		System.out.println("Destroying robot's body.");
	}

	public void destroyHands() {
		System.out.println("Hands destroyed.");
	}

	public void destroyRemainingParts() {
		System.out.println("Remaining parts destroyed.");
	}

}
