public class Convert
/* converts an int to a string
   * 
   */
{
  public static String convert(int num)
  //simulates Integer.toString()
  {
    return ""+ num;
  }
  public static void main (String [] asd)
  {
    String s=convert(12345);
    System.out.println(s.length());
  }
}