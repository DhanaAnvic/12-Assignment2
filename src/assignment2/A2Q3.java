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
    
    //create a mathod called triangle that returns the total number of the triangles in a row
    
   public int triangle (int num){
       
       //create an if statment that if 2 is greater than the num
       if (num < 2){
           //now the number will return itself
           return num;
           //create an else statement if the num is greater than 2
       }else{
           //it will return the num and add the triangle with the num subtracting it by 1
           // to know how many total number of the triangles
           return num + triangle(num-1);
       }
   }
    
    public static void main(String[] args) {
        //create a variable to test the boundaries
        A2Q3 test = new A2Q3 ();
        System.out.println("triangle(0)");
        int triangle = test.triangle(0);
        System.out.println(triangle);
        
        System.out.println("triangle(1)");
        int triangle1 = test.triangle(1);
        System.out.println(triangle1);
        
        System.out.println("triangle(2)");
        int triangle2 = test.triangle(2);
        System.out.println(triangle2);
        
        System.out.println("triangle(3)");
        int triangle3 = test.triangle(3);
        System.out.println(triangle3);
    }
}
