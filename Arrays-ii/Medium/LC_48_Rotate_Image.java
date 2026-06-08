public class LC_48_Rotate_Image {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3}, {4,5,6},{7,8,9}} ;
        transpose(matrix);
        rev_image(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matrix)
    {
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = i+1 ; j < matrix.length ; j++)
            {
                int temp = matrix[i][j] ; 
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] = temp ;
            }
        }
    }

    public static void rev_image(int[][] matrix)
    {
        for(int i = 0 ; i < matrix.length ; i++)
        {
            int start = 0 ;
            int end = matrix.length-1 ;
            while(start <= end)
            {
                int temp = matrix[i][start] ;
                matrix[i][start] = matrix[i][end] ;
                matrix[i][end] = temp ; 
                start++ ;
                end-- ;
            }
        }
    }
}