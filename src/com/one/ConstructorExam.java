package com.one;

public class ConstructorExam {
	public int intField;
	public double doubleField;
	boolean booleanField;
	char charField;//null char
	public void printData() {
		System.out.println("intField = " + intField);
		System.out.println("doubleField = " + doubleField);
		System.out.println("booleanField = " + booleanField);
		System.out.println("charField = " + (int)charField);
	}
	public ConstructorExam(int intField, double doubleField) {//정의해서 기본 생성자 안만들어줌
		super();
		this.intField = intField;
		this.doubleField = doubleField;
		securityCheck();//권한 부여
		//intField = intField1;
		//doubleField = doubleField2;구분해줘야함
		
	}
	public ConstructorExam(int intField, double doubleField, boolean booleanField, char charField) {
		//super();기본생성자는 따로 만들어줬음
		this(intField, doubleField);//this 호출하면 기본 생성자 여기서 호출 못함
		this.booleanField = booleanField;
		this.charField = charField;
	}
	public ConstructorExam() {//기본생성자 만들어줌 ^.^
		this(20, 500);//생성이 되면서 ConstructorExam(int intField, double doubleField) 호출함. 반드시 입력해야할 값이 들어가게됨
		printData();//생성되면서 printData 호출함
	}
	public void securityCheck() {//보안의 권한 체크, 아무나 접근하지 못하도록 막아야 함
		if( intField > 100 ) {
			booleanField = true;
		}
	}

}
