package Enterprise;

public class Lotte implements Company{//인터페이스 다형성 구현
	@Override
	public void history() {
		System.out.println("롯데그룹의 업력은 56년차 입니다.");
		System.out.println("설립일: 1967년 3월 24일");
	} // 기업 업력
	public void scale() {
		System.out.println("기업형태: 대기업");
	} //기업의 규모
	public void subsidiary() {
		System.out.println("계열사: 89개");
	}//계열사
}
