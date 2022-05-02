package factory.factories;

import factory.animals.Animal;
import factory.animals.Cat;

public class CatFactory extends Factory {

    @Override
    public Animal createAnimal() {
        System.out.println("New cat is created");
        return createInstance();
    }

    @Override
    public Animal createInstance() {
        return new Cat();
    }
}
