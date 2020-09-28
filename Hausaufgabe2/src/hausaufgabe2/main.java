/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausaufgabe2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

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
        String filename="file";
        NumberTester tester= new NumberTester(filename);
        EratosthenesPrimeSieve eps= new EratosthenesPrimeSieve();
        
        tester.setOddEvenTester((i) -> (i%2) == 0);
        tester.setPrimeTester((i) -> eps.isPrime(i));
        tester.setPalindromeTester((number) -> {
            return number == IntStream.iterate(number, i -> i / 10)
            .map(n -> n % 10)
            .limit(String.valueOf(number).length())
            .reduce(0, (a, b) -> a = a * 10 + b);
        });
        
        tester.testFile();
    }
}
