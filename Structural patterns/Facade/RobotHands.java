package facade;

public class RobotHands {

	// methods for creating hands
	public void setAndroidHands() {
		System.out.println("The robot will have android hands.");
	}

	public void setSemioidHands() {
		System.out.println("The robot will have semioid hands.");
	}

	// methods for resetting hands
	public void resetAndroidHands() {
		System.out.println("Android hands are about to be destroyed.");
	}

	public void resetSemioidHands() {
		System.out.println("Semioid hands are about to be destroyed.");
	}
}
