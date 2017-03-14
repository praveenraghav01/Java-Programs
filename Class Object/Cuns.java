import java.util.Scanner;
class Cuns
{
	double basic,exp,hr,da,sal;
	Cuns()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Workexperianse");
		exp= s.nextDouble();
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
		Cuns c=new Cuns();

	}
}