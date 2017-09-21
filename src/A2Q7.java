/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A2Q7 {

    public static boolean isPalindrome(String s, int length){
       
        //base case if the word is one length or not length at all
        //print true if the word is equal or less than 1 characters long
        if(length <= 1){
            return true;
        }
        // create a new string for the first letter
        String first = s.substring(0,1);
        
        //create a new string for the last letter
        String last = s.substring(s.length() - 1, s.length());
        
        //create an if statement if the first and the last letter equal together
        if(first.equals(last)){
            //use a subtring to seperate the letters
            return isPalindrome(s.substring(1, length - 1), length - 2);   
        } else {
            //return false if the letters are not the same
            return false;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        A2Q7 test = new A2Q7();
        System.out.println("isPalindrome(racecar)");
        System.out.println(test.isPalindrome("racecar" ,7));
    }
}
