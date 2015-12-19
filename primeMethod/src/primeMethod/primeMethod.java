package primeMethod;
import java.util.Scanner;
public class primeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,ans;
		/*Scanner nm = new Scanner(System.in);
		System.out.print("Enter number to check prime:");
		n = nm.next();
		System.out.print(n);*/
		ans = Prime(8);
		System.out.println("ans is:" + ans);
		if(ans == 1)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}

	public static int Prime(int a)
	{
		int b,result = 0;
		for(b = 1;b<=a;b++)
		{
			
			if(a%b==0)
			{
				
				if(b!=1 && b!=a)
				{
					/*System.out.println(a%b );*/
					/*prime = 0;*/
					result = 0;
					/*System.out.println(a);*/
					break;					
				}
				else 
				{
					/*prime = 1;*/
					result = 1;
				}
							
			}

		}
		return  result;
	}
}
