package rentalstore;

public class ReleaseMovie implements Movie{
    private String title;

    public String getTitle() {
        return this.title;
    }

    public ReleaseMovie(String title) {
        this.title = title;
    }

    @Override
    public double getAmount(Rental rental) {
        return rental.getDayRented() * 3;
    }
}
