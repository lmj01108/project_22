package Enterprise;

public class Hyundai_motors implements Company{//인터페이스 다형성 구현
	@Override
	public void history() {
		System.out.println("현대자동차의 업력은 56년차 입니다.");
		System.out.println("설립일: 1967년 12월 29일");
	} // 기업 업력
	public void scale() {
		System.out.println("기업형태: 대기업");
	} //기업의 규모
	public void subsidiary() {
		System.out.println("계열사: 54개");
	}//계열사
}
