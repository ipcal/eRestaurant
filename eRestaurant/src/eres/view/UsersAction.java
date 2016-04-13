package eres.view;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import eres.controller.UsersManagement;
import eres.model.Users;

public class UsersAction extends ActionSupport{
	
	private static final long serialVersionUID = 9149826260758390091L;
    private Users user;
    private List<Users> usrsList;
    private String userId;
    private String password;
 
    private UsersManagement usersManager;
 
    public UsersAction() {
    	usersManager = new UsersManagement();
    }
 
    public String execute() {
        this.usrsList = usersManager.list();
        System.out.println("execute called");
        return SUCCESS;
    }
 
    public String add() {
        System.out.println("user.add:" + getUser());
        try {
        	usersManager.add(getUser());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.usrsList = usersManager.list();
        return SUCCESS;
    }
 
    public String delete() {
    	usersManager.delete(getUserId());
        return SUCCESS;
    }
    
    public String update(){
    	System.out.println("user.update:" + getUser());
    	System.out.println("user.update.UserID:" + getUserId());
    	usersManager.updateUser(getUser());
    	addActionMessage("Update successful!");
    	return SUCCESS;
    }
    
    public String updatePw(){
    	System.out.println("user.updatepw" + getUser());
    	usersManager.updatePw(getUser());
    	addActionMessage("update Successful!");
    	return SUCCESS;
    }


	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public List<Users> getUsersList() {
		return usrsList;
	}

	public void setUsersList(List<Users> usrsList) {
		this.usrsList = usrsList;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

 

}
