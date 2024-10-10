package set_get;
class Test01{
	int num = 12345;
	public void abcd() {	
		System.out.println("abcd 호출");
	}
	public void test() {
		this.abcd();
		int num = 500;
		System.out.println("test num : "+ num);
		System.out.println("this : "+ this);
		System.out.println("this : "+ this.num);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01(); 
		//t는 참조형 변수 = 객체에 대한 정보를 담고 있다. 
		System.out.println("t : "+ t);
		System.out.println("t.num :" + t.num);
		t.test();
	
		t.abcd();
}

}
