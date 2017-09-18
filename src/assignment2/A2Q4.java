/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author fabed2976
 */
public class A2Q4 {
    
    //create a void method to return the integer n
    public void hailstone (int n){ 
        //create a base case
        //create an if statement that if the n will equal to 1 it will print out n
        if (n == 1){
            System.out.println(n);
           
        }
        //create an else if statement that is the n is odd number
        else if (n % 2 == 1){
            // if it is odd multiply n by 3 and add 1
            n = (3 * n + 1);
            System.out.println(n);
            hailstone(n);
            
            //create an else statement that if the n is even
        } else {
            // if the number is even it will divide it by 2
            n = n/2;
            System.out.println(n);
            hailstone(n);
            
        }
    }
     

    
    public static void main(String[] args) {
        
        //test the boundaries
        A2Q4 test = new A2Q4 ();
        System.out.println("hailstone(5)");
        System.out.println(5);
        test.hailstone(5);
        
        
        
        
        
    }
}
