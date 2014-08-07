import java.util.*;
import java.io.*;

public class Read3
  /*
   * attempting to read a file
   */
{
  public static void main(String []asd) throws Exception
  {
    Scanner kbd=new Scanner(new File("life2.dat"));
    String s=kbd.next();
    System.out.println(s); 
  }
}