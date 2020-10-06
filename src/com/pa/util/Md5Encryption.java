package com.pa.util;

import java.util.Scanner;
import com.pa.entity.Variate;
import java.security.MessageDigest;  

public class Md5Encryption implements Encryption{  
	public static void md5En() {		
	    Variate md5EnVar = new Variate(null, 0, null);
	    Md5Encryption md5Encryption = new Md5Encryption();
		System.out.println("\t成功进入MD5加密\n请输入加密内容:");
		Scanner md5EnInput = new Scanner(System.in);
		md5EnVar.setContent(md5EnInput.nextLine());	
		md5Encryption.encryption(md5EnVar.getContent(),1);// 调用加密方法
		md5EnInput.close();
	}  
	public static void md5De() {  
		Variate md5DeVar = new Variate(null, 0, null);
		Md5Encryption md5Decryption = new Md5Encryption();
		System.out.println("\t成功进入MD5解密\n请输入解密内容:");
		Scanner md5DeInput = new Scanner(System.in);
		md5DeVar.setContent(md5DeInput.nextLine());	
		md5Decryption.decryption(md5DeVar.getContent(),1);// 调用解密方法
		md5DeInput.close();
    }  
	// 实现接口
    @Override 
    public void  encryption(String str, int keyEn) {
    	MessageDigest md5 = null;  // MD5加密
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
        System.out.println("加密后为：" + hexValue.toString() + "\n*******************程序结束********************");
    }
    @Override 
    public void  decryption (String str, int keyDe) {
    	try{
    		int c = 1/0;       // MD5无法解密    
        }catch (Exception e){  
            System.out.println("UnsupportedOperationException\n" + "\tMD5 算法无法解密" + "\n*******************程序结束********************");  
            e.printStackTrace();  
        }  
    }

}  


   