import java.util.*;
import java.io.*;

public class Life
  /*
   * initalize world and print it
   */
{
  final static int NROW=25, NCOL=75;
  final static char DOT='.';
  
  public static void init(char[][] grid)
  {
    for(int row=0; row<=NROW+1; row++)
    {
      for(int col=0; col<=NCOL+1; col++)
      {
        grid[row][col]=DOT;
      } 
    }
  }
  
  public static void print(char[][] grid)
  {
    for(int row=1; row<=NROW; row++)
    {
      for(int col=1; col<=NCOL; col++)
      {
        System.out.print(grid[row][col]);
      }
      System.out.println();
    }
  } 
  
  public static void main(String []asd)
  {
    char [][] grid=new char[NROW+2][NCOL+2];
    init(grid);
    print(grid);
    System.out.println(); 
  }
}