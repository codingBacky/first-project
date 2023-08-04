package com.one;

public class SubConstructorExam extends ConstructorExam{
	public SubConstructorExam() {
		//super(); 오류, 상속 불가
		super(10,20);// 정의해놓은 형태로만 쓸 수 있음, 기본 생성자를 만들어라.
	}

}
