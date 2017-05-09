package com.zxx.structues;

/**
 * 金额转换，阿拉伯数字的金额转换成中国传统的形式如：（￥1011）－>（一千零一拾一元整）输出。
 * 去零的代码：
 * return sb.reverse().toString().replaceAll("零[拾佰仟]","零").replaceAll("零+万","万").replaceAll("零+元","元").replaceAll("零+","零");
 *
 * @author anxingxing
 *
 *         2017年5月9日  下午10:34:24
 */
public class RenMingBi {	
    
    private static final char[] data = new char[]{
                '零','壹','贰','叁','肆','伍','陆','柒','捌','玖'
          }; 
    private static final char[] units = new char[]{
          '元','拾','佰','仟','万','拾','佰','仟','亿'
    };
    public static void main(String[] args) {
          System.out.println(
            convert(135689123));
    }
    public static String convert(int money)
    {
          StringBuffer sbf = new StringBuffer();
          int unit = 0;
          while(money!=0)
          {
                sbf.insert(0,units[unit++]);
                int number = money%10;
                sbf.insert(0, data[number]);
                money /= 10;
          }
          return sbf.toString();
    }
}








