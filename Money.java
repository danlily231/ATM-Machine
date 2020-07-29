//
// COP 2510 – Spring Semester, 2020 //
// Homework #1: The New ACME Machines ATM Machine //
// Dan Nguyen //

import java.util.Scanner;


public class Money {
	/**
	* Method Name: enterAmount
	* Description: allows user to enter the amount they want to withdraw
	* @param: scan, money
	*/
	public boolean enterAmount(ATMCard[] db, ATMCard user, char type, int cust) {
		Scanner scan = new Scanner(System.in);
		Security security = new Security();
		Dispense dispense = new Dispense();
		boolean account_type = (type == 'c' ? true : false);
		System.out.println("Enter the amount of money you want to withdraw from " + (account_type ? "checking" : "saving") + " balance: ");
		int withdraw_money = scan.nextInt();
		if (!security.verityBalance(user, type, withdraw_money)) {
			System.out.println("You don't have enough money to withdraw!");
			return false;
		}
		else if(!security.checkMachineBalance(withdraw_money)){
			System.out.println("Sorry! The machine does not have enough money to execute transaction.");
			return false;
		} else {
			Transnum transnum = new Transnum();
			if (transnum.transCharge(db, true, cust)){
				if (account_type)
					user.checking -= withdraw_money;
				else
					user.savings -= withdraw_money;
		}
			
			int ones = 0, fives = 0, tens = 0, twenties = 0;
			
			while (dispense.twenties(withdraw_money) && security.verifyMachineBalance(20)) {
				withdraw_money -= 20;
				twenties++;
			}
			while (dispense.tens(withdraw_money) && security.verifyMachineBalance(10)) {
				withdraw_money -= 10;
				tens++;
			}
			while (dispense.fives(withdraw_money) && security.verifyMachineBalance(5)) {
				withdraw_money -= 5;
				fives++;
			}
			while (dispense.ones(withdraw_money) && security.verifyMachineBalance(1)) {
				withdraw_money--;
				ones++;
			}
			
			
			System.out.println("\nYou have withdrawn " + twenties + " $20 bills, " + tens + " $10 bills, " + fives + " $5 bills, and " + ones + " $1 bills.");
			System.out.println("You have $" + (account_type ? user.checking : user.savings) + " left in your " + (account_type ? "checking" : "saving") + " account.");
			
			//security.check_amount();
		}
			
		return true;

			
			
	}
}
