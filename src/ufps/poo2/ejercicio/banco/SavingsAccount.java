package ufps.poo2.ejercicio.banco;

public class SavingsAccount extends Account {

    private double interest;

    public SavingsAccount(int a) {
        super(a);
        this.interest = 0;
    }

    /**
     * El método que hace el depósito pero sumando a "num" el valor del interés
     */
    @Override
    public void deposit(double sum) {
        if (sum < 0 ) throw new RuntimeException("Deposit amount must be greater than 0.");
        double dex = this.getBalance() * this.getInterest();
        if (this.getBalance() > 0) super.deposit(sum + dex); else super.deposit(sum);
    }

    public double getInterest() {
        return this.interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        String msg = "";
        msg = "\nAccount Serial Number: " + this.getAccountNumber();
        msg += "\nAccount Balance Amount: " + this.getBalance();
        msg += "\nAccount Interest Amount: " + this.getInterest();
        return msg;
    }
}
