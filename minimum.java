import java.util.Scanner;
public class minimum{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=1;i<n;i++)
{
if(a[0]>a[i])
 a[0]=a[i];
}
System.out.print(a[0]);
}
}
