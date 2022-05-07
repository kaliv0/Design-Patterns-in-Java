package factories;

import animals.Animal;

public abstract class Factory {
    public abstract Animal createAnimal(String animalType);
}
