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
    
    //create a digitalSum method that returns the sum of the integer
 
    public int digitalSum (int n){
        
        //create an if statement that if the 10 is greater than the number
        if(n < 10){
            //it will go back to the number itself
            return n;
            // and the else statement is when the number is greater than the number
            
        }else{
            //create a variable to find the remainder of the number when you divide it by 10
            int right = n % 10;
            //create a varaible to find the quotient of the number by dividing it by 10
            int left = n / 10;
            //create a return statement that returns the quotient and it to the remainder
            return digitalSum(left) + right;
    }
    }

    
    public static void main(String[] args) {
        
        //create a varibel to test the boundaries
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
