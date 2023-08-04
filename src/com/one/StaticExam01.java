package com.one;
/*
public static class StaticExam01 {//클래스에는 붙일 수 없다.

}
*/
public class StaticExam01 {//클래스에는 붙일 수 없다.
	public static int aaa =300;//static 바로 쓸 수 있음
	public long bbb = 5000L;//new에 의해 생성되어야 (메모리에 올라와야)쓸 수 있음
	public static final int DDD =10;
	public void maa() {
		System.out.println(bbb);
		System.out.println(aaa);
	}
	public static void amaa() {//이 메서드는 new에 의해 객체가 생성되기 전에 메모리에 만들어짐, 오류
		System.out.println(bbb);
	}
}
class ExamA{
	public void aExam() {
		System.out.println(StaticExam01.aaa);
	}
}