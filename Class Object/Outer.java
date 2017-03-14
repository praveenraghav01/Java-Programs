/*nested classes are further classified in to 
1. Static
2. Non Static <^>*/
class Outer
{
	private int data=2;
	static int a=4;
	class Inner
	{
		void get()
		{
			System.out.println(data);
			System.out.println(a);
		}
		
	}
	public static void main(String[] args) 
	{
		Outer o=new Outer();
		Outer.Inner in=o.new Inner();
		in.get();
		
	}
}
