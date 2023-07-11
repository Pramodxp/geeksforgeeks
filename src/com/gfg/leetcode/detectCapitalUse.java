package com.gfg.leetcode;

/**
 * @author pramodr
 *
 */
class detectCapitalUse {
	public static void main(String[] args) {
		
	}

	public boolean detectCapitalUse(String word) {
		int numsCount = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				numsCount++;
			}
		}

		return ((numsCount == 0 || numsCount == word.length())
				|| (numsCount == 1 && Character.isUpperCase(word.charAt(0))));
	}
}