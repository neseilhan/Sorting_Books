import java.util.*;
import java.util.TreeSet;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Books> booksByTitle = new TreeSet<>(); //Treeset Books created.

        Books book1 = new Books("Pride and Prejudice", 279, "Jane Austen", 1813);
        Books book2 = new Books("Outlander", 627, "Diana Gabaldon", 1991);
        Books book3 = new Books("Me Before You", 480, "Jojo Moyes", 2012);
        Books book4 = new Books("The Notebook", 214, "Nicholas Sparks", 1996);
        Books book5 = new Books("The Time Traveler's Wife", 546, "Audrey Niffenegger", 2003);
        System.out.println("Books sorted by title A to Z: ");
        //The books are created manually.
        booksByTitle.add(book1);
        booksByTitle.add(book2);
        booksByTitle.add(book3);
        booksByTitle.add(book4);
        booksByTitle.add(book5);
        //The books are added to the set.

        for (Books book : booksByTitle) { //Reading books by foreach
            System.out.println(book);
        }

        Comparator<Books> pageComparetor = new Comparator<Books>() { //Created Books' comparetor method.
            @Override
            public int compare(Books o1, Books o2) {
                return Integer.compare(o1.getPages(), o2.getPages());
            }
        };
        Set<Books> booksByPages = new TreeSet<>(pageComparetor); //Created set by pageComparetor.
        booksByPages.addAll(booksByTitle);
        System.out.println("Sorted by pages ascently : ");
        for(Books book : booksByPages){
            System.out.println(book);
        }

        Comparator<Books> dateComparator = new Comparator<Books>() {
            @Override
            public int compare(Books o1, Books o2) {
                return Integer.compare(o1.getPublicationDate(),o2.getPublicationDate());
            }
        };
        Set<Books> booksByDate = new TreeSet<>(dateComparator); //Created set by dateComparetor.
        booksByDate.addAll(booksByTitle);
        System.out.println("Sorted by year ascently : ");
        for(Books book : booksByDate){
            System.out.println(book);
        }

    }
}

