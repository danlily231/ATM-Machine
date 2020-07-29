//
// COP 2510 – Spring Semester, 2020 //
// Homework #1: The New ACME Machines ATM Machine //
// Dan Nguyen //

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		CardServices cardCheck = new CardServices();
		//Money money = new Money();
		Account account = new Account();
		Scanner scan = new Scanner(System.in);

		ATMCard[] cards = new ATMCard[5];
		cards[0] = new ATMCard("Kyle Bustami","123456789", "1111", 500, 200, 2);
		cards[1] = new ATMCard("Cory Chambers","135792468", "2097", 100, 700, 3);
		cards[2] = new ATMCard("Tanner Douglas","019283746", "6194", 1500, 2500, 5);
		cards[3] = new ATMCard("Jordan Jones","675849302", "0071", 50, -1, 0);
		cards[4] = new ATMCard("Jesse Pecar","347821904", "9871", 150, 250, 1);
		
		ATMCard user = new ATMCard("","","",0,0,0);


		cardCheck.initializeCardDB();
		int cust = cardCheck.insertCard(user, cards);
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		Money withdraw = new Money();
		Deposit deposit = new Deposit();
		Transfer transfer = new Transfer();


	/**
	* Method Name: 
	* Description: show menu
	* @param 
	*/
		
		System.out.println("\nA. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Transfer");
		System.out.println("E. Exit");
		System.out.println();

		do {
			System.out.println("\nEnter an option");
			option = scanner.next().charAt(0);
			System.out.println();

			switch (option) {
				//check balance
				case 'A':
					System.out.println("Your saving balance is $" + user.savings);
					System.out.println("Your checking balance is $" + user.checking);
					System.out.println();
						break;

				//deposit money
				case 'B':
					deposit.depositMoney(cards, user, cust);
					System.out.println("Your saving balance is $" + user.savings);
					System.out.println("Your checking balance is $" + user.checking);
						break;
				
				//withdraw money
				case 'C':
						char type = account.select_withdraw();
						withdraw.enterAmount(cards, user, type, cust);
						System.out.println();
						break;
					
				//transfer money
				case 'D':
						int direction = account.chooseDirection();
						transfer.transferMoney(cards, user, direction, cust);
						System.out.println("Your saving balance is $" + user.savings);
						System.out.println("Your checking balance is $" + user.checking);
						break;

				//exit program
				case 'E':
						System.out.println();
						break;
				
				//check current balance in ATM
				case 'X':
						Security.check_amount();;
						Security.check_balance();
						break;
				
				//wrong option
				default:
						System.out.println("Invalid Option! Please try again.");
						break;
				}


			}while(option != 'E');
			System.out.println("Thank you for using our services. See you again!");


		cardCheck.returnCard();

		
		
		
	}


	}
	
