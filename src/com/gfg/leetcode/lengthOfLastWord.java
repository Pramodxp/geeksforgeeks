package com.gfg.leetcode;
class lengthOfLastWord {
	public static void main(String[] args) {
		lengthOfLastWord("    day");
	}
    public static int lengthOfLastWord(String s) {
        int count=0;
        String s1 = s.trim();
        for(int i=s1.length();i>0;i--){
            if(s1.length() == 1){
                return s1.length();
            }
            if(s1.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}