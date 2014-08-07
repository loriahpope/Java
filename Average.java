import java.util.Scanner;
public class Average
  /*calculating average using the scanner class
   * 
   */
{
  public static void main (String []args)
  {
    System.out.println("Type your data ending with a ^z and a c.r.");
    Scanner kbd=new Scanner(System.in);
    double sum=0;
    int n=0;
    while(kbd.hasNext())//what this does: kdb is an instance of the scanner class. in order to obtain a function of this instance, you dereference it (use the dot). 
                        //hasNext sees whteher there is another piece of data in the buffer
    {
      int num=kbd.nextInt();
      sum=sum+num;
      n++;
    }
    double average=sum/n;
    System.out.println("The average of the numbers is: "+average);
  }
}