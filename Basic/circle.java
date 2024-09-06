import java.io.*;
class Circle
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream j=new DataInputStream(System.in);
			double r,e,
			System.out.println("r=");
			r=Double.parseDouble(j.readLine());
			e=3.14*Math.pow(r,2);
			System.out.println("e="+e);
		}
			catch (Exception e)
			


			
			{
			   System.out.println(e);
			
			}
	}
}
			