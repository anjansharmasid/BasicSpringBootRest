package com.thomascook.testapi;

import java.io.Serializable;

public class Data implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String login_url;
	String message;
	String goodbyemessage;
	
	public Data() {}
	
	public Data(String name, String login_url, String message, String goodbyemessage) {
		this.name=name;
		this.login_url=login_url;
		this.message=message;
		this.goodbyemessage=goodbyemessage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin_url() {
		return login_url;
	}
	public void setLogin_url(String login_url) {
		this.login_url = login_url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getGoodbyemessage() {
		return goodbyemessage;
	}
	public void setGoodbyemessage(String goodbyemessage) {
		this.goodbyemessage = goodbyemessage;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", login_url=" + login_url + ", message=" + message + ", goodbyemessage="
				+ goodbyemessage + "]";
	}
	
	
}
