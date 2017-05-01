package com.fifty.programs;

/**
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 *
 * @author anxingxing
 *
 *         2017年4月24日  下午11:48:49
 */
public class Part {

	public static void main(String[] args) {
		int n = 24;
		decompose(n);
	}
	private static void decompose(int n){
		System.out.print(n+"=");
		for(int i=2;i<n+1;i++){
			while(n%i==0 && n!=i){
				n/=i;
				System.out.print(i+"*");
			}
			if(n==i){
				System.out.println(i);
				break;
			}
		}
	}
}
