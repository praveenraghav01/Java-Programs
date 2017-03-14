import java.io.*;
public class Fileout
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos=null;
		String s= "My Name is Raghav.";
		byte buf[]=s.getBytes();
		try
		{
			fos=new FileOutputStream("D:/java1/Database/abc1.txt");
			for(int i=0; i<buf.length;i++)
			{
				fos.write(buf[i]);
			}
		}
		    catch(FileNotFoundException ex)
			{

			}
			finally
			{
				fos.close();
			}

	}
}	