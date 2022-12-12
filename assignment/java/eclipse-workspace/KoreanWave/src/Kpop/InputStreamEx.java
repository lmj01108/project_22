package Kpop;

import java.io.*;

public class InputStreamEx {

	public void method2() {
		try{
	        //파일 객체 생성
	        File file = new File("c:/like.txt");
	         //입력 스트림 생성
	         FileReader file_reader = new FileReader(file);
	         int cur = 0;
	         while((cur = file_reader.read()) != -1){
	            System.out.print((char)cur);
	         }
	         file_reader.close();
	        }catch (FileNotFoundException e) {
	            e.getStackTrace();
	        }catch(IOException e){
	            e.getStackTrace();
	        }

	}

}
