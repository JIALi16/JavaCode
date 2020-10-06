/*
 * #Time:2020/10/7
 * #Author:3120004699
 * #Eclipse
 * #Name:凯撒密码&MD5
 */
package com.pa.view;

import java.util.Scanner;
import com.pa.dao.TimeData;
import com.pa.entity.Variate;
import com.pa.util.CaesarEncryption;
import com.pa.util.Md5Encryption;

public class MainView {
	public static void main(String[] args) { 
	System.out.println("\n\t 欢迎使用加解密工具1.0版  \n");
	TimeData.timeData();// 输出当前时间
	System.out.println("********************************************");
	System.out.println("\t选择加密或者解密\n[A.加密][B.解密],请输入一个字母(支持大小写)");	
	boolean con = true;
	do {		
		Scanner mainInput = new Scanner(System.in);  // 读写数据	
		Variate mainVar = new Variate(null, 0, null);
		mainVar.setContent(mainInput.nextLine());;
		switch(mainVar.getContent()) {
		case "a":
			// 加密界面
			encryption();
			mainInput.close();
			con = true;
			break;
		case "A":	
			// 加密界面
			encryption();
			mainInput.close();
			con = true;
			break;
		case "b":	
			// 解密界面
			decryption();
			mainInput.close();
			con = true;
			break;
		case "B":	
			// 解密界面
			decryption();
			mainInput.close();
			con = true;
			break;	
		default:
			System.out.println("输入错误，请重新输入：");
			mainInput.close();
			con = false;	
			}
		}while(con != true);
	}
	private static void decryption() {
		System.out.println("\t选择解密规则\n[A.凯撒解密][B.MD5解密],请输入一个字母(支持大小写)");
		boolean con3 = true;
		do {
			Scanner deInput = new Scanner(System.in);// 读写数据	
			Variate deVar = new Variate(null, 0, null);
			deVar.setContent(deInput.nextLine());;
			switch(deVar.getContent()) {
			case "a":
				// 凯撒解密界面
				CaesarEncryption.decryption();
				con3 = true;
				deInput.close();
				break;
			case "A":	
				// 凯撒解密界面
				CaesarEncryption.decryption();
				deInput.close();
				con3 = true;
				break;
			case "b":	
				// MD5解密界面
				Md5Encryption.md5De();
				deInput.close();
				con3 = true;
				break;
			case "B":	
				// MD5解密界面
				Md5Encryption.md5De();
				deInput.close();
				con3 = true;
				break;	
			default:
				System.out.println("输入错误，请重新输入：");
				deInput.close();
				con3 = false;
				}
		}while(con3 != true);
	}
	public static void encryption() {
		
		System.out.println("\t选择加密规则\n[A.凯撒加密][B.MD5加密],请输入一个字母(支持大小写)");
		boolean con2 = true;
		do {			
			Scanner enIntput = new Scanner(System.in);
			String command = enIntput.nextLine();
			switch(command) {
			case "a":
				// 凯撒加密界面
				CaesarEncryption.encryption();
				enIntput.close();
				con2 = true;
				break;
			case "A":	
				// 凯撒加密界面
				CaesarEncryption.encryption();
				enIntput.close();
				con2 = true;
				break;
			case "b":	
				// MD5加密界面
				Md5Encryption.md5En();
				enIntput.close();
				con2 = true;
				break;
			case "B":	
				// MD5加密界面
				Md5Encryption.md5En();
				enIntput.close();
				con2 = true;
				break;	
			default:
				System.out.println("输入错误，请重新输入：");
				enIntput.close();
				con2 = false;	
			}
		}while(con2 != true);
	}

}
