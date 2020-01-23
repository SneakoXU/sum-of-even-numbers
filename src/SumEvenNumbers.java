/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sneako
 */

public class SumEvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=2;
        int max=50;
        int sum = 0;
        
        while (i<=max)  
        {
            sum=sum+i;
             i=i+2;
        }
        System.out.println("Week6-7 ASN by Niko Suntay - Graduate Student");
        System.out.println("Entering While Loop");
        System.out.println("The sum is " +sum);
        
        sum=0;
        for (i=2; i<=max; i=i+2)  
        {
             sum=sum+i;
        }
        System.out.println("Entering For Loop");
        System.out.println("The sum is " +sum);
        
    }
    
}
