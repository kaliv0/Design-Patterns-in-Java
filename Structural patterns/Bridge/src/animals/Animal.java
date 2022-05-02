package animals;

import movements.Movement;

public abstract class Animal {
    private final Movement _movement;
    private final String _name;

    protected Animal(Movement movement, String name) {
        _movement = movement;
        _name = name;
    }

    public void displayMovement() {
        System.out.printf("I'm a %s. ", _name);
        System.out.printf("Watch me %s.\n", this._movement.move());
    }
}
