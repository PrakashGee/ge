import java.util.Scanner;
public class Prime{    
public static void main(String args[]){    
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int i,m=0,flag=0;
if(N<=1000)
{ 
m=N/2;     
if(N==0||N==1)
{  
System.out.println("no");      
}
else
{  
for(i=2;i<=m;i++)
{      
if(N%i==0)
{      
System.out.println("no");      
flag=1;      
break;      
}      
}      
if(flag==0)  
{ 
System.out.println("yes"); 
}  
}  
}    
}   
}
