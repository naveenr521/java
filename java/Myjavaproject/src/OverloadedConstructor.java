public class OverloadedConstructor {
    String name;
    int age;
    String grade;

    // Constructor 1 - No parameters
    public OverloadedConstructor() {
        name = "Unknown";
        age = 0;
        grade = "Not Assigned";
    }

    // Constructor 2 - Name only
    public OverloadedConstructor(String name) {
        this.name = name;
        this.age = 0;
        this.grade = "Not Assigned";
    }

    // Constructor 3 - Name and Age
    public OverloadedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = "Not Assigned";
    }

    // Constructor 4 - Name, Age, and Grade
    public OverloadedConstructor(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}
