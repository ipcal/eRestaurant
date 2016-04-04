package eres.model;
 
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
 
@Entity
@Table(name="Restaurant")
public class Restaurant implements Serializable{
     
    private static final long serialVersionUID = -8767337896773261247L;
 
    private String restaurantId;
    private String ownerId;
    private String phoneNumber;
    private String address;
    private String name;
    private String email;
    private Date openingTime;
    private Date endTime;
    private Date BreakDate;
    private String type;

 

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setOpeningTime(Date openingTime) {
		this.openingTime = openingTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void setBreakDate(Date breakDate) {
		BreakDate = breakDate;
	}

	public void setType(String type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Id
    @GeneratedValue
    @Column(name="restaurant_id")
    public String getRestaurantId() {
		return restaurantId;
	}
	 @Column(name="owner_id")
		public String getOwnerId() {
			return ownerId;
		}
	 @Column(name="phone_number")
		public String getPhoneNumber() {
			return phoneNumber;
		}
	 @Column(name="address")
		public String getAddress() {
			return address;
		}
	 @Column(name="name")
		public String getName() {
			return name;
		}
	 @Column(name="email")
		public String getEmail() {
			return email;
		}
	 @Column(name="opening_time")
		public Date getOpeningTime() {
			return openingTime;
		}
	 @Column(name="end_time")
		public Date getEndTime() {
			return endTime;
		}
	 @Column(name="break_date")
		public Date getBreakDate() {
			return BreakDate;
		}
	 @Column(name="type")
		public String getType() {
			return type;
		}
}