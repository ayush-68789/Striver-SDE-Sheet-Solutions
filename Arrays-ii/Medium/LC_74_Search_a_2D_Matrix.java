public class LC_74_Search_a_2D_Matrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7} , {10,11,16,20} , {23,30,34,60}} ; 
        int target = 3 ;
        System.out.println((searchMatrix(matrix, target))) ;
    }   
    public static boolean searchMatrix(int[][] matrix, int target) 
    {
        int low = 0 ;
        int high = matrix[0].length-1 ;
        while(low < matrix.length && high >= 0) 
        {
            if(matrix[low][high] == target)
            {
                return true ;
            }
            if(matrix[low][high] < target)
            {
                low ++ ;
            }
            else if(matrix[low][high] > target)
            {
                high -- ; 
            }
        }
        return false ; 
    }
}
