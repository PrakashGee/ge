import java.util.*; 
public class revnum{
public static void main(String[] args){
Scanner read = new Scanner(System.in);
int n = read.nextInt();
int sum=0;
for(int i=0;n!=0;i++)
{
int s=n%10;
sum=sum*10+s;
n/=10;
}
System.out.print(sum);
}
}
