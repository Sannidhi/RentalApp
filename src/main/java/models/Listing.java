package models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "listing")
public class Listing {

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
    private long id;

    @Column
    private String address;

    @Column
    private int numberOfBedrooms;

    @Column
    private long price;

    @Column
    private double squareFootage;

    @Column
    private String contact;


    public Listing() {
    }

    public Listing(int id, String address, int numberOfBedrooms, long price, double squareFootage, String contact) {
        this.id = id;
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.price = price;
        this.squareFootage = squareFootage;
        this.contact = contact;
    }

    public Listing(String address, int numberOfBedrooms, long price, double squareFootage, String contact) {
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.price = price;
        this.squareFootage = squareFootage;
        this.contact = contact;
    }


    public String getAddress() {
        return address;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public long getPrice() {
        return price;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public String getContact() {
        return contact;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
