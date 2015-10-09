package Test;

public class StoreHandler {

	public static void main(String arg[])
	{
		
		System.out.println("Bar openning");
		
		System.out.println("Crate Girl in Bar");
		
	
		Girl a=new Girl("Mai","222");
		Girl b=new Girl("parn","122");
		Girl c=new Girl("Ann","232");
		Girl d=new Girl("Fah","242");
		
		System.out.println("Girls have already been  initilized\n");
		
		System.out.println(a.getName()+" number is : "+a.getNumber());
		System.out.println(b.getName()+" number is : "+b.getNumber());
		System.out.println(c.getName()+" number is : "+c.getNumber());
		System.out.println(d.getName()+" number is : "+d.getNumber());
		
		System.out.println("Sunddenly customer get to spa  initilized\n");
		
		Customer man=new Customer("Teerawut",c);
		man.getCustomerDetail();
		
		System.out.println(man.getGirlName()+" Status :"+man.getGirlStatus());
		
		man.checkOutGirl();
		
		System.out.println("-----The man has checked out");
		System.out.println(man.getGirlName()+" Status :"+man.getGirlStatus());
	}
	
}
