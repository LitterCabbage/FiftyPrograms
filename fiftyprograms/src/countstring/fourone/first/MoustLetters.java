package countstring.fourone.first;

/**
 * 最大的出现次数
 *
 * @author  axingxing
 *
 * 2017年4月10日  下午3:55:55
 */
public class MoustLetters {

	public static void main(String[] args) {

		String s = "afdifajfsafmiodasmfieoajfsd";
		
		//记录最大出现次数
		int max = 0;
		//临时计数用的数组
		int[] count = new int[127];
		//循环字符以做统计
		for (int i = 0; i < s.length(); i++) {
			//取出单个字符
			char c = s.charAt(i);
			//计数并检测最大出现次数
			max = (++count[c] > max)?count[c]:max;
		}
		System.out.println(max);
	}

}
