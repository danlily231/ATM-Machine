//
// COP 2510 – Spring Semester, 2020 //
// Homework #1: The New ACME Machines ATM Machine //
// Dan Nguyen //

import java.util.Scanner;
public class PIN {
	
	/**
	* Method Name: processPIN
	* Description: compares the entered PIN to the PIN stored for this card
	* @param: user, cards
	*/
	public int processPIN(ATMCard user, ATMCard[] cards) {
		Scanner scan = new Scanner(System.in);
		int repeat = 4;
		do {
			System.out.println("\nEnter Card Pin");
			user.pin = scan.nextLine();
			int i;
			for (i = 0; i < cards.length; i++) {
				if (cards[i].accNum.equals(user.accNum));
					if (cards[i].pin.equals(user.pin)) {
						System.out.println("Valid card.");
						System.out.println("\nWelcome " + user.customerName);
						user.checking = cards[i].checking;
						user.savings = cards[i].savings;
						return i;
					}
					
			}
			repeat--;
			System.out.println("Try Again. You have " + repeat + " more attempt" + (repeat == 1 ? "." : "s.") );
			
		}
		while (repeat > 0);
		
		eatCard();
		return 5;

	}
	
	/**
	* Method Name: eatCard
	* Description: take away card if enter PIN wrong for 4 times
	* @param: 
	*/
	public void eatCard() {
		System.out.println("\nYour card has been eaten!\n");
		String [] args= {} ;
		main.main(args);
		
	}

	public static int eatCard(ATMCard user, ATMCard[] cards) {
		return 0;
	}
	
	
}
