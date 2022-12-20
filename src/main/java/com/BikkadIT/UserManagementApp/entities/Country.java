package com.BikkadIT.UserManagementApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "COUNTRY_MASTER")
public class Country {

	@Id
	@Column(name="COUNTRY_ID")
	private int countryId;

	@Column(name="COUNTRY_NAME")
	private String countryname;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryname=" + countryname + "]";
	}

}



