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
    
   public void binaryConvert(int num){
       
       if (num > 0){
           binaryConvert( num / 2);
           System.out.print(num % 2 + " " );
       }
       }
       
    public static void main(String[] args) {
        A2Q5 test = new A2Q5();
        System.out.println("binaryconvert(156)");
        test.binaryConvert(156);
        
        
     
        
    }
}
