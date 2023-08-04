package com.one;

public class PackageExam {
	int data1 = 200;
	public int data2 = 1000;//직접 읽고 쓰기가 가능
	protected int data3 = 123;//상속해야 쓸 수 있음
	private int data4 = 123;
	private int data5 = 12345;
	//여기서만 쓸수 있음, 다른 클래스에서는 오직 값을 가져가는 것(메서드를 통해서)만 가능하다 => readOnly
	
	public int getData4() {
/*		if(권한체크) {
			return data4;
		}
		return 0;
*/
		return data4;
	}
	
	public int getData5() {
		return data5;
	}
	public void setData5(int data5) {
		this.data5 = data5;
	}
	
}
//접근 지정자, 접근 한정자, 접근 수정자 
//4개 => pubilc protected package(default, friendly) private 
//클래스에는 pubilc, package 접근 지정자만 사용할 수 있다.
//필드나 메서드는 4개의 접근 지정자를 사용할 수 있다.
//public은 누구나, package는 같은 폴더 안에서
//protected은 같은 폴더(package)안에서 쓸 수 있음, 다른 폴더에서는 상속을 받아서 사용할 수 있다.
//private은 같은 클래스 안에서만 사용할 수 있다. => 상속 되지 않는다.
class Aaaa{
	
}