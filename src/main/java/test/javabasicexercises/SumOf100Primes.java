/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.javabasicexercises;

/**
 *
 * @author adtk85
 */
public class SumOf100Primes {
    public static void main(String[] args) {
        int sum = 1;
        int n = 0;
        int k = 0;
        while(k<100)
        {
            n++;
            if(n%2!=0)
            {
                if(isPrime(n))
                {
                    sum += n;
                    k++;
                }
                
            }
                  
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int n) {
        for (int i = 3; i*i<=n;i+=2)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
}
