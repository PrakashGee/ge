import java.util.Scanner;
public class pos{
  public static void main(String[] args) 
 {
 int n;
 Scanner s = new Scanner(System.in);
 n = s.nextInt();
if(n > 0)
  {
  System.out.println("The given number "+n+" is Positive");
}
 else if(n < 0)
 {
 System.out.println("The given number "+n+" is Negative");
  }
 else
  {
 System.out.println("The given number "+n+" is Zero ");
  }
  }
}
