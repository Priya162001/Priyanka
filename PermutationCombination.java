import java.util.Scanner;

public class PermutationCombination{
	public static int fact(int num){
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args){
	       
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter value of n :  ");
		int n =obj.nextInt();

		System.out.println("Enter vale of r :  ");
		int r = obj.nextInt();
		
		int nCr = (fact(n)/(fact(n-r)*fact(r)));

		int nPr = (fact(n)/(fact(n-r)));

		System.out.println("Combination is"+nCr);
		System.out.println("Permutation is "+nPr);
	}
}


