package basicJava;
import java.util.*;// Importing all utility classes



public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        // Creating an object of List class
		          // Declaring an object of String type with
		        // reference to ArrayList class
		        // Type safe list
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
		 
		        // Print and display the elements in
		        // ArrayList class object
//		        System.out.println(al);
//		        System.out.println(aloo.get(0));
//		        
       for (String i :alooo) {
	        	System.out.println(i);
		        }
		        
				/*
				 * for (int i=0;i<alooo.size();i++) { System.out.println(alooo.get(i)); }
				 */
	}
}


