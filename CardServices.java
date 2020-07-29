//
// COP 2510 – Spring Semester, 2020 //
// Homework #1: The New ACME Machines ATM Machine //
// Dan Nguyen //

import java.util.Scanner;
public class CardServices {
	PIN pin = new PIN();
	/**
	* Method Name: initializeCardDB
	* Description: creates an array containing ATM card numbers and PINs
	* @param: cards
	*/
	public void initializeCardDB() {	

		ATMCard[] cards = new ATMCard[5];
		cards[0] = new ATMCard("Kyle Bustami","123456789", "1111", 500, 200, 2);
		cards[1] = new ATMCard("Cory Chambers","135792468", "2097", 100, 700, 3);
		cards[2] = new ATMCard("Tanner Douglas","019283746", "6194", 1500, 2500, 5);
		cards[3] = new ATMCard("Jordan Jones","675849302", "0071", 50, -1, 0);
		cards[4] = new ATMCard("Jesse Pecar","347821904", "9871", 150, 250, 1);
		}
	
	/**
	* Method Name: insertCard
	* Description: checks to see if the inserted card's ID number is recognized
	* @param: user, cards, scan
	*/
	public int insertCard(ATMCard user, ATMCard[] cards) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert Card");
		user.accNum = scan.nextLine();
		
		boolean found=false;
		
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].accNum.equals(user.accNum)) {
				found=true;
				break;
			}
		}
		
		if(found)
			System.out.println("Recognized card.");
			
		else {
			System.out.println("Unrecognized card.");
			main.main(null);
			//return false;
			}
			
		return pin.processPIN(user, cards);
		
	}
	
	/**
	* Method Name: processCard
	* Description: allows a user to request funds to withdraw
	* @param: pin
	*/
	public double processCard() {
		PIN pin = new PIN();
		return 1.0;
	}
	
	/**
	* Method Name: returnCard
	* Description: return card to user
	* @param: n/a
	*/
	public void returnCard(){
		System.out.println("Your card is successfully returned!");
		System.out.println();
		main.main(null);
		}
}

	
	

	
	

