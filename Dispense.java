//
// COP 2510 – Spring Semester, 2020 //
// Homework #1: The New ACME Machines ATM Machine //
// Dan Nguyen //

public class Dispense {
	
	/**
	* Method Name: ones
	* Description: number of one dollar bills
	* @param: amount
	*/
	public boolean ones(int amount) {
		if (amount >= 1) {
			amount--;
			return true;
		} else {
			return false;
		}
	}

	/**
	* Method Name: fives
	* Description: number of five dollar bills
	* @param: amount
	*/
	public boolean fives(int amount) {
		if (amount >= 5) {
			amount -= 5;
			return true;
		} else {
			return false;
		}
	}

	/**
	* Method Name: tens
	* Description: number of ten dollar bills
	* @param: amount
	*/
	public boolean tens(int amount) {
		if (amount >= 10) {
			amount -= 10;
			return true;
		} else {
			return false;
		}
	}

	/**
	* Method Name: twenties
	* Description: number of tewenties dollar bills
	* @param: amount
	*/
	public boolean twenties(int amount) {
		if (amount >= 20) {
			amount -= 20;
			return true;
		} else {
			return false;
		}
	}
}
