import java.util.*;
import java.io.*;

public class Read4
  /*
   * attempting to read a file
   * abbreviated version
   * uses a try-catch block
   */
{
  public static void main(String []asd)
  {
    Scanner kbd=null;
    try
    {
    kbd=new Scanner(new File("life2.dat"));//anything declared in a block cannoy be used afterwards, so kbd must be declared before the block
    }catch(Exception ex){};
    String s=kbd.next();
    System.out.println(s); 
  }
}