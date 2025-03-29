package classes;

public class PrintedBook {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        this.pages = pages;

    }
    protected double calculatePoints(){
        return (double) pages;

    }

}
