package classes.abstracts;



public abstract class Title extends PhysicalBook {
    private final String title;
    private final String literatureType;
    private double rate;

    public Title(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies, pages);
        this.title = title;
        this.literatureType = literatureType;

    }

    public double calculateRoyalty() {
        return rate * 0.10;
    }

    @Override
    protected double calculatePoints() {
        if (rate > 100) {
            return rate * 5;

        } else if (rate < 100) {
            return rate * 2;

        } else {
            return rate;
        }

    }
    protected double convertLiteratureType(){

        return switch (literatureType) {
            case "action" -> 1;
            case "romance" -> 2;
            case "fantasy" -> 3;
            default -> 0;
        };

    }
}



