package Kpop;

import java.io.*;

public class IdolTest {
	public static void main(String[] args) throws IOException {
		String[] boy_group = {"BTS","Seventeen","StrayKids","NCT",};//보이그룹 1-4위
		String[] girl_group = {"NewJeans","BlackPink","RedVelvet","Twice"};//걸그룹 1-4위
		
		System.out.println("kpop을 주도하는 아이돌의 브랜드 평판 순위입니다.");
		
		for(int i=0; i<boy_group.length; i++) {
			int num = i+1;
			System.out.println(num + "위 : " +boy_group[i]);//보이그룹 출력
		}
		for(int j=0; j<girl_group.length; j++) {
			int num = j+1;
			System.out.println(num + "위 : " + girl_group[j]);//걸그룹출력
		}
		
		System.out.println("그 중 BTS가 브랜드 평판지수 12,276,480으로 전체에서 압도적 1위를 했습니다!!");
		Details detail = new Details();
		detail.MemberName();
		
		OutputStreamEx out = new OutputStreamEx();// 좋아하는 아이돌 작성
		out.method1();
		InputStreamEx in = new InputStreamEx();
		in.method2();

	}
}
