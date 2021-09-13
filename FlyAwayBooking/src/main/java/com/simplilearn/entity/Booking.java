package com.simplilearn.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="book_tbl")
public class Booking {
	@Id
	@GeneratedValue
	@Column(name="b_id")
	private int b_id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="mobile_no")
	private Double mobileNo;
	
	@Column(name="email_id")
	private String emailId;
	
	@Temporal(TemporalType.DATE)
	@Column(name="book_date")
	private Date bookDate;
	
	@Column(name="passenger_count")
	private int passengerCount;
	
	@Column(name="address")
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "f_id")
	private Flight flight;
	
	public Booking() {
	}
	
	public Booking(String firstName, String lastName, Double mobileNo, String emailId, Date bookDate,
			int passengerCount, String address, Flight flight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.bookDate = bookDate;
		this.passengerCount = passengerCount;
		this.address = address;
		this.flight = flight;
	}


	/*
	@ManyToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinTable(
			name = "book_flight",
			joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "b_id"),
			inverseJoinColumns = @JoinColumn(name = "flight_id", referencedColumnName = "f_id"))
	private List<Flight> flights;
	
	
	
	public Booking(String firstName, String lastName, Double mobileNo, String emailId, Date bookDate,
			int passengerCount, String address, List<Flight> flights) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.bookDate = bookDate;
		this.passengerCount = passengerCount;
		this.address = address;
		this.flights = flights;
	}
	*/



	public Booking(String firstName, String lastName, Double mobileNo, String emailId, Date bookDate,
			int passengerCount, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.bookDate = bookDate;
		this.passengerCount = passengerCount;
		this.address = address;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Double mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	/*

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	*/
	
}
