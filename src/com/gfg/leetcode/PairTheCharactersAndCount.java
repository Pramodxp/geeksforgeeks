package com.gfg.leetcode;

//pending
public class PairTheCharactersAndCount {
	public static void main(String[] args) {
		String s = new String("aabbcccdddaaaa");
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length()-1;i++) {
			if (s.charAt(i) == s.charAt(i + 1))
			{
			count++;	
			}else {
				sb.append(s.charAt(i-1));
				sb.append(count);
				count=0;
			}
		}
		System.out.println(sb);
	}
}
