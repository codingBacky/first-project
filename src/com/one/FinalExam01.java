package com.one;

public class FinalExam01 {//클래스는 final이 아니다..
	public final int k ;//k = 10 초기값을 지정해줌 생성자를 통해서 값을 변경할 수 없다.
	//상수처럼 쓸거면 static을 붙여서 쓰는거야!!
	final public long abc;//필드이기 때문에 만들어지지 않은 상태 => 생성자를 통해서 만들어진다.
	public String myName;
	
	public FinalExam01() {//기본생성자
		k = 10;
		abc = 500;
	}
	public FinalExam01(int aaa ,int data) {
		k = aaa;
		abc = data;
	}

}
//FinalExam01 가 = FinalExam01(); 가.abc = 500, 가.k => 10
//FinalExam01 나 = FinalExam01(200, 15000); 나.abc=> 15000, 나.k = 200
