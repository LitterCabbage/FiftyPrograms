package com.wtclass.why;

import java.math.BigInteger;

public class Shuzu {

		public static void main(String[] args) {

//			int[] a = { -8, 2, 4, -3, -4, -4, -6, 9, -1, -13 };

//			max(a);
//			for (int i = 1; i < 9; i++) {
//				System.out.println(fib1(i));
//			}
//			
			System.out.println(gcd(4,6));
//			System.out.println(fib1(10));
//	        System.out.println(fib3(10));
			// //找出出现一次的元素（只有一个） 2^10=1024
			// int[] b = {1,2,2,4,1,4,5,5,7};
			//
			// //0(n)
			// int x = 0;
			// for (int i = 0; i < b.length; i++) {
			// x ^= b[i];//留下了奇数次的数字
			// }
			// System.out.println(x);
		}

		// 动态规划
		// 线性的，时间复杂度低很多
		private static void max(int[] a) {
			int thisSum = 0;
			int maxSum = a[0];
			for (int j = 0; j < a.length; j++) {
				thisSum += a[j];
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
				if (thisSum < 0) {
					thisSum = 0;
				}
			}
			System.out.println(maxSum);
		}

		// 数组中的连续子元素最大和

		
		// 两个数的最大公约数欧几里得算法
		// 线性
		public static int getOuji(int a, int b) {
			while (b != 0) {
				int ren = a % b;
				a = b;
				b = ren;
			}
			return a;
		}
		
		//阶乘  递归实现
//		public static int multi(int n){
			
			
//		if(n<=1){
//			return n;
//		}
//		return n*multi(n-1);
//		}
		public static BigInteger multi2(int n){
			if(n<=1){
				return BigInteger.valueOf(1);
			}
			return BigInteger.valueOf(n).multiply(multi2(n-1));
		}
		
		//阶乘  非递归实现
		public static void multi3(int n){
//			int sum = 1;
			BigInteger sum = BigInteger.valueOf(n);
			for (int i = 1; i <= n; i++) {
				sum = sum.multiply(BigInteger.valueOf(i));
			}
			System.out.println(sum.toString());
		}
		
		static int c = 0;
		
		//递归
		public static int fib1(int n){
			
			
			if(n<=2){
				return 1;	
			}else{
				return fib1(n-1)+fib1(n-2);
			}
		}
		//三元运算 递归
		public static int fib2(int n){
			c++;
			return n<=2?1:fib2(n-1)+fib2(n-2);
		}
		
		//非递归 也是动态规划的一种
		public static int fib3(int n){
			
			//从第三个开始，就是前两个数的和
			int a = 1;
			int b = 1;
			int c = 1;
			for (int i = 3; i <= n; i++) {
				c = a+b;
				a=b;
				b=c;
			}
			return c;
		}
		
		//最大公约数,递归0(n)
		//gcd(a,b) = gcd(b, a mod b)
		public static int gcd(int a,int b){
			if(b == 0)
				return a;
			return gcd(b,a%b);
		}
		
//		{'a','b','c','g','d'}
		//1）长度大于零的，所有组合排列
		//2）长度大于零的，相邻的元素的所有排列组合
		//3）有重复
		
		//素数
		//1）第N个  10000
		//2）10000以内最大的
		//时间复杂度分析

}
