import java.util.Scanner;
public class Transfer{
    int transfer_amount;

    /**
	* Method Name: transferMoney
    * Description: allow customer to transfer money to the preferred account
    * param: db, user, direction, cust
	*/
    public boolean transferMoney(ATMCard[] db, ATMCard user, int direction, int cust){
        Scanner scanner_2 = new Scanner(System.in);
        Security security = new Security();
        System.out.println("\nHow much would you like to transfer?");
        transfer_amount = scanner_2.nextInt();

       
			
        if (!security.verifyBalance2(user, direction, transfer_amount)) {
			System.out.println("You don't have enough money to transfer! Transaction incompleted.");
            return false;
            
        
        }else{
            Transnum transnum = new Transnum();
            if (transnum.transCharge(db, true, cust)){
            boolean transfer_direction = (direction == 1 ? true : false);
                if(transfer_direction){   
                    user.savings -= transfer_amount;
                    user.checking += transfer_amount;
                }else{
                    user.checking -= transfer_amount;
                    user.savings += transfer_amount;
            }
        }
    }
        return true;
    }
}

            