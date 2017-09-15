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
    
    //create a digitalSum  method that returns the sum of the integer 

    public int digitalSum(int num) {
        //create an if statement that if 10 is greater than the number
        if (num < 10) {
             //it will go back to the number itself
            return num;
            // and the else statement is when the number is greater than 10
        } else {
            //create a variable to find the remainder of the number when you divide it by 10
            int remainder = num % 10;
             //create a varaible to find the quotient of the number by dividing it by 10
            int quotient = num / 10;
             //create a return statement that returns the quotient and it to the remainder
            return digitalSum(quotient) + remainder;

        }
    }

    //create digitalRoot that return the digtial root of n
    public int digitalRoot(int n) {
        
        //create an if statement if 10 is greater than the number
        if (n < 10) {
            //the number will return itself
            return n;
            //create an else statement is when the number is greater than 10
        }else{
            //try to make the n into a digitalSum to go over the digital sum method again
        n = digitalSum(n);
        // now return the digitalroot to digitalsum n
        return digitalRoot(digitalSum(n));
    }
    }
    
    
    public static void main(String[] args) {
        // create a variable to print out the boundaries
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

