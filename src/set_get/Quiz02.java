package set_get;
class Testquiz{
	private int kor, eng, math, sum;
	private double avg;

	public void setKor(int k) {
		this.kor = k;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int e) {
		this.eng = e;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int m) {
		this.math = m;
	}
	public int getMath() {
		return math;
	}
	
	public int sum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
	public double avg(int sum) {
		double avg = sum/3; 
	return avg;
	}
	
	public void print (String st, int a) {
		System.out.println(st+ " : "+a);
	}
	public void print (String st, double a) {
		System.out.println(st+ " : "+a);
	}

}


public class Quiz02 {
	public static void main(String[] args) {
		Testquiz t = new Testquiz();
		
		int k= 100, e =90, m=80;
		t.setKor(k);
		t.setEng(e);
		t.setMath(m);
		
		int ssum = t.sum(t.getKor(), t.getEng(), t.getMath());
		double aavg = t.avg(ssum);
		
		t.print("국어",k);
		t.print("영어",e);
		t.print("수학",m);
		t.print("합계",ssum);
		t.print("평균",aavg);
	
		
		
		
	}

}
