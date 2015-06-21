package org.javabase.math.armstrong;


/*
Java Program to find Armstrong numbers with Example
Armstrong number Example in Java
How to check if a number is Armstrong number or not or write a Java program to find Armstrong number is common 
Java interview question asked on campus interviews or fresher level interview. This is also a popular Java programming 
exercise on various school and colleges. An Armstrong number is a 3 digit number for which sum of cube of its digit is 
equal to the number. Example of Armstrong number is 153 as 153= 1+ 125+27 which 1^3+5^3+3^3. 
Another Armstrong number is 371. In this Java program example we will see complete code example of Java program to 
check if any 3 digit number is Armstrong number or not. If you are going for Java interview, then be prepare for some
 follow question e.g. finding prime numbers, or finding Armstrong number of more than 3 digit.
*/

import java.util.Scanner;

/**
 * Simple Java Program to check or find if a number is Armstrong number or not.
 * An Armstrong number of three digit is a number whose sum of cubes of its digit is equal 
 * to its number. For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or   1+125+27=153
 * @author Javin
 */
public class ArmstrongTest{

    
    public static void main(String args[]) {
    
        //input number to check if its Armstrong number
        System.out.println("Please enter a 3 digit number to find if its an Armstrong number:");
        int number = new Scanner(System.in).nextInt();
      
        //printing result
        if(isArmStrong(number)){
            System.out.println("Number : " + number + " is an Armstrong number");
        }else{
            System.out.println("Number : " + number + " is not an Armstrong number");
        }

    
    }

    /*
     * @return true if number is Armstrong number or return false
     */
    private static boolean isArmStrong(int number) {
        int result = 0;
        int orig = number;
        while(number != 0){
            int remainder = number%10;
            result = result + remainder*remainder*remainder;
            number = number/10;
            System.out.println(result);
        }
        //number is Armstrong return true
        if(orig == result){
            return true;
        }
      
        return false;
    } 
  
}