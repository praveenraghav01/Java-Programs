import java.util.Scanner;
interface mom
{
	void eat();
}
interface pop
{
	void eat();
}
class Multi implements mom,pop
{
	char g;
	Scanner s= new Scanner(System.in);
	public void eat()
	{
		System.out.println("Enter your gender male(m)/female(f):-");
		g=s.next().charAt(0);
		if(g=='m')
		{
			System.out.println("You are a male and used to eat non-veg");
		}
		else
		{
			System.out.println("You are a female and used to eat veg");
		}
	}
	public static void main(String[] args)
	{
		Multi ms=new Multi();
		ms.eat();
	}
}