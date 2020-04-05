public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        int[][] ma = Matrix.ARRAY_A;
        int[][] mb = Matrix.ARRAY_B;
        int[][] mc = null;

        // ma[0].length = number of columns in ma
        // mb.length = number of rows in mb
        if(ma[0].length == mb.length)
        {
            mc = new int[ma.length][mb[0].length];
            for(int i = 0; i < mc.length; i++)
            {
                for(int j = 0; j < mc[0].length; j++)
                {
                    mc[i][j] = 0;

                    // add to mc[i][j] the product of the ith row
                    // of ma and the jth column of mb
                    for(int idx = 0; idx < mb.length; idx++)
                    {
                        mc[i][j] += (ma[i][idx] * mb[idx][j]);
                    }
                }
            }
            print_matrix(ma);
            print_matrix(mb);
            print_matrix(mc);
        }
    }

    public static void print_matrix(int[][] m)
    {
        for(int[] arr : m)
        {
            for(int e : arr)
            {
                System.out.printf("%-3d", e);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
