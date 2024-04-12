package ufps.poo2.ejercicio.banco;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();

    public Bank() {
    }

    public void openAccount(char tipo, int accnum){
        if(accnum <= 0 ) throw new RuntimeException("Account number must be greater than 0.");
        if(isAccount(accnum)) throw new RuntimeException("Account number already exists.");
        if(tipo != 'C' && tipo != 'A') throw new RuntimeException("Account type must be 'C' or 'A'.");
        if(tipo == 'C') accounts.add(new CurrentAccount(accnum));
        if(tipo == 'A') accounts.add(new SavingsAccount(accnum));
    }

    public void closeAccount(Account account){
        if(accounts.contains(account)){
            accounts.remove(account);
        }else{
            throw new RuntimeException("Account does not exist.");
        }
    }

    public Account findAccount(int accnum) {
        if(accnum <= 0 ) throw new RuntimeException("Account number must be greater than 0.");
        for (Account account : accounts) {
            if (account.getAccountNumber() == accnum) {
                return account;
            }
        }
        throw new RuntimeException("Account does not exist.");
    }

    public void payDividend(int accountCode, double x) {
        if (x < 0 ) throw new RuntimeException("Dividend must be greater than 0.");
        findAccount(accountCode).deposit(x);
    }

    public void withdrawAccount(int accountCode, double x) {
        if(x < 0 ) throw new RuntimeException("Withdrawal amount must be greater than 0.");
        if(findAccount(accountCode).getBalance()>=0){
            findAccount(accountCode).withdraw(x);
        }else{
            System.err.println("CurrentAccount.withdraw(...): cannot withdraw this amount.");
        }
    }

    public void sendLetterToOverdraftAccounts(){
        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                System.out.println("Sending letter to this account: " + account.getAccountNumber()+" account");
            }
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

    private boolean isAccount(int accnum){
        for (Account account : accounts) {
            if(account.getAccountNumber() == accnum){
                return true;
            }
        }
        return false;   
    }
}
