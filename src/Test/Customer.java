package Test;

public class Customer {

	String name="";

	Girl g;
	
	public Customer(String name,Girl g){
		this.name=name;
		this.g=g;
		
	}
	
	public void getCustomerDetail(){
		
		System.out.println(this.name+" was service by "+g.getName()+" number: "+g.getNumber());
		
	}
}
