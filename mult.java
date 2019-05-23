import java.util.Scanner;
public class mult{
public static void main (String [] args) 
{
int m=0;
Scanner input = new Scanner(System.in);
int N = input.nextInt();
for(int i=1;i<=5;i++)
{
m=N*i;
System.out.print(m+"\t");
}
}
}
