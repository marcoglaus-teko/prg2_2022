package ch.teko.prg2.tag04.solution.ue_oop_04_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Library implements IService {
    private String name;
    private String address;
    private ArrayList<Subject> subjectArrayList;

    public Library(String name, String address, ArrayList<Subject> subjectArrayList) {
        this.name = name;
        this.address = address;
        this.subjectArrayList = subjectArrayList;
    }

    public ArrayList<Subject> getSubjectArrayList() {
        return subjectArrayList;
    }

    @Override
    public Book search(String isbn) {
        Book result = null;
        Iterator<Subject> subjectIterator = getSubjectArrayList().iterator();
        while (subjectIterator.hasNext()) {
            Subject subject = subjectIterator.next();
            Set<String> keys = subject.getBookHashMap().keySet();
            for (String s : keys) {
                if (s.equals(isbn)) {
                    result = subject.getBookHashMap().get(s);
                }
            }

        }
        return result;

    }

}
