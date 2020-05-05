package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 425);
        Book javaPhilosophy = new Book("Thinking in Java", 1200);
        Book scrum = new Book("The Scrum Guide", 26);
        Book git = new Book("Pro Git", 288);

        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = javaPhilosophy;
        books[2] = scrum;
        books[3] = git;

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            System.out.println("Title: " + books[i].getTitle() + ", number of pages " + books[i].getPages());
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals("Clean code")) {
                System.out.println("Title: " + books[i].getTitle() + ", number of pages " + books[i].getPages());
            }
        }
    }
}
