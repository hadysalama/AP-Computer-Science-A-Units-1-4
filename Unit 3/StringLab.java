/*
 *This is a program that runs various string operations on one's full name.
 *Hady Salama
 *10/3/17
 */
 
 import java.util.Scanner;
 public class StringLab
 {
 	public static void main(String[]args)
 	{
 		Scanner reader = new Scanner(System.in);
 		System.out.println("Please enter your first name:");
 		String firstName = reader.nextLine();
 		System.out.println("Please enter your last name:");
 		String lastName = reader.nextLine();
 		System.out.println("Your last name is: " + lastName);
 		String fullName = firstName + lastName;
 		System.out.println("Your substring is: " + fullname.substring(1,7));
 		char firstLetter = firstName.charAt(0);
 		String str = firstLetter.toString();
 		String pigLatin = firstName.substring(1) + str + "ay";	
 	}
 	
 }
 		