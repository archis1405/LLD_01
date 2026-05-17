package lld10.BoundedTypes;

import java.util.List;

public class Utility {
    //Upper bounded Wildcard
    /*
        List<? extends Animal> --> this means this list will accept anything that extends the animal class, here the
        class animal is defined as a boundary, anything below animal is acceptable , but not above the animal class

        reading data from this list is safe as whether it is a dog or a cat or any other animal , it will always be
        a part of the animal
     */
    public void feedAnimals(List<? extends Animal> animals){
        for(Animal a : animals){
            a.eat();//every animal is going to have an eat function
        }
    }

    //Lower Bound WildCards
    /*
        List<? super Dog> --> so anything above dog in the hierarchy can be a part of the list , this simply means
        some unknown type that is either dog or a parent of dog
        Dog can go into a dog list , mammal list and a animal list but not into a cat list

        Our current hierarchy : Dog,Cat --> Mammal --> Animal ,
        so in this list dog can be added to a list of animal and mammal , but cat cannot be added to the list of dog

     */
}
