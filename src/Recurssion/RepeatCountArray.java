package Recurssion;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatCountArray {

    public static void main(String[] args) {
        int[] ar ={1,3,4,6,2,6,5};

       // System.out.println(getRepeatedElement(ar));
        //System.out.println(findDuplicate_2loops(ar));
        int repNum=findDuplicateElementSet(ar);
        if(repNum >0)
            System.out.println("Repeated number is " +repNum);
        else
            System.out.println(" No repeated num");
    }

    public  static int getRepeatedElement(int[] ary){

        int item =0;
        Map<Integer, Integer> mapCnt = new HashMap<>();
        for(int i =0; i< ary.length ; i++){
            if(mapCnt.get(ary[i]) != null){
                mapCnt.put(ary[i], mapCnt.get(ary[i])+1);
            }
            else
                mapCnt.put(ary[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : mapCnt.entrySet()) {
           // System.out.println("Key is ::" +entry.getKey() +" Value is:: "+ entry.getValue());
            if (entry.getValue() > 1)
                item=entry .getKey();
        }
        return item;
    }

    public static int findDuplicate_2loops(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return len;
    }

    public static int findDuplicateElementSet(int [] nums){

        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for(int i =0; i <nums.length; i++){

            if(!set.add(nums[i]))
                return nums[i];
        }

        return -1;
    }

}
