package Array;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr= {1,3,4,6,6,7,8,9,12};
        int target=8;
        int result =binarySearch(arr,target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
    public static int  binarySearch(int[] array, int target){

        int left=0, right =array.length-1;
        int mid;
        while (left <= right){
            mid= (left+right)/2;

            if(array[mid] == target)
                return mid;

            else if(array[mid] < target)
                left =mid+1;
            else
                right =mid-1;
        }

        return -1;
    }
}
