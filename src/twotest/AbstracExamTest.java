package twotest;



import java.util.Date;

import org.junit.Test;

import com.two.AbstExam02;
import com.two.AbstExam03;
import com.two.Calcu;

import tow.Circle;
import tow.Rectangle;
import tow.Triangle;

public class AbstracExamTest {
	@Test
	public void exam02Test() {
			AbstExam02 obj = new AbstExam02() {//익명의 클래스{} 사용하면 클래스가 상속 받아서 AbstExam02()쓸 수 있어
			
			@Override
			public void abstMethod() {//메서드가 하나라면 이렇게 쓸수 있다.
				System.out.println("추상메서드의 내용을 구현함");
				
			}
		};//객체는 생성됨
		
		obj.abstMethod();//출력됨
	}
	@Test
	public void areacalcu() {
		Calcu cal = new Rectangle();//rr에게 사각형 면적을 구하는 프로그램 작성 지시
		System.out.println("사각형 면적 : " + cal.area(50,30));
		cal = new Triangle();//qq에게 삼각형 면적을 구하는 프로그램 작성 지시
		System.out.println("삼각형 면적 : " + cal.area(50,30));
		cal = new Circle();//zz에게 원형 면적을 구하는 프로그램 작성 지시
		System.out.println("원형 면적 : " + cal.area(50));
		System.out.println("----------------클래스가 많이지는 단점을 보완하기");
		cal = new Calcu() {//익명의 클래스 만들기, 추상 메서드 하나 일때만 사용, 두개 이상은 복잡해짐 
			
			@Override
			public double area(double... data) {
				return data[0] * data[1];
			}
		};
		System.out.println("사각형 면적 : " + cal.area(80,160));//클래스를 만들지 않고 사용가능
	}
	@Test
	public void abstExam03Test() {
		AbstExam03 obj = new AbstExam03() {
			
			@Override
			public void stringPrint(String[] str) {
				for( int i = 0; i < str.length; i++ ) {
					System.out.printf("%s님 반갑습니다\nHave a good day%s\n", str[i], 30);//형식지정문자%
				}
			}
			
			@Override
			public void intPrint(int ... intData) {
				for(int i = 0; i < intData.length; i++) {
					System.out.println("%s님 반갑습니다\nHave a good day%s\n");
				}
				System.out.printf("%s, %s, %X %n", "metoo", "metoo", 125 );
				System.out.printf("%2$s, %1$s, %2$s \n", "metoo", "igo" );
				System.out.printf("%1$tY년 %1$tm월 %1$td일\n", new Date() );
			}
		};
		obj.inamePrint("backy");
		obj.stringPrint(new String[]{"newjeans","lovely"});
		obj.intPrint(10,20,30,40);

	}
}
