import java.io.*;
class Bigeestnumberofnthvalue
{
	public static void main(String arg[])
		{
			try
	{
		DataInputStream j=new DataInputStream(System.in);
		int n=1,count=1,value=0,b=0;
		System.out.println("enter the numbers to find whic is biggest");
		count=Integer.parseInt(j.readLine());
		do
		{
				System.out.println("enter the number");
				value=Integer.parseInt(j.readLine());
				if(n==1)
				{
					b=value;
				}			
				if(b<value)
				{
					b=value;
				}
			                         n++;
		}
				while(n<=count);
		               System.out.println(b);
																			
		}	

			catch(Exception e)
			{
				System.out.println(e);
			}
		
		}
}

							