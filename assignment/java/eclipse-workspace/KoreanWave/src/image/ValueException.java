package image;

import java.util.*;

public class ValueException {
	
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	
	public void input() {
	
	while(true) {
		try {
			System.out.println("1위부터 5위 중 알고 싶은 순위를 입력하세요");
			num = scanner.nextInt();
		} catch (InputMismatchException error) {
			System.out.println("범위 내 올바른 정수 값을 입력해주세요.");
			num = scanner.nextInt();
		}
		scanner.close();
	} // while 문 닫기
} // input 함수 닫기
	public static void main(String[] args) {
		
	}
}
