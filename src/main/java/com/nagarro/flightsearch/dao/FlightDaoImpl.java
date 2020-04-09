package com.nagarro.flightsearch.dao;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.util.StringToDate;

@Component
public class FlightDaoImpl implements FlightDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void addFlight(Flight flight) {
		Session session= sessionFactory.getCurrentSession();
		session.save(flight);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Transactional
	@Override
	public List<Flight> searchFlights(String deploc, String arrloc, String fdate, String fclass) {
		
		Session session= sessionFactory.getCurrentSession();
		String hql = "FROM Flight f WHERE deploc = :deploc AND arrloc= :arrloc AND validTill >= :fdate AND cl LIKE :cl";
		org.hibernate.query.Query<Flight> q = session.createQuery(hql);
		q.setParameter("deploc", deploc);
		q.setParameter("arrloc", arrloc);
		q.setParameter("cl", "%"+fclass.subSequence(0, 1) + "%");
		System.out.println("Class .." + fclass.subSequence(0, 1));
		Date date = null;
		
		try {
			date = StringToDate.getDate(fdate);
		} catch (ParseException e) {
			System.out.println("Cannot Parse Fdate: "+e);
		}
		
		q.setDate("fdate", date);
		List<Flight> flights = q.getResultList();
		return flights;

	}
}
