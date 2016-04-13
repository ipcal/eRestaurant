package eres.model;
 
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
 
@Entity
@Table(name="Users")
public class Users implements Serializable{
	private static final long serialVersionUID = -8767337896773261247L;
	 
    private String userId;
    private String password;
    private String name;
    private String phoneNumber;
    private String email;
    private Date birthday;
    private String gender;
    private String userType;
    private String address;

 

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Id
    //@GeneratedValue
    @Column(name="User_ID")
    public String getUserId() {
		return userId;
	}
	 @Column(name="password")
		public String getPassword() {
			return password;
		}
	 
	 @Column(name="name")
		public String getName() {
			return name;
		}
	 
	 @Column(name="phone_number")
		public String getPhoneNumber() {
			return phoneNumber;
		}
	 
	 @Column(name="email")
		public String getEmail() {
			return email;
		}
	 
	 @Column(name="birthday")
		public Date getBirthday() {
			return birthday;
		}
	 
	 @Column(name="gender")
		public String getGender() {
			return gender;
		}
	 
	 @Column(name="user_type")
		public String getUserType() {
			return userType;
		}
	 
	 @Column(name="address")
		public String getAddress() {
			return address;
		}



}
