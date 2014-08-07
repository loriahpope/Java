public class Driver5
  /* all classes extend the object class
   * 
   */
{
  public static void main(String [] asd)
  {
    Ex obj=new Ex("NYU");//instantiating the class Object2
    
    System.out.println(obj);
  }
}

class Ex
{
  String s;
  
  public Ex(String t)
  {
    s=t;
  }
  public String toString()//is activated when either the instance of the class is printed or it is concatenated
  {
    return s;
  }
}

