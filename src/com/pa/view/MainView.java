/*
 * #Time:2020/10/7
 * #Author:3120004699
 * #Eclipse
 * #Name:��������&MD5
 */
package com.pa.view;

import java.util.Scanner;
import com.pa.dao.TimeData;
import com.pa.entity.Variate;
import com.pa.util.CaesarEncryption;
import com.pa.util.Md5Encryption;

public class MainView {
	public static void main(String[] args) { 
	System.out.println("\n\t ��ӭʹ�üӽ��ܹ���1.0��  \n");
	TimeData.timeData();// �����ǰʱ��
	System.out.println("********************************************");
	System.out.println("\tѡ����ܻ��߽���\n[A.����][B.����],������һ����ĸ(֧�ִ�Сд)");	
	boolean con = true;
	do {		
		Scanner mainInput = new Scanner(System.in);  // ��д����	
		Variate mainVar = new Variate(null, 0, null);
		mainVar.setContent(mainInput.nextLine());;
		switch(mainVar.getContent()) {
		case "a":
			// ���ܽ���
			encryption();
			mainInput.close();
			con = true;
			break;
		case "A":	
			// ���ܽ���
			encryption();
			mainInput.close();
			con = true;
			break;
		case "b":	
			// ���ܽ���
			decryption();
			mainInput.close();
			con = true;
			break;
		case "B":	
			// ���ܽ���
			decryption();
			mainInput.close();
			con = true;
			break;	
		default:
			System.out.println("����������������룺");
			mainInput.close();
			con = false;	
			}
		}while(con != true);
	}
	private static void decryption() {
		System.out.println("\tѡ����ܹ���\n[A.��������][B.MD5����],������һ����ĸ(֧�ִ�Сд)");
		boolean con3 = true;
		do {
			Scanner deInput = new Scanner(System.in);// ��д����	
			Variate deVar = new Variate(null, 0, null);
			deVar.setContent(deInput.nextLine());;
			switch(deVar.getContent()) {
			case "a":
				// �������ܽ���
				CaesarEncryption.decryption();
				con3 = true;
				deInput.close();
				break;
			case "A":	
				// �������ܽ���
				CaesarEncryption.decryption();
				deInput.close();
				con3 = true;
				break;
			case "b":	
				// MD5���ܽ���
				Md5Encryption.md5De();
				deInput.close();
				con3 = true;
				break;
			case "B":	
				// MD5���ܽ���
				Md5Encryption.md5De();
				deInput.close();
				con3 = true;
				break;	
			default:
				System.out.println("����������������룺");
				deInput.close();
				con3 = false;
				}
		}while(con3 != true);
	}
	public static void encryption() {
		
		System.out.println("\tѡ����ܹ���\n[A.��������][B.MD5����],������һ����ĸ(֧�ִ�Сд)");
		boolean con2 = true;
		do {			
			Scanner enIntput = new Scanner(System.in);
			String command = enIntput.nextLine();
			switch(command) {
			case "a":
				// �������ܽ���
				CaesarEncryption.encryption();
				enIntput.close();
				con2 = true;
				break;
			case "A":	
				// �������ܽ���
				CaesarEncryption.encryption();
				enIntput.close();
				con2 = true;
				break;
			case "b":	
				// MD5���ܽ���
				Md5Encryption.md5En();
				enIntput.close();
				con2 = true;
				break;
			case "B":	
				// MD5���ܽ���
				Md5Encryption.md5En();
				enIntput.close();
				con2 = true;
				break;	
			default:
				System.out.println("����������������룺");
				enIntput.close();
				con2 = false;	
			}
		}while(con2 != true);
	}

}
