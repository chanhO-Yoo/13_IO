package kh.java.io.byte_.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {
	public static void main(String[] args) {
		FileIOTest f = new FileIOTest();
		f.test1();
	}
	
	public void test1() {
		String fileName = "src/kh/java/io/byte_/file/FileIOTest.java";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File newFile = new File("FileIOTestCopy.java");
		
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream(newFile);
			
			int data = 0;
			
			while ((data=fis.read()) != -1) {
				//1byte씩 읽어온 데이터를 문자형으로 변환 후 출력
				System.out.print((char)data);
				
				//파일에 출력(쓰기)
				fos.write(data);
				fos.write(58); //아스키코드 58문자 ':'
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
