import java.util.*; 
public class fact{
public static void main(String[] args){
Scanner read = new Scanner(System.in);
int n = read.nextInt();
int j=1;
for(int i=1;i<=n;i++)
{
j=j*i;
}
System.out.print(j);
}
}
