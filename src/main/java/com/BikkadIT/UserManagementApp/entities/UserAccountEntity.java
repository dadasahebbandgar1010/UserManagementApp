package com.BikkadIT.UserManagementApp.entities;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserAccountEntity {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int userId;

		private String fname;

		private String lname;

		private String email;

		private String phone;

		private Date dob;

		private String gender;

		private String country;

		private String state;

		private String city;

		private String password;

		private String accStatus;

		@CreationTimestamp
		@Column(name = "CREATED_DATE",updatable = false)
		private LocalDate createdDate;

		@UpdateTimestamp
		@Column(name = "UPDATED_DATE", insertable = false)
		private LocalDate updatedDate;

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getAccStatus() {
			return accStatus;
		}

		public void setAccStatus(String accStatus) {
			this.accStatus = accStatus;
		}

		public LocalDate getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(LocalDate createdDate) {
			this.createdDate = createdDate;
		}

		public LocalDate getUpdatedDate() {
			return updatedDate;
		}

		public void setUpdatedDate(LocalDate updatedDate) {
			this.updatedDate = updatedDate;
		}

		@Override
		public String toString() {
			return "UserAccountEntity [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
					+ ", phone=" + phone + ", dob=" + dob + ", gender=" + gender + ", country=" + country + ", state="
					+ state + ", city=" + city + ", password=" + password + ", accStatus=" + accStatus + ", createdDate="
					+ createdDate + ", updatedDate=" + updatedDate + "]";
		}
	}
	
