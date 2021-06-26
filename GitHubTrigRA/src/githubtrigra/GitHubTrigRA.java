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
public class GitHubTrigRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char Which = ' ';
       char Hyp = ' ';
       double A, B, C;
       Scanner Speak = new Scanner(System.in);
       
        System.out.println("Do you know any angles (apart from 90 degrees)?      Y/N");
        Which = Speak.findWithinHorizon(".", 0).charAt(0);
        
        if (Which=='Y') {
            System.out.println("good");
            
            //call a way to fill ABC
           // WorkOutAngles.main(args);

                 
            
            
    }
        else {System.out.println("bad");}
        
        System.out.println("Do you know the Hypotenuese?     Y/N");
        Hyp = Speak.findWithinHorizon(".", 0).charAt(0);
        

        if (Which == 'Y'&&Hyp == 'Y')
        {
            GotHypAndAngles.main(args);
                }
        
        if (Which =='Y'&&Hyp == 'N')
        {
            //chekc the maths here
        NotHypButAngles.main(args);
        }
        
        if (Which == 'N'&&Hyp == 'Y')
        {
            GotHypNotAngles.main(args);
            
        }
        
        if (Which == 'N'&&Hyp == 'N')
        {
        NotHypeOrAngles.main(args);
        }
        
    }
    
}
