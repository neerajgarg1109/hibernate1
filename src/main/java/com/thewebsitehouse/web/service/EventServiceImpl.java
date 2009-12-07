package com.thewebsitehouse.web.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thewebsitehouse.web.dao.EventDao;
import com.thewebsitehouse.web.domain.Event;

@Service("eventService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class EventServiceImpl implements EventService {
	
	private final Log log = LogFactory.getLog ( EventServiceImpl.class );
	
	@Autowired
	private EventDao eventDao;

	public EventServiceImpl() {}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void addEvent(Event event) {
		if ( log.isDebugEnabled() )
        	log.debug ( event.toString() );
		
		eventDao.saveEvent ( event );
	}
	
	public List<Event> getAllEvents() {		
		return eventDao.getAllEvents();
	}

}
