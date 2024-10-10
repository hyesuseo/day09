package variable;

import set_get.CommonClass;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println(CommonClass.path + " 위치에 저장");
		CommonClass.path = "위치 변경~";
		CommonClass c = new CommonClass();
		System.out.println(c.path + " 위치에 저장");
		
		//CommonClass.KOREA = "aaa" ; //파이널이 붙었으므로 변경할 수 없다
		
	}
}
