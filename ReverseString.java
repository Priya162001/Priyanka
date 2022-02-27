import java.util.Scanner;

class ReverseString{
	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter Sting");
		String str1 = obj.nextLine();

		StringBuffer sb = new StringBuffer(str1);

		str1 = sb.reverse().toString();

		System.out.println(str1);
	}
}


