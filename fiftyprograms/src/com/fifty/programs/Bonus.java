package com.fifty.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，
 * 可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
 * 从键盘输入当月利润I，求应发放奖金总数？ 
 *
 * @author anxingxing
 *
 *         2017年5月1日  下午11:16:07
 */
public class Bonus {

	public static void main(String[] args){
		System.out.print("请输入当前利润：");
		long profit = Long.parseLong(key_Input());
		System.out.println("应发奖金："+bonus(profit));
	}
	//接受从键盘输入的内容
	private static String key_Input(){
		String str = null;
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(System.in));
		try{
			str = bufIn.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				bufIn.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return str;
	}
	//计算奖金
	private static long bonus(long profit){
		long prize = 0;
		long profit_sub = profit;
		if(profit>1000000){
			profit = profit_sub-1000000;
			profit_sub = 1000000;
			prize += profit*0.01;
		}
		if(profit>600000){
			profit = profit_sub-600000;
			profit_sub = 600000;
			prize += profit*0.015; 
		}
		if(profit>400000){
			profit = profit_sub-400000;
			profit_sub = 400000;
			prize += profit*0.03;
		}
		if(profit>200000){
			profit = profit_sub-200000;
			profit_sub = 200000;
			prize += prize*0.05;
		}
		if(profit>100000){
			profit = profit_sub-100000;
			profit_sub = 100000;
			prize += profit*0.075;
		}
		prize += profit_sub*0.1;
		return prize;
	}
}
