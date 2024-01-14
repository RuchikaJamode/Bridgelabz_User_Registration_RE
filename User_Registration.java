package com.bridgelabz.userregistration;
import java.util.Scanner;
public class User_Registration {
	
	public static void UC1(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        // Validate the first name
        if (isValidFirstName(firstName)) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. Please ensure it starts with a capital letter and has at least 3 characters.");
        }
        
        //scanner.close();
    }

    private static boolean isValidFirstName(String firstName) {
        // Regular expression for validating the first name
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        
        // Use String.matches() to check if the input matches the regular expression
        return firstName.matches(regex);
    }
    public static void UC2(){
    	Scanner scanner = new Scanner(System.in);
          System.out.println("Enter your last name: ");
          String lastName = scanner.nextLine();
          // Validate the last name
          if (isValidLastName(lastName)) {
              System.out.println("Valid last name: " + lastName);
          } else {
              System.out.println("Invalid last name. Please ensure it starts with a capital letter and has at least 3 characters.");
          }
          
        //  scanner.close();
      }

      private static boolean isValidLastName(String lastName) {
          // Regular expression for validating the last name
          String regex = "^[A-Z][a-zA-Z]{2,}$";
          
          // Use String.matches() to check if the input matches the regular expression
          return lastName.matches(regex);
      }
  
      public static void UC3(){
      	Scanner scanner = new Scanner(System.in);
      	 System.out.println("Enter your email address: ");
         String email = scanner.nextLine();

         // Validate the email address
         if (isValidEmail(email)) {
             System.out.println("Valid email address: " + email);
         } else {
             System.out.println("Invalid email address. Please enter a valid email with precise @ and . positions.");
         }

         //scanner.close();
     }

     private static boolean isValidEmail(String email) {
         // Regular expression for validating the email address
         String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)@[a-zA-Z]+(\\.[a-zA-Z]{2,})(\\.[a-zA-Z]{2,})$";

         // Use String.matches() to check if the input matches the regular expression
         return email.matches(regex);
     }
 
     public static void UC4(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your mobile number: ");
         String mobileNumber = scanner.nextLine();

         // Validate the mobile number
         if (isValidMobileNumber(mobileNumber)) {
             System.out.println("Valid mobile number: " + mobileNumber);
         } else {
             System.out.println("Invalid mobile number. Please enter a valid mobile number in the format '91 1234567890'.");
         }

         scanner.close();
     }

     private static boolean isValidMobileNumber(String mobileNumber) {
         // Regular expression for validating the mobile number
         String regex = "^91\\s[1-9]\\d{9}$";

         // Use String.matches() to check if the input matches the regular expression
         return mobileNumber.matches(regex);
     }
 
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
UC1();
UC2();
UC3();
UC4();
	}

}
