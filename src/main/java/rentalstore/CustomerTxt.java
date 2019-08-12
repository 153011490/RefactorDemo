package rentalstore;

public class CustomerTxt extends Customer {

    public CustomerTxt(String name) {
        super(name);
    }

    public String getResult(int frequentRenterPoints, double totalAmount) {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : super.rentals) {
            double thisAmount = getThisAmount(each);
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }


}
