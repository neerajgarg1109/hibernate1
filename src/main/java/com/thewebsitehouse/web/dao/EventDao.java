package com.thewebsitehouse.web.dao;

import java.util.Date;
import java.util.List;

import com.thewebsitehouse.web.domain.Event;

public interface EventDao {
	public void saveEvent ( Event event );
	
	public Event findEventByTitle ( String title );
	
	public Event getEventById ( Integer id );
	
	public List<Event> getEventsForDay ( Date day );
	
	public List<Event> getAllEvents();
}
