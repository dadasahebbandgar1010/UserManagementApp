package com.BikkadIT.UserManagementApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="CITY_MASTER")
public class City {
	@Id
	@Column(name="CITY_ID")
	private int cityId;
	
	@Column(name="CITY_NAME")
	private String cityName;
	
	@Column(name="CITY_STATEID")
	private int stateId;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", stateId=" + stateId + "]";
	}
}

