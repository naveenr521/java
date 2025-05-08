public class Main3 {
    public static void main(String[]args){

        OverloadedConstructor oc1=new OverloadedConstructor();
        OverloadedConstructor oc2=new OverloadedConstructor("Naveen");
        OverloadedConstructor oc3=new OverloadedConstructor("Nani",24);
        OverloadedConstructor oc4=new OverloadedConstructor("Naveen reddy",24,"A");

        oc1.display();
        oc2.display();;
        oc3.display();
        oc4.display();

    }
}
