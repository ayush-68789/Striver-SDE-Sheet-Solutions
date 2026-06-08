public class LC_169_Majority_Element {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2} ;
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int vote = 0 ; 
        int majority = 0 ; 
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(vote == 0)
            {
                vote++ ; 
                majority = nums[i] ; 
            }
            else if(nums[i] == majority)
            {
                vote++ ; 
            }
            else
            {
                vote-- ; 
            }
        }
        return majority ;
    }    
}
