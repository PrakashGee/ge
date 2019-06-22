import java.util.Scanner; 
public class sp 
{ 
 public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
 String str =sc.nextLine();
int  special = 0; 
for(int i = 0; i < str.length(); i++) 
{ 
 char ch = str.charAt(i); 
 if ((ch >= 'A' && ch <= 'Z')|| (ch >= 'a' && ch <= 'z') ||(ch >= '0' && ch <= '9') )
 continue; 
 else
 special++; 
 } 
 System.out.println(special); 
 } 
} 
