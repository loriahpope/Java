import java.awt.*;
import java.applet.*;
import javax.swing.JOptionPane;
//process a 15-digit sequence of digits and draws three 5 digit lines, a bar, and the largest of the three numbers numbers

public class Barcode2 extends Applet
{
  Font font;
  int x, y, w=20;
  String s;
  int t;
  final boolean T=true, F=false;
  int len;//these are all the instance variables
  
  public void init()//executed by the JVM when the applet is launched
  {
    s=JOptionPane.showInputDialog("Please type your 15 digit number.");
    len=s.length();
    t=Integer.parseInt(s);  
  }
  
  public void paint(Graphics g)//executed when the applet window is resized
  {
    processAllLines(g);//paints the digits
  }
  
  public void processLine(Graphics g, String subString)
  {
    for(int j=0; j<5; j++)//cycles through the string and draws the bars for five digits
    {
      int digit=subString.charAt(j)-'0';//the digit is equal to the character's ascii code at the given index minus 0, in order to return the value of the number
      drawBar(g, digit);//draws the digit
      x=x+(2*w); //changes x so that the next digit is drawn to the right
    }
    
  }

  public void processAllLines(Graphics g)
  { 
    String s1=s.substring(0, 5);//creates a string that is the part of the original string at index 0 to 5
    int i1=Integer.parseInt(s1);//converts the new string s1 into an integer so its value can be compared
    String s2=s.substring(5, 10);//creates a string that is the part of the original string at index 0 to 5
    int i2=Integer.parseInt(s2);//converts the new string s2 into an integer so its value can be compared
    String s3=s.substring(10, 15);//creates a string that is the part of the original string at index 0 to 5
    int i3=Integer.parseInt(s3);//converts the new string s3 into an integer so its value can be compared
    
    int largest=i1;//creates a variable to hold the largest of the three numbers and sets it automatically to the value of i1
    if(i2>largest)//if i2 is greater than the largest number, then it becomes the new largest number
    {
      largest=i2;
    }
    if(i3>largest)//if i3 is greater than the largest number, then it becomes the largest number
    {
      largest=i3; 
    }
    
    String greatest=""+largest;//converts the integer largest into a string so it can be used as the parameter in processLine

    
    
   x=20;//set x and y so they will appear within the parameters of the automatic Dr.Java applet window size
   y=50;
   processLine(g, s1);//processes the first string of 5 digits 
   x=x-(10*w);//resets x
   y=y+(3*w);//resets y
   processLine(g, s2);//processes the second string of 5 digits
   x=x-(10*w);//resets x
   y=y+(3*w);//resets y
   processLine(g, s3);//processes the third string of 5 digits
   x=x-(10*w);//resets x
   y=y+(2*w);//resets y
   g.drawLine(x, y, x+200, y);//draws a line underneath the three lines of digits
   y=y+(2*w);//resets y
   processLine(g, greatest);//processes the largest of the three strings of 5 digits
    }
  
  
  public void drawBar(Graphics g, int digit)
  {
    switch(digit)//turns certain lines on (color shows blue) or off (color shows white) depending on the digit
    {
      case 1: draw(g, F, F, T, T, F, F, F);break;
      case 2: draw(g, F, T, T, F, T, T, T);break;
      case 3: draw(g, F, T, T, T, T, F, T);break;
      case 4: draw(g, T, F, T, T, F, F, T);break;
      case 5: draw(g, T, T, F, T, T, F, T);break;
      case 6: draw(g, T, T, F, T, T, T, T);break;
      case 7: draw(g, F, T, T, T, F, F, F);break;
      case 8: draw(g, T, T, T, T, T, T, T);break;
      case 9: draw(g, T, T, T, T, T, F, T);break;
      case 0: draw(g, T, T, T, T, T, T, F);break;
      default: draw(g, T, T, T, T, T, T, F);break;
    }
    
  }
  public void draw(Graphics g, boolean ul, boolean top, boolean ur, boolean lr, 
                   boolean bottom, boolean ll, boolean mid)//sets up the points that will be used to draw each digit
  {
    pallet(g, ul);
    g.drawLine(x,y, x, y-w);//drawLine is one of the functions of the abstract windowing kit (awt) we imported
    pallet(g, top);
    g.drawLine(x, y-w, x+w, y-w);
    pallet(g, ur);
    g.drawLine(x+w, y-w, x+w, y);
    pallet(g, lr);
    g.drawLine(x+w, y, x+w, y+w);
    pallet(g, bottom);
    g.drawLine(x+w, y+w, x, y+w);
    pallet(g, ll);
    g.drawLine(x, y+w, x, y);
    pallet(g, mid);
    g.drawLine(x, y, x+w, y);
  }
  public void pallet(Graphics g, boolean on)
  {
    if(on)
    {
      g.setColor(Color.blue);//color is visible and obvious
    }
    else
    {
      g.setColor(Color.white);//color is not obvious (and should not be seen too clearly against the background of the applet
    }
  } 
}
