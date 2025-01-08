import java.util.Scanner;

public class Insertionsort{
    
    public void sort(int arr[]){
            int n =arr.length;
            for(int i=1; i<n; ++i){
                int key =arr[i];
                int j=i-1;
                while (j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j -= 1;
                }
                arr[j+1]=key;
            }
        }
    
        public static void array(int arr[]){
            int n = arr.length;
            for(int i=0; i<n;++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
    
            System.out.print("Enter number of elements: ");
            int n=sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter the elements:");
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt(); 
            }
            Insertionsort ob=new Insertionsort();
            ob.sort(arr);
        System.out.println("Sorted array:");
        array(arr);
        sc.close();
    }
}



   
