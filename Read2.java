import java.util.*;
import java.io.*;

public class Read2
  /*
   * attempting to read a file
   */
{
  public static void main(String []asd)
  {
    Scanner kbd=new Scanner(new File("life2.dat"));
    String s=kbd.next();
    System.out.println(s); 
  }
}