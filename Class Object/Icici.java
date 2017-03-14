import java.util.Scanner;
class Bank
{
	int i,a;
	void cal()
	{
		Scanner s=new Scanner(System.in);
		i=(7000*5)/100;
		System.out.println("Value is:"+i);
	}
}
class Sbi extends Bank
{
	int a;
	void cal()
	{
		a=(7000*6)/100;
		System.out.println("SBI value is:"+a);
	}
}
class Icici extends Bank
{
	int i;
	void cal()
	{
		i=(7000*7)/100;
		System.out.println("ICICI value is:"+i);
	}
	public static void main(String[] args)
    {
		Icici i= new Icici();
		Sbi s= new Sbi();
		Bank b= new Bank();
		i.cal();
		s.cal();
		b.cal();
	}
}