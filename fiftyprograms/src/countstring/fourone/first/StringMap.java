package countstring.fourone.first;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringMap {

	public static void main(String[] args) {

		String a = "I come from County DingYuan Province AnHui.";
		String s = getCount(a);
		System.out.println(s);
	}

	/**
	 * 用map的方法来计算英语字符串中每个字母出现的次数
	 * 
	 * @param s
	 *            需要处理的字符串
	 * @return
	 */
	private static String getCount(String s) {
		// 有了toLowerCase()就不会区分大小写。//将字符串转换为字符数组
		char[] c = s.replace(" ", "").toLowerCase().toCharArray();
		// 定义map集合
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < c.length; i++) {
			// 将字符数组中的字母作为键去查map表
			Integer value = map.get(c[i]);
			int count = 1;
			if (value != null) {
				count = value + 1;
			}

			map.put(c[i], count);
		}

		return getMap(map);
	}

	/**
	 * 从map中读出数据
	 * 
	 * @param map
	 * @return
	 */
	private static String getMap(Map<Character, Integer> map) {
		StringBuilder sb = new StringBuilder();
		Iterator<Character> it = map.keySet().iterator();
		while (it.hasNext()) {
			Character key = it.next();
			Integer value = map.get(key);
			sb.append(key + ":" + value + " ");
		}
		return sb.toString();
	}
}
