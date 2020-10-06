package com.pa.util;

import java.util.Scanner;
import com.pa.entity.Variate;
import java.security.MessageDigest;  

public class Md5Encryption implements Encryption{  
	public static void md5En() {		
	    Variate md5EnVar = new Variate(null, 0, null);
	    Md5Encryption md5Encryption = new Md5Encryption();
		System.out.println("\t�ɹ�����MD5����\n�������������:");
		Scanner md5EnInput = new Scanner(System.in);
		md5EnVar.setContent(md5EnInput.nextLine());	
		md5Encryption.encryption(md5EnVar.getContent(),1);// ���ü��ܷ���
		md5EnInput.close();
	}  
	public static void md5De() {  
		Variate md5DeVar = new Variate(null, 0, null);
		Md5Encryption md5Decryption = new Md5Encryption();
		System.out.println("\t�ɹ�����MD5����\n�������������:");
		Scanner md5DeInput = new Scanner(System.in);
		md5DeVar.setContent(md5DeInput.nextLine());	
		md5Decryption.decryption(md5DeVar.getContent(),1);// ���ý��ܷ���
		md5DeInput.close();
    }  
	// ʵ�ֽӿ�
    @Override 
    public void  encryption(String str, int keyEn) {
    	MessageDigest md5 = null;  // MD5����
        try{ 
            md5 = MessageDigest.getInstance("MD5"); 
        }catch (Exception e){  
            System.out.println(e.toString());  
            e.printStackTrace();  
        }  
        char[] charArray = str.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i];  
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++){  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        System.out.println("���ܺ�Ϊ��" + hexValue.toString() + "\n*******************�������********************");
    }
    @Override 
    public void  decryption (String str, int keyDe) {
    	try{
    		int c = 1/0;       // MD5�޷�����    
        }catch (Exception e){  
            System.out.println("UnsupportedOperationException\n" + "\tMD5 �㷨�޷�����" + "\n*******************�������********************");  
            e.printStackTrace();  
        }  
    }

}  


   