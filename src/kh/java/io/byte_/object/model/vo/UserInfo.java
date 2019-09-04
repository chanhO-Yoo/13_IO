package kh.java.io.byte_.object.model.vo;

import java.io.Serializable;

/*
 * 객체 단위로 파일에 읽고 쓰는 ObjcetInput/OutputStream을 사용하려면.
 * 해당클래스는 반드시 Serializable(직렬화) 인터페이스를 구현해야함.
 * 
 */
public class UserInfo implements Serializable{
	private static final long serialversionUID = 1L;
	
	private String name;
	private String password;
	private int age;
	
	public UserInfo() {
		
	}
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+", "+password+", "+age;
	}
	
	
}
