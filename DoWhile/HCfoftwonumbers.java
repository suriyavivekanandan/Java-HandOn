import java.io.*;                                                      
class	 HCfoftwonumbers
{
	public static void main(String arg[])
		{
			try
	{
		DataInputStream j=new DataInputStream(System.in);
		int a=0,b=0,n=1,i=1,k=0;
		System.out.println("enter the 1 st number");
		a=Integer.parseInt(j.readLine());
		System.out.println("enter the 2 st number");
		b=Integer.parseInt(j.readLine());
		n=a*b;
		do
			{
				if(a%i==0 && b%i==0)
					{
						k=i;
					}
						i++;
			}
						while(i<=n);
						System.out.println("HCF of two numbers is:"+k)	;
			}	
			catch(Exception e)
			{
				System.out.println(e);
			}
		
 
		}
}
	
				  
		
