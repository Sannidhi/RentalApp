package models;

import java.util.List;

public interface ListingDAO {

    Listing save(Listing listing);

    Listing fetch(long id);

    List<Listing> fetchAll();

    void deleteAll();
}
