package org.pk.ssi.managebeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="userRequest")
@RequestScoped
public class UserRequest {

	private String sex;

	private String education;
	private List<String> selectedLanguages;
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}	

	public String getEducation() {
	
		if (education == "1")
			return "Primary";
		else if (education == "2")
			return "Secendary";
		else if (education == "3")
			return "Higher";
		return "";
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
	
	public String success() {
		return "success";
	}
}
