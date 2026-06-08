import java.util.ArrayList;
import java.util.Arrays;

public class LC_56_Merge_Intervals {
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}} ;
        int [][] res = merge(intervals) ;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] +" ");
            }
            System.out.println();
        }
    }   
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));  // sort by starting time
        ArrayList<int [] > ll = new ArrayList<>() ;
        for(int i = 0 ; i < intervals.length ; i++)
        { 
            if(!ll.isEmpty() && ll.get(ll.size()-1)[1]  >= intervals[i][0])
            {
                ll.get(ll.size()-1)[1] = Math.max(ll.get(ll.size()-1)[1]  , intervals[i][1]) ;
            }
            else{
                ll.add(intervals[i]) ;
            }
        }
        
        int[][] ans = new int[ll.size()][2];
        for (int i = 0; i < ll.size(); i++) {
            ans[i] = ll.get(i);
        }

        return ans;
    } 
}
