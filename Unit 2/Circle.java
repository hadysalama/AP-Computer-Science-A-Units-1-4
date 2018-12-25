/*
 *This is a program that calculates area and circumference of a circle
 *Rachel Milenius and Hady Salama
 *9/15/17
 */
 
 import java.util.Scanner;
 public class Circle
 {
 	public static void main(String[]args)
 	{
 		Scanner reader = new Scanner(System.in);
 		System.out.println("Enter the circle's radius: ");
 		double radius = reader.nextDouble();
 		double area = Math.PI * radius * radius;
 		double circumference = Math.PI * 2 * radius;
 		System.out.println("Your area of a circle with a radius of: " + radius + " is " + area);
 		System.out.println("Your circumference of a circle with a radius of: " + radius + " is " + circumference);
 		double newRadius = 2 * radius;
 		System.out.println("Twice the radius is: " + newRadius);
 		double newArea = Math.PI * newRadius * newRadius;
 		double newCircumference = Math.PI * 2 * newRadius;
 		System.out.println("The new area of the circle is: " + newArea);
 		System.out.println("The new circumference of the circle is: " + newCircumference);
 		double changeRadius = newRadius - radius;
 		System.out.println("The change in the radius is: " + changeRadius);
 		double changeArea = newArea - area;
 		System.out.println("The change in the area is: " + changeArea);
 		double changeCircumference = newCircumference - circumference;
 		System.out.println("The change in the circumference is: " + changeCircumference);
 	}
 }
