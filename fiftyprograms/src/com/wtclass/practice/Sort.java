package com.wtclass.practice;

import java.util.Arrays;

/**
 * 有关于排序算法问题 数组：冒泡 选择 插入 Arrays.sort()、Collections.sort() :快速 堆排序
 *
 * @author anxingxing
 *
 *         2017年4月20日 下午7:26:38
 */
public class Sort {

	static int count = 0;

	public static void main(String[] args) {

		int[] n = { 6, 4, 7, 3, 9, 5, 1 };
		quickSort(n,0,n.length-1);
	}

	/**
	 * 快速排序    0(n log n) 目前是稳定性最好的 
	 * 
	 * @param n
	 *            数组
	 * @param lo
	 *            起始位置
	 * @param hi
	 *            结束位置
	 */
	private static void quickSort(int[] n, int lo, int hi) {
		if (lo >= hi) {
			return;
		}

		// 原地分区 （2堆 大小 3对 相等）
		// 轴 索引的值
		// 基准 轴所在位置的值
		int p = partition(n, lo, hi);

		//分治   二分搜索也是分治
		//归并  先分治再合并
		
		//小于基准
		quickSort(n, lo, p - 1);
		//大于基准
		quickSort(n, p + 1, hi);

//		System.out.println(Arrays.toString(n));
	}
	
	private static int partition1(int[] n, int lo, int hi){
		//最后一个元素为基准
		int base = n[hi];
		
		int l = lo;
		int r = hi-1;
		
		while (true) {
			while (n[l] < base) if(++l > hi) break;
			while (n[r] > base) if(--r < lo) break;
			
			if (l >= r) break;
			swap (n,l,r);
		}
		//找到了轴
		swap(n,hi,l);
//		System.out.println();
		return l;
	}

	/**
	 * 第一个元素（或最后一个元素） 作为基准
	 * @param n  数组
	 * @param lo 最小下标
	 * @param hi 最大下标
	 * @return  合适的轴（基准的合适下标）
	 */
	private static int partition(int[] n, int lo, int hi) {
		int l = lo;
		int r = hi - 1;
		int p = n[hi];// 把数组中最后一个做轴
		
		while(true){
			while(n[l]<p) if(++l == hi) break;
			while(n[r] >p) if(--r == lo ) break;
			if( l >= r) break;
			// 给轴设置合适的位置
//			swap(n, hi, p);
		}
		// 给轴设置合适的位置
		swap(n, hi, l);
		return l;
	}

	/**
	 * 插入排序
	 * 
	 * @param n
	 */
	private static void insertSort(int[] n) {

		for (int i = 1; i < n.length; i++) {
			int x = n[i];
			for (int j = i - 1; j >= 0; j--) {
				if (n[j] > x) {
					swap(n, j, j + 1);
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}

	/**
	 * 选择排序，效率比冒泡要高些
	 * 
	 * @param n
	 *            数组
	 */
	private static void selectionSort(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			int min = i;// 数组中第一个数，为索引
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < n[min]) {
					min = j;
				}
			}
			swap(n, i, min);
		}
	}

	/**
	 * 冒泡排序
	 * 
	 * @param n
	 *            数组
	 */
	private static void bubbleSort(int[] n) {
		// 执行n-1 次
		for (int j = 0; j < n.length - 1; j++) {
			// 缩小了每一次比较的范围
			for (int i = n.length - 1; i > j; i--) {
				count++;
				if (n[i] < n[i - 1]) {
					swap(n, i, i - 1);
				}
			}
		}
	}

	/**
	 * 交换两个数组中两个变量的值
	 * 
	 * @param n
	 *            数组
	 * @param i
	 *            索引
	 * @param j
	 *            索引
	 */
	private static void swap(int[] n, int a, int b) {
		System.out.printf("swap: %d, %d\n", n[a], n[b]);
		int t = n[a];
		n[a] = n[b];
		n[b] = t;
	}
}
