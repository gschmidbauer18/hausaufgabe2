/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausaufgabe2;

import java.util.ArrayList;

/**
 *
 * @author 43676
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    private int obergrenzePrimzahlen;

    public EratosthenesPrimeSieve() {
    }

    
    
    public EratosthenesPrimeSieve(int pobergrenzePrimzahlen) {
        this.obergrenzePrimzahlen = pobergrenzePrimzahlen;
    }

    @Override
    public boolean isPrime(int p) {
        ArrayList<Boolean> zahlen=new ArrayList<Boolean>();
        if(p<2)
        {
            return false;
        }
        
        for(int i=0; i<=p; i++)
        {
            zahlen.add(i, true);
        }
        
        for (int i = 2; i <= p; i++) {
            if(zahlen.get(i).equals(true))
            {
                int j=i;
                do
                {
                    j=j+i;
                    if(j<=p)
                    {
                        zahlen.set(j, false);
                    }
                }while(j<=p);
            }
        }
        
        //System.out.println(zahlen.get(p--));
        return zahlen.get(p--);
    }

    @Override
    public void printPrimes() {
        System.out.println("Primzahlen sind:");
        for(int i=0; i<=this.obergrenzePrimzahlen;i++)
        {
            if(isPrime(i)==true&&i>1)
            {
                System.out.print(i+",");
            }
        }
    }

}
