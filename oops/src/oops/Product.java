package oops;

public class Product {
	int pid;
	String pname;
	
	void demo() {
		
	}
	
	static void display() {
		Product p1 = new Product();
		p1.pid=101;
	}
	
	public static void main(String[] args)
	{
		Product p1 = new Product();
		p1.demo();
		Product.display();
	}

}
