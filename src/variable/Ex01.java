package variable;

import java.util.ArrayList;
class TestClass01{
	public void sumFunc() {
		System.out.println("매개변수 없음");
	}
	
	public void sumFunc(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public void sumFunc(String s1, int n1) {
		System.out.println(n1 +s1);
	}
	
	// 세 메소드의 이름은 모두 같다
	//단 매개변수 개수가 다르거나, 자료형이 다르면 
	//서로 다른 메소드로 인식한다. 
}

public class Ex01 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		TestClass01 t = new TestClass01();
		t.sumFunc(100,100);
		
		Test05 t05 = new Test05();
		
		
		
		

	}

}
