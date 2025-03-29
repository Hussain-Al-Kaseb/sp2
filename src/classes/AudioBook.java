package classes;


import classes.interfaces.IAudioBook;

//en classes kan ikke extended fra 2 super classer
public class AudioBook implements IAudioBook {
    private int durationInMinutes;
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
    this.durationInMinutes = durationInMinutes;

    }
    public double calculatePoints(){
        return (double) durationInMinutes;

    }
}
