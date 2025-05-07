public class Main1 {
    public static void main(String args[]) {

        student s1 = new student();
        s1.name = "Naveen";
        s1.rollnumber = 21;
        s1.marks = 96;

        student s2 = new student();
        s2.name = "Nani";
        s2.rollnumber = 22;
        s2.marks = 96;

        System.out.println("Student1 detials :");
        s1.displayDetails();
        s1.ispass();
        System.out.println("##################################");
        System.out.println("Student2 details ");
        s2.displayDetails();
        s2.ispass();
    }
}
