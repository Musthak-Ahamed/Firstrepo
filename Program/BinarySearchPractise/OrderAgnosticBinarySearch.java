//Agnostic is an algorithm to check whether the sorted array is ascending or descending order.

public class OrderAgnosticBinarySearch{
  public static void main(String[] args){
    int[] arr = {9,8,7,6,5,4,3,2,1,0};
    int target = 6;
    int ans = orderAgnosticBS(arr,target);
    System.out.println(ans);
  }
  static int orderAgnosticBS(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;

    while(start <= end){
      int mid = start + (end-start)/2;

      boolean isAsc;
      if(start < end){
        isAsc = true;        
  }else{
        isAsc = false;
      }
      if (arr[mid] == target){
        return mid;
      }
      if(isAsc == true){
        if(target < arr[mid]){
          start = mid+1;
     }else{
          end = mid-1;
        }
  } else{
        if(target > arr[mid]){
          end = mid-1;
}else{
          start = mid+1;
        }
      }
    }
    return -1;
  }
}
