package com.two;

public abstract class Calcu {//추상클래스 메서드의 이름을 강제성 가지게함 
	public abstract double area(double... data);//반드시 이 메서드를 사용해야한다.
	//실수형 타입 자료 1~3개를  배열로 받겠다... 가변데이터를 받을때 사용
	//이 사용법만 보고 사용하면 어떻게 만들어질지 신경쓰지 않아도 되는 장점이 있다.
	//정형화된 틀 안에서 사용가능
	//하위클래스에서 구현 해줘야 사용가능
}
