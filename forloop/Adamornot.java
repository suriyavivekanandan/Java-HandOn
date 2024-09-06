import java.io.*;
class Adamornot
{
	public static void main(String arg[])
		{
			try
				{
						

					DataInputStream t=new DataInputStream(System.in);
					int a,b,c,d=0,e,f=0,g;
					System.out.println("enter the number");
					a=Integer.parseInt(t.readLine());
					b=(int)Math.pow(a,2);
				    	do
					{
						c=b%10;
						d=d*10+c;
						b=b/10;
							
					}
						while(b!=0);
						System.out.println(d);
						e=(int)Math.sqrt(d);
						do
					{
						g=e%10;
						f=f*10+g;
						e=e/10;
							
					}
							while(e!=0);
						System.out.println(f);
					if(a==f)
							{
									System.out.println("Its adam number");
							}
					else
							{
									
									System.out.println("Its  not  adam number");
							}
									
}



catch(Exception e)
{
	System.out.println(e);
}
}
}
						


					
					
			