package githubtrigra;


import java.util.Scanner;
import java.lang.Math;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ben-g
 */
public class GotHypAndAngles {
    
    public static void main(String[] args) {
        double A, B, C, a, b, c;
        Scanner Speak = new Scanner(System.in);
        
        
        System.out.println("Please Enter the angle, I will work out the rest");
        A = Speak.nextDouble();
        
        
        B = 90-A;
        
        C=90;
        
        System.out.println("Angles are:");
             
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        
        

       
       
        System.out.println("Enter Hypotenuese");
        c = Speak.nextDouble();
       
       
        
        A = (A*Math.PI)/180;
                
        
        b = c*(Math.sin(A));
        a = c*(Math.cos(A));
        
        System.out.println("sides :");
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("c ="+c);
        
        }
        
        //work out sides
        
        
        
        
        
                
        
}
        
    
              
