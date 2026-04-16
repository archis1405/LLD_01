package lld01.basics.employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "anshika";
        e1.employeeId = "0001";
        e1.email = "anshikas.18@gmail.com";
        e1.salary = 500000.0;
        e1.dept = "TECH";
        e1.phnNumber = "1234567873";
        e1.role = "CEO";
        e1.yoe = 1;

        e1.promote(200.0);

        e1.changeDept("finance");

        e1.display();
    }
}
