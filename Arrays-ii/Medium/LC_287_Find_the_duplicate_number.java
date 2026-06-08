import java.util.HashMap;
import java.util.HashSet;

public class LC_287_Find_the_duplicate_number {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2} ;
        System.out.println(findDuplicateusing_MAP(nums));
        System.out.println(findDuplicateusing_SET(nums));
    }  

    public static int findDuplicateusing_MAP(int[] nums) 
    {
        HashMap <Integer, Integer> map = new HashMap <>() ;
        for(int val : nums)
        {
            if(map.containsKey(val))
            {
                map.put(val, map.get(val) + 1) ;
            }
            else
            {
                map.put(val , 1) ;
            }
        }   
        for(int ans : map.keySet())
        {
            if(map.get(ans) > 1)
            {
                return ans ;
            }
        }
        return -1 ;
    }

    public static int findDuplicateusing_SET(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>() ; 
        for(int x : nums)
        {
            if(set.contains(x))
            {
                return x ; 
            }
            set.add(x) ; 
        }
        return -1 ; 
    }
}
