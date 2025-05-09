public class MethodOverloading {

public static void main(String []args){
    Teacher t= new Teacher();

    System.out.println(t.students("nani",24,21));
    System.out.println(t.students("Naveen",21));
    System.out.println(t.students(91,5.2));
}
}
