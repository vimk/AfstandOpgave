//opgave 5 i import og brug af klasser
package afstandopgave;


import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Kim Vammen
 */
public class main
{
    public static void main(String[] args)
    {
        String x;
        String y;
        
        System.out.println("Indtast x-koordinatet for første punkt:");
        
        Scanner scan = new Scanner (System.in);
        x = scan.nextLine();
        int cx = Integer.parseInt(x);
        
        System.out.println("Indtast y-koordinatet for første punkt:");
        y = scan.nextLine();
        int cy = Integer.parseInt(y);
        
        Point p1 = new Point(cx,cy);
        System.out.println("Første punkt er: " + p1);
        
        
        String x2;
        String y2; 
        
        x2 = scan.nextLine();
        int cx2 = Integer.parseInt(x2);
        
        System.out.println("Indtast y-koordinatet for næste punkt:");
        
        y2 = scan.nextLine();
        int cy2 = Integer.parseInt(y2);
        
        Point p2 = new Point(cx2,cy2);
        System.out.println("Første punkt er: " + p2);
        
        System.out.println("Afstanden mellem punkt 1 og punkt 2 er: " + (Math.sqrt( (Math.pow((cx2-cx), 2)) + (Math.pow(cy2-cy, 2)))));
        
        System.out.println("Afstanden mellem punkt 1 og punkt 2 er: " + p1.distance(p2) );
    }
}


