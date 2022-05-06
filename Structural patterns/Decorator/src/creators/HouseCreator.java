package creators;

public class HouseCreator implements creators.Creator {
    @Override
    public void makeHouse() {
        System.out.println("Original House is complete. It is closed for modification.");
    }
}
