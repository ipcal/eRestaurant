package eres.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Food")
public class Food implements Serializable{
	private static final long serialVersionUID = -8767337896773261247L;
	
	private String menuId;
    private String foodId;
    private String foodName;
    private String type;
    private String description;
    private int price;
    private String limitedFood;
    private Date issueDate;
    private String display;
    
    public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
    
    public void setFoodId(String foodId){
    	this.foodId = foodId;
    }
    
    public void setFoodName(String foodName){
    	this.foodName = foodName;
    }
    
    public void setType (String type){
    	this.type = type;
    }
    
    public void setDescription(String description)
    {
    	this.description = description;
    }
    
    public void setPrice(int price){
    	this.price = price;
    }
    
    public void setLimitedFood(String limitedFood){
    	this.limitedFood = limitedFood;
    }
    
    public void setIssueDate(Date issueDate){
    	this.issueDate = issueDate;
    }
    
    public void setDisplay(String display){
    	this.display = display;
    }
    
    @Column(name="MENU_ID")
	public String getMenuId() {
		return menuId;
	}
    
    @Id
    @Column(name="FOOD_ID")
    public String getFoodId(){
    	return foodId;
    }
    
    @Column(name="FOOD_NAME")
    public String getFoodName(){
    	return foodName;
    }
    
    @Column(name="TYPE")
    public String getType(){
    	return type;
    }
    
    @Column(name="DESCRIPTION")
    public String getDescription(){
    	return description;
    }
    
    @Column(name="PRICE")
    public int getPrice(){
    	return price;
    }
    
    @Column(name="LIMITED_FOOD")
    public String getLimitedFood(){
    	return limitedFood;
    }
    
    @Column(name="ISSUE_DATE")
    public Date getIssueDate(){
    	return issueDate;
    }
    
    @Column(name="DISPLAY")
    public String getDisplay(){
    	return display;
    }
}
