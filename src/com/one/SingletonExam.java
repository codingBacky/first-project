package com.one;

public class SingletonExam {
		
		public int data = 350000;
		
//여기서부터
		
	    private static SingletonExam instance = new SingletonExam();
	    private SingletonExam() {
	        // 생성자는 외부에서 호출 못하게 private 으로 지정해야 한다.
	    }
	    

	    public static SingletonExam getInstance() {//필드를 반환하게 한다. static instance정적필드 => static정적 메서드로 받아줘야 한다.
	        return instance;//이미 만들어진 객체를 가져다 쓴다.
	    }
//여기까지가 이 클래스를 이용해서 생성되는 객체는 오직 하나 뿐이다. 싱글톤 디자인 패턴
//메모리 낭비를 줄인다. 다른곳에서 데이터를 바꿔버릴 수 있다.
//쓰고싶다면 스프링에서 제공되는 싱글톤을 사용해라.
	    
	    
	    public void printData() {
	    	System.out.println("아무거나");
	    	System.out.println(data);
	    }

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	
}
