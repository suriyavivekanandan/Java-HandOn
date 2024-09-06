import java.io.*;
class Add
{
	public static void main(String arg[])
	{
		try
		{
		DataInputStream i=new DataInputStream(System.in);
		int a,b,c=0;
		String methoed,add,sub,div,mul,mod;
		System.out.println("enter the 1 st number");
		a=Integer.parseInt(i.readLine());
		System.out.println("enter the 2 st number");
		b=Integer.parseInt(i.readLine());
		System.out.println("methoed");
		methoed=(i.readLine());
			switch(methoed)
			{
			 case "add":
				  c=a+b;
				System.out.println(c);
			break;
			case "sub":
				  c=a-b;
				System.out.println(c);
			break;
			case "mul":
				  c=a*b;
				System.out.println(c);
			break;
		
			case "div":
				  c=a/b;
				System.out.println(c);
			break;
		       case "mod":
				  c=a%b;
				System.out.println(c);
			break;
			default:
				
			System.out.println(c);
			break;
			}
			

	}

				catch(Exception e)
			{
				System.out.println(e);
			}
}
}