import java.util.Scanner;
/**
 * Calculates basic physics stuff
 * 
 * @Ryan Regier
 * @1.0 
 * @8/21/17
 */
public class PhysicsLol
{
   public static void main(String args[])
   {
       double d, t, Di, Df;
       Scanner scan = new Scanner(System.in);
       int ans = 0;
       System.out.println("Enter the number for whatever equation you want.[1 = speed, 2 = displacement, 3 = average velocity, 4 = average speed, 5 = slope, 6 = average acceleration]");
       ans = scan.nextInt();
       System.out.println("Enter your distance in meters and your time in seconds");
       if(ans == 1)
       {
           System.out.println("Enter distance");
           d = scan.nextDouble();
           System.out.println("Enter time");
           t = scan.nextDouble();
           System.out.println(speed(d, t) + " m/s");
        }
       else if(ans == 2)
       {
           System.out.println("Enter final distance");
           Df = scan.nextDouble();
           System.out.println("Enter initial distance");
           Di = scan.nextDouble();
           System.out.println("Enter time");
           t = scan.nextDouble();
           System.out.println(displacement(Df, Di, t) + " m/s");           
        }
    }
   public static double speed(double d, double t)
   {
       return(d/t);      
    }
    public static double displacement(double Df, double Di, double t)
   {
       return((Df-Di)/t);      
    }
}
