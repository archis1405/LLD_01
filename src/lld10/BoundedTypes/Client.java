package lld10.BoundedTypes;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        dogs.add(new Dog());

        // List<Animal> animals = dogs; this will throw an error


        Utility utility = new Utility();

        utility.feedAnimals(dogs);
        utility.feedAnimals(cats);
        utility.feedAnimals(animals);

        /*
            We are able to pass a dog here and it is not throwing an error?
            -> List<Dog> is not a child of List<Animal>
         */
    }
}
