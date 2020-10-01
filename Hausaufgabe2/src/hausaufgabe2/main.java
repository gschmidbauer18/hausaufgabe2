/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausaufgabe2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 *
 * @author 43676
 */
public class main {

    static Scanner sc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        /*String filename="file";
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
        
        tester.testFile();*/
        String input;
        int actInput=0;
        boolean stop=false;
        
        int xa=0;
        int xb=0;
        int ya=0;
        int yb=0;
       
        
        
        do
        {
            menu();
            input=sc.nextLine();
            actInput=Integer.parseInt(input);
            
            if(actInput==1)
            {
                numberEnter(xa, xb, ya, yb);
                operationChooser(actInput);
                
                RationalCalculator rc=new RationalCalculator(
                        new CalculationOperation() {
                    @Override
                    public Number calc(Number x, Number y) {
                        if(x.getB()==y.getB())
                        {
                            double xy=x.getA()+y.getA();
                            Number erg=new Number();
                            erg.setA(xy);
                            erg.setB(x.getB());
                            return erg;
                        }
                        else
                        {
                            double nenner=x.getB()*y.getB();
                            double zähler1=x.getA()*y.getB();
                            double zähler2=y.getA()*x.getB();
                            
                            double xy=zähler1+zähler2;
                            Number erg=new Number();
                            erg.setA(xy);
                            erg.setB(nenner);
                            return erg;
                        }
                    }
                }, 
                        new CalculationOperation() {
                    @Override
                    public Number calc(Number x, Number y) {
                        if(x.getB()==y.getB())
                        {
                            double xy=x.getA()-y.getA();
                            Number erg=new Number();
                            erg.setA(xy);
                            erg.setB(x.getB());
                            return erg;
                        }
                        else
                        {
                            double nenner=x.getB()*y.getB();
                            double zähler1=x.getA()*y.getB();
                            double zähler2=y.getA()*x.getB();
                            
                            double xy=zähler1-zähler2;
                            Number erg=new Number();
                            erg.setA(xy);
                            erg.setB(nenner);
                            return erg;
                        }
                    }
                }, 
                        new CalculationOperation() {
                    @Override
                    public Number calc(Number x, Number y) {
                        double xyZ=x.getA()*y.getA();
                        double xyN=x.getB()*y.getB();
                        Number erg=new Number();
                            erg.setA(xyZ);
                            erg.setB(xyN);
                            return erg;
                    }
                }, 
                        new CalculationOperation() {
                    @Override
                    public Number calc(Number x, Number y) {
                        double xyZ=x.getA()*y.getB();
                        double xyN=x.getB()*y.getA();
                        Number erg=new Number();
                            erg.setA(xyZ);
                            erg.setB(xyN);
                            return erg;
                    }
                });
                
                if(actInput==1)
                {
                    
                }
                if(actInput==2)
                {
                    
                }
                if(actInput==3)
                {
                    
                }
                if(actInput==4)
                {
                    
                }
                else
                {
                    System.out.println("Unvalid Input");
                }
            }
            if(actInput==2)
            {
                numberEnter(xa, xb, ya, yb);
                operationChooser(actInput);
            }
            if(actInput==3)
            {
                numberEnter(xa, xb, ya, yb);
                operationChooser(actInput);
            }
            if(actInput==4)
            {
                stop=true;
            }
            else
            {
                System.out.println("Unvalid Input");
                stop=true;
            }
        }while(stop==false);
    }
    
    public static void menu()
    {
        System.out.println("1 - Relational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3- Complex calculator");
        System.out.println("4- Exit program");
    }
    
    public static void numberEnter(double a,double b,double aa,double bb)
    {
        System.out.println("Enter number x a>");
        String xaString=sc.nextLine();
        a=Integer.parseInt(xaString);
        System.out.println("Enter number x b>");
        String xbString=sc.nextLine();
        b=Integer.parseInt(xbString);
        System.out.println("Enter number y a>");
        String yaString=sc.nextLine();
        aa=Integer.parseInt(yaString);
        System.out.println("Enter number y b>");
        String ybString=sc.nextLine();
        bb=Integer.parseInt(ybString);
    }
    
    public static void operationChooser(int input)
    {
        System.out.println("Choose the operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter the numbers again");
        String sinput=sc.nextLine();
        input=Integer.parseInt(sinput);
    }
}
