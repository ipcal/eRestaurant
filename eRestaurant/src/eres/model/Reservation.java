package eres.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Reservation")
public class Reservation implements Serializable {
	private static final long serialVersionUID = -8767337896773261247L;
	
	private String userId;
	private String restaurantId;
	private String tableId;
	
	//@Temporal(TemporalType.TIME)
	private Date reserTime;
	
	private Date reserDate;
	private String cancel;
	private Date actualTimeIn;
	private int	numberOfPeople;
	private int reserId;
	private String remark;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	
	public void setReserTime(Date reserTime) {
		this.reserTime = reserTime;
	}
	
	public void setReserDate(Date reserDate) {
		this.reserDate = reserDate;
	}
	
	public void setCancel(String cancel) {
		this.cancel = cancel;
	}
	
	public void setActualTimeIn(Date actualTimeIn) {
		this.actualTimeIn = actualTimeIn;
	}
	
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	
	public void setReserId (int reserId){
		this.reserId = reserId;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

    @Column(name="User_ID")
    public String getUserId() {
		return userId;
	}
	 @Column(name="Restaurant_ID")
		public String getRestaurantId() {
			return restaurantId;
		}
	 
	 @Column(name="Table_ID")
		public String getTableId() {
			return tableId;
		}
	 

	 @Column(name="Reservation_time")
		public Date getReserTime() {
			return reserTime;
		}
	 
	 @Column(name="Reservation_Date")
	 	public Date getReserDate() {
			return reserDate;
		}
	 
	 @Column(name="Cancel")
		public String getCancel() {
			return cancel;
		}
	 
	 @Column(name="Actual_Time_In")
		public Date getActualTimeIn() {
			return actualTimeIn;
		}
	 
	 @Column(name="Number_Of_People")
		public int getNumberOfPeople() {
			return numberOfPeople;
		}
	 
	 @Id
	 @GeneratedValue
	 @Column(name="Reservation_Id")
		public int getReserId() {
			return reserId;
		}
	 
	 @Column(name="Remark")
		public String getRemark() {
			return remark;
		}

}
