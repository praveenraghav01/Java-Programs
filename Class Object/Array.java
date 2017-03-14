import java.util.Scanner;
class Array
{
	void cal()
	{
		int i,temp=0;
	    int a[]= new int[3];
	    System.out.println("Enter the element");
	    Scanner s=new Scanner(System.in);
	    for(i=0;i<3;i++)
	    {
	       	a[i]=s.nextInt();
	    }
	    for(i=0;i<3;i++)
	    {
	      	if(temp<a[i])
		    {
		    	temp=a[i];
		    }
	    }
	    System.out.println("Top is:"+temp);
	}
	public static void main(String[] args) 
	{
	Array o=new Array();
	o.cal();	
	}
}