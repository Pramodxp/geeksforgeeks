package com.gfg.leetcode;
class Shuffle {
	public static void main(String[] args) {
		System.out.println(shuffle(new int[]{2,5,1,3,4,7}, 3));
	}
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        boolean alternative = true;
        int alternateIndex = 0;
        for(int x=0;x<nums.length;x++){
            if(alternative){
                alternative = false;
                result[x] = nums[alternateIndex];
                alternateIndex++;
            }else{
                alternative = true;
                result[x] = nums[n];
                n++;
            }
        }
        return result;
    }
}

//[2,3,5,4,1,7]