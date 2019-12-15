class Student               // encapsulation binding data with methods
{
	private int rollNo;
	private String name;
	
	public void setRollNo(int r)
	{
		this.rollNo=r;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	
	public void setName(String s)
	{
		this.name=s;
	}
	public String getName()
	{
		return name;
	}
}


public class EncapsulationDemo {

	public static void main(String[] args) 
	{
		Student s1= new Student();
		s1.setRollNo(4);
		s1.setName("vinay");
		System.out.println(s1.getRollNo());
		System.out.println(s1.getName());

	}

}
