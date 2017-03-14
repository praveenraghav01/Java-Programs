import java.util.Scanner;
class student
{
	String name;
	double percent;
	int fee=50000;
	int id;
	Scanner m=new Scanner(System.in);
	void display()
	{
		System.out.println("Enter Name : ");
		name=m.nextLine();
		System.out.println("Enter Id : ");
		id=m.nextInt();
		System.out.println("Enter 12th percentage : ");
		percent=m.nextDouble();
	
		if(percent>=80)
		{
			fee=fee-20000;
		}
	}
	
}

class sport extends student
{
	char sp;
	void sportdetails()
	{
		System.out.println("Do you want Sport Facility : ");
		sp=m.next().charAt(0);
		
		if(sp=='y' || sp=='Y')
		{
			fee=fee+10000;
			System.out.println("Sport fee 10,000");	
		}	
	
	}
}

public class exam extends sport
{
	int ef;
	
	void examfee()
	{
		fee=fee+1500;
		System.out.println("Exam fee 1,500");
		System.out.println("Total Class : "+fee);	
	}
	
	public static void main(String []args)
	{
		exam m2=new exam();
		m2.display();
		m2.sportdetails();
		m2.examfee();
	}

}