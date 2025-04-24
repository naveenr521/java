public class StringMethods {

    public static void main (String args[]){

        String name = "naveen reddy";

        int length=name.length();
char letter =name.charAt(5);
int index=name.indexOf(" ");
int lastindex=name.lastIndexOf("n");
name=name.trim();
name=name.replace("naveen","Nani");

if(name.isEmpty()){
    System.out.println("your name is empty");
}
else{
    System.out.println("Hello " + name);
}

if(name.contains(" ")){
    System.out.println("Your name contains spaces ");
}
else{
    System.out.println("No spaces ");
}
if(name.equals("password")){
    System.out.println("Your name canot be password ");
}
else{
    System.out.println("Hi " + name );
}

if(name.equalsIgnoreCase("password")){
    System.out.println("Your name can't be password ");
}
else{
    System.out.println("Good " + name );
        }


System.out.println(index);
        System.out.println(length);
        System.out.println(letter);
        System.out.println(lastindex);
        System.out.println(name);
        System.out.println(name);

    }
}
