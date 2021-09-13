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
@Table(name = "pay_tbl")
public class Payment {
	@Id
	@GeneratedValue
	@Column(name = "p_id")
	private int p_id;
	
	@Column(name = "card_no")
	private int cardNumber;
	
	@Column(name = "holder_name")
	private String cardHolder;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "exp_date")
	private Date expDate;
	
//	@Column(name = "cvv_no")
//	private int cvv;
	
	@ManyToOne
	@JoinColumn(name = "b_id")
	private Booking booking;
	
	
	public Payment() {
	}


	public Payment(int cardNumber, String cardHolder, Date expDate, Booking booking) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.expDate = expDate;
//		this.cvv = cvv;
		this.booking = booking;
	}


//	public Payment(int p_id, int cardNumber, String cardHolder, Date expDate, int cvv, Booking booking) {
//		super();
//		this.p_id = p_id;
//		this.cardNumber = cardNumber;
//		this.cardHolder = cardHolder;
//		this.expDate = expDate;
//		this.cvv = cvv;
//		this.booking = booking;
//	}


//	public Payment(int cardNumber, String cardHolder, Date expDate, int cvv) {
//		super();
//		this.cardNumber = cardNumber;
//		this.cardHolder = cardHolder;
//		this.expDate = expDate;
//		this.cvv = cvv;
//	}


	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
	}


	public int getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}


	public String getCardHolder() {
		return cardHolder;
	}


	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}


	public Date getExpDate() {
		return expDate;
	}


	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}


//	public int getCvv() {
//		return cvv;
//	}
//
//
//	public void setCvv(int cvv) {
//		this.cvv = cvv;
//	}


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	
	
	
	
	
	
}
