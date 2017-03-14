import java.io.*;
public class File
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=null;
		int i=0;
		char c;
		try
		{
			fis=new FileInputStream("D:/java1/Database/abc.txt");
			while((i=fis.read())!=-1)
			{
				c=(char)i;
				System.out.print(c);
			}
		}
		    catch(FileNotFoundException ex)
			{

			}
			finally
			{
				fis.close();
			}

	}
}