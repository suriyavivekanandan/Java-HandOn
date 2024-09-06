import java.io.*;
class Factofoddnumbers
{
	public static void main(String arg[])
	{
		try
			{
				DataInputStream t=new DataInputStream(System.in);
				double i,n,f,d=1;
				i=1;
				System.out.println("enter the value of n");
				n=Double.parseDouble(t.readLine());
				do
						{
								if(i%2!=0)
										{
										 System.out.println(i);
											f=1/i;
											d=d*f;
						;
										}
											
												i++;
						}
							while(i<=n);
									
							System.out.println(d);
						}
catch(Exception e)
{
	System.out.println(e);
}
}
}
