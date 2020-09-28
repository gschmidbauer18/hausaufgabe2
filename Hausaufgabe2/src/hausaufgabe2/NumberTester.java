/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausaufgabe2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 43676
 */
public class NumberTester {
    private NumberTest oddEvenTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    String fileName;
    
    
    public NumberTester(String fileName) {
        this.fileName=fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        //oddTester = (i) -> (i%2) == 0;
        this.oddEvenTester=oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        /*primeTester = (int i) -> (
            
        );*/
        this.primeTester=primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester=palindromeTester;
    }

    public void testFile() {
        try {
            BufferedReader br=new BufferedReader(new FileReader(this.fileName));
            String line=br.readLine();
            line=br.readLine();
            while(line!=null)
            {
                
                final String[] input = line.split(" ");
                int i1=Integer.parseInt(input[0]);
                int i2=Integer.parseInt(input[1]);
                if(i1==1)
                {
                    if(oddEvenTester.testNumber(i2)==true){
                        System.out.println("EVEN");
                    }
                    else
                    {
                        System.out.println("ODD");
                    }
                }
                else if(i1==2)
                {
                    if(primeTester.testNumber(i2)==true)
                    {
                        System.out.println("PRIME");
                    }
                    else
                    {
                        System.out.println("NO PRIME");
                    }
                }
                else if(i1==3)
                {
                    if(palindromeTester.testNumber(i2)==true)
                    {
                        System.out.println("PALINDROME");
                    }
                    else
                    {
                        System.out.println("NO PALINDROME");
                    }
                }
                else
                {
                    System.out.println("Error");
                }
                line=br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found.");
        } catch (IOException ex) {
            System.out.println("IO Exception");
        }
    }
}
