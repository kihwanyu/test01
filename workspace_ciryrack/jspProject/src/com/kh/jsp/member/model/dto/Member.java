package com.kh.jsp.member.model.dto;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4631186997573942211L;
	
	private int uno;
	private String user_id;
	private String user_pwd;
	private String nick_name;
	private String phone;
	private String email;
	private String address;
	private String interest;
	private Date enroll_date;
	private Date modify_date;
	private String status;
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public Date getEnroll_date() {
		return enroll_date;
	}
	public void setEnroll_date(Date enroll_date) {
		this.enroll_date = enroll_date;
	}
	public Date getModify_date() {
		return modify_date;
	}
	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Member() {
		super();
	}
	public Member(int uno, String user_id, String user_pwd, String nick_name, String phone, String email,
			String address, String interest, Date enroll_date, Date modify_date, String status) {
		super();
		this.uno = uno;
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.nick_name = nick_name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.interest = interest;
		this.enroll_date = enroll_date;
		this.modify_date = modify_date;
		this.status = status;
	}
	
	public Member(String user_id, String user_pwd, String nick_name, String phone, String email, String address,
			String interest) {
		super();
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.nick_name = nick_name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.interest = interest;
	}
	@Override
	public String toString() {
		return "Member [uno=" + uno + ", user_id=" + user_id + ", user_pwd=" + user_pwd + ", nick_name=" + nick_name
				+ ", phone=" + phone + ", email=" + email + ", address=" + address + ", interest=" + interest
				+ ", enroll_date=" + enroll_date + ", modify_date=" + modify_date + ", status=" + status + "]";
	}
	
	
	/*UNO
	USER_ID
	USER_PWD
	NICK_NAME
	PHONE
	EMAIL
	ADDRESS
	INTEREST
	ENROLL_DATE
	MODIFY_DATE
	STATUS*/
}
