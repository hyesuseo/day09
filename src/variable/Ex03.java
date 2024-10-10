package variable;
class Test03{
	//int var = 100; //메서드 바깥에서 선언하면 각 메서드에서 사용가능하다.
	//중복되는 것 같은건 바깥에서 해도 될듯 (스캐너를 바깥으로 써놓는 것처럼)
	//근데 상황을 봐서 해야겠지 당연히....
	public void test1() {
		int var = 100;
		System.out.println(var+" : 11111");
	}
	
	public void test2() {
		//System.out.println(var+ "22222");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Test03 t = new Test03();
		t.test1();
		t.test2();
		
		if (true) {
			int num  = 100;
		}
		int num = 200;
		
		for (int i = 0; i<5; i++) {
			//이 때 int i는 반복문 내부에서만 쓰는 변수이므로,
			//일회성 변수, 그 안에서만 쓰고 버린다
			//일회성 변수를 쓸데없이 저장하면 용량을 많이차지하므로!
			//변수를 얼마동안 유지하는 것이 좋은지를 고민하며 코드를 짤 것
		}

	}

}
