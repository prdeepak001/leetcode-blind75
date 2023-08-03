package com.bigdreams.leetcode.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class LC_217_Contains_Duplicate {
    public static void main(String[] args) {
        int []array= {1,4,3,2};
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> list=  Arrays.stream(nums).boxed().collect(Collectors.toList());
        Map<Integer, List<Integer>> keyCountMap=list.stream().collect(Collectors.groupingBy(Integer::intValue));
        for(Integer key:keyCountMap.keySet()){
            if(keyCountMap.get(key).size()>1)
                return true;
        }
        return false;
    }

    public static boolean containsDuplicateS2(int[] nums) {
        Set<Integer> items = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!items.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
