package fiftyprograms.fourone.first;

/**
 * 计算字符串中子串出现的次数
 *
 * @author axingxing
 *
 *         2017年4月10日 上午9:12:09
 */
public class FourOne {

	public static void main(String[] args) {

		String str = "I come from County DingYuan Province AnHui.";
		subString(str);
//		int index = 1 ;
//		str = str.replace(" ", "");
//		char[] c = str.toCharArray();
//		for(char ch :c){
//			System.out.print(ch+" ");
//		}
	}

	private static void subString(String str) {
		char[] ch = str.trim().toCharArray();
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;
			}
		}
		System.out.println("字符串中共有" + count + "子串");
	}

}
