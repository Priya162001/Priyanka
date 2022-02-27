import java.io.*;

class Pattern{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of Row");
		int row=Integer.parseInt(br.readLine());

		int num=row/2;
		for(int i=0;i<row;i++){

			if(i<=num){
			       for(int sp=i;sp<num;sp++){
				       System.out.print(" ");
			       }
			       for(int col=0;col<(i*2)+1;col++){
				       System.out.print("*");
			       }
			       System.out.println();
			}else{
				for(int sp=i; sp>num;sp--){
					System.out.print(" ");
				}
				for(int col=(row*2)-1;col>(i*2);col--){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}




