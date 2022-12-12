package Kpop;

import java.io.*;
import java.util.*;

public class OutputStreamEx {

		public void method1() {
		Scanner scanner = new Scanner(System.in);//제일 좋아하는 아이돌 그룹을 입력하기 위함
		// TODO Auto-generated method stub
		try {
		    FileOutputStream output = new FileOutputStream("c:/like.txt");
		    String str = scanner.nextLine(); ;
		    byte[] by=str.getBytes();
		    output.write(by);
				
		} catch (Exception e) {
	            e.getStackTrace();
		}
		scanner.close();
	}
	
}