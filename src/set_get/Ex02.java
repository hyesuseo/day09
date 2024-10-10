package set_get;

import java.util.ArrayList;

class Test02 extends ArrayList{ //상속
	public void test() {
		this.add(STR); // 내가 가진 add 기능
		//super.add(); //상속 받은 add 기능
		// 같은 add 여도 코드가 많아지면 내코드인지 타인코드인지 알 수가 없어서..
		//그걸 구분하기 위해서도 사용된다.
	}
	public boolean add111(Object obj) {
		System.out.println("내가 만든 add");
		return true;
	}
}
public class Ex02 {
	public static void main(String[] args) {
	Test02 t = new Test02();
	t.test();
	
}
}
