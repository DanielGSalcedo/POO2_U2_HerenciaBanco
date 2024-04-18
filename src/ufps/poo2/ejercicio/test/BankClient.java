package ufps.poo2.ejercicio.test;

import ufps.poo2.ejercicio.banco.Bank;

public class BankClient {
    public static void main(String[] args) {

        String separator = "\n#################################################################\n";
        String sepLight = "\n------------------------------------------------------------------\n";

        // ================================================
        // TESTING BANK CLASS
        // ================================================

        println(separator);
        println("\t\tTesting bank class...\t\t");
        println(separator);

        Bank bank = new Bank(0.05);

        bank.openAccount('A', 1);
        bank.openAccount('C', 2);
        bank.openAccount('C', 3);
        bank.openAccount('T', 4);

        bank.setInterestAccount(4, bank.getInterest());
        bank.setMonthsToWithdraw(4, 12);
        bank.payDividend(4, 1000);
        bank.withdrawAccount(4);
        //System.out.println(bank.findAccount(4).getBalance());

        println(sepLight);

        bank.setInterestAccount(1, 0.1);
        bank.payDividend(1, 1000);
        bank.withdrawAccount(1, 500);
        bank.payDividend(1, 1000);
        bank.showAccount(1);
        
        println(sepLight);

        bank.setOverdraftAccount(2, 500);
        bank.showAccount(2);
        bank.payDividend(2, 1000);
        System.out.println("\nBalance of account number 2 is: " + bank.getBalance(2));
        bank.withdrawAccount(2, 1500);
        System.out.println("\nBalance of account number 2 is: " + bank.getBalance(2));
        bank.payDividend(2, 1000);
        System.out.println("\nBalance of account number 2 is: " + bank.getBalance(2));
     

        println(sepLight);


        println(separator);
        println("\t\tFinalizing testing...\t\t");
        println(separator);
    }

    public static void println(Object obj) {
        System.out.println("\n\t" + obj + "\t\n");
    }
}