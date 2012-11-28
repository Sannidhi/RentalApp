package rentalapp.controller;

import org.hibernate.Session;
import rentalapp.model.Listing;

import java.io.Serializable;

public class RentalAppSession {

    private Session session = null;

    public RentalAppSession() {
        initSession();
    }

    private void initSession() {
        this.session = RentalAppSessionFactory.getInstance().createSession();
    }

    public Listing get(Class clazz, long id) {
        return (Listing)session.get(clazz, id);
    }


    public long saveOrUpdate (Object object) {
        startTransaction();
        session.saveOrUpdate(object);
        commit();
        Listing listing = (Listing)object;
        return listing.getId();

    }

    private void startTransaction() {
        if (session == null)
            initSession();
        session.beginTransaction();
    }

    private void commit() {
        session.getTransaction().commit();
    }

    public void save(Object object) {
        startTransaction();
        session.save(object);
        commit();
    }
}
