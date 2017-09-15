/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author fabed2976
 */
public class A2Q3 {
    
   public int triangle (int num){
       if (num < 2){
           return num;
       }else{
           return num + triangle(num-1);
       }
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        A2Q3 test = new A2Q3 ();
        System.out.println("triangle(0)");
        int triangle = test.triangle(0);
        System.out.println(triangle);
    }
}
