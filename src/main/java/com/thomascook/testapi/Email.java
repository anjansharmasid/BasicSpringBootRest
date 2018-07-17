package com.thomascook.testapi;

import java.io.Serializable;

public class Email implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String from;
	String to;
	String subject;
	
	public Email() {}
	
	public Email(String from, String to, String subject) {
	   this.from=from;
	   this.to=to;
	   this.subject=subject;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Email [from=" + from + ", to=" + to + ", subject=" + subject + "]";
	}
	
	
}
