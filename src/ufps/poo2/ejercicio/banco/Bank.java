package ufps.poo2.ejercicio.banco;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();

    public Bank() {
    }

    public void openAccount(char name, int accnum){
        accounts.add(new Account(accnum));
    }

    public void closeAccount(Account account){
        accounts.remove(account);
    }

    public Account findAccount(int accnum) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accnum) {
                return account;
            }
        }
        throw new RuntimeException("El número que ha ingresado no pertenece a ninguna cuenta");
    }

    public void payDividend(int accountCode, double x) {
        findAccount(accountCode).deposit(x);
    }

    public void withdrawAccount(int accountCode, double x) {
        if(findAccount(accountCode).getBalance()>=0){
            findAccount(accountCode).withdraw(x);
        }else{
            System.err.println("CurrentAccount.withdraw(...): cannot withdraw this amount.");
        }
    }

    public double getBalance(int accountCode) {
        return findAccount(accountCode).getBalance();
    }

    public void showAccount(int accountCode){
        System.out.println(findAccount(accountCode));
    }

    public String toString(){
        String msg = "";
        for (Account account : accounts) {
            msg += account.getAccountNumber() + "\n";
        }
        return msg;
    }
}
