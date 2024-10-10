package set_get;

import java.util.Scanner;

class TestPt{
	private String name;
	private int age;
	
	public void setName(String name) { //set 다른 값으로 변경
		this.name= name;
	}
	
	public String getName(){ //get 값 가져오기
		return name;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public int getAge() {
		return age;
	
	}
	
	public int abage(int a) { //나이를 만으로 계산하는 메소드
		int b = a-1;
		return b;
	}
	
}
public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		TestPt test = new TestPt();
		
		String name; 
		int age; 
		System.out.print("이름 입력: ");
		name = sc.next();
		test.setName(name);
		System.out.print("나이 입력: ");
		age = sc.nextInt();
		test.setAge(age);
		int ab = test.abage(test.getAge());
		
		System.out.println(test.getName()+"님의 나이는 "+test.getAge());
		System.out.println(test.getName()+"님의 만 나이는 "+ ab);
		
		
	}

}
