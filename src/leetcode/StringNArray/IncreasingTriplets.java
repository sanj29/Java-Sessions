package leetcode.StringNArray;

public class IncreasingTriplets {

    public static void main(String[] args) {
        int[] ar ={2,1,5,0,4,6};

        System.out.println(increasingTriplet(ar));
    }
        public static boolean increasingTriplet(int[] nums) {

            int a=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i] <= a){
                    a= nums[i];
                }
                else if(nums[i] < b){
                    b=nums[i];
                }
                else if(nums[i] > b){
                    return true;
                }
            }
            return false;

        }

}
