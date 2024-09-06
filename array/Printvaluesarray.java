import  java.io.*;
class Printvaluesarray
{
	public static void main(String arg[])
	{
		try
			{
				DataInputStream t=new DataInputStream(System.in);
				int i=0,n;
				
				System.out.println("enter the size of array");
				n=Integer.parseInt(t.readLine());
			          int[]a=new int [n];
				for(i=0;i<n;i++)
							{
								a[i]=Integer.parseInt(t.readLine());
							}
					                   System.out.print(a[0] +"   ");
								System.out.print(a[n-1] );

						
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
	}
}                       