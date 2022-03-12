package CopyConstructor;

public class TestCopyConstructor {
	public static void main(String[] args)
	{
		Address2 add=new Address2("pune","IND",123);
		Employee emp1=new Employee(10,"ram",add);
		System.out.println("Emp1:"+emp1);
		Employee emp2=new Employee(emp1);
		System.out.println("Emp2:"+emp2);
		
		emp1.address.city="Mumbai";
		System.out.println(" changed Emp1:"+emp1);
		System.out.println(" changed Emp2:"+emp2);
		
	}
	
}
