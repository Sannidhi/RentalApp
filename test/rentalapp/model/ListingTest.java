package rentalapp.model;

import org.junit.Before;
import org.junit.Test;
import rentalapp.controller.RentalAppSession;

import static org.junit.Assert.assertEquals;

public class ListingTest {

    @Before
    RentalAppSession rentalAppSession = new RentalAppSession();
    Listing listing = new Listing(1,"315 Montgomery St", "2", "120", "1000", "Contact details");
    long id = rentalAppSession.saveOrUpdate(listing);

    @Test
    public void shouldFetchAListingFromDatabase() {
        Listing listingFromDatabase = rentalAppSession.get(Listing.class, listing.getId());
        assertEquals(listing.getAddress(), listingFromDatabase.getAddress());
        assertEquals(listing.getNumberOfBedrooms(), listingFromDatabase.getNumberOfBedrooms());
    }
}
