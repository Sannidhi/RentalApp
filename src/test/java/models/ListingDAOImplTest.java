package models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hibernateContext-test.xml"})
@Transactional
public class ListingDAOImplTest {
    @Autowired
    private ListingDAO listingDAO;

    @Test
    public void shouldSaveAListing() {
        Listing listing = createListing();
        Listing savedListing = listingDAO.save(listing);

        Listing fetchedListing = listingDAO.fetch(savedListing.getId());

        assertThat(fetchedListing, notNullValue());
    }

    @Test
    public void shouldFetchAllListings() throws Exception {
        Listing listing1 = createListing();
        Listing listing2 = createListing();

        listingDAO.save(listing1);
        listingDAO.save(listing2);

        List<Listing> listings = listingDAO.fetchAll();

        assertThat(listings.size(), is(2));
    }

    @Test
    public void shouldDeleteAllListings() throws Exception {
        listingDAO.save(createListing());

        listingDAO.deleteAll();

        List<Listing> listings = listingDAO.fetchAll();
        assertThat(listings.size(), is(0));
    }


    private Listing createListing() {
        return new Listing("address", "numberOfBedrooms", "price", "squareFootage", "contact");
    }
}