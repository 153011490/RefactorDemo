package rentalstore;

public class ChildrenMovie implements Movie{
    private String title;

    public String getTitle() {
        return this.title;
    }

    public ChildrenMovie(String title) {
        this.title = title;
    }

    @Override
    public double getAmount(Rental rental) {
        double amount = 0;
        amount += 1.5;
        if (rental.getDayRented() > 3) {
            amount += (rental.getDayRented() - 3) * 1.5;
        }
        return amount;
    }
}
