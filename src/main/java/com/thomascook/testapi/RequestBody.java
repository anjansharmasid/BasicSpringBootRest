package com.thomascook.testapi;

import java.io.Serializable;

public class RequestBody implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Email email;
    Data data;
    
    public RequestBody() {}
    
  public RequestBody(Email email, Data data) {
		this.email =email;
		this.data = data;
	}
	
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "RequestBody [email=" + email + ", data=" + data + "]";
	}
    
    
}
