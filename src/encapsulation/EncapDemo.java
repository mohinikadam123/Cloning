package encapsulation;

public class EncapDemo {
	
	//Step 2: Declare field/variable as private. 
	   private int y; 

	//Step 3: Create a public getter method for private variable. 
	public int get() 
	{
	    return y; 
	} 
	//Step 4: Create a public setter method for private variable and declare the parameter. 
	public void set(int y) 
	{ 
	   this.y = y; 
	 } 
	} 
	