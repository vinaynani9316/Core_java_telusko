import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
	int rollNo;
	int marks;
	String name;
	public int getRollNo() {
		return rollNo;
	}
	public Stud(int rollNo, int marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(Stud s)
	{
		return name.length()>s.name.length()?1:-1;  // comparing with two strings of names
	}  
}
public class ComparableSort {

	public static void main(String[] args) 
	{
		
		List<Stud> stu =new ArrayList<>();
		stu.add(new Stud(23, 50, "vinay"));
		stu.add(new Stud(24, 70, "vinodKumar"));
		stu.add(new Stud(18, 87, "shambu"));
		stu.add(new Stud(42, 36, "ramu"));
		
		Collections.sort(stu); // Collections.sort(stu ,(i,j)->i.marks>j.marks?1:-1); marks comparison using lambda expression
		for(Stud s1: stu)
		{
			System.out.println(s1);
		}
	}

	

}
