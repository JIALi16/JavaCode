package com.pa.util;

import java.util.Scanner;
import com.pa.entity.Variate; 

public class CaesarEncryption implements Encryption{
	public static void decryption() { 
		Variate deVar = new Variate(null, 0, null);
		CaesarEncryption  deCaesar = new CaesarEncryption();
			System.out.println("\t成功进入凯撒解密\n请输入解密内容:");
			deVar.setContent(extracted().nextLine());// 从控制台获取内容
			System.out.println("请输入密钥：");
			deVar.setNumber(extracted().nextInt());
			int key=deVar.getNumber();
			deCaesar.decryption(deVar.getContent(),key);//调用解密方法
	}
	public static void encryption() { 
		Variate enVar = new Variate(null, 0, null);
		CaesarEncryption  enCaesar = new CaesarEncryption();
			System.out.println("\t成功进入凯撒加密\n请输入加密内容：");
			enVar.setContent(extracted().nextLine());
			System.out.println("请输入密钥:");
			enVar.setNumber(extracted().nextInt());
			int key = enVar.getNumber();//将输入项转换成int类型
			enCaesar.encryption(enVar.getContent(),key);//调用加密方法
	}
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	@Override 
	public void encryption(String str, int keyEn) {
		// TODO Auto-generated method stub
		//加密
		String string="";
		for (int i = 0;i < str.length();i++) {
			char aChar = str.charAt(i);
			if (aChar >= 'a' && aChar <= 'z')//如果字符串中的某个字符是小写字母
			{
				aChar = (char)(aChar+(keyEn%26));//移动key%26位
				if (aChar < 'a') {
					aChar=(char)(aChar+26);
				}if (aChar > 'z') {	
					aChar=(char)(aChar-26);
				}
			}else if(aChar >= 'A' && aChar<= 'Z')//如果字符串中的某个字符是大写字母
			{
				aChar = (char)(aChar+(keyEn%26));//移动key%26位
				if (aChar < 'A') {
					aChar = (char)(aChar+26);
				} if (aChar > 'Z') {
					aChar = (char)(aChar-26);
					}
				}else{
				if (aChar >= '0' && aChar <= '9') {//如果字符串中的某个字符是数字
					aChar = (char)(aChar+(keyEn%10));//移动key%10位
					if(aChar < '0') {
						aChar = (char)(aChar+10);
					}
					if (aChar > '9') {
						aChar = (char)(aChar-10);	
					}
				}
			}
			string +=aChar;//将解密后的字符连成字符串
		}
		System.out.println(str + "加密后为：" + string + "\n*******************程序结束********************");		
	}
	@Override
	public void decryption(String str, int n) {
		//解密
		int keyDe=Integer.parseInt("-"+n);
		String string="";
		for(int i = 0;i < str.length();i++) {
			char aChar = str.charAt(i);
			if (aChar >= 'a' && aChar <= 'z')//如果字符串中的某个字符是小写字母
			{
				aChar = (char)(aChar+(keyDe%26));//移动key%26位
				if (aChar < 'a') {
					aChar = (char)(aChar+26);
				}if (aChar > 'z') {	
					aChar = (char)(aChar-26);
				}
			}else if(aChar >= 'A' && aChar<= 'Z')//如果字符串中的某个字符是大写字母
			{
				aChar = (char)(aChar+(keyDe%26));//移动key%26位
				if (aChar < 'A') {
					aChar = (char)(aChar+26);
				} if (aChar > 'Z') {
					aChar = (char)(aChar-26);
					}
				}else{
				if (aChar >= '0' && aChar <= '9') {//如果字符串中的某个字符是数字
					aChar = (char)(aChar+(keyDe%10));//移动key%10位
					if(aChar < '0') {
						aChar = (char)(aChar+10);
					}
					if (aChar > '9') {
						aChar = (char)(aChar-10);	
					}
				}
			}
			string += aChar;//将解密后的字符连成字符串
		}	
		System.out.println(str + "解密后为：" + string + "\n*******************程序结束********************");	//输出到控制台
	}
}
