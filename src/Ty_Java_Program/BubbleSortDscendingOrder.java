package Ty_Java_Program;

public class BubbleSortDscendingOrder {


public static void main(String[] args) {
	int a[] = {20,60,80,50,90,10};
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]<a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for(int x : a)
	{
		System.out.print(x +" ");
	}
}
}