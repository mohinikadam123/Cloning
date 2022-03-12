package basic.programming.cloning;

public class Student implements Cloneable
{
int rollNo;
String name;
Address address;
public Student()
{
	
}
public Student(int rollNo, String name, Address address) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
}

public static void main(String[] args)throws CloneNotSupportedException
{
	Address addr=new Address(413520,"pune","India");
	Student s1=new Student(10,"ram",addr);
	System.out.println("Before s1:"+s1);
	Student s2=(Student)s1.clone();
	System.out.println("Before s2:"+s2);
	System.out.println("<<<<<<<<<<Changing address of s1>>>>>>>>>>>>>");
	s1.address.city="Mumbai";
	System.out.println("After s1:"+s1);
	System.out.println("After s2:"+s2);	
}
}
    