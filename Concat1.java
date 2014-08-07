
public class Concat1
  /*generating string with digits in reverse
   * 
   */
{
  public static void main (String []args)
  {
    String s="";
    for(int j=1; j<10;j++)
    {
      s=j+s;//each time executed, the garbage collector frees up previous locations
    }
    
    System.out.println( s);
  }
}