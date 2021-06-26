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
public class NotHypeOrAngles {
    
    public static void main(String[] args) {
       char Which = ' ';
       char Hyp = ' ';
       double A, B, C, a, b, c;
       Scanner Speak = new Scanner(System.in);
       
        System.out.println("please enter both sides");
       a = Speak.nextDouble();
       b = Speak.nextDouble();
       
       c=Math.sqrt(a*a+b*b);
        System.out.println("Hypotenuese ="+c);
        
        C=90;
        A=Math.asin(a/c);
        B=Math.acos(a/c);
        System.out.println("angles =");
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
    }
    
    
}
