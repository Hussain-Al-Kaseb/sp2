package classes;

import classes.abstracts.Title;

import java.util.ArrayList;

public class Author {
    //global
    // Variable name, datatype
    //modifier (private/public)
    private String name;
    private ArrayList<Title> titles;

    //metode/funktion, local
    //returværdi
    /*public String setName(String s){
       name = s;
       return name;
    }*/


    //Constructor - parameter( )
    public Author(String name) {
        this.name = name;
    }


    public void addTitle(Title title) {
        //collection


        titles.add(title);

    }

    public float calculateTotalPay() {
        int length = name.length();
        return (float) (length * 4.5);

    }

    // getter
    public String getName() {
        return name;

    }

    //setter
    public String setName(String name) {
        if (!name.isEmpty()) {

            this.name = name;
        }
        return name;

    }

}
