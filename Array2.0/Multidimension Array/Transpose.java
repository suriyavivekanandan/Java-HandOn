import java.io.*;
public class Transpose {

    public static void main (String arg[])
    {
        try{
            DataInputStream t=new DataInputStream(System.in);
            int d=0;
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
            for(int i=0;i<r;i++)
             {
                 for(int j=0;j<c;j++)
                 {
                    if(a[i][j]==a[j][i]){
                         c=""
                    }
                    else
                    {
                       d =0;
                    }
                 }
                }
                 if(d==1)
                 {
                    System.out.println("tt");
                 }
                 else{
                    System.out.println("tt111");
                 }
                }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

