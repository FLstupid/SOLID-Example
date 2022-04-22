package net.SingleResponsibility;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		User o = new User("O","123");
		User i = new User("I","456");
		
		StoreUser s = new StoreUser();
		s.addUser(u);
		s.addUser(i);
		s.addUser(o);
		s.deleteUser(u);
		System.out.print(s.getUserlist().toString() + "\n");
		
		ArchiveUser saveToFile = new ArchiveUser();
		saveToFile.saveUser(u, "UserU");
		saveToFile.saveUser(i, "UserI");
	}
}
