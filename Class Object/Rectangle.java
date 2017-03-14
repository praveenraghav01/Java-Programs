import java.util.Scanner;
/*All methods are in interface is public and abstract
and memebers are public static final*/
interface Rects
{
	abstract void area();
	abstract void volume();
	abstract void cord();
}
public class Rectangle implements Rects
{
	public void area()
	{
		int a;
		a=5*4;
		System.out.println("Area is:"+a);
	}
	public void cord()
	{
		int l=5,h=6;
		System.out.println("Lenght is:"+l+"\nHeight is:"+h);
	}
	public void volume()
	{
		int v;
		v=5*4*3;
		System.out.println("Volume is:"+v);
	}
	public static void main(String[] args) 
	{
		Rects r= new Rectangle();
		r.area();
		r.volume();
		r.cord();
		
	}
}