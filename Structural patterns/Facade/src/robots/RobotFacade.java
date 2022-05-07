package robots;

public class RobotFacade {
    private final RobotBody _body;
    private final RobotHands _hands;
    private final RobotColor _color;

    public RobotFacade() {
        _body = new RobotBody();
        _hands = new RobotHands();
        _color = new RobotColor();
    }

    // facade methods for creating the robot = reminds me of the Builder pattern ;)
    public void constructAndroid() {
        System.out.println("Creation of Android Robot starts.");

        _body.createBody();
        _color.setBlackColor();

        _hands.setAndroidHands(); // prepares hands
        _body.createHands(); // actually creates them

        _body.createRemainingParts();
        System.out.println("Creation of Android Robot finished.\n");
    }

    public void constructSemioid() {
        System.out.println("Creation of Semioid Robot starts.");

        _body.createBody();
        _color.setRedColor();

        _hands.setSemioidHands(); // prepares _hands
        _body.createHands(); // actually creates them

        _body.createRemainingParts();
        System.out.println("Creation of Semioid Robot finished.\n");
    }

    // methods for destroying it
    public void destroyAndroid() {
        System.out.println("Destruction of Android Robot starts.");

        _body.destroyBody();

        _hands.resetAndroidHands(); // prepares hands
        _body.destroyHands(); // actually destroys them

        _body.destroyRemainingParts();
        System.out.println("Creation of Android Robot finished.\n");
    }

    public void destroySemioid() {
        System.out.println("Destruction of Semioid Robot starts.");

        _body.destroyBody();

        _hands.resetSemioidHands(); // prepares hands
        _body.destroyHands(); // actually destroys them

        _body.destroyRemainingParts();
        System.out.println("Destruction of Semioid Robot finished.\n");
    }
}
