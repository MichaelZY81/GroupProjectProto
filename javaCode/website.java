import java.util.ArrayList;
import java.util.List;

public class webSite 
{
	private	List<String> name; 
	public webSite(){
		name = new Arraylist<String>();	
	}
	
	// why do you want this ? the field should be a job for the html 
	// not a job for a java applet 
	// java should just take the input and translate it into query 
	public object listField(){
	}	

	public void addField(String field){
		name.add(field);
	}

	// this should be the defualt method to convert user modified 
	// list into a query string, 
	// which will be recieved by database 
	public String toString(){
	
			
	}

	// when html fire a <jar> tab, this main will be run 
	// what will it do ? 
	public static void main(String[] args) {
		
	}
}
