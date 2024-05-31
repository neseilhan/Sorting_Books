import java.util.*;
import java.util.TreeSet;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Books> booksByTitle = new TreeSet<>(); //Treeset Books created.

        Books book1 = new Books("Pride and Prejudice", 279, "Jane Austen", java.sql.Date.valueOf("1813-01-28"));
        Books book2 = new Books("Outlander", 627, "Diana Gabaldon", java.sql.Date.valueOf("1991-06-01"));
        Books book3 = new Books("Me Before You", 480, "Jojo Moyes", java.sql.Date.valueOf("2012-01-05"));
        Books book4 = new Books("The Notebook", 214, "Nicholas Sparks", java.sql.Date.valueOf("1996-10-01"));
        Books book5 = new Books("The Time Traveler's Wife", 546, "Audrey Niffenegger", java.sql.Date.valueOf("2003-09-01"));
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

//        Comparator<Books> dateComparator = new Comparator<Books>() {
//            @Override
//            public int compare(Books o1, Books o2) {
//                return Integer.compare()
//            }
//        }
    }
}

