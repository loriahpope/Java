public class Ascii
  /*produces Ascii table
   * 
   */
{
  public static void main (String [] asd)
  {
    for(int j = 0; j<126; j++)
    {
      if(j % 10 == 0)//prints new line every 10 characters
        System.out.println();
      System.out.print("<"+j+","+(char)j+">");//puts it in <51,3> form
    }
    System.out.println();
  }
}

  