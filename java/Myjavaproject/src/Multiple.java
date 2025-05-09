
interface Printable {
    void print();


}

interface showable {
    void show();
}

class Document implements Printable, showable {
    public void print() {
        System.out.println("Printing document ");
    }

    public void show() {
        System.out.println("Showing the document");
    }
}


public class Multiple {
    public static void main(String args[]) {
        Document d = new Document();
        d.print();
        d.show();
    }
}
