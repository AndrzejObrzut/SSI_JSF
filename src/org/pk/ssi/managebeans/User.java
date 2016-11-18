package org.pk.ssi.managebeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped
public class User {
	
	private String firstName;
	private String lastName;
	private String sex;

	private String education;
	private List<String> selectedLanguages;
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}	

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public List<String> getSelectedLanguages() {
		return selectedLanguages;
	}

	public void setSelectedLanguages(List<String> selectedLanguages) {
		this.selectedLanguages = selectedLanguages;
	}
}
