//import java.util.Scanner;
class Staticfu
{
	static int a;
	static void get()
	{
		a++;
	}
	static void put()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		//Staticfun s1= new Staticfun();
		//Staticfun s2= new Staticfun();
		//Staticfun s3= new Staticfun();
		Staticfu.get();
		Staticfu.get();
		Staticfu.put();
		Staticfu.put();
	}

}