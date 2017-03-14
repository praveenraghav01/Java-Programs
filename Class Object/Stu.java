import java.util.Scanner;
class Stu
{
	String name;
	double cgpa;
	int age;
	void stu()
	{
		Scanner i =new Scanner(System.in);
		System.out.println("Enter the name");
		name= i.nextLine();
		System.out.println("cgpa");
		cgpa = i.nextDouble();
		System.out.println("age");
		age = i.nextInt();
	}
	void print()
	{
		System.out.println("Name"+name+"\ncgpa"+cgpa+"\nage"+age);
	}
}
	class Sport extends Stu
	{
		double height;
		void in()
		{
			Scanner i =new Scanner(System.in);
			System.out.println("Enter the height");
			height= i.nextDouble();
		}
		void check()
		{
			if(height>=5.0 && height<=6.0)
			{
				System.out.println("You are IN");
			}
			else
			{
				System.out.println("Sorry You are not IN");
			}
		}
		public static void main(String[] args) 
		{
			Sport s=new Sport();
			s.stu();
			s.print();
			s.in();
			s.check();
			
		}

	}