/*nested classes are further classified in to 
1. Static
2. Non Static <^>*/
class Nested
{
	static int a;
	static class Inner
	{
		static int b=3;
		int c=4;
		static void get()
		{
			System.out.println(b);
			System.out.println(a);
		}
		void display()
		{
			System.out.println(c);
		}
	}
	public static void main(String[] args) 
	{
		Nested.Inner obj = new Nested.Inner();
		Nested.Inner.get();
		obj.display();
		
	}
}
