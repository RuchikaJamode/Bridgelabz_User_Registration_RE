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
        
        scanner.close();
    }

    private static boolean isValidFirstName(String firstName) {
        // Regular expression for validating the first name
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        
        // Use String.matches() to check if the input matches the regular expression
        return firstName.matches(regex);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
UC1();
	}

}