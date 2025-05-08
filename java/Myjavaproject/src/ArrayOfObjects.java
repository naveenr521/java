public class ArrayOfObjects {

    public static void main(String [] args){

        Book[] b=new Book[3];

        b[0]=new Book("The Hindu",1947,"abc");
        b[1]=new Book("Cricket",2013,"MSD");
        b[2]=new Book("Movie",2020,"Rajamouli");

        for(int i=0;i<b.length;i++){
            b[i].display();
        }

    }
}
