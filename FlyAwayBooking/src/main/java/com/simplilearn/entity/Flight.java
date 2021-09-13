package com.simplilearn.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "flight_tbl")
public class Flight {
		@Id
		@GeneratedValue
		@Column(name="f_id")
		private int f_id;
		
		@Column(name = "flight_no")
		private int flightNo;
		
		@Column(name = "flight_name")
		private String flightName;
		
		@Column(name = "from_city")
		private String fromCity;
		
		@Column(name = "to_city")
		private String toCity;
		
		@Temporal(TemporalType.DATE)
		@Column(name = "date")
		private Date date;
		
		
		@Column(name = "dep_time")
		private float time;
		
		@Column(name = "travel_duration")
		private float duration;
		
		@Column(name = "airport_name")
		private String airportName;
		
		@Column(name = "ticket_price")
		private Double ticketPrice;
		
		public Flight() {
		}

		public Flight(int flightNo, String flightName, String fromCity, String toCity, Date date, float time,
				float duration, String airportName, Double ticketPrice) {
			super();
			this.flightNo = flightNo;
			this.flightName = flightName;
			this.fromCity = fromCity;
			this.toCity = toCity;
			this.date = date;
			this.time = time;
			this.duration = duration;
			this.airportName = airportName;
			this.ticketPrice = ticketPrice;
		}
		
		

		public Flight(int f_id, int flightNo, String flightName, String fromCity, String toCity, Date date,
				float time, float duration, String airportName, Double ticketPrice) {
			super();
			this.f_id = f_id;
			this.flightNo = flightNo;
			this.flightName = flightName;
			this.fromCity = fromCity;
			this.toCity = toCity;
			this.date = date;
			this.time = time;
			this.duration = duration;
			this.airportName = airportName;
			this.ticketPrice = ticketPrice;
		}

		public int getF_id() {
			return f_id;
		}

		public void setF_id(int f_id) {
			this.f_id = f_id;
		}

		public int getFlightNo() {
			return flightNo;
		}

		public void setFlightNo(int flightNo) {
			this.flightNo = flightNo;
		}

		public String getFlightName() {
			return flightName;
		}

		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}

		public String getFromCity() {
			return fromCity;
		}

		public void setFromCity(String fromCity) {
			this.fromCity = fromCity;
		}

		public String getToCity() {
			return toCity;
		}

		public void setToCity(String toCity) {
			this.toCity = toCity;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public float getTime() {
			return time;
		}

		public void setTime(float time) {
			this.time = time;
		}

		public float getDuration() {
			return duration;
		}

		public void setDuration(float duration) {
			this.duration = duration;
		}

		public String getAirportName() {
			return airportName;
		}

		public void setAirportName(String airportName) {
			this.airportName = airportName;
		}

		public Double getTicketPrice() {
			return ticketPrice;
		}

		public void setTicketPrice(Double ticketPrice) {
			this.ticketPrice = ticketPrice;
		}
		
		
		
		
}
