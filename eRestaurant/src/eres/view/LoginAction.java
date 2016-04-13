package eres.view;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import eres.controller.UsersManagement;
import eres.model.Users;

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 9149826260758390091L;
    private Users user;
	
    private String userId;
    private String password;
    
    private UsersManagement usersManager;
     
    
    public LoginAction() {
    	usersManager = new UsersManagement();
    }
    
    public String login() throws Exception {
    	System.out.println("user.login:" + usersManager.findUser(user.getUserId(), user.getPassword()));
    	
    	Users userDB =usersManager.findUser(user.getUserId(), user.getPassword());
    	if(userDB == null) 
    	{	
    		addActionError("UserName or Password is incorrected!");
    		return ERROR;
    		
    	}
    	else {
    	System.out.println("find User");
    	
    	Map session = ActionContext.getContext().getSession();
    	session.put("logined","true");
    	session.put("context", new Date());
    	session.put("name", userDB.getUserId());
    	addActionMessage("you have successfully login!");
    	
    	return SUCCESS;
    	}
    }
    

    public String logout() throws Exception {
 
    	Map session = ActionContext.getContext().getSession();
    	 session.remove("logined");
    	 session.remove("context");
    	 session.remove("name");
    	 addActionMessage("you have successfully logout!");
        return SUCCESS;
    }
    
    public String getInfo() throws Exception {
    	this.user = usersManager.getUserInfo(user.getUserId());
    	
    	return SUCCESS;
    
    }

    
    
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
    
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getpassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
