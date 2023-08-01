package com.bigdreams.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LC_169_Majority_Element {
    public static void main (String args[]){
        int arr1 [] = {3, 2, 3};
        System.out.println(majorityElement(arr1));
    }

    public static int majorityElement(int[] nums) {
        int x =0 ;
        HashMap<Integer,Integer>arrayElementCount=new HashMap<>();
        if(nums.length==1){
            return nums[0];
        }
        for(int i =0;i<nums.length;i++){
            int element = nums[i];
            if(arrayElementCount.containsKey(element)){
                int elementCount = arrayElementCount.get(element);
                elementCount=elementCount+1;
                if(elementCount>nums.length/2){
                    x=element;
                    break;
                }
                arrayElementCount.put(element,elementCount);
            }else {
                arrayElementCount.put(element,1);
            }
        }
        return x;
    }

    // Other solutions
    public static int majorityElementS2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int majorityElementS3(int[] nums) {
        List<Integer> list=  Arrays.stream(nums).boxed().collect(Collectors.toList());
        Map<Integer, List<Integer>> keyCountMap=list.stream().collect(Collectors.groupingBy(Integer::intValue));
        for(Integer key:keyCountMap.keySet()){
            if(keyCountMap.get(key).size()>(list.size())/2)
                return key;
        }
        return 0;
    }
}
