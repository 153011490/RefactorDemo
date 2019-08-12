package rentalstore;

public class RegularMovie implements Movie{
    private String title;

    public String getTitle() {
        return this.title;
    }

    @Override
    public double getAmount(Rental rental) {
        double amount = 0;
        amount += 2;
        if (rental.getDayRented() > 2) {
            amount += (rental.getDayRented() - 2) * 1.5;
        }
        return amount;
    }

    public RegularMovie(String title) {
        this.title = title;
    }
}
