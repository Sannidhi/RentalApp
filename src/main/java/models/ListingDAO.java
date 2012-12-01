package models;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.*;
import java.util.List;

@Repository("listingDAO")
@Transactional
public class ListingDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public Listing save(Listing listing) {
        Listing merge = entityManager.merge(listing);
        entityManager.flush();
        listing.setId(merge.getId());
        return listing;
    }

    public Listing fetch(long id) {
        return entityManager.find(Listing.class, id);
    }

    public List<Listing> fetchAll() {
        return entityManager.createQuery("From listing ").getResultList();
    }

    public void deleteAll() {
        Query deleteQuery = entityManager.createQuery("Delete From listing");
        deleteQuery.executeUpdate();
    }
}
