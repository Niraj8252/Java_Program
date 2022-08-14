package Ty_Java_Program;

public class Encapsulation {
	
	private int x = 10;
	private String str = "niraj";
	
	public int getx()
	{
		return x;
	}
	private String m1() {
		System.out.println("private function running");
		return "good morning";
		
	}
	
	public String getstr() {
		return str;
	}
	
	public void setx(int x) {
		this.x=x;
		
	}
	public void setstr(String str) {
		this.str=str;
		
	}
	public String getm1() {
		return m1();
		
	}
}


