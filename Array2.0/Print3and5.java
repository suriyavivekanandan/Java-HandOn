import java.io.*;
public class Print3and5 {

    public static void main(String[] args) {
        try
        {
        DataInputStream t=new DataInputStream(System.in);
        int n=0;
        System.out.println("enter the value of index");
        n=Integer.parseInt(t.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(t.readLine());

        }
    
                    System.out.println(a[2]);
                    System.out.println(a[4]);
                
          }
          catch(Exception e)
				{
					System.out.println(e);
				}

    }
}
