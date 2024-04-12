package ufps.poo2.ejercicio.banco;

public class CurrentAccount extends Account{

    private double limiteSobregiro;

    public CurrentAccount(int a) {
        super(a);
        this.limiteSobregiro = 0;
    }
    
    @Override
    public void withdraw(double num){
        double i = getBalance() + getLimiteSobregiro();
        if(num < 0) throw new RuntimeException("Withdrawal amount must be greater than 0.");
        if(i > num){
            super.withdraw(num);  
        }else{
            System.err.println("Account.withdraw(...): " + "cannot withdraw this amount.");
        }
    }

    public double getLimiteSobregiro() {
        return this.limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public String toString() {
		String msg = "";
        msg = "\nAccount Serial Number: " + this.getAccountNumber();
        msg += "\nAccount Balance Amount: " + this.getBalance();
        msg += "\nOverLimit Balance Amount: " + this.getLimiteSobregiro();
		return msg;
	}
}
