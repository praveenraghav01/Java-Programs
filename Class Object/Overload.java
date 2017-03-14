import java.util.Scanner;
class Overload
{
	Overload()
	{
		System.out.println("1");
	}
	Overload(int a,int b)
	{
		int c=a+b;
		System.out.println("Ans"+c);
	}
	public static void main(String[] args)
	{
		Overload obj = new Overload();
		Overload obj1 = new Overload(3,5);
	}
}