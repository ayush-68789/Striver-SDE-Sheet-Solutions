public class LC_75_Sort_Colors {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void sortColors(int[] arr) 
    {
        int mid = 0 , low = 0 ;
        int n = arr.length;
        int high = n-1 ;
        while(mid <= high)
        {
            if (arr[mid] == 0)
            {
                swap(arr,low,mid) ;
                mid++ ;
                low++ ;
            }
            else if(arr[mid] == 1)
            {
                mid++ ;
            }
            else if(arr[mid] == 2)
            {
                swap(arr,mid,high) ;
                high-- ;
            }
        }
    }
    public static void swap(int arr[], int i , int j)
    {
        int temp = arr[i] ; 
        arr[i] = arr[j] ; 
        arr[j] = temp ;
    }
}
