/* 
 *  Types of interfaces
 *  1) Normal interface having more than one method
 *  2) single abstract method interface (sam)  also called as functional interface from jdk 8
 *  3) Marker interface -> without methods
 */
interface Vinay
{
	public abstract void show();
}

public class FunctionalInterface {

	public static void main(String[] args)
	{
		Vinay v= ()-> System.out.println("im the best");  // function interface can use lambda expressions using anonymous class & having any
		                                                   // one method in interface.
		v.show();
		

	}

}
