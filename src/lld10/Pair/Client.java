package lld10.Pair;

public class Client {
    public static void main(String[] args) {
        //Pair here is used as a custom data-structure to store the students name,marks
        Pair studentData = new Pair("Rahul",95);

        //Problem
        studentData.setFirst(42);
        // this should not happen, there must be a check as we are putting a number in place of a name

        String name = studentData.getFirst();// throwing error as we are trying to store an object inside a string
        /*
            Compiler sees an object , it is perfectly legal,
            but at runtime it sees an Object(integer) -> string, which impossible to cast -> so it will crash
         */
    }
}

