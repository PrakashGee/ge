import java.util.Scanner;
class swapnum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int c;
int a=sc.nextInt();
int b=sc.nextInt();
c=a;
a=b;
b=c;
System.out.println(a+"\t"+b);
}
}
