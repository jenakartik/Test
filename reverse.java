import java.util.*;
public class Reverse {
	public static void main(String args[])
	{
		//This is for reverse program
		Scanner sc=new Scanner(System.in);
		String s,reverse="";
		System.out.println("Enter a string");
		s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Reverse sting is :"+reverse);
	}

}
