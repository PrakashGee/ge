import java.util.Scanner;
public class Armg{  
public static void main(String[] args)  
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int c=0,a,temp;    
temp=N;  
while(N>0 && N<100000)  
{  
a=N%10;  
N=N/10;  
c=c+(a*a*a);  
}  
if(temp==c)  
System.out.println("yes");   
else  
System.out.println("no");   
}  
}  
