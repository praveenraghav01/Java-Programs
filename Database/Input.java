import java.io.*;
public class Input
{
	public static void main(String[] args) throws IOException
	{
		int i,j;
		FileInputStream fos=new FileInputStream("D:/java1/Database/abc2.txt");
		FileInputStream fo=new FileInputStream("D:/java1/Database/abc3.txt");
		try
		{
			while((i=fos.read())!=-1)
			{
				System.out.print(i);
			}
			while((j=fo.read())!=-1)
			{
				System.out.print(j);
			}
		}
		    catch(FileNotFoundException ex)
			{

			}
			finally
			{
				fos.close();
				fo.close();
			}

	}
}	