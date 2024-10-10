package set_get;
class Test03{
	private int num = 1234;
	//자바에서는 이 안에 변수를 만들어 쓸 때는 private으로 쓰라고 권장한다고..
	//나중에 다른 언어에서 사용하면 값을 자동으로 저장해준다고!
	//다른 클래스에서는 해당 변수에 접근이 불가 : 정보 은닉
	// 이렇게 은닉해놓으면 가져다가 쓸 수가 없는데, getter를 사용하여 가져옴
	// 아래와 같이 getter라는 메소드를 사용!
	// 값을 변경하고 싶을 때는 setter를 사용!
	
	public int get() {
		return num;
	}
	
	public void set(int num) {
		
		//num = num; 이렇게 쓰면 자기자신의 값을 먼저 찾음 
		this.num = num; // 받아온 값을 위의 num에 넣으라는 뜻!
		
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		int n = t.get();
		System.out.println( n );
		int num = 789;
		t.set(num);
		System.out.println("변경후: "+t.get() );
	}
}
