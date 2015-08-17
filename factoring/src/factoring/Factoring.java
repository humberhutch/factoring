/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoring;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ghutchison
 */
public class Factoring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = getInput();
        //displayPrimeFactors(n);
        //displayList(getPrimeFactors(n));
        if (isFactorListValid(getPrimeFactors(n), n)) {
            displayPrimeFactors(n);
            System.out.println("Everything is amazing");
        }
    }

    private static int getInput() {
        Scanner in = new Scanner(System.in);
        int value = 0;
        System.out.print("Which number would you like to factor? ");
        value = in.nextInt();
        return value;
    }

    private static void displayPrimeFactors(int n) {
        //start with first prime factor 2
        int factor = 2;

        System.out.println("Prime factors of " + n + " are :");
        while (factor <= n) {
            if (n % factor == 0) {
                System.out.print(factor);
                System.out.print(",");
                n = n / factor; // integer division - remainder 
            } else {
                factor++;
            }
        }
        System.out.println();
    }

    private static ArrayList<Integer> getPrimeFactors(int n) {
        //start with first prime factor 2
        int factor = 2;

        ArrayList<Integer> factorList = new ArrayList<Integer>();

        while (factor <= n) {
            if (n % factor == 0) {
                factorList.add(factor);
                n = n / factor; // integer division - remainder 
            } else {
                factor++;
            }
        }
        return factorList;
    }

    private static void displayList(ArrayList<Integer> factors) {

        for (Integer factor : factors) {
            System.out.print(factor);
            System.out.print(",");
        }

        return;
    }

    /**
     * Method is used to validate the prime factors are correct.
     *
     * @param factors
     * @param n
     * @return
     */
    private static boolean isFactorListValid(ArrayList<Integer> factors, int n) {
        int product = 1; // 
        for (Integer factor : factors) {
            product = product * factor;
        }
        return product == n;

    }
}