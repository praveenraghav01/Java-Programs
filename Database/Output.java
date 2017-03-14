import java.io.*;
public class Output
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileOutputStream fos=new FileOutputStream("D:/java1/Database/abc2.txt");
		FileOutputStream fo=new FileOutputStream("D:/java1/Database/abc3.txt");
		try
		{
			for(i=0; i<=20;i++)
			{
				fos.write(i);
			}
			for(i=20; i<=40;i++)
			{
				fo.write(i);
			}
			byte x=69;
			fos.write(x);
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