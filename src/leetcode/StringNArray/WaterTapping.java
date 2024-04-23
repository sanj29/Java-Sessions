package leetcode.StringNArray;


class WaterTapping {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8};
        int a =maxWaterAre(height);
        System.out.println(a);

    }

    public static int maxWaterAre(int[] ar){

        int maxAr = Integer.MIN_VALUE; // 6

        int lef = 0;
        int right= ar.length-1;

        while(lef <right){

            int shortPole = Math.min(ar[lef], ar[right]);

            maxAr = Math.max(maxAr, shortPole*(right-lef));

            if(ar[lef] < ar[right])
                lef++;
            else
                right --;

        }
        return maxAr;
    }

}