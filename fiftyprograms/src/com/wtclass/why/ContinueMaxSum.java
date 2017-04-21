package com.wtclass.why;

/**
 * 求数组中连续子元素的最大和的一些算法
 *
 * @author anxingxing
 *
 *         2017年4月21日 下午12:41:01
 */
public class ContinueMaxSum {
	
	public static void main(String[] args) {

	}

	/**
	 * 暴力法，计算并列出连续子元素的和
	 * 
	 * @param a
	 */
	public static void subSum(int[] a) {	
		for (int i = 0; i < a.length; i++) {// 代表计算的起点
			int sum = a[i];
			for (int j = i + 1; j < a.length; j++) {// 要开始取后面的连续
				sum = sum + a[j];
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 求数组中连续子元素的最大和，线性的0(n)，
	 *  wt 时间复杂度低很多，动态规划
	 * 
	 * @param a
	 */
	private static void maxSubSum(int[] a) {
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
		System.out.println("数组中连续子元素的最大和:" + maxSum);
	}

	/**
	 * 求数组中连续子元素的最大和，线性的0(n) csdn
	 * 
	 * @param a
	 * @return
	 */
	public static int maxSubSum_1(int[] a) {
		int maxSum = 0, thisSum = 0;
		for (int j = 0; j < a.length; j++) {
			thisSum += a[j];
			if (thisSum < 0) {
				thisSum = 0;
			} else if (thisSum > maxSum) {
				maxSum = thisSum;
			}
		}
		return maxSum;
	}

	/**
	 * 暴力法，计算并列出连续子元素的最大和 0(n*n) m
	 * 
	 * @param a
	 */
	public static void maxSubSum_2(int[] a) {
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {// 代表计算的起点
			int thisSum = a[i];
			for (int j = i + 1; j < a.length; j++) {// 要开始取后面的连续
				thisSum += a[j];
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		System.out.println("数组中连续子元素的最大和:" + maxSum);
	}

	/**
	 * 暴力法，计算并列出连续子元素的最大和 0(n*n*n) csdn
	 * 
	 * @param a
	 */
	public static void maxSubSum_3(int[] a) {
		int maxSum = 0;// 最大子序列求和
		// start表示子序列开始索引，end表示子序列结束索引
		for (int start = 0; start < a.length; start++) {
			for (int end = 0; end < a.length; end++) {
				int thisSum = 0;// 当前子序列的和
				for (int index = start; index <= end; index++) {
					thisSum += a[index];
				}
				// 判断是否大于之前得到的最大子序列和
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		System.out.println("数组中连续子元素的最大和:" + maxSum);
	}
}
