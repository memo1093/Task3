package Task3;

import java.util.ArrayList;


public class UserManager {
	//Fields
	private ArrayList<User> users= new ArrayList<User>();
	//Methods
	public ArrayList<User> getUsers() {
		return users;
	}	
	public User getUser(String userName) {
		
		for (User user : users) {
			if (user.getUserName()==userName) {
				return user;				
			}
		}
		return null;
	}	
	public void signIn(User user) {
		users.add(user);
		System.out.println(user.getUserName()+" adl� kullan�c� ba�ar�yla kay�t edilmi�tir!");
	}
	public Boolean logIn(String userName,String password) {
		for (User user : users) {
			if (user.getUserName().contains(userName)&& user.getPassword().contains(password)) {
				System.out.println("Merhaba "+userName+", ba�ar�yla giri� yapt�n�z!");
				return true;
			}
		}
		System.out.println("Kullan�c� ad� veya �ifre Hatal�!");
		return false;
	}
	
}
