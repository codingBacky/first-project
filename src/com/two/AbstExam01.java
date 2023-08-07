package com.two;

public abstract class AbstExam01 {
	int numData;//인스턴스 필드 => 필드
	private int privateData;
	protected int protectedData;
	public int publicData;
	public void method1() {//인스턴스 메서드 => 메서드
		
	}
	public void method2() {//인스턴스 메서드 => 메서드
		
	}
}//인스턴스 필드와 인스턴스 메서드들로만 구성된 추상 클래스 => 거의 사용하지 않음
class SubAbstExam01 extends AbstExam01{
	/*int numData;//인스턴스 필드 => 필드
	public void method1() {//인스턴스 메서드 => 메서드
		
	}
	public void method2() {//인스턴스 메서드 => 메서드
		
	}
	물려받음
	*/
}
class AbstExam01Use{
	AbstExam01 obj = new SubAbstExam01();
	//AbstExam01 obj = new AbstExam01();//new AbstExam01() 바로 쓰기 불가능, 상속 받아서 쓸 수 있음
}
