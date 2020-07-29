//
// COP 2510 – Spring Semester, 2020 //
// Homework #1: The New ACME Machines ATM Machine //
// Dan Nguyen //

import java.util.Scanner;
public class ATMCard {
	
	String customerName;
	String accNum;
	String pin;
	int checking;
	int savings;
	int balance;
	int transNum;

	// Constructors ATMCard() that hold info of each user
	// @para: accNum, pin, checking, savings
	public ATMCard(String customerName, String accNum, String pin, int checking, int savings, int transNum) {
		this.customerName = customerName;
		this.accNum = accNum;
		this.pin = pin;
		this.checking = checking;
		this.savings = savings;
		this.transNum = transNum;

	}

	
}

	