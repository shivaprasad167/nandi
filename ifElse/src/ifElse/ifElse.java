package ifElse;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		age = 21;
		if(age > 0 & age <130)
		{
			if(age>= 18)
			{
				System.out.println("you are eligible to vote");
			}
			else
			{
				System.out.println("Not eligible to vote");
			}
		}		
		else
		{
			System.out.println("age should be between 0 to 130");
		}
	}

}
