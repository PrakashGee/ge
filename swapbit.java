import java.util.Scanner;
public class swapbit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int c;
int a=sc.nextInt();
int b=sc.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println(b+"\t"+a);
}
}
