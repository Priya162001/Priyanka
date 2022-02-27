import java.io.*;

class FacNo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number To Calculate Factorial");
		int num = Integer.parseInt(br.readLine());
		
		//int num=5;
		int fact=1;
		for(int i=1;i<=num;i++){

			fact=fact*i;
		}
		System.out.println("Factorial of" +num+" is:"+fact);
	}
}
