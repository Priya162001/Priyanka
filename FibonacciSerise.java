import java.util.*;

class FibNo{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter Range to calculate Fibonacci Series uto n ");
		int range = obj.nextInt();
		
		System.out.println("Fibonacci serise upto"+range+"is:");
		int num1=0;
		int a=0;
		int b=1;
		while(num1<=range){
			System.out.print(num1+" ");
			a=b;
			b=num1;
			num1=a+b;
		}
	}
}




