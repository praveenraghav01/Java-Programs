import java.util.Scanner;
class Fuction
{
	int a,b,c;
	int ans;
	void area(int a)
	{
		ans= a*a;
		System.out.println("Value"+ ans);
	}
	void area(int a ,int b )
	{
		ans = a*b;
		System.out.println("Value"+ ans);
		
	}
	void area(int a,int b ,int c)
	{
		ans= a*b*c;
		System.out.println("Value"+ ans);
	}
}
class Fuction1
{

	public static void main(String ab[])
	{
        int a,b,c;
		Fuction f=new Fuction();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = s.nextInt();
		System.out.println("Enter the value of b");
		b = s.nextInt();
		System.out.println("Enter the value of c");
		c = s.nextInt();
		f.area(a);
		f.area(a,b);
		f.area(a,b,c);
	}
}