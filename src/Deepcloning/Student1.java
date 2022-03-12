package Deepcloning;

public class Student1 implements Cloneable
{
int roll;
String name;
Address1 add;
public Student1()
{
	
}
public Student1(int roll, String name,Address1 add) {
	super();
	this.roll = roll;
	this.name = name;
	this.add = add;
}

@Override
public String toString() {
	return "Student1 [roll=" + roll + ", name=" + name + ", add=" + add + "]";
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	Student1 dummyStd=(Student1)super.clone();//create dummy copy of student
	Address1 addr=(Address1)add.clone();//also create copy of address
	dummyStd.add=addr;//assign address copy to dummy student object
	return dummyStd;
}

}

