/*
 *The following are tests. 
 *Hady Salama
 *9/1/17
 */ 
 	
 	public class Unit2 {
 		public static void main(String[]args)
 		{
 			double age;
 			age = 18.75;
 			age -= 1; 
 			String name = "Hady ";
 			String greeting = "Hello my name is ";
 			String ageGreeting = "and I am ";
 		    System.out.println(greeting + name + ageGreeting + age);
 		    boolean foreign = true;
 		    System.out.println("Hady is not from this country:" + foreign);
		    System.out.println(name.length()); 
		    System.out.println(name.substring(1)); 
		    System.out.println(name.toLowerCase());
		    System.out.println(name.toUpperCase());
		    System.out.println(name);
		    double cosPi4 = Math.sqrt(2)/2;
		    double realValue = Math.cos(Math.PI/4);
		  //  public boolean trigTest(double cosPi4, double realValue)
		  //  {
		    	 if (cosPi4 == realValue)
		   		 {
		    		System.out.println(true);
		   		 }
		   		 else
		   		 {
		    		System.out.println(false);
		  		 }
		  //  }
		 //  trigTest();
		    System.out.println(cosPi4);
 		}
 	}