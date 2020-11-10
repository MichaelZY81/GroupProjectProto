
import java.util.ArrayList;
import java.util.List;

public class Translator 
{
	private String query;
	private ArrayList<String>; 

	/**
	 * I add this to get input from website
	 * if other mean can achieve the same goal without class 
	 * this can be discard 
	 */
	public void getInputFromWeb(){
	
	}

	/**
	 * convert a string into query 
	 * prefix the string as table, attributs and all other format will not 
	 * be handled by this method 
	 */
	public String conver(String input){
		// use delimma or scanner to solve this problem 		
	}

	/**
	 *convert the result from connector' query return to a fomat 
	 * which will be recogizeable from website point of view 
	 */
	public format(){
	
	}

	public static void main(String[] args){
		// create connector  
		private Connector init = new Connector(); 
		init.getCredential();
		init.connectToDB(); 
		
		getInputFromWeb();
		convert(); 
		result = init.qeury();
		
		format();
	}
	
	
}
