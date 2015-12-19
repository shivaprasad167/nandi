package math;
/*import java.lang.*;*/

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z,zz;
		x = 2;
		y = 3;
		z = 64;
		zz = 27;
		System.out.println(multi(x,y));
		System.out.println("Squar root of " + z + "is:" + Math.sqrt(z));
		System.out.println("cube root of " + zz + "is:" + Math.cbrt(27));
	}

	public static int multi(int a,int b)
	{
		return a * b;
	}
	
}
