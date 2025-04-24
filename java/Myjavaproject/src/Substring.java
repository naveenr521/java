public class Substring {


    public static void main(String args[]){

        String email="naveenkoppula@gmail.com";

        String username=email.substring(0,6);
        String domain=email.substring(6);
        String username1=email.substring(0,email.indexOf("@"));
        System.out.println(username);
        System.out.println(domain);
        System.out.println(username1);
    }
}
