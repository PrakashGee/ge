import java.util.Scanner; 
public class maximum{ 
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
Integer[] a =new Integer[5];
for (int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
int c=0,i; 
for(i=0;i<a.length;i++) 
{ 
for(int j=i+1;j<=a.length;j++) 
{
if(a[i]>a[j]) 
{ 
c=a[i]; 
a[i]=a[j]; 
a[j]=c; 
} 
} 
} 
System.out.print(a[i]);
}
}
