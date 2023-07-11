package com.gfg.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinimumTotal {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(-1);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(-1);
		list2.add(-3);
		
		List<List<Integer>> integerList = new ArrayList<>();
		integerList.add(list);
		integerList.add(list1);
		integerList.add(list2);
		
		minimumTotal(integerList);
	}
	
    public static int minimumTotal(List<List<Integer>> triangle) {
        Integer total = 0;
        for(List<Integer> list:triangle){
            total = (total) + (findMinimumInAnList(list));
        }
        return total;
    }

    static Integer findMinimumInAnList(List<Integer> list){
        Integer min = list.get(0);
        for(Integer value:list){
            if(min > value){
                min = value;
            }
        }
        return min;
    }
}