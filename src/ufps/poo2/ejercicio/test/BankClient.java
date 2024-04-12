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


        Bank bank = new Bank();


        bank.openAccount('A', 1);
        bank.openAccount('C', 2);
        bank.openAccount('C', 3);


        println(sepLight);

        bank.setInterestAccount(1, 0.1);
        bank.payDividend(1, 1000);
        bank.withdrawAccount(1, 500);
        bank.payDividend(1, 1000);

        println(sepLight);

        bank.showAccount(1);

        println(sepLight);

        bank.setInterestAccount(1, 0.1);
        bank.payDividend(1, 1000);
        bank.withdrawAccount(1, 500);
        bank.payDividend(1, 1000);

        System.out.println("\nBalance of account number 2 is: " +
        bank.getBalance(2));

        println(sepLight);

        bank.payDividend(6, 1000);
        bank.withdrawAccount(6, 1000);

        System.out.println("\nBalance of account number 1 is: " +
        bank.getBalance(6));

        println(sepLight);

        bank.payDividend(2,1000);
        bank.withdrawAccount(2,2000);

        System.out.println("\nBalance of account number 1 is: " +
        bank.getBalance(0));

        println(sepLight);

        bank.showAccount(1);
        println(sepLight);

        bank.showAccount(1);
        println(sepLight);

        bank.showAccount(1);

        println(separator);
        println("\t\tFinalizing testing...\t\t");
        println(separator);
    }
        
    

    public static void println(Object obj) {
        System.out.println("\n\t" + obj + "\t\n");
    }
}