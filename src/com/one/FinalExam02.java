package com.one;

public class FinalExam02 {
	public final void aaa() {
		System.out.println("fnffnfnffn");
	}
	public void bbb() {
		System.out.println("akakakaakak");
	}
}

class SubFinalExam02 extends FinalExam02 {
	/*
	public void aaa() {//부모의 메소드랑 같은이름인데 final이라 overriding못해 ㅠ
		System.out.println("이렇게 바꿀래");
	}
	*/
	@Override
	public void bbb() {//부모의 메소드랑 같은이름인데 final이라 overriding못해 ㅠ
		System.out.println("이렇게 바꿀래");
	}
	public void aaa(int k) {//다른 매개변수로 호출 함
		System.out.println("이렇게 바꿀래");
	}
}