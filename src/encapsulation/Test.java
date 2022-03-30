package encapsulation;

public class Test//Step4: Create another class EncapTest.
{
		public static void main(String[] args)
		{ 
		//Step 6: Create an object of class Number using the new keyword. 
		 EncapDemo n = new EncapDemo(); // Here, n is a reference variable of Number and pointing to the object of class Number. 

		//Step 7: Now call setter method and set value of the variable. 
		   n.set(6); 

		//Step 8: Call getter method to read the value of variable. 
		  int num = n.get(); 

		//Step 9: Print the output. 
		  System.out.println(num); 
		  } 
		}





