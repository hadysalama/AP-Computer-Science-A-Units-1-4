/**
 *The following is a list of Math Operations through println(). 
 *Hady Salama
 *8/28/17
 */
 
 public class MathOps
 { 
   public static void main (String[]args)
   {
   	System.out.println("Double Op: " + (4.2 + 5.6));
   	System.out.println("Double Op: " + (5 + 4.4));
   	System.out.println("Int Op: " + (5 + 7));
   	System.out.println("5 +7 = " + 5 + 7);
   	System.out.println();
   	
   	System.out.println((double)(3+8)); //cast as double and as decimal and zero
   	System.out.println(3.5 + 8.4); //Double Op
   	System.out.println((int)(3.2 + 8.4)); //Casts the answer as int - trunicates
   	System.out.println();
   	
   	System.out.println("Double Op: " + (5.4/4));
   	System.out.println("Double Op: " + (4.4/5));
   	System.out.println("Int Op: " + (int)(25.7 / 5.4));
   	System.out.println();
   	
   	System.out.println(Math.pow(5,4)); //5 to the power of 4
   	System.out.println(Math.sqrt(50)); //Square Root of 50
   	System.out.println(Math.abs(-315)); //Absolute Value
   	System.out.println(Math.random() * 100 ); //Random number between 0 and 100
   	System.out.println();
   	
   	 }
 
 }