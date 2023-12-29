class MatrixQuestion
{
    public static void main(String[] args)
    {
        int[][] matrix =  {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i = 0; i < matrix.length; i++ )
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(j > i)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(java.util.Arrays.toString(matrix[0]));
        System.out.println(java.util.Arrays.toString(matrix[1]));
        System.out.println(java.util.Arrays.toString(matrix[2]));
        
    }
}