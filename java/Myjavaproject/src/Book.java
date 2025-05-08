public class Book {

    String name;
    int year;
    String author;

    public Book(String name,int year,String author){
        this.name=name;
        this.year=year;
        this.author=author;
    }

    public void display(){
        System.out.println("Name :" + name + "Year : " + year +  "Author : " + author);
    }


}
