import java .io.*;
class Removetheelementfromarray
{
	public static void main(String arg[])
	{
		try
			{
				DataInputStream t=new DataInputStream(System.in);
				int i=0,n=0,b=0;
				System.out.println("enter the index value of Array");
				n= Integer.parseInt(t.readLine());
				int a[]=new int[n];
				for(i=0;i<n;i++)
						{
							a[i]=Integer.parseInt(t.readLine());
						}
				System.out.println("Enter the value to remove from Array");
				b= Integer.parseInt(t.readLine());
				int c=-1;
				for(i=0;i<n;i++)
						{
							if(a[i]==b)
								{
									c=i;
									break;

								}
							if(c!=-1)
									{
										a[c]=a[n-1];
										n--;
									}

							else
								{
										System.out.println("Element not found I array");
								}

									
						}
				for(i=0;i<n;i++)
						{
							System.out.println(a[i]+"     ");

						}
				
}
				catch(Exception e)
				{
					System.out.println(e);
				}
	}
}                       
