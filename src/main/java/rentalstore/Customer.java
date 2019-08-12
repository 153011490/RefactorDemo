package rentalstore;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    protected String name;
    protected List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }


    public final String statement() {
        int frequentRenterPoints = getFrequentRenterPoints(0);
        double totalAmount = getTotalAmount();
        String result = getResult(frequentRenterPoints, totalAmount);
        return result;
    }

    protected abstract String getResult(int frequentRenterPoints, double totalAmount);

    protected double getThisAmount(Rental each) {
        double thisAmount = each.getAmount();
        return thisAmount;
    }

    private double getTotalAmount(){
        double totalAmount = 0;
        for (Rental each : this.rentals) {
            double thisAmount = getThisAmount(each);
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    private int getFrequentRenterPoints(int frequentRenterPoints){
        for (Rental each : this.rentals) {
            frequentRenterPoints++;
            if ((each.getMovie() instanceof ReleaseMovie) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;
    }
}
