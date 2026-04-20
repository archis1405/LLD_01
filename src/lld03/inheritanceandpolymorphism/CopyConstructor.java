package lld03.inheritanceandpolymorphism;

public class CopyConstructor {
    String name;
    int age;
    private  Address address; // Another object address inside the student object

    // Parameterized constructor
    CopyConstructor(String name, int age , Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor other){
        this.name = other.name;
        this.age = other.age;
        // this.address = other.address; --> shallow copy
        this.address = new Address(other.address); // Deep copy calling the address class copy constructor for copying the address
    }
    // This constructor will create a new object with exactly with the same values that other have i.e. s1 passed from main class

    void display() {
        System.out.println(name + " " + age);
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

