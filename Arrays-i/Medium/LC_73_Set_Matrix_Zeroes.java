public class LC_73_Set_Matrix_Zeroes {
    // Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
    // Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
    // Output: [[1,0,1],[0,0,0],[1,0,1]]
    public static void main(String[] args) {
        int [][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}} ;

        setZeroes(matrix) ;
        // printing 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) 
    {
        boolean [] row = new boolean[matrix.length] ;  
        boolean [] col = new boolean[matrix[0].length] ;
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = true ; 
                    col[j] = true ;
                }
            }
        } 

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                if(row[i] == true || col[j] == true)
                {
                    matrix[i][j] = 0 ;
                }
            }
        } 
    }
}
