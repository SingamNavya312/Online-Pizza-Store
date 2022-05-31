package com.pizza.Pizzabackend.model;



import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "users")


public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	 @Column(name = "user_name")
	private String userName;
	 
	 @Column(name="password")
	 private String password;
	 
	 @Column(name = "email_id")
	private String emailId;
	 
	 @Column(name = "mobile_number")
	private int mobileNumber;
	 
	 @Column(name = "user_address")
	private String userAddress;
	
	
	
	public User() {
		
	}
	
	public User( String userName, String emailId, int mobileNumber,String password, String userAddress) {
		super();
		
		this.userName = userName;
		
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.userAddress = userAddress;
	}

	public long getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(emailId, mobileNumber,password,  userAddress, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(emailId, other.emailId) && mobileNumber == other.mobileNumber
				 && Objects.equals(userAddress, other.userAddress)&&Objects.equals(password, other.password)
				&& userId == other.userId && Objects.equals(userName, other.userName);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
