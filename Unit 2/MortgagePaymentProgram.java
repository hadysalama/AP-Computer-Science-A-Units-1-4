// TextLab03st.java
// The Mortage Payment Program
// This is the student, starting version of the Mortage Payment Program assignment.
// This program computes the Mortgage Payment, Total Payments, and Total Interest based on user input.


//Add the required import statement
 import java.util.Scanner;
public class MortgagePaymentProgram

{
	public static void main(String args[])
	{
		System.out.println("Mortgage Payment Program, Student Version\n");

		double principal;
		double annualRate;
		double numYears;
        Scanner reader = new Scanner(System.in);

		//prompt for user input of principal, annual rate, and number of years and store properly in variables
	   System.out.println("Please enter the principal loan, annual interest rate, and the number of years on this loan");
	   principal = reader.nextDouble();
	   annualRate = reader.nextDouble();
	   numYears = reader.nextDouble();
		
		//Create variables to store the calculated monthly rate and number of months
		double R = annualRate/100/12;
		double months = numYears * 12;
		
		//Create a temp variable to calculate the (1+R) ^ N . Then create a variable that calculates Monthly Payment using your temp variable.
		double temp = Math.pow((1 + R), months);
		double monthlyPayment = ((R * temp) / (temp - 1)) * principal;
		
		
		//Create variables to store the calculated Total Payments and Total Interest
		double totalPayments = Math.round(((months * monthlyPayment)*100)/100);
		double totalInterest = Math.round(((totalPayments - principal)*100)/100);
	

		System.out.println();
		//Create output statements that output the required information as shown in directions
		System.out.println("Principal: $" + principal);
		System.out.println("Annual Rate: " + annualRate + "%");
		System.out.println("Number of Years: " + numYears);
	    System.out.println("Monthly Payment: $" + monthlyPayment);
        System.out.println("Total Payments: $" + totalPayments);
        System.out.println("Total Interest: $" + totalInterest);

		
		
		
	}
}