package Heron;

import java.util.Scanner;
public class HeronsFR {

    public static void main(String[] args){

        //Calculate Triangle are with Herons formula.
        
        Scanner sc = new Scanner(System.in);

        // Side A
        System.out.print("Enter Side A: ");
        
        double A = sc.nextDouble();
       
        // Side B
        System.out.print("Enter Side B: ");         
        
        double B = sc.nextDouble();

        // SIDE C 
        
        System.out.print("Enter Side C: ");
        
        double C = sc.nextDouble();
        
        // Calculate S -> Semi-perimeter
         
        double S = (A + B + C) / 2;
             
        // Calculate triangle area with Heron's formula.
          
        double Area = Math.sqrt(S * (S - A) * (S - B) * (S - C));

       // Output with 2 decimal places of precision.
       
       System.out.printf("The Area of the triangle is: %.2f", Area);



    }
}
