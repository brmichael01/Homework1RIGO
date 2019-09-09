/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaka9
 */
import java.util.Scanner;

public class CookieCalories {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the number of cookies eaten: ");
		
		
	    double cookie = scan.nextDouble();  // Read user input
	    
	    Double calories=(cookie * 300)/4 ;
	    System.out.println("Then the total number of calories consumed is: " +  calories+" Calories");
	}

}
