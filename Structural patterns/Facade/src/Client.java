/*
	Provide a unified interface to a set of interfaces in a subsystem.
    Facade defines a higher-level interface that makes the subsystem easier to use
*/
import robots.RobotFacade;

public class Client {
	public static void main(String[] args) {
		RobotFacade robotCreator = new RobotFacade();
		// create robots
		robotCreator.constructAndroid();
		robotCreator.constructSemioid();
		// destroy robots
		robotCreator.destroyAndroid();
		robotCreator.destroySemioid();
	}
}
