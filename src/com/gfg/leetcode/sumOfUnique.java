package com.gfg.leetcode;
class sumOfUnique {
	public static void main(String[] args) {
		sumOfUnique(new int[] {1,2,3,2});
	}
    public static int sumOfUnique(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            boolean isUnique = true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    nums[j] = 0;
                    isUnique = false;
                }
            }
            if(isUnique){
                total += nums[i];
            }
        }
        return total;
    }
}