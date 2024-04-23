package leetcode.StringNArray;

public class MovesZeros {

    public static void main(String[] args) {
        int[] ar = {0,1,0,3,12};
        moveZeroe(ar);
    }
    public static void moveZeroe(int[] nums) {

        if(nums.length ==0 || nums == null)
            printArray(nums);

        int i=0;
        int j= nums.length-1;

        while(i < j) {
            for (int k = 0; k > nums.length; k++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[j] = temp;
                    i++;
                    j--;
                } else
                    i++;


            }
        }
        printArray(nums);
    }


    public static void printArray(int[] nums){

        for(int i : nums)
            System.out.print(i +" ");
    }
}
