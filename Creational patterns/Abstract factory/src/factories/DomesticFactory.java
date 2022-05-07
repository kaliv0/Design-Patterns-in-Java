package factories;

import animals.*;

public class DomesticFactory extends Factory {
    @Override
    public Animal createAnimal(String animalType) {
        Animal animal = null;

        if (animalType.equals("cat")) {
            animal = new Cat();
        } else if (animalType.equals("dog")) {
            animal = new Dog();
        }
        return animal;
    }
}
