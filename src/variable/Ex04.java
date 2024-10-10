package variable;


class Test04{
	
	String name;
	//아래 인풋과 프린트에 name이 동시에 사용되므로 이런경우에는
	//메소드 바깥에서 선언하면 return하지 않고도 동시에 사용할 수 있다. 
	public void inputData () {
		name = "홍길동";
	}

	public void printData() {
		System.out.println(name);
}



}


public class Ex04 {
public static void main(String[] args) {
	Test04 t = new Test04();
	t.printData();
	t.inputData();
	
}
}
