
import java.io.*;
class fibnobiiSeries
{
	public static void main(String Arg[])
	{
		try
			{
				DataInputStream t=new DataInputStream(System.in);
				int n,i=0,v1=0,v2=1,d=0;
				System.out.println("enter the value of number");
				n=Integer.parseInt(t.readLine());
						do
						{

						System.out.println(v1);
						d=v1+v2;
						v1=v2;
						v2=d;
						i++;
					}
						while(i<=n)
			}
				catch (Exception e)
					{
						System.out.println(e);
		}			}
}



