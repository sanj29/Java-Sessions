package Array;

public class MatrixRotate {

    public static void main(String[] args) {

        int ar[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(" Before rotating ::");
        printMatrix(ar );
        rotateMatrix(ar);
        System.out.println("After rotating ::");
        printMatrix(ar );

    }

    public static void rotateMatrix(int[][] ar){

        // Transpose Matrix::
        for(int i =0 ; i <ar.length-1; i++){
            for(int j =i+1; j <ar.length; j++){

                int temp = ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i] = temp;
            }
        }

        // Reverse Matrix:://
        for (int i = 0; i < ar.length; i++) {
            int start = 0, end = ar[0].length-1;

            while (start < end) {

                int temp = ar[i][start];
                ar[i][start] = ar[i][end];
                ar[i][end] = temp;
                start++;
                end--;

            }
        }

    }

public static  void printMatrix(int [][] ar){
    for (int i = 0; i < ar.length; i++) {
        // Loop through all elements of current row
        for (int j = 0; j < ar[i].length; j++) {
            System.out.print(ar[i][j] + " ");
        }
        System.out.print("\n");
    }
}
}
