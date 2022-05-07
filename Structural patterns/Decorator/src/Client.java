/*
    Attach additional responsibilities to an object dynamically.
    Decorators provide a flexible alternative to subclassing for extending functionality
 */

import creators.HouseCreator;
import decorators.*;

public class Client {

    public static void main(String[] args) {

        System.out.println("Creating a house without decorating it");
        HouseCreator houseCreator = new HouseCreator();
        houseCreator.makeHouse();
        System.out.println("-----------");

        // ------------------------------------------------------------

        System.out.println("Creating a house and adding an additional floor");
        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setCreator(houseCreator);
        floorDecorator.makeHouse();
        System.out.println("-----------");

        // -------------------------------------------------------------

        System.out.println("Creating a house, adding an additional floor and painting the walls");
        WallDecorator wallDecorator = new WallDecorator();
        wallDecorator.setCreator(floorDecorator);
        wallDecorator.makeHouse();
        System.out.println("-----------");
    }
}
