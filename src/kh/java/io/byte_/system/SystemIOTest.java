package kh.java.io.byte_.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * System.in : 표준 입력 - 사용자의 키보드 입력
 * System.out : 표준 출력 - 콘솔 출력
 * 
 * System.in은 사용자 입력을 기다리는 block상태에 있다가,
 * 사용자가 enter키를 누르면 내부퍼에 있는 입력데이터를 읽기 시작한다.
 * 모두 읽으면 다시 입력 대기 상태가 된다.
 * 
 */
public class SystemIOTest {
	public static void main(String[] args) {
		SystemIOTest s = new SystemIOTest();
//		s.test1();
		s.test2();
	}
	
	public void test1() {
		//바이트 단위로 입력스트림이 읽어온 값을 리턴
		//256가지 경우의 수를 읽고, -1(값없음)을 표현하기
		//byte보다 큰 단위인 int타입 이용
		
		int input = 0;
		System.out.println("아무 글자 입력 후 엔터를 치세요 : ");
		
		/*
		 * -1을 리턴
		 * 윈도우 cmd : ctrl + c
		 * 이클립스 : ctrl + z
		 * 맥/리눅스 : ctrl + d 
		 */
		try {
			while((input=System.in.read())!=-1) {
				System.out.println("input : "+input+", (char)input : "+(char)input);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//자원반납
//			System.in.close();
//			System.out.close();
			
			//표준입출력스트림은 다른 스트림과 다르게
			//한번 닫으면 프로그램 종료시까지 사용할 수 없으므로,
			//반납코드를 작성하지 않는다.
		}
	}
	
	/*
	 * System.in : 주스트림
	 * InputStreamReader : 브릿지스트림 - 1byte -> 2byte
	 * (스트림은 바이트 단위 이지만 문자(char)의 경우 2바이트로 구성)
	 * -> 두개를 연결하는 스트림
	 * BufferedReader : 보조스트림
	 */
	public void test2() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line = "";
		
		try {
			while((line=br.readLine())!=null) {
				System.out.println("input : "+line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//최종 보조 스트림만 자원 반납
			try {
				br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
	}
}
