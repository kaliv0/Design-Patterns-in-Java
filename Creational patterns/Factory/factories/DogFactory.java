package factory.factories;

import factory.animals.Animal;
import factory.animals.Dog;

public class DogFactory extends Factory {

    @Override
    public Animal createAnimal() {
        System.out.println("New dog is created");
        return createInstance();
    }

    @Override
    public Animal createInstance() {
        return new Dog();
    }
}
