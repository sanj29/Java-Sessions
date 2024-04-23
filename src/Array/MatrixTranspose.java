package Array;

public class MatrixTranspose {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        transposeMatrix(arr);
    }

    public static void transposeMatrix(int [] [] ar){

        for(int i =0 ; i <ar.length-1; i++){
            for(int j =i+1; j <ar.length; j++){

                int temp = ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i] = temp;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
