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
		System.out.println(user.getUserName()+" adlý kullanýcý baþarýyla kayýt edilmiþtir!");
	}
	public Boolean logIn(String userName,String password) {
		for (User user : users) {
			if (user.getUserName().contains(userName)&& user.getPassword().contains(password)) {
				System.out.println("Merhaba "+userName+", baþarýyla giriþ yaptýnýz!");
				return true;
			}
		}
		System.out.println("Kullanýcý adý veya Þifre Hatalý!");
		return false;
	}
	
}
