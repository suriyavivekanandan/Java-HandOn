import  java.io.*;
class Test2
{
	public static void main(String arg[])
	{
		try
			{
				DataInputStream t=new DataInputStream(System.in);
				int i=0,n,b=0,c=0;
				System.out.println("enter the size of array");
				n=Integer.parseInt(t.readLine());
				int a[]=new int[n];
				System.out.println("enter the Elements of array");

				for (i=0;i<n;i++)
						{
							a[i]=Integer.parseInt(t.readLine());
						}
			System.out.println("enter the index  value to check");
			b=Integer.parseInt(t.readLine());
                          c=-1;

			for(i=0;i<n;i++)
{

				if(a[i]==b)
					{
							c=i;
                                                     break;
					}
}			
			if(c!=-1)
				{
						System.out.println(c);
				}		
				else
			{
						System.out.println("not found ");
					}


				
}
				catch(Exception e)
				{
					System.out.println(e);
				}
	}
}                       