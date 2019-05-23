import java.util.Scanner;
class Pal{  
public static void main(String args[])
{ 
int r,sum=0,temp; 
Scanner sc=new Scanner(System.in); 
int N=sc.nextInt();
temp=N;    
while(N>0)
{    
r=N%10; 
sum=(sum*10)+r;    
N=N/10;    
}    
if(temp==sum)    
System.out.println("yes");    
else    
System.out.println("no");    
}  
}  
