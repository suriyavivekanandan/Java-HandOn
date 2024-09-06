import java.io.*;
class Automorpic
{
	public static  void main(String arg[])
	{
		try
			{
					DataInputStream in=new DataInputStream(System.in);
					int a,b=0,c=0,d=0,e=0,f=0,g=0;
					System.out.println("enter the number");
					a=Integer.parseInt(in.readLine());
					b=(int) Math.pow(a,2);
					f=a;
					do
						{
								a=a/10;
								g++;
								System.out.println(g);
						}
							while(a>0);
						
							d=b%(int)(Math.pow(10,g));
							System.out.println(d);
								if(f==d)
										{
												
											System.out.println(" the numberautomorpic");
										}
								else
										{
											
												System.out.println(" the number not automorpic");
										}
													
}



catch(Exception e)
{
	System.out.println(e);
}
}
}
