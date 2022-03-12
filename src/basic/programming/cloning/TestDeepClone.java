package basic.programming.cloning;

public class TestDeepClone {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Address1 add=new Address1("pune","India",123);
		Student1 s1=new Student1(20,"shamm",add);
		System.out.println("Original(s1)="+s1);
		Student1 s2=(Student1)s1.clone();
		System.out.println("cloned(s2)="+s2);
		
		s1.add.city="Mumbai";
		System.out.println("<<<<<<<<<<<<<<<After change>>>>>>>>>>>>");
		System.out.println("Original(s1) after change="+s1);
		System.out.println("Cloned(s2) after changing in original="+s2);
		System.out.println("s1 hashcode="+s1.hashCode()+" s1.address hashcode="+s1.add.hashCode());
		System.out.println("s2 hashcode="+s2.hashCode()+" s2.address hashcode="+s2.add.hashCode());

	}

}
