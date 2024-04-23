package Array;

public class MoveAllZeroToLeft {

    static int[] arr={0,1,0,3,12,0,0,0};

    public static void main(String[] args) {

        int[] resultArray= moveAllZeroToLeft(arr);
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        int[] rightZero=moveAllZeroToRight(arr);

        for (int num : rightZero) {
            System.out.print(num + " ");
        }

    }

    public static int [] moveAllZeroToLeft(int[] array){

        if (array == null || array.length == 0) {
            return array;
        }
        int temp;
        int n = array.length;
        //int nz=n-1, z =n-1;
        int nz=0, z =0;
        int count=0;
        while (nz <array.length){
//{0,1,0,3,12};
            if (array[nz] != 0) {
                temp = array[nz];
                array[nz] = array[z];
                array[z] = temp;

                z++;

            }
            nz++;

        }
        return array;
    }


    public static int [] moveAllZeroToRight(int[] array){

        if (array == null || array.length == 0) {
            return array;
        }
        int temp;
        int n = array.length;
        int nz=0, z=0;
        int count=0;
        while (nz <n){
//{0,1,0,3,12};
            if (array[nz] != 0) {
                temp = array[nz];
                array[nz] = array[z];
                array[z] = temp;

                z++;

            }
            nz++;

        }
        return array;
    }
}
