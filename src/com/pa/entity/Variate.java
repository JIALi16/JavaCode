package com.pa.entity;

public class Variate {
	private String choose;  // 用于保存用户选择
	private int number;  // 用于保存密钥
	private String content;  // 用于保存加密或者解密内容
	
	public Variate(String choose, int invalid, String content) {
		super();
		this.choose = choose;
		this.number = invalid;
		this.content = content;
	}
	public String getChoose() {
		return choose;
	}
	public void setChoose(String choose) {
		this.choose = choose;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int string) {
		this.number = string;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Variate [choose=" + choose + ", number=" + number + ", content=" + content + "]";
	}
	
}
