package twotest;

import org.junit.Test;

import twoInter.InterExam01Sub;
import twoInter.InterExam01SubImpl01;
import twoInter.InterExam01SubImpl02;

public class InterExamTest {
	@Test
	public void InterExam01SubImplTest() {
		InterExam01Sub obj = new InterExam01SubImpl02();
		obj.printAddr("수원시 인계동");
		obj.printName("backy");
		obj.printAge(30);
		obj = new InterExam01SubImpl01();
		obj.printAddr("수원시 인계동");
		obj.printName("backy");
		obj.printAge(20);
		
		
	}
	
}

