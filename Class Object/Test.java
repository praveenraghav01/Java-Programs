class Test
{
public static void main(String args[])
{
area(1);
area(2,3);
}
static void area(int side)
{
System.out.println("area of square"+(side*side));
}
static void area(int l,int b)
{
System.out.println("area of rectangle"+(l*b));
}
}
