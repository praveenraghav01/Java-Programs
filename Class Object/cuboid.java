public class Cuboid
{
int length;
int breadth;
int height;
public int getVolume()
{
return(length*breadth*height);
}
Cuboid()
{
	length=10;
breadth=10;
height=10;
}
public static void main(String args[])
{
Cuboid c1=new Cuboid();
System.out.println("volume of cuboid is:"+c1.getVolume());
}}