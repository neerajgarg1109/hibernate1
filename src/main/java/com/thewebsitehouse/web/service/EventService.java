package com.thewebsitehouse.web.service;

import java.util.List;

import com.thewebsitehouse.web.domain.Event;

public interface EventService {
	
	public void addEvent ( Event event );
	
	public List<Event> getAllEvents();
}
