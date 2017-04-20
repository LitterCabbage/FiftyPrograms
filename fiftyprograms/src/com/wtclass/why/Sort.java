package com.wtclass.why;

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
		System.out.println("before:" + Arrays.toString(n));
		// (n-1)*(n-1)
		// n*n/2 性能提升了一半
		// bubbleSort(n);
		// selectionSort(n);
		// insertSort(n);
		quickSort(n, 0, n.length);
		System.out.println("after :" + Arrays.toString(n));
		// System.out.println(count);
	}

	/**
	 * 快速排序
	 * 
	 * @param n
	 *            数组
	 * @param left
	 *            起始位置
	 * @param right
	 *            结束位置
	 */
	private static void quickSort(int[] n, int left, int right) {

		int start = left;
		int end = right - 1;
		// 确定轴的位置
		int p = 3;

		int key = n[right];// 把数组中最后一个做轴

		// 给轴设置合适的位置
		swap(n, right, p);

		// 递归，比轴小的左边
		quickSort(n, left, p - 1);
		// 递归，比轴大的右边
		quickSort(n, p + 1, right);

	}

	/**
	 * 插入排序
	 * 
	 * @param n
	 */
	private static void insertSort(int[] n) {

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
