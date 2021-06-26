/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubtrigra;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author ben-g
 */
public class NotHypButAngles {
    
    public static void main(String[] args) {
        double A, B, C, a, b, c;
        Scanner Speak = new Scanner(System.in);
         char Which = ' ';
       char Hyp = ' ';
        //work out angles
        System.out.println("Please Enter the angle, I will work out the rest");
        A = Speak.nextDouble();
        
        
        B = 90-A;
        
        C=90;
        
        System.out.println("Angles are:");
             
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        
        //work out sides
        System.out.println("do you have the side length opposite the angle that you had typed?   Y/N"   );
        Which = Speak.findWithinHorizon(".", 0).charAt(0);
        System.out.println("please enter side length");
        
        //convert degrees to radians
        A=A*Math.PI/180;
        B=B*Math.PI/180;
        
        
        if (Which=='Y'){
        a = Speak.nextDouble();
        
        
        c = a/(Math.sin(A));
         b = c*(Math.cos(A));
        }
        
        
        else {
        b = Speak.nextDouble();
        c = b/(Math.cos(A));
         a = c*(Math.sin(A));
        }
        
        System.out.println("sides =");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
    
}
