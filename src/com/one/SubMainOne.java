package com.one;

public class SubMainOne extends SuperMain {
	int sf1 = 4000;
	/*
	int f1 = 200;
	String f2 = "둥이";
	
	public int numCalcu(int numData);{
		return this.f1 + numData;//this.f1 SuperMain에 있는 f1 반환
	}
	public void namePrint() {
		System.out.println(this.f2);
	}	
	*/	
	
	public void myDataPrint() {
		System.out.println(sf1 + f1);
	}
	
	@Override
	public void namePrint() {
		super.namePrint();//아버지 기능도 쓰고 부가적 기능 추가할게!
		System.out.println(this.f2);
		System.out.println("백둥이");
		System.out.println("그묘일조아");
	}
	
	
	public void namePrint(String data) {//overloading. 아버지한테 받은 것에서 매개변수 추가해서 형식이 달라짐
		System.out.println(data/*this.f2*/);
		System.out.println("백둥이");
		System.out.println("그묘일조아");
	}
	
}
