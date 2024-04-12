package ufps.poo2.ejercicio.test;

import ufps.poo2.ejercicio.banco.Account;
import ufps.poo2.ejercicio.banco.Bank;
import ufps.poo2.ejercicio.banco.CurrentAccount;
import ufps.poo2.ejercicio.banco.SavingsAccount;

public class TestingAccounts {

    static String separator = "\n#################################################################\n";
    static String sepLight = "\n------------------------------------------------------------------\n";

    /**
     * ==================================================================
     * NOTA IMPORTANTE RESPECTO A ESTA CLASE MAIN
     * ==================================================================
     * 
     * Esta clase contiene tres implementaciones por separado, Testing Saving
     * Acounts, Testing Current Accounts y Testing Bank. Por diseño, no se puede
     * descomentar todo el códio, puesto que hay variables que se llaman igual.
     * 
     * No obstante, se pueden descomentar las partes de código dentro de los
     * apartados === para usarse de manera individual. Los imports serán usados en
     * la medida que se descomenten los fragmentos de código que los usan.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // ================================================
        // TESTING SAVING ACCOUNTS CLASS
        // ================================================

        // println(separator);
        // println("\t\tInitializing testing Savings Accounts...\t\t");
        // println(separator);

        // SavingsAccount x1 = new SavingsAccount(2851);
        // System.err.println(x1);
        // x1.deposit(1000);
        // System.err.println(x1);
        // x1.withdraw(100);
        // System.err.println(x1);

        // println(sepLight);

        // x1.setInterest(20);
        // System.err.println(x1);
        // x1.deposit(1000);
        // System.err.println(x1);
        // x1.withdraw(20000);
        // System.err.println(x1);

        // println(separator);
        // println("\t\tFinalizing testing...\t\t");
        // println(separator);

        // ================================================
        // TESTING CURRENT ACCOUNTS CLASS
        // ================================================

        // println(separator);
        // println("\t\tInitializing testing Current Accounts...\t\t");
        // println(separator);

        // CurrentAccount x2 = new CurrentAccount(2851);
        // System.err.println(x2);
        // x2.deposit(1000);
        // System.err.println(x2);
        // x2.withdraw(100);
        // System.err.println(x2);

        // x2.setLimiteSobregiro(1000);

        // System.err.println(x2);
        // x2.deposit(1000);
        // System.err.println(x2);
        // x2.withdraw(20000);
        // System.err.println(x2);

        // println(separator);
        // println("\t\tFinalizing testing...\t\t");
        // println(separator);

       
    
} 
public static void println(Object obj) {
    System.out.println("\n\t" + obj + "\t\n");
}
}