import java.io.*;
class daysinaweek
{
	public static void main(String arg[])
	{
		try
		{
		DataInputStream i=new DataInputStream(System.in);
		int a;
		System.out.println("eneter the number of week");
		a=Integer.parseInt(i.readLine());
		switch(a)
				{
					case 1:
						System.out.println("monday");
					break;
					case 2:
						System.out.println("tuesday");
					break;
					case 3:
						System.out.println("wendesday");
					break;
					case 4:
						System.out.println("thursday");
					break;
					case 5:
						System.out.println("friday");
					break;
					case 6:
						System.out.println("sat");
					break;
					case 7:
						System.out.println("sunday");
					break;
					default:
						System.out.println("Enter the valid Input");
					break;
			}
}
				catch(Exception e)
			{
				System.out.println(e);
			}
}
}