import java.util.Scanner;
public class count {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int counts=0;
while( n != 0)
 {  n /= 10;
    ++counts;
 }
System.out.print(counts);
}
}
