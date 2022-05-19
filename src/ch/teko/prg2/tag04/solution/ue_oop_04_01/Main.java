package ch.teko.prg2.tag04.solution.ue_oop_04_01;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Erstellen von Büchern für die Simulation
        Book book1 = new Book("Java lernen in abgeschlossenen Lerneinheiten", "Sebastian Dörn", 208);
        Book book2 = new Book("Java der Grundkurs", "Michael Kofler", 448);
        Book book3 = new Book("Der Kleine Prinz", "Antoine de Saint-Exupery", 96);
        Book book4 = new Book("Faust Der Tragödie Erster Teil", "Johann Wolfgang Goethe", 136);

        HashMap<String, Book> bookHashMap1 = new HashMap<>();

        HashMap<String, Book> bookHashMap2 = new HashMap<>();

        bookHashMap1.put("978-3-658-24002-8", book1);
        bookHashMap1.put("978-3-8362-6959-9", book2);
        bookHashMap2.put("978-3-7920-0049-6", book3);
        bookHashMap2.put("978-3-15-000001-4", book4);
        Subject computerscience = new Subject(bookHashMap1);
        Subject literature = new Subject(bookHashMap2);

        ArrayList<Subject> subjectArrayList = new ArrayList<>();

        subjectArrayList.add(computerscience);
        subjectArrayList.add(literature);
        Library library = new Library("Zentralbibliothek", "Luzern", subjectArrayList);
        // Beispielhafte Konsolen Ausgabe
        System.out.println(library.search("978-3-7920-0049-6").getTitle());
        System.out.println(library.search("978-3-8362-6959-9").getAuthor());
    }
}
