import java.util.Scanner;
public class s {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int arr[]=new int[n1];
for(int i=0;i<n1;i++)
{
arr[i]=sc.nextInt();
}
int n = arr.length; 
for (int i = 0; i < n; i++) { 
int j; 
for (j = 0; j < n; j++) 
if (i != j && arr[i] == arr[j]) 
break; 
if (j == n) 
System.out.print(arr[i]); 
} 
}
} 
  
   
