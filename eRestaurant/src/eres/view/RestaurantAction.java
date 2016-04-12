package eres.view;
 
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import eres.controller.RestaurantManagement;
import eres.model.Restaurant;
 
 
public class RestaurantAction extends ActionSupport {
 
    private static final long serialVersionUID = 9149826260758390091L;
    private Restaurant restaurant;
    private List<Restaurant> restaurantList;
    private String restaurantId;
 
    private RestaurantManagement restaurantManager;
 
    public RestaurantAction() {
    	restaurantManager = new RestaurantManagement();
    }
 
    public String execute() {
        this.restaurantList = restaurantManager.list();
        System.out.println("execute called");
        return SUCCESS;
    }
 
    public String add() {
        System.out.println("restaurant.add:"+getRestaurant());
        try {
        	restaurantManager.add(getRestaurant());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.restaurantList = restaurantManager.list();
        return SUCCESS;
    }
 
    public String delete() {
    	restaurantManager.delete(getRestaurantId());
        return SUCCESS;
    }
 


	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public List<Restaurant> getRestaurantList() {
		return restaurantList;
	}

	public void setRestaurantList(List<Restaurant> restaurantList) {
		this.restaurantList = restaurantList;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
 

}