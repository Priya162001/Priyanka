import java.io.*;

class Matrix{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Numbers of Row");
		int norow = Integer.parseInt(br.readLine());

		System.out.println("Enter Numbers of Column");
		int nocol = Integer.parseInt(br.readLine());

		int[][] iarr = new int[norow][nocol];

		System.out.println("Enter Element in Matrix");
		for(int i=0;i<norow;i++){

			for(int j=0;j<nocol;j++){
				iarr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Matrix is");
		for(int i=0;i<norow;i++){

			for(int j=0;j<nocol;j++){
				System.out.print(iarr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix is");
		for(int i=0;i<norow;i++){

			for(int j=0;j<nocol;j++){
				System.out.print(iarr[j][i]+" ");
			}
		         System.out.println();
		}
		
	}
}


