package basicJava;
import java.util.*;// Importing all utility classes



public class arrayList {

	public static void main(String[] args) {
		
		        List<String> al = new ArrayList<String>();
		        //assigning arraylist object address to list al
		        //now they both point to same object of Arraylist
		        ArrayList<String> alooo = new ArrayList<String>();
		       
		        // Adding elements using add() method
		        // Custom input elements
		        al.add("Geeks");
		        al.add("for");
		        al.add("Geeks");
		        
		        alooo.add("chips");
		        alooo.add("kandu");
		        alooo.add("landu");
		        alooo.add("jhandu");
		 
		   
		        
       for (String i :alooo) {
	        	System.out.println(i);
		        }
		        
				
	}
}


