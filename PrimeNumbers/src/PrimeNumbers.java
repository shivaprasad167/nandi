
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a;
		float b,c ;
		int prime;
		prime = 1;
		for(a = 1;a<=100;a++)
		{
			for(b = 1;b<=a;b++)
			{
				
				if(a%b==0)
				{
					
					if(b!=1 && b!=a)
					{
						/*System.out.println(a%b );*/
						prime = 0;
						/*System.out.println(a);*/
						break;
						
					}
					else 
					{
						prime = 1;
					}
								
				}
	
			}
			if(prime==1)
			{
					System.out.println(a);
			}

		}
	}

}
