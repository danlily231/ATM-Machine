//
// COP 2510 – Spring Semester, 2020 //
// Homework #1: The New ACME Machines ATM Machine //
// Dan Nguyen //

public class Security {
	public static int twenties = 25, tens = 25, fives = 40, ones = 50;
	public static int totalMachineBalance = twenties * (20) + tens * (10) + fives * (5) + ones * (1);

	/**
	 * Method Name: verifyBalance Description: ensure that the card owner's account
	 * has enough money
	 * 
	 * @param: user, type, withdraw_money
	 */
	public boolean verityBalance(ATMCard user, char type, int withdraw_money) {
		if (type == 's') // Saving
		{
			return user.savings >= withdraw_money ? true : false;
		} else // Checking
		{
			return user.checking >= withdraw_money ? true : false;
		}
	}

	public boolean verifyBalance2(ATMCard user, int direction, int transfer_amount) {
		if (direction == 1) {
			return user.savings >= transfer_amount ? true : false;
		} else {
			return user.checking >= transfer_amount ? true : false;
		}
	}

	/**
	 * Method Name: verifyMachineBalance Description: ensure that the ATM machine
	 * has enough money
	 * 
	 * @param: type
	 */
	public boolean verifyMachineBalance(int type) {
		switch (type) {
			case 20:
				if (twenties > 0) {
					twenties--;
					return true;
				} else {
					return false;
				}
			case 10:
				if (tens > 0) {
					tens--;
					return true;
				} else {
					return false;
				}
			case 5:
				if (fives > 0) {
					fives--;
					return true;
				} else {
					return false;
				}
			case 1:
				if (ones > 0) {
					ones--;
					return true;
				} else {
					return false;
				}
			default:
				return false;
		}
	}

	public boolean checkMachineBalance(int withdraw_money){
		if(withdraw_money > totalMachineBalance){
			return false;
		}else{
			return true;
		}
	}

	// public boolean verifyMachineBalance2(int withdraw_money) {
	// 	if (withdraw_money > totalMachineBalance) {
	// 		return false;
	// 	} else {
	// 		return true;
	// 	}
	//}

	static void check_amount() {
		System.out.println("The bank has " + twenties + " $20 bills, " + tens + " $10 bills, " + fives
				+ " $5 bills, and " + ones + " $1 bills.");
	}

	static void check_balance() {
		System.out.println("The bank has " + totalMachineBalance);
	}


	public int verityBalance(double request, double balance) {
		
		return 0;
	}

	public int verityBalance(double request, Object card) {
		return 0;
	}
}

	