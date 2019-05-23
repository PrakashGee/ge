import java.util.Scanner;
public class Power
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int temp=N;
int k = sc.nextInt();
for (int i=1; i<k; i++)
{
temp=temp*temp;
}
System.out.println(temp);
}
}
