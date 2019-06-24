import java.util.*; 
public class revers{
public static void main(String[] args){
Scanner read = new Scanner(System.in);
String str = read.nextLine();
StringBuilder sb = new StringBuilder();
for(int i = str.length() - 1; i >= 0; i--)
{
char c=str.charAt(i);
System.out.print(c);
}
}
}
