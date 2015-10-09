package Test;

public class Girl {

	private String name="";
	private String number="";
	private String status="free";
	
	public Girl(String name,String number){
		
		this.name=name;
		this.number=number;
	}
	
	public String getName(){
		return name;
		
	}	
	
	public String getNumber(){
		return number;
		
	}
	
	public void occupied(){
		
		this.setStatus("unavailable");
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public void setFree(){
		
		this.status="free";
	}
	
}
