package twoInter;

public interface InterExam01Sub extends InterExam01{
	default void printAge(int age) {
		System.out.printf("당신의 나이는 %d세입니다.\n", age);
	}//깜빡하고 못만든거 추가함. 필요하면 불러다 쓰고 원래대로 쓰던 사람은 그냥 써도 되고
	//public abstract (시그니처->)void printName(String iname); 부모로 부터 물려받은 추상메서드
	void printAddr(String addr);

}
