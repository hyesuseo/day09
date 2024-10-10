package set_get;
class Test04{
	private int age, num, aaa, bbb, ccc;  //은닉화 setter getter를 이용해서 접근한다
	public int getAge() {//getter의 이름을 적어준다!
		return age;
	}
	
	public int getNum() {
		return num;
	}
	public void setAge(int a) { //보통은 설정해주는 거니까 값을 전달받아서 사용한다
		age = a;
	
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	public int getAaa() {
		return aaa;
	}

	public void setAaa(int aaa) {
		this.aaa = aaa;
	}

	public int getBbb() {
		return bbb;
	}

	public void setBbb(int bbb) {
		this.bbb = bbb;
	}

	public int getCcc() {
		return ccc;
	}

	public void setCcc(int ccc) {
		this.ccc = ccc;
	}
	
}
public class Ex04 {
	public static void main(String[] args) {
		Test04 t = new Test04();
	System.out.println(t.getAge());
	System.out.println(t.getNum());
	
	t.setAge(2222);
	System.out.println(t.getAge());
	
	t.setNum(5555);
	System.out.println(t.getNum());
	
	
	}
}
