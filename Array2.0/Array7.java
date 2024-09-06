import java.io.*;
public class Array7 {
    public static void main(String[] args) {
        try
        {
        DataInputStream t=new DataInputStream(System.in);
        int n=0,c=0;
        System.out.println("enter the value of index");
        n=Integer.parseInt(t.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(t.readLine());

        }

             for(int i=0;i<n;i++) {
               System.out.print(" "+a[i]);
               c=c+a[i];
             }  
                System.out.println("  Total of Array = "+c);
          }
          catch(Exception e)
				{
					System.out.println(e);
				}

    }
}





