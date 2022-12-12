package image;

import java.util.*;

public class Ranking {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int num = 0;//사용자에게 입력받을 숫자
		
		System.out.println("2022 해외 한류 소비자들의 한국 연상 이미지 top5를 알아보자!");
		System.out.println("1위부터 5위 중 알고 싶은 순위를 입력하세요. 종료를 원할시 000을 입력하세요.");
		
		List<String> rank = new ArrayList<String>();//순위 저장 리스크(프레임 워크)
		
		rank.add("k-pop");//1위
		rank.add("한식");//2위
		rank.add("드라마");//3위
		rank.add("한류스타");//4위
		rank.add("IT 제품 및 브랜드");//5위
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		boolean again = true;
		
		while(again) {
			System.out.println("1위부터 5위 중 알고 싶은 순위를 입력하세요. 종료를 원할시 000을 입력하세요.");
			if (num < 0 || num > 5) {//범위내 정수를 입력하지 않은 경우
				System.out.println("범위 내 올바른 정수 값을 입력해주세요.");
				num = scanner.nextInt();
			}
			else if(num == 0) {//함수 반복 종료
				again = false;
			}
		}//while문 종료
		scanner.close();
		
		ValueException in = new ValueException();//예외처리 - 다른 타입을 입력할 경우
	    in.input();
	    
		System.out.println(num + "위는" +rank.get(num-1)+"입니다.");//결과 출력
	}//함수종료

}
