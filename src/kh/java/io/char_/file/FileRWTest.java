package kh.java.io.char_.file;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWTest {

	public static void main(String[] args) {
		FileRWTest f = new FileRWTest();
		f.test1();
	}
	
	/**
	 * 바이트기반 스트림
	 * 문자기반 스트림
	 */
	public void test1() {
		String fileName = "char/fileRWTest.txt";//프로젝트루트로부터의 경로+파일명
		FileInputStream fis = null;
		FileReader fr = null;
		FileWriter fw = null;
		String newFile = "char/fileRWTestCopy.txt";
		
		try {
			fis = new FileInputStream(fileName);
			fr = new FileReader(fileName);
			fw = new FileWriter(newFile);
			
			int data = 0;
			
			/*while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}*/
			
			while((data=fr.read())!=-1) {
				//콘솔출력
				System.out.print((char)data);
				
				//파일출력
				fw.write(data);
				//구분자추가
				fw.write(58);
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();			
		}finally {
			try {
				fis.close();
				fr.close();
				fw.close();//자원반납시, 내부 버퍼에 대해 flush()작업!
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}






