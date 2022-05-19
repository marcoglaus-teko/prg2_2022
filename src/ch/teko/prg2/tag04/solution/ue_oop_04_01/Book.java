package ch.teko.prg2.tag04.solution.ue_oop_04_01;

public class Book {
    private String title;
    private String author;
    private int page;

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

}
