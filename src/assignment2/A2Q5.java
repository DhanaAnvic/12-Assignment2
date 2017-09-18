/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author fabed2976
 */
public class A2Q5 {
    
    //create a method name binaryConvert to return the integer num as a binary
    
   public void binaryConvert(int num){
       
       //create an if statement that if num is greater than 0
       if (num > 0){
           //call in the method and divide the num by 2
           binaryConvert( num / 2);
           //print out the remainder
           System.out.print(num % 2);
       }
       }
       
    public static void main(String[] args) {
        
        //testing out the boundaries
        A2Q5 test = new A2Q5();
        System.out.println("binaryconvert(156)");
        test.binaryConvert(156);
        
        
     
        
    }
}
