package com.thewebsitehouse.web.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PATRICK.EVENTS")
public class Event {
	
	@Id @GeneratedValue
	@Column(name = "EID" )
	private Long id;
	
	@Column(name = "ETITLE")
	private String title;
	
	@Column(name = "EDATE")
	private Date date;

	public Event() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	
	private void setId ( Long id ) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate ( Date date ) {
		this.date = date;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle ( String title ) {
		this.title = title;
	}
	
	public String toString() {
		return "Title: " + title + ", Date: " + date;
	}

}
