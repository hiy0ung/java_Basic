package exam;

public class Student {
	// 필드(field) (= 멤버변수) : 객체의 데이터가 저장된다
	String name;
	
	/*
	 * 생성자(Constructor)
	 * - 객체 생성시 초기화 역할 
	 * - 클래스 이름과 동일해야함
	 */
	Student() {
		
	}
	
	// 메소드(Method) : 객체의 행위(동작)에 해당한다 (기능 정의)
	// 객체간에 데이터 전달의 수단으로도 사용된다
	void studey() {
		System.out.println(name + "공부한다.");
	}
}