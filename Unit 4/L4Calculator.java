/*Calculator using case statements
 *Hady Salama
 *10/26/2017
 */
 
// import java.io.*;
//import javax.swing.*;

 import java.util.Scanner;
 public class L4Calculator
 {
 	public static void main(String args[])
 	{
 		System.out.println("Make your arithmetic selection from the choices below:\n");
 			System.out.println(" 1. Addition");
 			System.out.println(" 2. Subtraction");
 			System.out.println(" 3. Multiplication");
 			System.out.println(" 4. Division");
 		
		System.out.print(" Your choice? ");
		Scanner reader = new Scanner(System.in);
		int choice = reader.nextInt();
		
		System.out.print("\nEnter first operand. ");
		double op1 = reader.nextDouble();
		
		System.out.print("\nEnter your second operand. ");
		double op2 = reader.nextDouble();
		
		switch (choice)
		{
			case 1: //addition
			System.out.print(op1 + " plus " + op2 + " = " + (op1 + op2) );
			break;
			
			case 2: //subtraction
			System.out.print(op1 + " minues " + op2 + " = " + (op1 - op2) );
			break;
			
			case 3: //multiplication
			System.out.print(op1 + " times " + op2 + " = " + (op1 * op2) );
			break;
			
			case 4: //division
			System.out.print(op1 + " divided by " + op2 + " = " + (op1 / op2) );
			break;
			
			default:
			System.out.println("Please enter only a 1, 2, 3, or 4.");
		}
 	}
 }
