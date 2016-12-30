package org.dinesh.java.service;

import java.util.HashMap;

import org.dinesh.java.dto.User;

public class LoginService {
	
	HashMap<String,String> users = new HashMap<String,String>();
	public LoginService(){
		users.put("johndoe", "John Doe");
		users.put("janedoe", "Jane Doe");
		users.put("jguru", "Java Guru");
	}
	public boolean authenticate(String userId, String password){
		
		if(password == null || password.trim() == ""){
			return false;
	}
		return true;

}
	
//here User object is the Model
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserID(userId);
		return user;
	}
}
