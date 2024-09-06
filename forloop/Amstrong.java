import java.io.*;
class Amstrong
{
	public static  void main(String arg[])
	{
		try
			{
				DataInputStream t=new DataInputStream(System.in);
				int n,d=0,a,y,z=0;
				int k;
				System.out.println("enter the number");
				n=Integer.parseInt(t.readLine());
				y=n;
				k=y;
						do
						{
							n=n/10;
							z++;
						}
							while(n!=0);
						do
						{
							a=y%10;
							d=d+(int)Math.pow(a,z);
							y=y/10;
						}
							while(y!=0);
						if(d==k)
								{
									System.out.println("amstrong");
		                                                }
   
					else
							{
									System.out.println("amstrong");
			                                    }
				}


catch(Exception e)
{
	System.out.println(e);
}
}
}

							

