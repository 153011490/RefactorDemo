package rentalstore;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTxtTest {

    private Customer customerTxt = new CustomerTxt("Ben");

    private Customer customerHtml = new CustomerTxt("Ben");

    @Test
    public void should_return_receipt_with_customer_name_given_empty_rental_list(){
        String result = customerTxt.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Regular(){
        Rental rental=new Rental(new RegularMovie("Roma holiday"),1);
        customerTxt.addRental(rental);
        String result = customerTxt.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Regular_with_dayRented_more_than_2(){
        Rental rental=new Rental(new RegularMovie("Roma holiday"),3);
        customerTxt.addRental(rental);
        String result = customerTxt.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_New_Release(){
        Rental rental=new Rental(new ReleaseMovie("Roma holiday"),1);
        customerTxt.addRental(rental);
        String result = customerTxt.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_New_Release_with_dayRented_more_than_1(){
        Rental rental=new Rental(new ReleaseMovie("Roma holiday"),2);
        customerTxt.addRental(rental);
        String result = customerTxt.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Children(){
        Rental rental=new Rental(new ChildrenMovie("Roma holiday"),1);
        customerTxt.addRental(rental);
        String result = customerTxt.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Children_with_dayRanted_more_than_3(){
        Rental rental=new Rental(new ChildrenMovie("Roma holiday"),4);
        customerTxt.addRental(rental);
        String result = customerTxt.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Regular_New_Release_Children(){
        Rental childrenRental=new Rental(new ChildrenMovie("Roma holiday"),1);
        Rental regularRental=new Rental(new RegularMovie("SHANGHAI"),1);
        Rental releaseRental=new Rental(new ReleaseMovie("BEIJING"),1);
        customerTxt.addRental(childrenRental);
        customerTxt.addRental(regularRental);
        customerTxt.addRental(releaseRental);
        String result = customerTxt.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t1.5\n" +
                "\tSHANGHAI\t2.0\n" +
                "\tBEIJING\t3.0\n" +
                "Amount owed is 6.5\n" +
                "You earned 3 frequent renter points");
    }


}