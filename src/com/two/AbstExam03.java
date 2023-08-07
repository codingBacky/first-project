package com.two;

public abstract class AbstExam03 {
	public void inamePrint(String irum) {
		System.out.println(irum + "님 환영합니다.\n오늘도 행복한\t날로 채우세요^^");
	}
	public abstract void stringPrint(String[] str);//자유도가 높지만[](앞에와도 되고 뒤에와도 됨) 배열 형태로 받아야함.
	public abstract void intPrint( int ... intData);//자유도는 낮지만 (몇개가 올지 모르니까 마지막에 와야함) 사용자는 정보를 주기 편함


}
