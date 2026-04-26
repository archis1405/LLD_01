package lld04.inheritance;

public class Instructor extends User{
    private String expertise;
    private double rating;
    private  int courseCreated;

    public Instructor(String id, String userName , String email, String expertise){
        super(id,userName,email);

        this.expertise = expertise;
        this.rating = 0.0;
        this.courseCreated = 0;
    }

    //Create course
    public void createCourse(){
        courseCreated++;
        System.out.println("A new course is created");
    }

    public void setRating(double newRating){
        this.rating = newRating;
    }

    public double getRating() {
        return rating;
    }

    public String getExpertise(){
        return expertise;
    }
}
