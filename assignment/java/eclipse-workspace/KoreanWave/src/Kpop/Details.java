package Kpop;

public class Details extends Idol{// 자식 클래스 (다형성 - 오버라이딩)
	@Override
	void MemberName() {
		System.out.println("멤버 이름을 출력합니다.");
		System.out.println("정국, 지민, 뷔, 슈가, RM, 진, 제이홉");
	}
}
