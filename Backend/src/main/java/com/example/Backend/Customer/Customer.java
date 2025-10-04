package com.example.Backend.Customer;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	@Column(nullable = false)
	private String c_name;
	@Column(nullable = false, unique = true,name = "c_email")
	private String cEmail;
	private String c_password;
	private String c_city;
	private String role; // ADMIN or CUSTOMER
	private double total_spent;
	private String last_purchase_date;
	public Customer(int c_id, String c_name, String cEmail, String c_password, String c_city, String role,
			double total_spent, String last_purchase_date) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.cEmail = cEmail;
		this.c_password = c_password;
		this.c_city = c_city;
		this.role = role;
		this.total_spent = total_spent;
		this.last_purchase_date = last_purchase_date;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getC_password() {
		return c_password;
	}
	public void setC_password(String c_password) {
		this.c_password = c_password;
	}
	public String getC_city() {
		return c_city;
	}
	public void setC_city(String c_city) {
		this.c_city = c_city;
	}
	public double getTotal_spent() {
		return total_spent;
	}
	public void setTotal_spent(double total_spent) {
		this.total_spent = total_spent;
	}
	public String getLast_purchase_date() {
		return last_purchase_date;
	}
	public void setLast_purchase_date(String last_purchase_date) {
		this.last_purchase_date = last_purchase_date;
	}
	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", cEmail=" + cEmail + ", c_password=" + c_password
				+ ", c_city=" + c_city + ", role=" + role + ", total_spent=" + total_spent + ", last_purchase_date="
				+ last_purchase_date + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
