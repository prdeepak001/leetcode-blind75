package com.bigdreams.leetcode.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int target = 8;
        int[] nums = {2, 4, 5, 7, 8};
        int index = search(nums,target);
        System.out.println("Index is "+ String.valueOf(index));
    }

    public static int search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        int mid = (int) Math.floor((lo+hi)/2);
        while(lo<=hi){
           // System.out.println(" lo, hi , mid "+String.valueOf(lo)+"_"+String.valueOf(hi)+"_"+String.valueOf(mid));
            mid = (int) Math.floor((lo+hi)/2);
            if(target>nums[mid]){
                //move right
                lo=mid+1;

            }else{
                //move left
                hi=mid-1;
            }
            if(nums[mid]==target)
                return mid;
        }
        return -1;
    }
}
