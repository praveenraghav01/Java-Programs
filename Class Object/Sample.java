/*nested classes are further classified in to 
1. Static
2. Non Static <^>*/
class Sample
{
	private int data=40;
	void display()
	{
		final int s=4;
		class Local
		{
			private int a=30;
			void msg()
			{
				System.out.println("Data"+data);
				System.out.println(s);
			}
		}
		Local i=new Local();
		i.msg();
	}
	public static void main(String[] args) 
	{
		Sample obj=new Sample();
		obj.display();
	}
}
