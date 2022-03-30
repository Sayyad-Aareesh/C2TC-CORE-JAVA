import java.lang.*;
class Yield_Method_Demo extends Thread
{
   public void run()
   {
      for (int i=0; i<3 ; i++)
      System.out.println("In control of " + Thread.currentThread().getName() + " thread");
   }
}
public class Cocurrency_Yield_Demo
{
   public static void main(String[]args)
   {
      Yield_Method_Demo obj= new Yield_Method_Demo();
      
	  obj.start();
      
	  for (int i=0; i<3; i++)
	  {
         Thread.yield();
         System.out.println("In control of " + Thread.currentThread().getName() + " thread");
      }
   }
}