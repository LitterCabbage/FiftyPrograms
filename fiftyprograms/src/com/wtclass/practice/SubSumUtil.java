package com.wtclass.practice;

/**
 * 最大连续子元素和的相关方法
 *
 * @author anxingxing
 *
 *         2017年4月21日 下午12:41:01
 */
public class SubSumUtil {
	public static void main(String[] args) {
		int[] a = { 1,5,3,4,2};
		
		subSum(a);
		maxSubSum(a);
		maxSubSum_1(a);
		maxSubSum_2(a);
		maxSubSum_3(a);
		indexMaxSubSum2(a);
		indexMaxSubSum1(a);
	}

	/**
	 * 暴力法，列出连续子元素的和
	 * 
	 * @param a
	 *            数组
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
	 * 最大连续子元素和 线性0(n)， wt 时间复杂度低很多，动态规划
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
	 * 最大连续子元素和 线性的0(n) csdn
	 * 
	 * @param a
	 *            数组
	 * 
	 */
	public static void maxSubSum_1(int[] a) {
		int maxSum = 0, thisSum = 0;
		for (int j = 0; j < a.length; j++) {
			thisSum += a[j];
			if (thisSum < 0) {
				thisSum = 0;
			} else if (thisSum > maxSum) {
				maxSum = thisSum;
			}
		}
		System.out.println(maxSum);
		;
	}

	/**
	 * 暴力法，最大连续子元素和 0(n*n) m
	 * 
	 * @param a
	 *            数组
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
	 * 暴力法，最大连续子元素和 0(n*n*n) csdn
	 * 
	 * @param a
	 *            数组
	 */
	public static void maxSubSum_3(int[] a) {
		int maxSum = 0;
		for (int start = 0; start < a.length; start++) {
			for (int end = 0; end < a.length; end++) {
				int thisSum = 0;
				for (int index = start; index <= end; index++) {
					thisSum += a[index];
				}
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		System.out.println("数组中连续子元素的最大和:" + maxSum);
	}
	
	/**
	 * 最大连续子元素和的位置索引  0(n)
	 * 
	 * @param a
	 *            数组
	 */
	public static void indexMaxSubSum1(int[] a) {
		int maxSum = 0;
		int thisSum = 0;
		int start = 0;
		int end = 0;
		int point = 0;
		for (int i = 0; i < a.length; i++) {
			thisSum += a[i];
			if (thisSum > maxSum) {
				maxSum = thisSum;
				end = i;
				start = start > point ? start : point;
			}
			if (thisSum < 0) {
				thisSum = 0;
				point = i + 1;
			}
		}
		
		System.out.println("最大连续子元素和的起始位置：" + start);
		System.out.println("最大连续子元素和的结束位置：" + end);
	}
	
	/**
	 * 最大连续子元素和的位置索引  0(n*n)
	 * @param a 数组
	 */
	public static void indexMaxSubSum2(int[] a) {
		int maxSum = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < a.length; i++) {// 代表计算的起点
			int thisSum = a[i];
			for (int j = i + 1; j < a.length; j++) {// 要开始取后面的连续
				thisSum += a[j];
				if (thisSum > maxSum) {
					maxSum = thisSum;
					start = i;
					end = j;
				}
				if(thisSum < 0){
					thisSum = 0;
				}
			}
		}
		System.out.println(maxSum);
		System.out.println("最大连续子元素和的起始位置：" + start);
		System.out.println("最大连续子元素和的结束位置：" + end);
	}

}
