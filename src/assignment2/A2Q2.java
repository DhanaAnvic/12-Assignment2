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

    public int digitalRoot (int num){
        int sum = 0;
        if(num == 0){
            return sum;
        }else{
            sum = sum + num % 10 + digitalRoot(num/10);
            return sum;
        }
 
        }
    public static void main(String[] args) {
        // TODO code application logic here
        A2Q2 test = new A2Q2();
        System.out.println("digital (2019)");
        int digitalRoot = test.digitalRoot(2019);
        System.out.println(digitalRoot);
        
    }
}
