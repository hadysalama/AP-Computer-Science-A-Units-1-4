/*Even or Odd 
 *Hady Salama
 *10/26/2017
 */
 
 import java.util.Scanner;
 public class EvenOdd
 {
 	public static void main(String args[])
 	{
 		System.out.println("Please input an integer. ");
 		Scanner reader = new Scanner(System.in);
 		int num1 = reader.nextInt();
 		if (num1 % 2 == 0) 
 		{
 			System.out.println("Your number is even. ");
 		}
 		else 
 		{
 			System.out.println("Your number is odd. ");
 		} 
 		
 	}
 	
 }