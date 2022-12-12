package Enterprise;

public class SK implements Company{//인터페이스 다형성 구현
	@Override
	public void history() {
		System.out.println("SK의 업력은 70년차 입니다.");
		System.out.println("설립연도: 1953");
	} // 기업 업력
	public void scale() {
		System.out.println("기업형태: 대기업");
	} //기업의 규모
	public void subsidiary() {
		System.out.println("계열사: 188개");
	}//계열사
}
