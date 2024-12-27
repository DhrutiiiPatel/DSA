import java.util.*;
class Array{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n= scanner.nextInt();
    int[] arr = new int[n];
    
    System.out.println("Enter " + n + " integers:");  
    for(int i = 0;i<n;i++){
       arr[i] = scanner.nextInt();
    }
    for(int i = 0;i<n-1;i++){
      int mi = i;
      
      for(int j = i+1;j<n;j++){
        if (arr[j] < arr[mi]){
          mi = j;
        }
        
      }
      int temp = arr[mi];
      arr[mi] = arr[i];
      arr[i] = temp;
    }  
    System.out.println("Sorted array in ascending order:"); 
      for(int num:arr){
        System.out.print(num + " ");
        
        }
        scanner.close();

      }
    }