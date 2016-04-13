package eres.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order implements Serializable {
	private static final long serialVersionUID = -8767337896773261247L;
	
	private String restaurantId;
    private String userId;
    private int orderId;
    private Date orderingDate;
    private Date orderingTime;
    private String promotionCode;
    private String vipNo;
    private int totalPrice;
    private int reserId;

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public void setOrderingDate(Date orderingDate) {
		this.orderingDate = orderingDate;
	}
	
	public void setOrderingTime(Date orderingTime) {
		this.orderingTime = orderingTime;
	}
	
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}
	
	public void setVipNo(String vipNo) {
		this.vipNo = vipNo;
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void setReserId(int reserId) {
		this.reserId = reserId;
	}
	
	
	@Column(name="RESTAURANT_ID")
	public String getRestaurantId() {
		return restaurantId;
	}
	
	@Column(name="USER_ID")
	public String getUserId() {
		return userId;
	}
	
	@Id
	@GeneratedValue
	@Column(name="ORDER_ID")
	public int getOrderId() {
		return orderId;
	}
	
	@Column(name="ORDERING_DATE")
	public Date getOrderingDate() {
		return orderingDate;
	}
	
	@Column(name="ORDERING_TIME")
	public Date getOrderingTime() {
		return orderingTime;
	}
	
	@Column(name="PROMOTION_CODE")
	public String getPromotionCode() {
		return promotionCode;
	}
	
	@Column(name="VIP_NUMBER")
	public String getVipNo() {
		return vipNo;
	}
	
	@Column(name="TOTAL_PRICE")
	public int getTotalPrice() {
		return totalPrice;
	}
	
	@Column(name="RESERVATION_ID")
	public int getReserId() {
		return reserId;
	}
}
