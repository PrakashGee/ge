import java.util.Scanner;
public class fib{
public static void main(String[] args) {
int n=5,f1=1,f2=1;
for(int i=1;i<=n;++i)
 {
System.out.print(f1+" ");
int sum = f1 + f2;
f1=f2;
f2=sum;
 } }
}
