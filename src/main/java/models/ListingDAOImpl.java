package models;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.*;
import java.util.List;

@Repository("listingDAO")
@Transactional
public class ListingDAOImpl implements ListingDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Listing save(Listing listing) {
        Listing merge = entityManager.merge(listing);
        entityManager.flush();
        listing.setId(merge.getId());
        return listing;
    }

    @Override
    public Listing fetch(long id) {
        return entityManager.find(Listing.class, id);
    }

    @Override
    public List<Listing> fetchAll() {
        return entityManager.createQuery("From Listing order by price").getResultList();
    }

    @Override
    public void deleteAll() {
        Query deleteQuery = entityManager.createQuery("Delete From Listing");
        deleteQuery.executeUpdate();
    }
}
