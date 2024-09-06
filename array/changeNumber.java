import  java.io.*;
class changeNumber
{
	public static void main(String arg[])
	{
		try
			{
				DataInputStream t=new DataInputStream(System.in);
				int i=0,n,b;
				System.out.println("enter the size of array");
				n=Integer.parseInt(t.readLine());
				int a[]=new int[n];
				
				for (i=0;i<n;i++)
						{
							a[i]=Integer.parseInt(t.readLine());
						}

				a[1]=50;
				for (i=0;i<n;i++)
						{
							System.out.print(a[i]+"  ");

						}
}
				catch(Exception e)
				{
					System.out.println(e);
				}
	}
}                       