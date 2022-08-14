package Ty_Java_Program;

public class First3MaxnumWB {
	
	public static void main(String[] args) {
		int [] x = {20,50,60,20,55,10,45,23};
//		int [] x = {7,-3,0,2,1,-9};
		
		int Fmax1=0;
		int Fmax2=0;
		int Fmax3=0;
		
		for(int i=0; i<x.length; i++) {
			if(Fmax1<x[i]) {
				Fmax3=Fmax2;
				Fmax2=Fmax1;
				Fmax1=x[i];
			}
			else if(Fmax2<x[i]) {
				Fmax3=Fmax2;
				Fmax2=x[i];
			}
			else if(Fmax3<x[i]) {
				
				Fmax3=x[i];
			}
		}
		System.out.println("first max,second max, third max : "+Fmax1+","+Fmax2+","+Fmax3);
	} 

}
