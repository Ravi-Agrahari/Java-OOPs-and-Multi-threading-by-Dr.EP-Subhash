package exception_learning ; 

public class Exceptions {
	public static void main(String []args) {
		Account account1=null;
		Account account2=null;
                
//		try{
//			account2 = new Account(102, "Benson", -1234.5F);
//			account1 = new Account(101, "Dhanalkshmi", 12340.5F); // note if once the exception occur it will not execute remaining one 
//                }

                try{
			account1 = new Account(101, "Dhanalkshmi", 12340.5F);
                        account2 = new Account(102, "Benson", -1234.5F);
                }
                
                catch(MinimumBalanceException mbe){
			System.err.println("Exception: "+mbe.getMessage());
		}
                
                finally{
			if(account1==null){
				System.out.println("Account 1 did not create");
			}
			if(account2==null){
				System.out.println("Account 2 did not create");
			}
		}

		if(account1!=null)
			System.out.println("Account Details: "+account1);
		else
			System.out.println("Error in creating Account");

		if(account2!=null)
			System.out.println("Account Details: "+account2);
		else
			System.out.println("Error in creating Account");

	}
}




class Account {
    
        // private attributes 
    
	private int accountNo;
	private String customerName;
	private float balance;
        
        // constructor 
	public Account(int accountNo, String customerName, float balance)throws MinimumBalanceException{
		if(balance<1000){
			 throw new MinimumBalanceException("You cannot set initital balance with this amount -> "+balance);
                }
		this.accountNo=accountNo;
		this.customerName=customerName;
		this.balance=balance;
	}
        
        
        @Override
	public String toString(){
		//return getClass().getName()+"@"+hashCode();
		return "Account No: "+accountNo+"\nCustomer Name: "+customerName+"\nBalance: "+balance;
	}
}

class MinimumBalanceException extends Exception{
	public MinimumBalanceException(String message){
		super(message);
	}
}