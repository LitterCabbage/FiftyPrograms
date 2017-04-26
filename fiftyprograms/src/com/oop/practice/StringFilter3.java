package com.oop.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringFilter3 {

	public static void main(String[] args) {
      System.out.println("请输入一行字符：");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      sc.close();
      count(str);
	}

	private static void count(String str) {

		List<String> list = new ArrayList<>();
		char[] ch = str.toCharArray();
		for(char c : ch)
			//将字符作为字符串添加到list表中
			list.add(String.valueOf(c));
		    //排序
			Collections.sort(list);
			for(String s : list){
				int begin = list.indexOf(s);
				int end = list.lastIndexOf(s);
				//索引结束统计字符
				if(list.get(end) == s){
					System.out.print("字符‘"+s+"’有"+(end+1-begin)+"个"+"   ");
				}
			}
		}
}
