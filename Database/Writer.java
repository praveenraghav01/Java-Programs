import java.io.*;
import java.util.*;
class Writer implements Serializable
{
	String name;
	int rno;
	double cgpa;
	Writer(String n, int no, double c)
	{
		name=n;
		rno=no;
		cgpa=c;
	}
	public static void main(String[] args) throws Exception
	{
		Writer w=new Writer("Raghav",18,7.52);
		FileOutputStream o=new FileOutputStream("‪File.txt");
		ObjectOutputStream p=new ObjectOutputStream(o);
		p.writeObject(w);
		//o.close();
	}
}