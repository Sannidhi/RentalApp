package rentalapp.controller;

import org.hibernate.Session;

import java.io.Serializable;

public class RentalAppSession {

    private Session session = null;

    public RentalAppSession() {
        initSession();
    }

    private void initSession() {
        this.session = RentalAppSessionFactory.getInstance().createSession();
    }

    public Object get(Class clazz, Serializable id) {
        return session.get(clazz, id);
    }
}
