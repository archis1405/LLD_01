package lld03.inheritanceandpolymorphism;

public class Main {
    public static void main(String[] args) {
        Address adds1 = new Address("CCU","IND" , "712304");
        CopyConstructor s1 = new CopyConstructor("Anshika", 22 , adds1);

        // Copying object --> this is a shallow copy
        CopyConstructor s2 = new CopyConstructor(s1);

        s2.getAddress().setCity("Gwalior"); // if we do this then s1's city eill also change but this should not happen

        //Both will be delhi here  --> this is a concept of shallow copy but after adding a copy constructor in the address class it then performs deep copy
        System.out.println(s1.getAddress().getCity());
        System.out.println(s2.getAddress().getCity());

        s1.display();
        s2.display();
    }
}
