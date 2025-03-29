package classes;

public class EBook {
    private int characters;

    // Declaration - Initialization
    //private int age = 2;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        this.characters = characters;
        this.illustrated = illustrated;
    }
    private double calculatePages(){
        return (double) characters/240;

    }
    protected double calculatePoints(){
        return (double) characters/2;

    }

}
