package basicJava;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =2;//inside a main method local variable
		int y=x;//
		System.out.println(y);
		
		String firstName= "john";
		
		String secondName="john";
		System.out.println(firstName==secondName);
		String thirdName=new String("john");
		System.out.println(firstName==thirdName);
		
		String[] cars= new String[2];
		cars[0]="honda";
		cars[1]="civic";
		System.out.println(cars[0]);
		for (int i =1; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
	}

}
