package Ty_Java_Program;

public class PrintMissingElement {
	public static void main(String[] args) {
		
		int x[]= {2,4,7,10};
		
		for(int i=0; i<x.length-1; i++) {
			int n = x[i+1]-x[i];
			while(n>1) {
				x[i]++;
				System.out.print(x[i]+" ");
				n--;
			}
		}
	}
}
