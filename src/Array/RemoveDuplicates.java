package Array;

public class RemoveDuplicates {

    public static void main(String[] args) {
    int[] num= {0,0,1,1,1,2,2,3,3,4};

        int r =removeDuplicate(num);

        for(int i=0 ; i<r ;i++)
            System.out.print( num[i] +" ");
    }
    public static int removeDuplicate(int[] nums) {

        int rd = 0;

        for (int i = 1; i < nums.length; i++) {

            if(nums[rd] != nums[i])
                rd++;
            nums[rd]=nums[i];
        }

        return rd+1;

    }
}