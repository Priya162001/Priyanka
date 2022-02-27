import java.util.*;

class StrPalindromeNO{
	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a String to chech it is palindrome or not");
		String str1 =obj.nextLine();

		String rev="";
		int len=str1.length();
		for(int i=len-1;i>=0;i--)

			 rev=rev+str1.charAt(i);

			if(str1.equals(rev))

				System.out.println(str1+" is Palindrome");
			else
				System.out.println("Enter String is Not Palindrome");
			
		
	}
}

