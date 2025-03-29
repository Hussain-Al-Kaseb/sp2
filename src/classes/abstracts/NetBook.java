package classes.abstracts;

import classes.EBook;

public class NetBook extends EBook {
    private int availability;
    private int reach;
    private int use;

    private NetBook(String title, String literatureType, int availability, int reach, int use,int durationInMinutes, int characters, boolean illustrated){
        super(title, literatureType, availability, reach, use, characters, illustrated);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }
    protected double getPseudoCopies(){
        return (double) reach*use/availability;

    }
    private int getUseFactor(){
        return (int) use;

    }

}
