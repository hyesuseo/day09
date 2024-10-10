package variable;
class Test05{ // default class임
	//default class는 
	public int num = 100;
	public static String name ="홍길동"; //static있음
	//static 있으면 가장 처음에 만들어지고, 가장 오랫동안 유지(프로그램 종료시까지)
	public void test05() {
		System.out.println("test05실행");
		
		
	}
}

public class Ex05 {
	static int num;
	public static void main(String[] args) {
		//static//

	Test05 t = new Test05(); //객체를 만들어야 사용을 할 수 있다.
	//Test05. -> ctrl + spacebar 하면
	// static이 쓰인 것은 객체가 만들어지던말던 신경안쓰고
	//프로그램이 동작하면 무조건 생성된다.
	
	num = 100; //static 이 있으면 메인클래스 밖에서 생성한 것도 쓸 수 있음
	
	
	
	
	
	

	}

}
