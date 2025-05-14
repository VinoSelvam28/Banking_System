import java.util.Scanner;

public class UberApp {
   public static void main(String args[])
 {

      //Getting input fom the user
	  Scanner sc = new Scanner(System.in);
	  System.out.print (" Enter the Name: ");
	  String name = sc.nextLine();
	  // Here using tab escape string 
	  System.out.println( "Hi "+ name + "\n\t Welcome to the uber app!");
      System.out.print (" Enter the Phonenumber: ");
	  String phoneno = sc.nextLine();
      System.out.println("no: \n"+ phoneno);
	  System.out.print (" Enter the Current location: ");
	  String Location= sc.nextLine();
	  System.out.println(" location:\n\t" + Location);
	  System.out.print (" Enter the Designation: ");
	  String Designation= sc.nextLine();
	  System.out.println("Designation:\n\t");
	  System.out.println("\nThank you for using our app!\n " + " our drivers will reach you within 5 Mins");
	   sc.close();
 }
 }
