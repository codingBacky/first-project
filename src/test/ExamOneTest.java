package test;

import org.junit.Test;

import com.one.ConstructorExam;
import com.one.DataObj;
import com.one.PackageExam;
import com.one.SingletonExam;
import com.one.SubMainOne;

public class ExamOneTest {
	@Test
	public void subMainTest() {
		//SuperMain obj = new SubMainOne();//사용불가 myDataPrint()이 없음
		SubMainOne obj = new SubMainOne();
		obj.namePrint("123");
		obj.myDataPrint();
		//(SubMainOne)obj.myDataPrint();//형변환을 시켜서 쓸수 있다. 
	}
	@Test
		public void constructorExamTest() {
		ConstructorExam obj = new ConstructorExam();
		obj.printData();
		}
	@Test
		public void dataObjectTest() {
		DataObj k = new DataObj();
		k.data2 = 'b';
		DataObj j = new DataObj();
		j.data2 = 'z';//값이 달라도 data1만 비교하니 true 나옴
		System.out.println(k.hashCode());
		System.out.println(k.toString());
		System.out.println(j.hashCode());
		System.out.println(j.toString());
		System.out.println(k == j);
		System.out.println(k.equals(j));
		String aaa = "back";
		String bbb = "back";
		System.out.println(aaa == bbb);
		System.out.println(aaa.equals(bbb));
		String ccc = new String("back");
		String ddd = new String("back");
		System.out.println(ccc == ddd);
		System.out.println(ccc.equals(ddd));
	
	}
	
	
	/*
	   	7226 @Override 해시코드 값도 같아짐
		com.one.DataObj@1c3a
		7226
		com.one.DataObj@1c3a
		false
		true 
		*/
	@Test
	public void packageExamTest() {
	PackageExam obj = new PackageExam();
	//System.out.println(obj.data1);//package에 있는 data1 는 이 범위에서 사용할 수 없음
	System.out.println(obj.data2);
	//System.out.println(obj.data3);
	System.out.println(obj.getData4());
	}
	 @Test
	public void singletonExamTest() {
	//	SingletonExam obj = SingletonExam.instance;//static -> 생성 없이 사용가능
	//	int myVal = new SingletonExam().data;//필드는 생성없이 쓸수 없음
		int myVal = SingletonExam.getInstance().data;//data를 꺼내다 myVal에 줌
	 }
}
