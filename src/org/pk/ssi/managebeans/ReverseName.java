package org.pk.ssi.managebeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="reverseName")
@RequestScoped
public class ReverseName {

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = new StringBuffer(firstName).reverse().toString();
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = new StringBuffer(lastName).reverse().toString();
	}
}
