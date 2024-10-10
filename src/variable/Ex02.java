package variable;

public class Ex02 { //지역변수

	public static void main(String[] args) {
		
		String name = "홍길동"; //지역변수
		if (true) {
			name = "김개똥";	
			//String n ="1111";
		} 
		//System.out.println(n);
		
		System.out.println(name);

	}

}
