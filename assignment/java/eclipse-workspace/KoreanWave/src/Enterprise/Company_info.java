package Enterprise;

import java.util.Scanner;

public class Company_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String name;//기업이름을 받을 변수
		System.out.println("한국을 대표하는 5개의 기업들을 소개합니다."); // 열거형 names에 있는 재용 출력
		names sort = names.Samsung;
		
		Scanner scanner = new Scanner(System.in);//회사 이름을 입력하기 위함
		name = scanner.nextLine();
		Company en1 = new Samsung();// 클래스 객체 선언
		Company en2 = new Hyundai_motors();
		Company en3 = new Lotte();
		Company en4 = new Posco();
		Company en5 = new SK();
		
		switch(name) {//각 회사 이름을 입력시 해당 클래스의 함수를 불러와 정보 출력
			case "Samsung":
				en1.history();
				en1.scale();
				en1.subsidiary();
				break;
			case "Hyundai_motors":
				en1.history();
				en1.scale();
				en1.subsidiary();
				break;
			case "Lotte":
				en1.history();
				en1.scale();
				en1.subsidiary();
				break;
			case "Posco":
				en1.history();
				en1.scale();
				en1.subsidiary();
				break;
			case "SK":
				en1.history();
				en1.scale();
				en1.subsidiary();
				break;
		}
		
	}

}
