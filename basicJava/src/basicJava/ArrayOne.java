package basicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayOne {
	public static void main(String[] args) {
		List<String>cars= new ArrayList<>();
		cars.add("tesla model	3");
		cars.add("tesla model y");
		System.out.println(cars.get(0));
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		for(String x:cars) {
			System.out.println(x);
		}
		
//		Array<Integer> listOfNumbers=new Array<Integer>[5];
		
	}

}
