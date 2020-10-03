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
    static double zahl3=0.0;
    static double xa=0.0;
    static double xb=0.0;
    static double ya=0.0;
    static double yb=0.0;
    static int actInput=0;
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
        boolean stop=false;
        
        
       
        Number x=new Number();
        Number y=new Number();
        
        do
        {
            menu();
            input=sc.nextLine();
            actInput=Integer.parseInt(input);
            
            if(actInput==1)
            {
                numberEnter();
                x.setA(xa);
                x.setB(xb);
                y.setA(ya);
                y.setB(yb);
                
                operationChooser();
                
                CalculationOperation cadd=(Number x1, Number y1) -> {
                    if (x1.getB() == y1.getB()) {
                        double xy = x1.getA() + y1.getA();
                        Number erg=new Number();
                        erg.setA(xy);
                        erg.setB(x1.getB());
                        return erg;
                    } else {
                        double nenner = x1.getB() * y1.getB();
                        double zähler1 = x1.getA() * y1.getB();
                        double zähler2 = y1.getA() * x1.getB();
                        double xy=zähler1+zähler2;
                        Number erg=new Number();
                        erg.setA(xy);
                        erg.setB(nenner);
                        return erg;
                    }
                };
                CalculationOperation csub= (Number x1, Number y1) -> {
                    if (x1.getB() == y1.getB()) {
                        double xy = x1.getA() - y1.getA();
                        Number erg=new Number();
                        erg.setA(xy);
                        erg.setB(x1.getB());
                        return erg;
                    } else {
                        double nenner = x1.getB() * y1.getB();
                        double zähler1 = x1.getA() * y1.getB();
                        double zähler2 = y1.getA() * x1.getB();
                        double xy=zähler1-zähler2;
                        Number erg=new Number();
                        erg.setA(xy);
                        erg.setB(nenner);
                        return erg;
                    }
                };
                CalculationOperation cmult= (Number x1, Number y1) -> {
                    double xyZ = x1.getA() * y1.getA();
                    double xyN = x1.getB() * y1.getB();
                    Number erg=new Number();
                    erg.setA(xyZ);
                    erg.setB(xyN);
                    return erg;
                };
                CalculationOperation cdiv= (Number x1, Number y1) -> {
                    double xyZ = x1.getA() * y1.getB();
                    double xyN = x1.getB() * y1.getA();
                    Number erg=new Number();
                    erg.setA(xyZ);
                    erg.setB(xyN);
                    return erg;
                };
                RationalCalculator rc=new RationalCalculator(cadd,csub,cmult,cdiv);
                
                if(actInput==1)
                {
                    Number erg=rc.add(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                    System.out.println("b="+erg.getB());
                }
                else if(actInput==2)
                {
                    Number erg=rc.subtract(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                    System.out.println("b="+erg.getB());
                }
                else if(actInput==3)
                {
                    Number erg=rc.multiply(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                }
                else if(actInput==4)
                {
                    Number erg=rc.divide(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                }
                else
                {
                    System.out.println("Unvalid Input");
                }
            }
            else if(actInput==2)
            {
                numberEnter();
                x.setA(xa);
                x.setB(xb);
                y.setA(ya);
                y.setB(yb);
                
                
                operationChooser();
                
                CalculationOperation vadd=(Number x1, Number y1) -> {
                            double zah1 = x1.getA() + y1.getA();
                            double zah2 = y1.getB() + x1.getB();
                            Number erg=new Number();
                            erg.setA(zah1);
                            erg.setB(zah2);
                            return erg;
                };
                CalculationOperation vsub= (Number x1, Number y1) -> {
                    double zah1 = x1.getA() - y1.getA();
                    double zah2 = x1.getB() - y1.getB();
                    Number erg=new Number();
                    erg.setA(zah1);
                    erg.setB(zah2);
                    return erg;
                };
                CalculationOperation vmult= (Number x1, Number y1) -> {
                    double zah1 = x1.getB() * 0 - 0 * y1.getB();
                    double zah2 = y1.getA() * 0 - 0 * x1.getA();
                    zahl3 = x1.getA() * y1.getB() - x1.getB() * y1.getA();
                    Number erg=new Number();
                    erg.setA(zah1);
                    erg.setB(zah2);
                    return erg;
                };
                CalculationOperation vdiv= (Number x1, Number y1) -> {
                    double zah1 = x1.getA() + x1.getB();
                    double zah2 = y1.getA() + y1.getB();
                    Number erg=new Number();
                    erg.setA(zah1);
                    erg.setB(zah2);
                    return erg;
                };
                
                VectorCalculator vc=new VectorCalculator(vadd, vsub, vmult,vdiv);
                
                if(actInput==1)
                {
                    Number erg=vc.add(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                    System.out.println("b="+erg.getB());
                }
                else if(actInput==2)
                {
                    Number erg=vc.subtract(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                    System.out.println("b="+erg.getB());
                }
                else if(actInput==3)
                {
                    Number erg=vc.multiply(x, y);
                    System.out.println("Kreuzprodukt:");
                    System.out.println("a="+erg.getA());
                    System.out.println("b="+erg.getB());
                    System.out.println("c="+zahl3);
                }
                else if(actInput==4)
                {
                    Number erg=vc.divide(x, y);
                    System.out.println("Skalarprodukt ist:");
                    System.out.println(erg.getA()+erg.getB());
                }
                else
                {
                    System.out.println("Unvalid Input");
                }
            }
            else if(actInput==3)
            {
                numberEnter();
                x.setA(xa);
                x.setB(xb);
                y.setA(ya);
                y.setB(yb);
                
                operationChooser();
                
                ComplexCalculator cc=new ComplexCalculator(
                        (Number x1, Number y1) -> {
                            double zah1 = x1.getA() + y1.getA();
                            double zah2 = y1.getB() + x1.getB();
                            Number erg=new Number();
                            erg.setA(zah1);
                            erg.setB(zah2);
                            return erg;
                }, (Number x1, Number y1) -> {
                    double zah1 = x1.getA() - y1.getA();
                    double zah2 = y1.getB() - x1.getB();
                    Number erg=new Number();
                    erg.setA(zah1);
                    erg.setB(zah2);
                    return erg;
                }, (Number x1, Number y1) -> {
                    double zah1 = x1.getA() * y1.getA();
                    double zahl1 = x1.getA() * y1.getB();
                    double zah2 = x1.getB() - y1.getA();
                    double zahl22 = x1.getB() * y1.getB();
                    double zahl111=zah1+zah2;
                    double zahl222=zahl1+zahl22;
                    Number erg=new Number();
                    erg.setA(zahl111);
                    erg.setB(zahl222);
                    return erg;
                }, (Number x1, Number y1) -> {
                    double zah1 = x1.getA() * y1.getA();
                    double zahl1 = x1.getA() * y1.getB();
                    double zah2 = x1.getB() - y1.getA();
                    double zahl22 = x1.getB() * y1.getB();
                    double zahl111=zah1+zah2;
                    double zahl222=zahl1+zahl22;
                    Number erg=new Number();
                    erg.setA(zahl111);
                    erg.setB(zahl222);
                    return erg;
                });
                
                if(actInput==1)
                {
                    Number erg=cc.add(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                    System.out.println("b="+erg.getB()+"i");
                }
                else if(actInput==2)
                {
                    Number erg=cc.subtract(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                    System.out.println("b="+erg.getB()+"i");
                }
                else if(actInput==3)
                {
                    Number erg=cc.multiply(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                }
                else if(actInput==4)
                {
                    Number erg=cc.divide(x, y);
                    System.out.println("Ergebniss:");
                    System.out.println("a="+erg.getA());
                }
                else
                {
                    System.out.println("Unvalid Input");
                }
            }
            else if(actInput==4)
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
    
    public static void numberEnter()
    {
        System.out.println("Enter number x a>");
        String xaString=sc.nextLine();
        xa=Integer.parseInt(xaString);
        System.out.println("Enter number x b>");
        String xbString=sc.nextLine();
        xb=Integer.parseInt(xbString);
        System.out.println("Enter number y a>");
        String yaString=sc.nextLine();
        ya=Integer.parseInt(yaString);
        System.out.println("Enter number y b>");
        String ybString=sc.nextLine();
        yb=Integer.parseInt(ybString);
    }
    
    public static void operationChooser()
    {
        System.out.println("Choose the operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter the numbers again");
        String sinput=sc.nextLine();
        actInput=Integer.parseInt(sinput);
    }
}
