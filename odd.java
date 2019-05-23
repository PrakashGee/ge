import java.util.Scanner;
public class odd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<0)
 {
  System.out.print("invalid");
  }
 else if(n%2==0)
{
 System.out.print("even");
 }
else if(n%2!=0)
{
 System.out.print("odd");
}
}
}
