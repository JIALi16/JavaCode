package com.pa.util;

import java.util.Scanner;
import com.pa.entity.Variate; 

public class CaesarEncryption implements Encryption{
	public static void decryption() { 
		Variate deVar = new Variate(null, 0, null);
		CaesarEncryption  deCaesar = new CaesarEncryption();
			System.out.println("\t�ɹ����뿭������\n�������������:");
			deVar.setContent(extracted().nextLine());// �ӿ���̨��ȡ����
			System.out.println("��������Կ��");
			deVar.setNumber(extracted().nextInt());
			int key=deVar.getNumber();
			deCaesar.decryption(deVar.getContent(),key);//���ý��ܷ���
	}
	public static void encryption() { 
		Variate enVar = new Variate(null, 0, null);
		CaesarEncryption  enCaesar = new CaesarEncryption();
			System.out.println("\t�ɹ����뿭������\n������������ݣ�");
			enVar.setContent(extracted().nextLine());
			System.out.println("��������Կ:");
			enVar.setNumber(extracted().nextInt());
			int key = enVar.getNumber();//��������ת����int����
			enCaesar.encryption(enVar.getContent(),key);//���ü��ܷ���
	}
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	@Override 
	public void encryption(String str, int keyEn) {
		// TODO Auto-generated method stub
		//����
		String string="";
		for (int i = 0;i < str.length();i++) {
			char aChar = str.charAt(i);
			if (aChar >= 'a' && aChar <= 'z')//����ַ����е�ĳ���ַ���Сд��ĸ
			{
				aChar = (char)(aChar+(keyEn%26));//�ƶ�key%26λ
				if (aChar < 'a') {
					aChar=(char)(aChar+26);
				}if (aChar > 'z') {	
					aChar=(char)(aChar-26);
				}
			}else if(aChar >= 'A' && aChar<= 'Z')//����ַ����е�ĳ���ַ��Ǵ�д��ĸ
			{
				aChar = (char)(aChar+(keyEn%26));//�ƶ�key%26λ
				if (aChar < 'A') {
					aChar = (char)(aChar+26);
				} if (aChar > 'Z') {
					aChar = (char)(aChar-26);
					}
				}else{
				if (aChar >= '0' && aChar <= '9') {//����ַ����е�ĳ���ַ�������
					aChar = (char)(aChar+(keyEn%10));//�ƶ�key%10λ
					if(aChar < '0') {
						aChar = (char)(aChar+10);
					}
					if (aChar > '9') {
						aChar = (char)(aChar-10);	
					}
				}
			}
			string +=aChar;//�����ܺ���ַ������ַ���
		}
		System.out.println(str + "���ܺ�Ϊ��" + string + "\n*******************�������********************");		
	}
	@Override
	public void decryption(String str, int n) {
		//����
		int keyDe=Integer.parseInt("-"+n);
		String string="";
		for(int i = 0;i < str.length();i++) {
			char aChar = str.charAt(i);
			if (aChar >= 'a' && aChar <= 'z')//����ַ����е�ĳ���ַ���Сд��ĸ
			{
				aChar = (char)(aChar+(keyDe%26));//�ƶ�key%26λ
				if (aChar < 'a') {
					aChar = (char)(aChar+26);
				}if (aChar > 'z') {	
					aChar = (char)(aChar-26);
				}
			}else if(aChar >= 'A' && aChar<= 'Z')//����ַ����е�ĳ���ַ��Ǵ�д��ĸ
			{
				aChar = (char)(aChar+(keyDe%26));//�ƶ�key%26λ
				if (aChar < 'A') {
					aChar = (char)(aChar+26);
				} if (aChar > 'Z') {
					aChar = (char)(aChar-26);
					}
				}else{
				if (aChar >= '0' && aChar <= '9') {//����ַ����е�ĳ���ַ�������
					aChar = (char)(aChar+(keyDe%10));//�ƶ�key%10λ
					if(aChar < '0') {
						aChar = (char)(aChar+10);
					}
					if (aChar > '9') {
						aChar = (char)(aChar-10);	
					}
				}
			}
			string += aChar;//�����ܺ���ַ������ַ���
		}	
		System.out.println(str + "���ܺ�Ϊ��" + string + "\n*******************�������********************");	//���������̨
	}
}
