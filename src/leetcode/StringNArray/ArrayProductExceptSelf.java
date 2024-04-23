package leetcode.StringNArray;

public class ArrayProductExceptSelf {
    public static void main(String[] args) {

        int[] nums1 = {-1,1,0,-3,3};
        int[] nums={1,2,3,4};
        productExceptSelf(nums);
        productExceptSelf(nums1);
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        int j;
        int mul = 1;
        int n = nums.length;
            for (j=0; j < nums.length; j++){
                mul=mul* nums[j];
                answer[j]=mul; //1, 2, 6, 12
             //   mul=1;
        }

            mul=1;
        for (int i=n-1; i >0; --i) {
            answer[i]=answer[i-1]*mul;
            mul=mul*nums[i];
        }
        answer[0]=mul;

        return answer;
    }


}
