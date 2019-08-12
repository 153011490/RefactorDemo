package rentalstore;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerTest {

    private Customer customer = new Customer("Ben");

    @Test
    public void should_return_receipt_with_customer_name_given_empty_rental_list(){
        String result = customer.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Regular(){
        Movie movie=new Movie("Roma holiday",Movie.REGULAR);
        Rental rental=new Rental(movie,1);
        customer.addRental(rental);
        String result = customer.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Regular_with_dayRented_more_than_2(){
        Movie movie=new Movie("Roma holiday",Movie.REGULAR);
        Rental rental=new Rental(movie,3);
        customer.addRental(rental);
        String result = customer.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_New_Release(){
        Movie movie=new Movie("Roma holiday",Movie.NEW_RELEASE);
        Rental rental=new Rental(movie,1);
        customer.addRental(rental);
        String result = customer.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Children(){
        Movie movie=new Movie("Roma holiday",Movie.CHILDRENS);
        Rental rental=new Rental(movie,1);
        customer.addRental(rental);
        String result = customer.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Children_with_dayRanted_more_than_3(){
        Movie movie=new Movie("Roma holiday",Movie.CHILDRENS);
        Rental rental=new Rental(movie,4);
        customer.addRental(rental);
        String result = customer.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void should_return_receipt_with_customer_name_given_rental_list_with_Movie_Regular_New_Release_Children(){
        Movie childrenMovie=new Movie("Roma holiday",Movie.CHILDRENS);
        Movie releaseMovie=new Movie("BEIJING",Movie.NEW_RELEASE);
        Movie regularMovie=new Movie("SHANGHAI",Movie.REGULAR);
        Rental childrenRental=new Rental(childrenMovie,1);
        Rental regularRental=new Rental(regularMovie,1);
        Rental releaseRental=new Rental(releaseMovie,1);
        customer.addRental(childrenRental);
        customer.addRental(regularRental);
        customer.addRental(releaseRental);
        String result = customer.statement();
        Assert.assertEquals(result,"Rental Record for Ben\n" +
                "\tRoma holiday\t1.5\n" +
                "\tSHANGHAI\t2.0\n" +
                "\tBEIJING\t3.0\n" +
                "Amount owed is 6.5\n" +
                "You earned 3 frequent renter points");
    }




}