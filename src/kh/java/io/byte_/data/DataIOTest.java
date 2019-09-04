package kh.java.io.byte_.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileInput/OutputStream 주스트림으로
 * DataInput/OutputStream 보조스트림으로 처리함
 * 
 * 자바 기본형별로 읽고 쓰기가 가능한 스트림
 */
public class DataIOTest {
	public static void main(String[] args) {
		DataIOTest d = new DataIOTest();
		d.test1();
		d.test2();
	}
	
	public void test1() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("data/sample.dat");
			dos = new DataOutputStream(fos);
			
			dos.writeBoolean(true);
			dos.writeInt(1000);
			dos.writeDouble(99.9);
			dos.writeChar('아');
			dos.writeChar('안');
			dos.writeChar('녀');
			dos.writeChar('엉');
			dos.writeUTF("안녕");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void test2() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("data/sample.dat");
			dis = new DataInputStream(fis);
			
			//쓰기작업한 순서대로 읽어와야 한다.
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
