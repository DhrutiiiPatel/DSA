public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(BS(nums, 5));     
    }

    public static int BS(int[] num, int num_to_find) {
        
       int low = 0;
       int high = num.length - 1;

       while(low<=high){

        int mid = (low+high)/2;
        int mid_num = num[mid];

        if(num_to_find == mid_num){
            return mid;
        }

        if(num_to_find < mid){
            high = mid - 1;
        }

        else{
            low = mid + 1;
        }

       }
       
       return -1;
     
    }
    
}
