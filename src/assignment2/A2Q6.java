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
      //create a new empty String
      String letters = "";
      
      //create an array to store in the string that has all the numbers and letters
      String[] answer = {"0", "1", "2","3", "4", "5", "6" , "7", "8", "9", "A", "B", "C", "D" , "E" , "F"};
      
      //create a base case
      //create an if statement that if n is equals 0
      if(n == 0) {
          //return to string named letters
          return letters;
      }
      //replace the letters or stringinto the answer that has all the numbers and letters with the remainder
      letters= answer[ n % b];
      
      //this returns the method by taking in the positive integer and the base and then dividing n by b 
      //printing the letters with it
      return convert( n / b, b)+ letters;
      
}

    public static void main(String[] args) {
        
        //test out the boundaries
        A2Q6 test = new A2Q6();
        System.out.println("convert(1000,16)");
        String Convertest = test.convert(1000,16);
        System.out.println(Convertest);
    }
}
