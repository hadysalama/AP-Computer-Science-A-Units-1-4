/*Hady Salama
 *String Mutation
 *10/16/17
 *Usage of various string methods.
 */
public class StringMutation
{
   //Prints a string and various mutations of it.
   public static void main (String[] args)
   {
	String phrase = new String ("Change is inevitable"); 
		
	//Original Phrase

	String mutation1, mutation2, mutation3, mutation4, mutation5; 
    
	System.out.println ("Original string: \"" + phrase + "\"");
	
	System.out.println ("Length of string: " + phrase.length());
    
	mutation1 = phrase.concat("; resitance is futile.");
	
	mutation2 = mutation1.toUpperCase();

	mutation3 = mutation2.replace ('A', 'E'); 

	mutation4 = mutation3.substring (3, 30); 
		
  
	System.out.println ("Mutation #1: " + mutation1); 

	System.out.println ("Mutation #2: " + mutation2); 

	System.out.println ("Mutation #3: " + mutation3); 
		
	System.out.println ("Mutation #4: " + mutation4);
	
	String[] mutation6 = mutation1.split(" ");
	
	for(String w: mutation6)
	{  
		System.out.println(w);  
	}  

	System.out.println ("The UTF-16 Charset encoding mutation is: " + mutation4.getBytes());
		
    System.out.println ("New Mutated length: " + mutation4.length());
   }
}
