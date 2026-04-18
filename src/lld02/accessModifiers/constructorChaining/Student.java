package lld02.accessModifiers.constructorChaining;

class Student {
    String name;
    int age;
    String course;

    // Default constructor
    /*
    If we pass only no parameters then first this constructor will be executed then this will
    call the 3 parameter constructor with the default values we are passing from here.
     */
    Student() {
        this("Unknown", 0, "Not Assigned");
        System.out.println("No Args constructor called");
    }
    /*
    If we pass only one parameter name then first this constructor will be executed then this will
    call the 3 parameter constructor with the default values we are passing from here.
     */
    Student(String name) {
        this(name, 0, "Not Assigned");
        System.out.println("Name only Constructor is called");
    }

    // Constructor with 2 params
    /*
    If we pass only 2 parameters then first this constructor will be executed then this will
    call the 3 parameter constructor with the default values we are passing from here.
     */
    Student(String name, int age) {
        this(name, age, "Not Assigned");
        System.out.println("Name and Age constructor called");
    }

    // Main constructor i.e. the full constructor who assigns all the values
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("3-parameter constructor called");
    }

    void display() {
        System.out.println(name + " | " + age + " | " + course);
    }

}

/*
So here one constructor is calling another constructor this is known as Constructor Chaining
FLOW of the code (with an example) :

    From the main function : (only one param is passed)
        Student s = new Student("Oswald");

    1. Student(String name) is called
    2. First line → this(name, 0, "Not Assigned")
    3. Control goes to 3-parameter constructor
    4. 3-parameter constructor executes
    5. Control comes back to Student(String name)
    6. "Name only Constructor is called" gets printed
 */
