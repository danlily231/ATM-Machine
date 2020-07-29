import java.util.Scanner;
public class Transnum {
    Deposit deposit = new Deposit();
    Money withdraw = new Money();
    Transfer transfer = new Transfer();

    /**
	* Method Name: transCharge
	* Description: check transaction times and charge if they exceed 5 times.
	* @param: user, cont, cust
	*/
    public boolean transCharge(ATMCard[] user, boolean cont, int cust){
        if(user[cust].transNum < 5){
            user[cust].transNum++;
            int remaining_trans = 5 - user[cust].transNum;
            System.out.println("\nYou have " + remaining_trans + " free of charge transactions left.");
            System.out.println("\nYour transaction has gone through!\n");
        }
        

        else{
        System.out.println("From this transaction, you will be charged $1 of saving account. Enter 'OK' to continue or 'Cancel' to exit.");
        Scanner scanner_3 = new Scanner(System.in);
        String input = scanner_3.nextLine();
            if (input.equals("OK")){
                cont = true;
                user[cust].savings -= 1;	
                user[cust].transNum++;
                System.out.println("Your transaction has gone through!");
                System.out.println("Your saving balance is $" + user[cust].savings);
			    System.out.println("Your checking balance is $" + user[cust].checking);
            }
            else if (input.equals("Cancel")){
                System.out.println("\nYour transaction has been cancelled.\n");
                return cont = false;
            }
        }
    return cont;
    } 
}
