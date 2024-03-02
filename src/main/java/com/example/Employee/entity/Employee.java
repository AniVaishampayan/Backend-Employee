package com.example.Employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public Long id;
	@Column(name = "Emp_ID")
	public String empId;
	@Column(name = "NAME")
	public String name;
	@Column(name = "SURNAME")
	public String surname;
	@Column(name = "AGE")
	public int age;
	@Column(name = "EMAIL_ID")
	public String emailId;

	public Employee() {
		super();
	}

	public Employee(Long id, String empId, String name, String surname, int age, String emailId) {
		super();
		this.id = id;
		this.empId = empId;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.emailId = emailId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", name=" + name + ", surname=" + surname + ", age=" + age
				+ ", emailId=" + emailId + "]";
	}

}
