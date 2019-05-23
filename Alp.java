import java.util.Scanner;
public class Alp {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char c[]=s.toCharArray();
int a=c.length;
for( int i=0;i<a;i++)
{
if(c[i]>='a'&&c[i]<='z')
{
System.out.print("Alphabet");
}
else
{
System.out.print("No");
}
}
}
}
