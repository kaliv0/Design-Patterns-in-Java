package facade;

public class RobotFacade {

	private RobotBody body;
	private RobotHands hands;
	private RobotColor color;

	public RobotFacade() {
		this.body = new RobotBody();
		this.hands = new RobotHands();
		this.color = new RobotColor();

	}

	// facade methods for creating the robot = reminds me of the Builder pattern ;)

	public void constructAndroid() {
		System.out.println("Creation of Android Robot starts.");

		this.body.createBody();
		this.color.setSteelColor();

		this.hands.setAndroidHands(); // prepares hands
		this.body.createHands(); // actually creates them

		this.body.createRemainingParts();

		System.out.println("Creation of Android Robot finished.\n");
	}

	public void constructSemioid() {
		System.out.println("Creation of Semioid Robot starts.");

		this.body.createBody();
		this.color.setRedColor();

		this.hands.setSemioidHands(); // prepares hands
		this.body.createHands(); // actually creates them

		this.body.createRemainingParts();
		System.out.println("Creation of Semioid Robot finished.\n");
	}

	// methods for destroying it

	public void destroyAndroid() {
		System.out.println("Destruction of Android Robot starts.");

		this.body.destroyBody();

		this.hands.resetAndroidHands(); // prepares hands
		this.body.destroyHands(); // actually destroys them

		this.body.destroyRemainingParts();
		System.out.println("Creation of Android Robot finished.\n");
	}

	public void destroySemioid() {
		System.out.println("Destruction of Semioid Robot starts.");

		this.body.destroyBody();

		this.hands.resetSemioidHands(); // prepares hands
		this.body.destroyHands(); // actually destroys them

		this.body.destroyRemainingParts();
		System.out.println("Destruction of Semioid Robot finished.\n");
	}

}
