package eres.view;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import eres.controller.FoodManagement;
import eres.model.Food;
import eres.model.Restaurant;
import eres.model.Users;

public class FoodAction extends ActionSupport {
	private static final long serialVersionUID = 9149826260758390091L;
	private Food food;
	private List<Food> foodList;
	private String foodId;

	private FoodManagement foodManager;

	public FoodAction() {
		foodManager = new FoodManagement();
	}

	public String execute() {
		this.foodList = foodManager.list();
		System.out.println("execute called");
		return SUCCESS;
	}

	public String getFoodByMenuID() {
		this.foodList = foodManager.listByMenuId(food.getMenuId());
		return SUCCESS;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public String getFoodId() {
		return foodId;
	}

	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
}
