/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausaufgabe2;

/**
 *
 * @author 43676
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumberTester tester= new NumberTester("");
        EratosthenesPrimeSieve eps= new EratosthenesPrimeSieve();
        
        tester.setOddEvenTester((i) -> (i%2) == 0);
        tester.setPrimeTester((i) -> eps.isPrime(i));
        //tester.setPalindromeTester();
    }
}
