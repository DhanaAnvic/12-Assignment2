/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author fabed2976
 */
public class A2Q6 {
    
  public String convert (int n, int b){
      
      //create an if statement that is n is equals 0
      if(n == 0) {
          //return to nothing
          return"";
          //create an if statement that if n is not equal to 0
      }else {
          //return to the main method and divid the integer by the base and add to the remainder of the integer and base together
          return convert(n / b, b) + (n % b);
      }
      
}

    public static void main(String[] args) {
        
        //test out the boundaries
        A2Q6 test = new A2Q6();
        String Convertest = test.convert(1000, 16);
        System.out.println(Convertest);
    }
}
