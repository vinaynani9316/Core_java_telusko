import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

 public class MissingLetters {
 
    public static void main(String[] args) 
    {
    	Scanner scan= new Scanner(System.in);
    	System.out.println("Enter the String");
    	String input=scan.nextLine();
    	scan.close();
    	System.out.println("your entered String is :" +input);
    	input=input.replaceAll(" ", " ");
    	String array[] = input.split("");
    	String letters[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
    	HashSet<String> s1= new HashSet<>(Arrays.asList(array));
    	HashSet<String> s2= new HashSet<>(Arrays.asList(letters));
    	System.out.println("user input in set is :" +s1);
    	System.out.println("letters are :" +s2);
    	s2.removeAll(s1);
    	System.out.println("Missing letters are" +s2);
   }
}