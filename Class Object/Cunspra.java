import java.util.Scanner;
class Cunspra
{
	double basic,hr,da,sal;
	Cunspra(double exp)
	{
		
		if(exp<=5)
		{
			basic=2000;
		}
		else
		{
			basic=4000;
		}
		hr=(30*basic)/100;
		da=(20*basic)/100;
		sal=basic+hr+da;
		System.out.println("Income Salary is"+sal);
	}
	public static void main(String a[])
	{
		double exp;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Workexperianse");
		exp= s.nextDouble();
		Cunspra obj= new Cunspra(exp);

	}
}