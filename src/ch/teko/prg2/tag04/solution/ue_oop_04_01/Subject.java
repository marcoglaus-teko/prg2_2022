package ch.teko.prg2.tag04.solution.ue_oop_04_01;

import java.util.HashMap;

public class Subject {
    private HashMap<String, Book> bookHashMap;

    public Subject(HashMap<String, Book> bookHashMap) {
        this.bookHashMap = bookHashMap;
    }

    public HashMap<String, Book> getBookHashMap() {
        return bookHashMap;
    }
}
