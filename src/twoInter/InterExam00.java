package twoInter;
//하나의 프로젝트에서 사용되는 상수변수를 한 곳으로 모아서 정의 해주면 유지 보수가 쉽다.
//추상클래스 보다는 인터페이스!
//추상클래스는 인스턴스 메서드를 포함하고 있다는 장점이 있음. 인터페이스는 무조건 추상클래스만
//순수 자바로 작성할 경우 하나의 DAO클래스에서 사용되는 쿼리를 한 곳에 모아서 상수로 정의 해두고 사용하면 유지보수가 쉽니다.
//성능 중시 => 순수 자바로 작성
//인터페이스 안에 상수변수와 추상메서드를 혼합해서 정의하는 것은 권장하지 않는다.
public interface InterExam00 {
	int aaa = 500;//public static final 을 추가한다.컴파일러가 자동으로 추가 => public static final int aaa;
	public void dataInfo();
}
/* 이렇게 분리하는 것을 권장 
 public interface InterExam01 {
	public void dataInfo();
 }
 public interface InterExamConst {//상수 영역으로 분리
 	int aaa = 500;
 }
 Class MemberDAO{
 	public int insert(MemberVO vo){
 		String query = "insert~~~쿼리문"
 		con = DB연결 생략
 		prerparedStatement ps = con.pr~~("query")
 	}
 }이렇게 하지말고 
 이렇게 하는 것을 권장 =>
 
 interface MemberDAOQuery{
 String inQuery = "insert~~~쿼리문";
 String upQuery = "update~~~쿼리문";
 String delQuery = "delete~~~쿼리문";
 String getQuery = "select~~~쿼리문";
 
 }
 Class MemberDAO{
 public int insert(MemberVO vo){
 		con = DB연결 생략
 		prerparedStatement ps = con.pr~~(MemberDAOQuery.inQuery)
 		이하생략
 		}
 */
