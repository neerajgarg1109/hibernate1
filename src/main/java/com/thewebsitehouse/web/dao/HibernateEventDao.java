package com.thewebsitehouse.web.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thewebsitehouse.web.domain.Event;

@Repository("eventDao")
public class HibernateEventDao implements EventDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveEvent ( Event event ) {
		sessionFactory.getCurrentSession().saveOrUpdate ( event );
	}
	
	@SuppressWarnings("unchecked")
	public Event findEventByTitle ( String title ) {
		List<Event> results = (List<Event>) sessionFactory.getCurrentSession().createQuery ( "from PATRICK.EVENTS where title = ?" )
			.setString ( 0, title )
			.list();
		
		return results.size() > 0 ? results.get ( 0 ) : null;
	}
	
	public Event getEventById ( Integer id ) {
		return (Event) sessionFactory.getCurrentSession().load ( Event.class, id );
	}
	
	public List<Event> getEventsForDay ( Date day ) {
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Event> getAllEvents() {
		return (List<Event>) sessionFactory.getCurrentSession().createCriteria ( Event.class ).list();
	}

}
