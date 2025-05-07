public class student {

    String name;
    int rollnumber;
    int marks;

    void displayDetails() {
        System.out.println("Name :" + name);
        System.out.println("Roll Number :" + rollnumber);
        System.out.println("Marks :" + marks);
    }

    void ispass() {
        if (marks >= 35) {
            System.out.println(name + " has passed ");
        } else {
            System.out.println(name + " has failed ");
        }
    }
}
