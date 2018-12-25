/*Weight on Other Planets 
 *Hady Salama
 *10/30/2017
 */
 
 import java.util.Scanner;
 public class weightOnOtherPlanets
 {
 	public static void main(String args[])
 	{
 		System.out.println("Please enter your weight on earth : ");
 		Scanner reader = new Scanner(System.in);
 		double weight = reader.nextDouble();
 		System.out.println("Choose your planet from the choices below:\n");
 			System.out.println(" 1. Voltar");
 			System.out.println(" 2. Krypton");
 			System.out.println(" 3. Fertos");
 			System.out.println(" 4. Servantos");
 		int planet = reader.nextInt();
 		switch (planet) 
 		{
 			case 1: 
			System.out.println("Your weight on Voltar is: " + (weight * 0.091));
			break;
			
			case 2: 
			System.out.println("Your weight on Krypton is: " + (weight * 0.720));
			break;
			
			case 3: 
			System.out.println("Your weight on Fertos is: " + (weight * 0.865));
			break;
			
			case 4: 
			System.out.println("Your weight on Fertos is: " + (weight * 4.612));
			break;
			
			default:
			System.out.println("Please enter only a 1, 2, 3, or 4.");
 		}
 	}
 }