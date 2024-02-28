package oops;

public class atm_userAuthentication {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setBalance(1000);
        double balance=acc.getBalance(500.0);
		System.out.println("Witdrawing :: "+balance +" Amount");
    }
}
class Account {
    private double balance;
    public double getBalance(double balance){
        boolean result = validate("sachin","sachin123");
        if (result == true)
		{
			this.balance = this.balance - balance;
			return balance;
		}
		else
		{
			System.out.println("Invalid username/password try again....");
			return 0.0;
		}	
    }
    public void setBalance(double balance){
        boolean result = validate("sachin","sachin123");
        if (result==true)
		{
			//deposit the money
			this.balance = this.balance + balance;
			System.out.println("Credited to the account");
		}
		else
		{
			//throw a meaningful message to the user
			System.out.println("Invalid username/password try again....");
		}
    }
    private boolean validate(String userName,String password)
	{
		//logic for authentication
		return userName.equalsIgnoreCase("sachin") && password.equals("sachin123") ;
	}    
}