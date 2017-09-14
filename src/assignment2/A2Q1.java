/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author fabed2976
 */
public class A2Q1 {
    
    public int digitalSum (int n){
        
        if(n < 10){
            return n;
        }else{
            int right = n % 10;
            int left = n / 10;
            return digitalSum(left) + right;
    }
    }

    
    public static void main(String[] args) {
        
        A2Q1 test =  new A2Q1();
        System.out.println("digitalsum (126)");
        int digitalSum = test.digitalSum(126);
        System.out.println(digitalSum);
        System.out.println("digitalsum (49)");
        int Sum1 = test.digitalSum(49);
        System.out.println(Sum1);
        System.out.println("digitalsum (12)");
        int Sum2 = test.digitalSum(12);
        System.out.println(Sum2);

    }
}
