package Ty_Java_Program;

public class Encap {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
	
		System.out.println(	e.getx());
		e.setx(20);
		System.out.println(	e.getx());
		System.out.println(	e.getstr());
		e.setstr("kumar");
		System.out.println(	e.getstr());
		String msg = e.getm1();
		System.out.println(msg);
		
		
	}

}
