//Hello World
//Hady Salama
//8/22/17
//My first Java program.

public class HelloWorld {

    public static void main(String [] args) {
    System.out.println("3+3=" + 4+3);
    System.out.print("My name is ");
    System.out.print("Hady.");
    } 
}
public class Person
{
  /// fields ////////////////
  private String name = "Hady";
  private String cell;

  /////// constructors ////////////////////
  public Person(String theName, String theCell)
  {
    this.name = theName;
    this.cell = theCell;
  }

  //////////// methods ///////////////////////
  public String getName()
  {
     return this.name;
  }
  public void setName(String theName)
  {
     this.name = theName;
  }

  public String getCell()
  {
     return this.cell;
  }

  public void setCell(String theCell)
  {
     this.cell = theCell;
  }

  public String toString() { return "name: " + this.name +
                             ", cell: " + this.cell; }


  //////////// main for testing //////////////
  public static void main(String[] args)
  {
    Person p1 = new Person("Deja", "555 132-3253");
    System.out.println(p1);
    Person p2 = new Person("Avery", "555 132-6632");
    System.out.println(p2);
  }
  Person.getName(String[] args);
}