package com.gfg.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

class wordPattern {
	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}

	public static boolean wordPattern(String pattern, String s) {
		Map<Character, String> map = new LinkedHashMap<>();
		String[] splitarr = s.split(" ");
		if (splitarr.length != pattern.length()) {
			return false;
		}
		for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(pattern.charAt(i))) {
				if (!splitarr[i].trim().equals(map.get(pattern.charAt(i)))) {
					return false;
				}
			} else {
				map.put(pattern.charAt(i), splitarr[i].trim());
			}
		}
		return false;
	}
}