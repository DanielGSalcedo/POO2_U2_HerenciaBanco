package ufps.poo2.ejercicio.banco;

public class CDTAccount extends Account {

    private int meses;
    private double interest;

    public CDTAccount(int a) {
        super(a);
    }

    @Override
    public void deposit(double sum) {
        if (this.getBalance() == 0) super.deposit(sum); else System.out.println("You cant deposit in this account more than twice");
    }

    
    public void withdraw() {
        if(this.getMeses() == 0) throw new RuntimeException("define the number of months to withdraw the money");
        if (this.getBalance() != 0) {

            for (int i = 0; i < meses; i++) {
                depositIntereses();
                System.out.printf("Month %d: %.3f\n", i + 1, getBalance());
            }
        } else
            System.out.println("you have to make your firts deposit");

    }

    
    @Override
    public void withdraw(double x) {
       System.out.println("You cant withdraw an specific amount of money from this account");
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public void depositIntereses() {
        super.deposit(this.interest * getBalance());
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

}