package lld01.basics.employee;

/*
PROBLEM STATEMENT : Design a Employee class for managing the employees

    Requirements :

    1. An employee has name,email,phn,department,salary,role and yoe
    2. An employee can get a promotion (increase salary by 10% on promotion)
    3. An employee can change the department
    4. Display the employee details

 */

public class Employee {
    String name;
    String employeeId;
    String email;
    String phnNumber;
    String dept;
    double salary;
    String role;
    int yoe;

    void promote(double percentage){
        double increament = (salary * percentage) / 100.0;
        salary = salary + increament;

        System.out.println("The new Salary is : Rs. " + salary);
    }

    void changeDept(String newDept){
        String oldDept = dept;
        dept = newDept;

        System.out.println("The employee is shifted from " + oldDept + " to "+ newDept);
    }

    void display(){
        System.out.println("Name : " +name);
        System.out.println("EmployeeID : " +employeeId);
        System.out.println("Email : " +email);
        System.out.println("Phone Number : " +phnNumber);
        System.out.println("Department : Rs. " +dept);
        System.out.println("Salary : Rs. " +salary);
        System.out.println("Role : " +role);
        System.out.println("Years Of Experience : " +yoe);
        System.out.println("THANK YOU");
    }

}
