package lld01.basics;

public class Students {
    // Attributes of the student i.e. data associated to the student
    int age;
    String name;
    String batch;
    double psp;

    // Behaiviours (or methods) of the students i.e. the actions the student can perform ,
    void changepsp(double newPsp){
        psp = newPsp;
    }

    void PauseBatch(){
        //Logic to pause the batch
    }

    void giveMockInterview(){
        //Logic for implementing mock interview
    }
}
