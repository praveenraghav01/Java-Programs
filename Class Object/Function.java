import java.util.Scanner;
class Function
{
	public static void main(String ab[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		a= s.nextInt();
		b= s.nextInt();
		area(a);
		area(a,b);
	}
	static void area(int a)
	{
		System.out.println("Answer is"+a);
	}
	static void area(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Answer is"+c);
	}
}