package com.bit;

public class Solution {
    public int pivotIndex(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret+=nums[i];
        }
        int leftRet = 0;
        for (int i = 0; i <nums.length ; i++) {
            leftRet+=nums[i];
            if (leftRet==ret-nums[i]-leftRet){
                return i;
            }
        }
        return -1;
    }
}
