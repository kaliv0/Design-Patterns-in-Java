/*
    The Bridge pattern divides business logic or huge class into separate
    class hierarchies that can be developed independently.

    Difference with the Adapter pattern =>
    "Adapter makes things work after they're designed;
    Bridge makes them work before they are. [GoF, p219]"
 */

import animals.*;
import movements.*;

public class Client {
    public static void main(String[] args) {
        var swim = new Swim();
        var walk = new Walk();
        var fly = new Fly();
        var crawl = new Crawl();

        var walkingDog = new Dog(walk);
        walkingDog.displayMovement();

        var swimmingDog = new Dog(swim);
        swimmingDog.displayMovement();

        var flyingDuck = new Duck(fly);
        flyingDuck.displayMovement();

        var walkingDuck = new Duck(walk);
        walkingDuck.displayMovement();

        var dolphin = new Dolphin(swim);
        dolphin.displayMovement();

        var snake = new Snake(crawl);
        snake.displayMovement();
    }
}
