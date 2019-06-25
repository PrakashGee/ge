import java.util.Scanner;
public class nonrept {
public static void main(String[] args) {
int arr[] = { 9, 4, 9, 6, 7, 4 }; 
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
  
   
