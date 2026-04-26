package lld04.inheritance;

public class Main {
    public static void main(String[] args) {
        // Creating a student

        Student anshika = new Student("s01" , "anshika" , "anshika1234@gmail.com" , "Apr28");

        // Method inherited from the Parent class
        System.out.println(anshika.getUserName());
        System.out.println(anshika.getEmail());


        //Method that are only available for the students
        System.out.println(anshika.getBatchId());
        anshika.submitAssignment();

        System.out.println(" ");

        //Creating an Instructor
        Instructor ins = new Instructor("i01" , "isn01" , "isn01@gmail.com", "JAVA, LLD ,DBMS");

        // Method inherited from the Parent class
        System.out.println(ins.getUserName());
        System.out.println(ins.getEmail());

        // Method that are only available for the instructors
        System.out.println(ins.getExpertise());
        ins.createCourse();
    }
}




