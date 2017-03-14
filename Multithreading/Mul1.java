class A1 implements Runnable
{
  public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("\tFrom Thread A: i="+i);
		System.out.println("Exit from A");
	}
}
class B1 implements Runnable
{
  public void run()
	{
		for(int j=1;j<=5;j++)
			System.out.println("\tFrom Thread B: j="+j);
		System.out.println("Exit from B");
	}
}
class C1 implements Runnable
{
  public void run()
	{
		for(int k=1;k<=5;k++)
			System.out.println("\tFrom Thread C: c="+k);
		System.out.println("Exit from C");
	}
}
class Mul1
{
  public static void main(String[] args)
  {
    Thread m1=new Thread(new A1());
    Thread m2=new Thread(new B1());
    Thread m3=new Thread(new C1());
    m1.start();
    m2.start();
    m3.start();
  }
}
