package kh.java.io.byte_.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kh.java.io.byte_.object.model.vo.UserInfo;

public class ObjectIOTest {
	public static void main(String[] args) {
		ObjectIOTest o = new ObjectIOTest();
		o.test1();
		o.test2();
	}
	
	/*
	 * 사용자 정의 객체 파일에 쓰기
	 */
	public void test1() {
		UserInfo[] arr = new UserInfo[10];
		
		UserInfo u1 = new UserInfo("홍길동", "1234", 300);
		UserInfo u2 = new UserInfo("신사임당", "5678", 50);
		
		arr[0]=u1;
		arr[1]=u2;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		//ObjectOutputStream 보조스트림 제어
		
		try {
			fos = new FileOutputStream("object/userInfo.ser");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			/*oos.writeObject(u1);
			oos.writeObject(u2);*/
			
			//객체배열로 저장
			oos.writeObject(arr);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void test2() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		UserInfo[] arr = null;
//		UserInfo u1 = null;
//		UserInfo u2 = null;
		
		try {
//			fis = new FileInputStream("object/userInfo.ser");
//			bis = new BufferedInputStream(fis);
//			ois = new ObjectInputStream(bis);		}
			
			ois = new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream("object/userInfo.ser")));

//			u1 = (UserInfo)ois.readObject();
//			u2 = (UserInfo)ois.readObject();
			
//			System.out.println("u1 = "+u1);
//			System.out.println("u2 = "+u2);
			arr = (UserInfo[])ois.readObject();
			
			for(UserInfo u : arr) {
				System.out.println(u);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				ois.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
