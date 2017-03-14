import java.util.Scanner;
class Staticfun
{
	static int a;
	void get()
	{
		a++;
	}
	void put()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Staticfun s1= new Staticfun();
		Staticfun s2= new Staticfun();
		Staticfun s3= new Staticfun();
		s1.get();
		s2.get();
		s3.get();
		s1.put();
		s2.put();
		s3.put();
	}

}