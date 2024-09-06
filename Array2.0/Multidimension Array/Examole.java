import java.io.*;
public class Examole {

    public static void main (String arg[])
    {
        try{
            DataInputStream t=new DataInputStream(System.in);
            System.out.println("Enter the value of n");
            int n=Integer.parseInt(t.readLine());
            System.out.println("enter the value of the Row");
            int r=Integer.parseInt(t.readLine());
            System.out.println("enter the valure of C");
            int c=Integer.parseInt(t.readLine());
            int a[][]=new int[r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.println("enter the value of"+i+" "+j);
                    a[i][j]=Integer.parseInt(t.readLine());
                }
                System.out.println();
             }
             for(int i=0;i<r;i++)
             {
                 for(int j=0;j<c;j++)
                 {
                    System.out.print(a[i][j]+" ");
                 }
                 System.out.println();
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
