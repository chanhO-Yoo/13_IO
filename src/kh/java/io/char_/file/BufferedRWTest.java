package kh.java.io.char_.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRWTest {
	public static void main(String[] args) {
		BufferedRWTest b = new BufferedRWTest();
		b.test1();
	}
	
	/*
	 * 보조스트림 : 주스트림의 성능향상을 목적으로 추가해서 사용함.
	 * char단위가 line단위 처리가 가능하다.
	 * 자원반납시 보조스트림만 반납하면, 주스트림은 자동으로 반납된다.
	 * 
	 * BufferReder
	 * BufferWriter
	 */
	public void test1() {
		FileReader fr = null;
		BufferedReader br = null;
		String fileName = "src/kh/java/io/char_/file/BufferedRWTest.java";

		FileWriter fw = null;
		BufferedWriter bw = null;
		String newFile = "char/BufferedRWTestCopy.java";
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(newFile);
			bw = new BufferedWriter(fw);
			
			String data = "";
			int lineNum = 0;
			
			//더이상 내용이 없을때, readLine()은 null을 리턴
			while((data=br.readLine())!=null) {
				System.out.println(++lineNum + " : " + data);
				bw.write(data+"\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
