import java.util.Scanner;
abstract class Rects
{
abstract void area();
abstract void volume();
void cord()
{
int l=5;
int h=4;
System.out.println("Length is:"+l+"\nHeight is:"+h);
}
}
public class Rect extends Rects
{
void area()
{
int a;
a=5*4;
System.out.println("Area is:"+a);
}
void volume()
{
int v;
v=5*4*3;
System.out.println("Volume is:"+v);
}
public static void main(String[] args) 
{
Rects r= new Rect();
r.area();
r.volume();
r.cord();
}
}