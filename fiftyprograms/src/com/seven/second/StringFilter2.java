package com.seven.second;

public class StringFilter2 {

	/*
	 * 编写字符串压缩程序，将字符串中连续出席的重复字母精细压缩，并输出压缩后的字符串
	 */
	static void stringFilter( char InputStr[], long len, char OutputStr[]){
        int[] a= new int[26]; 
        int num=0;
        int j=0;//OutputStr[]计数
        for(int i=0;i<len;i++){
            num = InputStr[i]-'a';
            if(a[num]==0){//没出现过
                OutputStr[j]=InputStr[i];
                j++;
                a[num]=1;
            }
        }
    }
     
    static void stringZip( char InputStr[], long len, char OutputStr[]){
        char temp=' ';
        int num=1;
        int point=0;
        for(int i=0;i<len;i++){
            if(InputStr[i]==temp){
                num++;
            }else{
                if(num!=1){
                    OutputStr[point++]=(char)(num+'0');
                    num=1;
                }               
                OutputStr[point++]=temp;
                temp=InputStr[i];
            }
        }       
    }
     
    public static void main(String[] args) {
        char [] test={'a','a','a','c','b','b','b','a','a','c','a','d','d','d','c','d','e'};
        long len=test.length;
        char [] res = new char[(int) len];
        stringFilter(test,len,res);
        int j=res.length;
        for(int i=0;i<j;i++){
            if(res[i]!='\0'){
                System.out.print(res[i]);
            }else
                break;          
        }
         
        char[] res2=new char[(int) (2*len)];
        stringZip(test,len,res2);
        for(int i=0;i<2*len;i++){
            if(res2[i]!='\0'){
                System.out.print(res2[i]);
            }else
                break;
        }
    }

}
