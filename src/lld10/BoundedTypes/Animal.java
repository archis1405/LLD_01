package lld10.BoundedTypes;

import java.util.List;

public class Animal {
    void eat(){
        System.out.println("EATING......");
    }

    /*
    //Limitation: This method can only accept ArrayList<Animal>, it cannot take ArrayList<Dog>
    public void feedAnimals(List<Animal> animals){
        for(Animal a : animals){
            a.eat();
        }
    }
     */

    //Upper bounded Wildcard
    /*
        List<? extends Animal> --> this means this list will accept anything that extends the animal class, here the
        class animal is defined as a boundary, anything below animal is acceptable , but not above the animal class

    public void feedAnimals(List<? extends Animal> animals){
        for(Animal a : animals){
            a.eat();
        }
    }
     */
}
