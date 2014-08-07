public class Parse
  /* converts a string to an int
   * 
   */
{
  public static void main (String [] asd)
  {
    String s = "12345";
    int sum=0;
    for(int j=0; j<s.length(); j++)
    {
      char ch=s.charAt(j);
      int digit=ch-'0'; //put in zero because the computer automatically puts in the ascii code
      sum=sum*10+digit;
    }
    System.out.println("integer = "+(sum+3));
  }
}