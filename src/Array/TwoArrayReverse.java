package Array;

public class TwoArrayReverse {
    public static void main(String[] args) {
        int[][] ar = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        twoDarrayReverse(ar);
    }

    public static void twoDarrayReverse(int[][] ar) {

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

        for (int i = 0; i < ar.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
