package program;

import classes.Author;
import classes.Person;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Jack");
        String name = author.setName("Hussain");
        System.out.println(name);
        System.out.println(author.setName("Hussain"));

        Person jack = new Person("Jack");
        System.out.println(jack);
    }
}
