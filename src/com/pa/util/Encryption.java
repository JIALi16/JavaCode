package com.pa.util;

public interface Encryption {
	public abstract void encryption(String str, int keyEn);  // 加密接口
	public abstract void decryption(String str, int keyDe);  // 解密接口
}
