/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author fabed2976
 */
public class A2Q2 {

    public int digitalSum(int num) {
        if (num < 10) {
            return num;
        } else {
            int remainder = num % 10;
            int quotient = num / 10;
            return digitalSum(quotient) + remainder;

        }
    }

    
    public int digitalRoot(int n) {

        if (n < 10) {
            return n;
        }else{
        n = digitalSum(n);
        return digitalRoot(digitalSum(n));
    }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        A2Q2 test = new A2Q2();
        
        System.out.println("digital (2019)");
        int digitalRoot = test.digitalRoot(2019);
        System.out.println(digitalRoot);
        
        System.out.println("digital (126)");
        int Root1 = test.digitalRoot(126);
        System.out.println(Root1);
        
        System.out.println("digital (49)");
        int Root2 = test.digitalRoot(49);
        System.out.println(Root2);
        
        System.out.println("digital (276)");
        int Root3 = test.digitalRoot(276);
        System.out.println(Root3);
        
        

    }
}

