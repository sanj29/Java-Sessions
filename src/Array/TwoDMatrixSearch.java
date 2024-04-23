package Array;

public class TwoDMatrixSearch {

    public static void main(String[] args) {
        int [][]ar = {{1,3,5,7}, {10,11,16,20},{23,30,34,60}};
        int target = 60;
        if(searchedElementPos(ar,target))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }

    public static boolean  searchedElementPos(int[][] ar, int target){

        int i=0;
        int j =ar[0].length-1;

        while (i < ar.length && j >=0 ){

            if(target==ar[i][j]){
                return true;
            }
            else if(target<ar[i][j])
                j--;
            else if(target>ar[i][j])
                i++;
        }
        return false;
    }
}
