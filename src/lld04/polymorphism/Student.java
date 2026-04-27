package lld04.polymorphism;

public class Student extends User { // extends --> keyword
    //Additional attributes for Student
    private String batchId;
    private double psp;
    private int assignmentsCompleted;

    public Student(String id , String userName , String email, String batchId){
        super(id,userName,email); // using super keyword, we are referring to the constructor of the parent
        // super --> refers to the immediate parent class constructor
        this.batchId = batchId;
        this.assignmentsCompleted = 0;
        this.psp = 0.0;
    }

    // ADDITIONAL behaviors specific to this student
    public void submitAssignment(){
        assignmentsCompleted++;
        System.out.println("Assignment submitted");
    }

    public String getBatchId(){
        return batchId;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
    public void setBatchId(String batchId){
        this.batchId = batchId;
    }

    // Overridden method --> the method in the base in the base class in over-ridden
    public String getRole(){
        return "STUDENT";
    }
}
