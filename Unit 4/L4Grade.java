/*Grade Program
 *Hady Salama
 *10/25/2017
 *This is program that calculates acceptance or rejection
 */
 import java.util.Scanner;
 public class L4Grade
 {
 	public static void main(String args[])
 	{
 		System.out.println("Please input your Grade:");
 		Scanner reader = new Scanner(System.in);
 		Double grade = reader.nextDouble();
 		if (grade >= 70) 
 			{
 				System.out.println("Congratulations you passed!"); //true
 			}
 		else
 			{
 				System.out.println("Better luck next time."); //false
 			}
 	}
 }