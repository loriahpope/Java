import java.util.*;
import java.io.*;

public class Read1
  /*
   * attempting to read a file
   */
{
  public static void main(String []asd)
  {
    File f=new File("life2.dat");
    Scanner kbd=new Scanner(f);
    String s=kbd.next();
    System.out.println(s); 
  }
}