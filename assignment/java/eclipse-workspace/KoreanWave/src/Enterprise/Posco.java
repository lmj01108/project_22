package Enterprise;

public class Posco implements Company{//인터페이스 다형성 구현
	@Override
	public void history() {
		System.out.println("포스코의 업력은 41년차 입니다.");
		System.out.println("설립일: 1982년 2월 2일");
	} // 기업 업력
	public void scale() {
		System.out.println("기업형태: 대기업");
	} //기업의 규모
	public void subsidiary() {
		System.out.println("계열사: 40개");
	}//계열사
}
