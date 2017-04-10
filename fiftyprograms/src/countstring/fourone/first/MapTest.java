package countstring.fourone.first;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		String s = "adfkjsoafjie";
		count(s);
	}

	/**
	 * 获取字符串中每个字母出现的次数
	 * @param s
	 */
	private static void count(String s) {
		Map map = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			char tem = s.charAt(i);
			if(map.containsKey(tem)){
				int t = (int) map.get(tem);
				map.put(tem, t+1);
			}else{
				map.put(tem, 1);
			}
		}
		for(Object o :map.keySet()){
			char t = (char) o;
			int j = (int) map.get(t);
			System.out.print(t+":"+j+" ");
		}
	}

}
