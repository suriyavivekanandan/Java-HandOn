import  java.io.*;
class swapping
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

				 b=a[0];
				a[0]=a[n-1];
				a[n-1]=b;
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