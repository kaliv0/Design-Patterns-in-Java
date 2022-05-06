package decorators;

import creators.Creator;

//Decorator implements Creator interface to enable composition of several decorators
public abstract class Decorator implements Creator {
    private Creator _creator;

    // NB => the abstract class doesn't need to have abstract methods
    // the opposite isn't true
    public void setCreator(Creator creator) {
        _creator = creator;
    }

    public void makeHouse() {
        _creator.makeHouse(); // delegating the task
    }
}
