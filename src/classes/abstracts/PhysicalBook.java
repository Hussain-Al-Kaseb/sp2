package classes.abstracts;

import classes.AudioBook;
import classes.PrintedBook;

public abstract class PhysicalBook extends PrintedBook {
    protected int copies;
    public String title;
    private  String literatureType;
    public PhysicalBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType,copies,pages);
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;

    }


}
