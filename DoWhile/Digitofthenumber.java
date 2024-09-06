import java.io.*;
class Digitofthenumber
{
	public static void main(String arg[])
	{
		try
			{
				
				DataInputStream t=new DataInputStream(System.in);
				int a,i=0,d=0;
				System.out.println("enter the number");
				a=Integer.parseInt(t.readLine());

				do
					{
						a/=10;
						i++;
					}
				while(a!=0);
				System.out.println("The digit of the number is"+i);
			}
				
                            catch(Exception e)
           			{
					System.out.println(e);
         			   }
}
}

					
					
				
						
				