package decorators;

public class WallDecorator extends decorators.Decorator {

    @Override
    public void makeHouse() {
        super.makeHouse();
        paintWalls();
    }

    private void paintWalls() {
        System.out.println("Now I am painting the house.");
    }
}
