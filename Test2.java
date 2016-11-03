/**
 * This is the start of something big
 * 
 * Author: Lance, Jason
 * Date: Halloween, 2016
 * Desc: use some for loops to show how fast our computer is
 */
 
 public class Test2 {
     
     public static void main (String[] args) {
         
         int x = 5;
         System.out.println("x == " + x);
         
         x++; // add one to x
         System.out.println("x == " + x);
         
         x--; // subtract one from x
        System.out.println("x == " + x);
        
        x += 5; // equivilent to x = x + 5
        System.out.println("x == " + x);
        
        //loop to count to 1000 by 1's
        // syntax: for (start; max/min; count_by) {
            // code to repead
        //}
        
        for (int i = 0; i <= 1000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        
        
        // count down from 2000 to 0
        for (int i = 2000; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
     }
 }