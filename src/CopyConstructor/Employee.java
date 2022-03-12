package CopyConstructor;

public class Employee {
	int id;
	String name;
	Address2 address;
	
	public Employee()
	{
		
	}

	public Employee(int id, String name, Address2 address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Employee(Employee emp)//copy  constructor
	{
		this.id=emp.id;
		this.name=emp.name;
		
		Address2 dummyAdd=new Address2();
		dummyAdd.city=emp.address.city;
		dummyAdd.country=emp.address.country;
		dummyAdd.pin=emp.address.pin;
		
		this.address=dummyAdd;
		
		
				
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
