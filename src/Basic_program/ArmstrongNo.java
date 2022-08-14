package Basic_program;

public class ArmstrongNo {
	
	public static void main(String[] args) {
		
		int x = 153;
		int temp=x;
		int power =0;
		int sum = 0;
		
		while(temp!=0) {
			temp = temp/10;
			power++;
		}
		
		temp=x;
		while(temp!=0) {
			int rem = temp%10;
			int res=1;
			for(int i=1; i<=power; i++) {
				 res= res*rem;
			}
			sum=sum+res;
			temp= temp/10;
			
		}
		System.out.println(sum);
		if(sum==x) {
			System.out.println(x +": is armstrong No");
		}
		else {
			System.out.println(x +": is not a armstrong No");
		}
	}

}
