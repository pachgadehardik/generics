package hardik.generics;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class Driver 
{
    public static void main( String[] args )
    {	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter 3 Integers Numbers: ");
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	int num3 = sc.nextInt();
    	
    	Integer arr[] = new Integer[]{num1,num2,num3};
    	System.out.println("Maximum among Three is: "+new MaximumData().getMaximum(arr));	
    }
}
