package classes;

public class EAudioBook {
    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;


    }
    public double calculatePoints(){
        return (double) durationInMinutes;

    }
}

