public class MethodOverriding {

    public static void main(String [] args){
        Animal a = new Animal();

        a.eat();

        Animal b = new Dog();
        b.eat();
    }
}
