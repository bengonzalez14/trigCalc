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
public class GotHypNotAngles {
    
    public static void main(String[] args) {
       char Which = ' ';
       char Hyp = ' ';
       double A, B, C, c, a, b;
       Scanner Speak = new Scanner(System.in);
       C=90;
       
        System.out.println("");
        System.out.println("Enter Hypotenuese");
        c = Speak.nextDouble();
        
        System.out.println("please enter other side");
        a = Speak.nextDouble();
        
        A = Math.asin(a/c);
        A = A*(180/Math.PI);
        B = 90-A;
        b = Math.sqrt((c*c)-(a*a)); 
        
        System.out.println("angles =");
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        
        System.out.println("sides =");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    
    
}
