package com.codewithflex.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "customers_table")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "Destination")
    private String Destination;
    @Column(name = "TravelClass")
    private String travelClass;
    @Column(name = "Age")
    private int age;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Booking_Date")
    @DateTimeFormat(pattern= "yyy-MM-dd")
    private Date bookingDate;
    @Column(name = "Traveling_Date")
    @DateTimeFormat(pattern= "yyy-MM-dd")
    private Date travelingDate;

    public Customers() {
    }


	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param destination
	 * @param travelClass
	 * @param age
	 * @param gender
	 * @param bookingDate
	 * @param travelingDate
	 */
	public Customers(long id, String firstName, String lastName, String destination, String travelClass, int age,
			String gender, Date bookingDate, Date travelingDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Destination = destination;
		this.travelClass = travelClass;
		this.age = age;
		this.gender = gender;
		this.bookingDate = bookingDate;
		this.travelingDate = travelingDate;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the destination
	 */
	public String getDestination() {
		return Destination;
	}


	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		Destination = destination;
	}


	/**
	 * @return the travelClass
	 */
	public String getTravelClass() {
		return travelClass;
	}


	/**
	 * @param travelClass the travelClass to set
	 */
	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}


	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	/**
	 * @return the travelingDate
	 */
	public Date getTravelingDate() {
		return travelingDate;
	}


	/**
	 * @param travelingDate the travelingDate to set
	 */
	public void setTravelingDate(Date travelingDate) {
		this.travelingDate = travelingDate;
	}


	@Override
	public String toString() {
		return "Customers [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Destination="
				+ Destination + ", travelClass=" + travelClass + ", age=" + age + ", gender=" + gender
				+ ", bookingDate=" + bookingDate + ", travelingDate=" + travelingDate + "]";
	}

	

}