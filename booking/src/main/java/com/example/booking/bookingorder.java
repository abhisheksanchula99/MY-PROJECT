package com.example.booking;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "Orders")
public class bookingorder {
	
	@Id
	private String id;
	private String time;
	private String startStation;
	private String endStation;
	private String name;
	private String age;
	private String gender;
	private String credit;
	private String address;
	private String berth;
	private String bankname;
	private String date;
	private String Email;
	
	public bookingorder() {
		
	}

	public bookingorder(String id, String time, String startStation, String endStation, String name, String age,
			String gender, String credit, String address, String berth, String bankname, String date, String email) {
		super();
		this.id = id;
		this.time = time;
		this.startStation = startStation;
		this.endStation = endStation;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.credit = credit;
		this.address = address;
		this.berth = berth;
		this.bankname = bankname;
		this.date = date;
		this.Email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getEndStation() {
		return endStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBerth() {
		return berth;
	}

	public void setBerth(String berth) {
		this.berth = berth;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "bookingorder [id=" + id + ", time=" + time + ", startStation=" + startStation + ", endStation="
				+ endStation + ", name=" + name + ", age=" + age + ", gender=" + gender + ", credit=" + credit
				+ ", address=" + address + ", berth=" + berth + ", bankname=" + bankname + ", date=" + date + ", Email="
				+ Email + "]";
	}
	

}
