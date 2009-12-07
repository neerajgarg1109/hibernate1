package com.thewebsitehouse.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.thewebsitehouse.web.domain.Event;
import com.thewebsitehouse.web.service.EventService;
import com.thewebsitehouse.web.util.ControllerUtil;

@Controller
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventService eventService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEvent ( @ModelAttribute("event") Event event, BindingResult result ) {
		ControllerUtil.logBindingErrors ( result );
        
        eventService.addEvent ( event );
        
        return new ModelAndView ( "redirect:/events.html" );
    }
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView viewEvents() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put ( "events", eventService.getAllEvents() );
		
		return new ModelAndView ( "eventsView", model );
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEvent ( @ModelAttribute("event") Event event, BindingResult result) {
		return new ModelAndView ( "eventAdd" );
	}
	
}
