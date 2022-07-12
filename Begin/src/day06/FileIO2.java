package day06;
/* Exception
 * 		+------IOException
 * 					+-------FileNotFoundException
 * 
 * [1]try ~ catch로 발생한 예외를 처리하세요
 * [2]throws로 예외 선언
 * */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO2 {

	private static String contents;

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("명령줄 인수로 읽을 파일 명을 입력하세요");
			System.out.println("[예] C:\\myjava\\day01\\Hello.java");
			
			
			return;
		}
			String fileName=args[0];
			System.out.println("읽을 파일명: "+fileName);
			String contents=FileIO2.reading(fileName);
			System.out.println(contents);
			
			
	}

	public static String reading(String fname)
	{
		try{
			FileReader fr=null;
			
			char[] data = new char[1000];
			
			fr = new FileReader(fname);	//FileNotFoundException 발생
			//파일과 노드 연결
			
			fr.read(data, 0, 1000);		//IOException 발생
			//파일을 읽어서 char타입 배열 data에 담아준다
			
			fr.close();
			//노드 연결 끊기
			
			//파일 내용은 data 배열에 담긴다. ==> 문자열로 만들자
			String contents = new String(data);
			
			return contents;
		} catch(FileNotFoundException e) {
			System.out.println("찾을 수 없는 파일입니다.");
		} catch(IOException e) {
			System.out.println("IOException");
		}
		return fname;
		
	}

		
	}
	

		

	

