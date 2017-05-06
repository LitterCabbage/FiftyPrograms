package com.wtclass.practice;

import java.util.Arrays;

/**
 * 排序相关的工具类
 *
 * @author anxingxing
 *
 *         2017年4月26日 下午6:49:24
 */
public class SortUtil {

	public static void main(String[] args) {

		int[] a = { 3, 2, 5, 4, 1 };
		// reserve(a);
		// search(a, 3);
		// shuffle(a);
		// quickSort(a);
		// System.out.println(Arrays.toString(a));

		// int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// binarySearch(b,10);
		// shuffle_wt(b);
	}

	/**
	 * 快速排序
	 * 
	 * @param a
	 *            数组
	 */
	public static void quickSort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	private static void sort(int[] n, int lo, int hi) {

		if (lo >= hi) {
			return;
		}
		int p = partition(n, lo, hi);
		// 小于基准
		sort(n, lo, p - 1);
		// 大于基准
		sort(n, p + 1, hi);

	}

	/**
	 * 第一个元素（或最后一个元素） 作为基准
	 * 
	 * @param n
	 *            数组
	 * @param lo
	 *            最小下标
	 * @param hi
	 *            最大下标
	 * @return 合适的轴（基准的合适下标）
	 */
	private static int partition(int[] n, int lo, int hi) {
		// 最后一个元素为基准
		int base = n[hi];
		int l = lo;
		int r = hi - 1;
		while (true) {
			while (n[l] < base)
				if (++l > hi)
					break;
			while (n[r] > base)
				if (--r < lo)
					break;
			if (l >= r)
				break;
			swap(n, l, r);
		}
		// 找到了轴
		swap(n, hi, l);
		return l;
	}

	/**
	 * 插入排序
	 * 
	 * @param a
	 *            数组
	 */
	public static void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int x = a[i];
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] > x) {
					swap(a, j, j + 1);
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	/**
	 * 选择排序
	 * 
	 * @param a
	 *            数组
	 */
	public static void selectSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;// 数组中第一个数，为索引
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, i, min);
		}
	}

	/**
	 * 希尔排序
	 * 
	 * @param a
	 *            数组
	 */
	public static void shellSort(int[] a) {
		int d = a.length;
		while (true) {
			d = d / 2;
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < a.length; i = i + d) {
					int temp = a[i];
					int j;
					for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {
						a[j + d] = a[j];
					}
					a[j + d] = temp;
				}
			}
			if (d == 1)
				break;
		}
		System.out.println();
		System.out.println("排序后：" + Arrays.toString(a));
	}

	/**
	 * 数组反转
	 * 
	 * @param a
	 */
	public static void reserve(int[] a) {
		System.out.print("{");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + ",");
		}
		System.out.println("}");
	}

	/**
	 * 线性搜索
	 * 
	 * @param a
	 * @param e
	 * @return
	 */
	public static int search(int[] a, int e) {
		for (int i = 0; i < a.length; i++) {
			if (e == a[i]) {
				System.out.println("指定元素" + e + "所在的位置索引：" + i);
			}
		}
		return -1;
	}

	/**
	 * 二分搜索 前提 是数组有序 o(N LOG N)
	 * 
	 * @param a
	 *            有序的数组
	 * @param e
	 *            要搜索的元素
	 */
	public static void binarySearch(int[] a, int e) {
		int min = 0;
		int max = a.length - 1;
		int mid = (max + min) >> 1;
		while (a[mid] != e) {
			if (e > a[mid]) {
				min = mid + 1;
			} else if (e < a[mid]) {
				max = mid - 1;
			}
			if (max < min) {
				System.out.println("-1");
			}
			mid = (max + min) >> 1;
		}
		System.out.println(mid);
	}

	/**
	 * 打乱（洗牌）
	 * 
	 * @param a
	 *            数组
	 */
	public static void shuffle(int[] a) {
		// 生成0到1之内的随机数再乘以数组长度
		int r = (int) (Math.random() * a.length);
		for (int i = 0; i < a.length; i++) {
			swap(a, r, i);
		}
		System.out.println(Arrays.toString(a));
	}

	/**
	 * 打乱 1 2 3 4 5 0<= Math.random()<7
	 */
	public static void shuffle_wt(int[] a) {
		// 前面任意个元素的索引
		for (int i = a.length - 1; i > 0; i--) {
			// 将最后一个和索引为r的相交换
			int r = (int) (Math.random() * a.length - 1);
			int t = a[a.length - 1];
			a[a.length - 1] = a[r];
			a[r] = t;

		}
		System.out.println(Arrays.toString(a));
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
		int t = n[a];
		n[a] = n[b];
		n[b] = t;
	}
}
