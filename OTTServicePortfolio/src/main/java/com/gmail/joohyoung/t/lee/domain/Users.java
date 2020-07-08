package com.gmail.joohyoung.t.lee.domain;

import java.sql.Date;

public class Users {
	private String userid;
	private String userpw;
	private String usernickname;
	private String userprofileimage;
	private Date userlogindate;
	private String membership;
	private boolean userwithdrawal;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsernickname() {
		return usernickname;
	}
	public void setUsernickname(String usernickname) {
		this.usernickname = usernickname;
	}
	public String getUserprofileimage() {
		return userprofileimage;
	}
	public void setUserprofileimage(String userprofileimage) {
		this.userprofileimage = userprofileimage;
	}
	public Date getUserlogindate() {
		return userlogindate;
	}
	public void setUserlogindate(Date userlogindate) {
		this.userlogindate = userlogindate;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public boolean isUserwithdrawal() {
		return userwithdrawal;
	}
	public void setUserwithdrawal(boolean userwithdrawal) {
		this.userwithdrawal = userwithdrawal;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", userpw=" + userpw + ", usernickname=" + usernickname
				+ ", userprofileimage=" + userprofileimage + ", userlogindate=" + userlogindate + ", membership="
				+ membership + ", userwithdrawal=" + userwithdrawal + "]";
	}
	
	
}
