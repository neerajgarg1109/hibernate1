package com.thewebsitehouse.web.util;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public abstract class ControllerUtil {
	
	private final static Log log = LogFactory.getLog ( ControllerUtil.class );
	
	public static void logBindingErrors ( BindingResult result ) {
		if ( result.hasErrors() ) {
			if ( log.isErrorEnabled() )
				log.error ( result.getErrorCount() + " exist on BindingResult, listing errors:" );
			
			List<ObjectError> errors = result.getAllErrors();
			Iterator<ObjectError> iterator = errors.iterator();
			
			while ( iterator.hasNext() ) {
				if ( log.isErrorEnabled() )
					log.error ( iterator.next().toString() );
			}
		}
	}
}
