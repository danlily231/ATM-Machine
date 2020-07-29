import java.util.Scanner;
public class Deposit{
    Account account = new Account();

    /**
	* Method Name: depositMoney
	* Description: allow customer to deposit money to the chosen account
	* @param: db, user, cust
	*/
    public boolean depositMoney(ATMCard[] db, ATMCard user, int cust){
        char type_2 = account.select_deposit();
        boolean account_type = (type_2 == 'c' ? true : false);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter an amount to deposit");
        System.out.println("Twenty-dollar bills: ");
        
        int bill_20 = scanner.nextInt();
        Security.twenties += bill_20;
        
        System.out.println("Ten-dollar bills: ");
        int bill_10 = scanner.nextInt();
        Security.tens += bill_10;
        
        System.out.println("Five-dollar bills: ");
        int bill_5 = scanner.nextInt();
        Security.fives += bill_5;

        System.out.println("One-dollar bills: ");
        int bill_1 = scanner.nextInt();
        Security.ones += bill_1;

        int total_deposit = bill_20*(20) + bill_10*(10) + bill_5*(5) + bill_1*(1);
        System.out.println("Your total amount deposited is $"+ total_deposit);
        
        Transnum transnum = new Transnum();
        if (transnum.transCharge(db, true, cust)){
            if (account_type){
            user.checking += total_deposit;
            }else{
            user.savings += total_deposit;
            }
        }
        
        return true;
    }
}