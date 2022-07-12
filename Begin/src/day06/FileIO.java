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

public class FileIO {

	private static String contents;

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("명령줄 인수로 읽을 파일 명을 입력하세요");
			System.out.println("[예] C:~~~myjava");
			
			
			return;
		}
			String fileName=args[0];
			
			System.out.println("읽을 파일명: "+fileName);
			try {
			String contents=FileIO.reading(fileName);
			System.out.println(contents);
			
			}catch (IOException e) {
				System.out.println("파일 읽는 중 예외 발생: "+e.getMessage());
			}
				
			
			
			
	}

	public static String reading(String fname)
	throws FileNotFoundException, IOException
	{
		FileReader fr=null;
		
		char[] date=new char[1000];
		
	
			fr=new FileReader(fname);//FileNotFoundException발생
			//파일과 노드 연결
			
			fr.read(date, 0, 1000); //IOException
			//파일을 읽어서 char타입 배열 data에 담아준다
			
			fr.close();//IOException 
			//노드 연결 끊기
			
			String data = null;
			//파일 내용은 data배열에 담긴다 --> 문자열로 만들자
			String contents=new String(data);
	
	
		return contents;
		}
	}