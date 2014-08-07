import java.util.Scanner;
public class binary
{
 public static String getBin(int num)
 {
  String bin="";
  while(num>0)
  {
  int binary=num%2;
  num=num/2;
  bin=binary+bin;
  bin=""+bin;
  }
  return bin;
 }
 
 public static boolean checkBin(int num)
 {
   String bin=getBin(num);
   for(int j=0; j<bin.length(); j++)
   {
     
     int pow=(int)Math.pow(2,j);
     if(bin.charAt(j)==1)
     {
       num=num+pow;
     }
     String dec=""+num;
     System.out.println("binary number: " +bin);
     System.out.println("decimal number: " +dec);
     if(bin.equals(dec))
     {
       System.out.println("These numbers are the same.");
       return true;
     }
     else
     {
       System.out.println("These numbers are not the same.");
       return false;
     }
 }
 return true;
 }
 public static void main (String []args)
 {
   Scanner scan=new Scanner(System.in);
   boolean valid=true; 
     System.out.println("Please enter an integer between 0 and 256.");
     int num=scan.nextInt();
     valid=num>=0&&num<=256;
     while(!valid)
     {
         System.out.println("I'm sorry, but this is not a valid number.");
         num=0;
         break;
       }
     while(valid)
     {
       String ans=getBin(num);
       System.out.println("The binary representation of " + num + " is " + ans + ".");
       checkBin(num);
       break;
 }
 }
}

 
