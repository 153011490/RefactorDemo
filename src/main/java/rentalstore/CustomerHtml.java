package rentalstore;

public class CustomerHtml extends Customer {

    public CustomerHtml(String name) {
        super(name);
    }

    @Override
    protected String getResult(int frequentRenterPoints, double totalAmount) {
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
        for (Rental each : this.rentals) {
            double thisAmount = getThisAmount(each);
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
        }
        result += "<P>You owe<EM>" + String.valueOf(totalAmount) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + String.valueOf(frequentRenterPoints) + "</EM> frequent renter points<P>";
        return result;
    }
}
