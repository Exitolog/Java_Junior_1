package ru.belyakov.ex1;

public class Book {

    private final String title; //наименование
    private  final String author;// автор
    private final  int year; // год выпуска;

    //конструкторы
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    //методы
    @Override
    public String toString() {
        return "Book{" +
                "Наименование: '" + title + '\'' +
                ", Автор: '" + author + '\'' +
                ", Год издания: " + year +
                '}';
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}
