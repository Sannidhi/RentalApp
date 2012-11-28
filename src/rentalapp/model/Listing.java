package rentalapp.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Table
public class Listing {

    @Id
    @GeneratedValue(generator = "listingId")
    @GenericGenerator(name = "listingId", strategy = "increment")
    private long id;

    @Column
    private String address;

    @Column
    private String numberOfBedrooms;

    @Column
    private String price;

    @Column
    private String squareFootage;

    @Column
    private String contact;


    public Listing() {
    }

    public Listing(int id, String address, String numberOfBedrooms, String price, String squareFootage, String contact) {
        this.id = id;
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.price = price;
        this.squareFootage = squareFootage;
        this.contact = contact;
    }


    public String getAddress() {
        return address;
    }

    public String getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public String getPrice() {
        return price;
    }

    public String getSquareFootage() {
        return squareFootage;
    }

    public String getContact() {
        return contact;
    }

    public long getId() {
        return id;
    }
}
