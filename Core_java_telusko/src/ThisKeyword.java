class Obj
{
	int n1;
	int n2;
	int r;
	
	public Obj(int n1, int n2)
	{
		this.n1= n1; // current object
		this.n2= n2;
	}
}
public class ThisKeyword {

	public static void main(String[] args) 
	{
		
        Obj o= new Obj(4, 5);   
        System.out.println(o.n1);
        System.out.println(o.n2);


	}

}
