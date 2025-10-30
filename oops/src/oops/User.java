package oops;

public class User {
	
	int uId;
	String name;
	static String access;
	void getData() {
		
		this.uId=10;
		this.name= "Prajwal";
		User.access="Full";
		
	}
	
	static void display() {
		User u1 = new User();
		u1.uId=10;
		u1.name="Piks";
		System.out.println(u1.uId);
		System.out.println(u1.name);
		System.out.println(User.access);
	}
	
	public static void main(String[] args) {
		
		User u1=new User();
		u1.getData();
		User.display();
	}
}
