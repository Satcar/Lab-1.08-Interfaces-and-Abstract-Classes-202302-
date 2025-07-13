package streaming_service;

public class Movie extends Video{

    private double rating;


    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    String getInfo() {
        return super.getInfo() + String.format("\nPuntuacion: %.2f", getRating());
    }
}
