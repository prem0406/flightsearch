package com.nagarro.flightsearch.model;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	private String flightNo;
	private String depLoc;
	private String arrLoc;
	private LocalDate validTill;
	private LocalTime flightTime;
	private double flightDurr;
	private double fare;
	private String seatAvail;
	private String cl;
	
	public Flight() {}

	public Flight(String flightNo, String depLoc, String arrLoc, LocalDate validTill, LocalTime flightTime,
			double flightDurr, double fare, String seatAvail, String cl) {
	
		this.flightNo = flightNo;
		this.depLoc = depLoc;
		this.arrLoc = arrLoc;
		this.validTill = validTill;
		this.flightTime = flightTime;
		this.flightDurr = flightDurr;
		this.fare = fare;
		this.seatAvail = seatAvail;
		this.cl = cl;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", depLoc=" + depLoc + ", arrLoc=" + arrLoc + ", validTill=" + validTill
				+ ", flightTime=" + flightTime + ", flightDurr=" + flightDurr + ", fare=" + fare + ", seatAvail="
				+ seatAvail + ", cl=" + cl + "]";
	}

	public String getFlightNo() {
		return flightNo;
	}

	public String getDepLoc() {
		return depLoc;
	}

	public String getArrLoc() {
		return arrLoc;
	}

	public LocalDate getValidTill() {
		return validTill;
	}

	public LocalTime getFlightTime() {
		return flightTime;
	}

	public double getFlightDurr() {
		return flightDurr;
	}

	public double getFare() {
		return fare;
	}

	public double getFareBusiness() {
		return fare * 1.4;
	}

	public String getSeatAvail() {
		return seatAvail;
	}

	public String getCl() {
		return cl;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	public void setArrLoc(String arrLoc) {
		this.arrLoc = arrLoc;
	}

	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
	}

	public void setFlightTime(LocalTime flightTime) {
		this.flightTime = flightTime;
	}

	public void setFlightDurr(double flightDurr) {
		this.flightDurr = flightDurr;
	}

	public void setFare(double d) {
		this.fare = d;
	}

	public void setSeatAvail(String seatAvail) {
		this.seatAvail = seatAvail;
	}

	public void setCl(String cl) {
		this.cl = cl;
	}

}
