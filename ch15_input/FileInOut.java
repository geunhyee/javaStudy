package ch15_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		String fileNm = "delay.txt";
		File textFile = new File(path +"/" + fileNm);
//		File textFile = new File(path +System.lineSeparator() + fileNm);	//해당 os에 맞게 경로를 넣겠다는의미
		//파일내용쓰기
		
		try {														// true는 파일이 있으면 append
																	//false는 다시씀
		
			FileOutputStream fos= new FileOutputStream(textFile,false);
			fos.write("팽수 늦음\n" .getBytes());
			fos.write("동길 늦음\n" .getBytes());
			fos.close(); 	//파일을 읽거나 쓸때는 꼭 닫아주기
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
			//파일 읽기
		
		try {
			FileInputStream fis= new FileInputStream(textFile);
			byte[] data = new byte[fis.available()];
			while(true) {
				int x = fis.read(data);
				if( x == -1) {
					break;
				}
				String result= new String(data);
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		
	}

	}
}
