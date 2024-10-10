package variable;

import java.util.Scanner;

class Test{
	//입력
	Scanner sc= new Scanner(System.in);
	String name, addr;
	int kor, eng, math, sum ;
	public void input() {
		System.out.print("이름을 입력: ");
		name = sc.next();
		System.out.print("주소 입력: ");
		addr = sc.next();
		System.out.print("국어점수 입력: ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력: ");
		eng = sc.nextInt();
		System.out.print("수학점수 입력: ");
		math = sc.nextInt();
		System.out.println("입력완료! ");
		plus(); 
		//plus는 같은 클래스 안에서만 사용가능하게 숨겨보았다. 
	}
	//출력
	public void print () {
		System.out.println("이름은 "+ name);
		System.out.println("주소는 "+ addr);
		System.out.println("국어점수는 "+ kor);
		System.out.println("영어점수는 "+ eng);
		System.out.println("수학점수는 "+ math);
		System.out.println("점수 합은 "+ sum);
		
	}
	
	//합을 연산
	private void plus () {
		sum = kor + eng + math;
		System.out.println("계산완료");
		
	}
	
}


public class miniQuiz {

	public static void main(String[] args) {
		Test t = new Test();
		t.input();
		//여기서 sum기능을 숨길 수 있다. 
		t.print();

	}

}
