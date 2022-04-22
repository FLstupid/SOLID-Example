package net.SingleResponsibility;

import java.util.ArrayList;

public class StoreUser {
	private ArrayList<User> userlist = new ArrayList<User>();

	public void addUser(User u) {
		userlist.add(u);
	}

	public void deleteUser(User u) {
		int index = userlist.indexOf(u);
		if(index > -1)
			userlist.remove(index);
	}
	
	public ArrayList<User> getUserlist() {
		return userlist;
	}
}


