package Array;

public class MergeArray {

    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m=3, n=3;
        merge(num1,m,num2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
        while(p2 >=0 ){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else{
                nums1[i--] = nums2[p2--];
            }
        }
        for(int j =0; j <nums1.length ;j++)
            System.out.print(nums1[j]);
    }
}
