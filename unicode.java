package Deliverables2;

import java.util.Scanner;

public class unicode {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the my unicode calculator");
		
		
		Scanner userInput = new Scanner(System.in); 
		
		System.out.println("Please input 1st string to be converted");
		String string1 = userInput.next(); 
		System.out.println("Please input 2nd string to be converted");
		String string2 = userInput.next(); 
		
		System.out.println();
		
		int i; 
		int sum1 = 0; 
		int sum2 = 0; 
		
		for (i = 0; i < string1.length(); ++i) { 
			char c1 = string1.charAt(i); 
			int uc1 = (int) c1; 
			System.out.print("Character #" + (i+1) + " \"" + c1 + "\" is converted to: " + uc1); 
			sum1 = sum1 + uc1; 
			System.out.println(" (sum is " + sum1 + ")");
		}
		
		System.out.println();
		
		for (i = 0; i < string2.length(); ++i) { 
			char c2 = string2.charAt(i); 
			int uc2 = (int) c2; 
			System.out.print("Character #" + (i+1) + " \"" + c2 + "\" is converted to: " + uc2); 
			sum2 = sum2 + uc2; 
			System.out.println(" (sum is " + sum2 + ")");
		}
		
		System.out.println();
		
		int difference = sum1 - sum2; 
		difference = Math.abs(difference); 
		System.out.println("Difference between 1st sentence and 2nd sentence (as absolute value) is: " + difference);
		
		
		String winner = (sum1 > sum2) ? string1 : string2; 
		int winsum = (sum1 > sum2) ? sum1 : sum2; 
		System.out.println("Obviously, the superior string is \"" + winner + "\"" + " with a sum of " + winsum);
		
		userInput.close(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
