//
// COP 2510 – Spring Semester, 2020 //
// Homework #1: The New ACME Machines ATM Machine //
// Dan Nguyen //

import java.util.Scanner;

public class Account {
	/**
	* Method Name: select_withdraw
	* Description: select which account to withdraw money from
	* @param scan
	*/


	public char select_withdraw() {
		Scanner scan = new Scanner(System.in);
		char type;
		do {
			System.out.println("Would you like to withdraw from (c)hecking balance or (s)aving balance?");
			type = scan.next().charAt(0);
			type = Character.toLowerCase(type);
		} while(!(type != 'c' || type != 's'));
		
		return type;
	}
	
	/**
	* Method Name: chooseDirection
	* Description: select which account to transfer money from
	* @param 
	*/

	public int chooseDirection(){
        int direction;
        do{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a transfer method.\n(1) from saving to checking.\n(2) from checking to saving.");
        direction = scanner.nextInt();
        } while(!(direction !=1 || direction !=2));
        return direction;
    }

	/**
	* Method Name: select_deposit
	* Description: select which account to deposit money to
	* @param 
	*/
	public char select_deposit() {
		Scanner scan = new Scanner(System.in);
		char type;
		do {
			System.out.println("Would you like to deposit to (c)hecking balance or (s)aving balance?");
			type = scan.next().charAt(0);
			type = Character.toLowerCase(type);
		} while(!(type != 'c' || type != 's'));
		
		return type;
	}
	
}
