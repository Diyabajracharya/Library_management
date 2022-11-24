package model;

public class books {
    String name;
    String author;
    int ISBN;
    int published_year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author= author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }
    public books(String name, String author, int ISBN, int published_year) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.published_year = published_year;
    }
    public void setPublishedYear(int publishedYear) {
        this.published_year = published_year;
    }

    public void books_format(){
        System.out.println("Name: " + name);
        System.out.println("Author: "+ author);
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Published Year: "+ published_year);
    }

}
