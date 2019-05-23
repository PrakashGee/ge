import java.util.Scanner;
public class Odd2 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int Q=sc.nextInt();
if(Q<=100000)
{
for(int i=N;i<=Q;i++) 
{
if(i%2!=0) 
{
System.out.print(i+"\t");
}
}
}
}
}


