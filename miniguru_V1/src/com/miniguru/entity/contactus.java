package com.miniguru.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name="miniguru")
public class contactus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotEmpty(message="Please Enter Your Name")
	@Size(min=2,message="Please Enter Your Name")
	@Column(name="name")
	private String name;
	
	@NotEmpty(message="Please Enter Your Email")
	@Size(min=2,message="Please Enter Your Email")
	@Column(name="email",unique=true)
	private String email;
	
	@NotEmpty(message="Please Enter Your Meesage here")
	@Size(min=3,message="Please Enter Your Message here")
	@Column(name="message")
	private String message;
	
	public contactus() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMeesage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "customer [id=" +id+", name=" +name+", email=" +email+",message=" +message+"] ";
	}

}
