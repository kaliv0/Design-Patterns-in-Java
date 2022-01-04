package decorator;

//Decorator implements Creator interface to enable composition of several decorators
public abstract class Decorator implements Creator {

	private Creator creator;

	// NB => the abstract class doesn't need to have abstract methods
	// the opposite isn't true

	public void setCreator(Creator creator) {

		this.creator = creator;
	}

	public void makeHouse() {

		creator.makeHouse(); // delegating the task

	}

}
