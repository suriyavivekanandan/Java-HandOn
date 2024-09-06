import  java.io.*;
class Fractionofoddsq
	{
		public static void main(String arg[])
			{
				try
					{
						DataInputStream i=new DataInputStream(System.in);
						int a=1,b=0,c=0,d=0,e=0;
						System.out.println("enter the value of b");
						b=Integer.parseInt(i.readLine());
						do
							{
							        if(a%2==1)
									{
									c=(int)Math.pow(a,2);
									
									d=1/c;
									e=e+d;
									}
							
								a++;
							}
								while(a<=b);
								

								System.out.println(e);

								
						}



catch(Exception e)
{
	System.out.println(e);
}
}
}
