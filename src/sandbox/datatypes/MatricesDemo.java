package src.sandbox.datatypes;

public class MatricesDemo {
    public static void main(String[] args) {
        /*
        *  Implementing a bi-dimensional array
        *  It is a 2 rows and two columns array
        * */
        int[][] intMatrix = {{0,1},{1,0}};

        int[][] intMatrix2 = new int[2][2];
        for (int i=0; i<intMatrix2.length;i++){
            for (int j=0; j<intMatrix2[i].length;j++){
                intMatrix2[i][j] = i+j;
                System.out.println("In the inner loop:" + intMatrix2[i][j] + " ");
            }
            System.out.println("Outside loop ");
        }
        /*
        * Implementing the cubical dimensional array
        * */
        // cubical matrix, with three coordinates
        int[][][] intMatrix3 = new int[2][2][2];
        for (int i = 0; i < intMatrix3.length; ++i) {
            for (int j = 0; j < intMatrix3[i].length; ++j) {
                for (int k = 0; k < intMatrix3[i][j].length; ++k) {
                    intMatrix3[i][j][k] = i + j + k;
                    System.out.print("["+i+", "+j+", " + k + "]");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
