package com.math.basic;

/**
 * 有1、2、3、4个数字，
 * 能组成多少个互不相同且无重复数字的三位数？都是多少？
 *
 * @author anxingxing
 *
 *         2017年4月26日  下午11:13:21
 */
public class Zuhe {

	public static void main(String[] args){
		int count = 0;
		int n = 0;
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				if(j==i)
				  continue;
				for(int k=1;k<5;k++){
					if(k!=i && k!=j){
						n = i*100+j*10+k;
					  System.out.print(n+" ");
					  if((++count)%5==0)
					  System.out.println();
					}
				}
			}
		}
		System.out.println();
		System.out.println("符合条件的数共："+count+"个");
	}
}
