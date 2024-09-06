import java.io.*;
class Evennumbers
{
public static void main(String arg[])
			{
				try
					{
						DataInputStream i=new DataInputStream(System.in);
						 	int a=1,b=0;
							System.out.println("enter the value of the b");
							b=Integer.parseInt(i.readLine());
							do
							{
								if(a%2==0)
										{
											
			
											System.out.println(a);
										}
											a++;
						}
							while(a<=b);
}

catch(Exception e)
{
	System.out.println(e);
}
}
}




   