import java.io.*;
class Total
{
    public static void main(String[] args) {
        {
            try
            {
                DataInputStream t=new DataInputStream(System.in);
                int i=0,n=0,k=0;
                System.out.println("enter the idex value of array");
                n=Integer.parseInt(t.readLine());
                int a[]=new int[n];
                for(i=0;i<n;i++)
                {
                    a[i]=Integer.parseInt(t.readLine());
                }
                for(i=0;i<n;i++)
                {
                    System.out.println(a[i]+" ");
                    k=k+a[i];
                }
                System.out.println(k);
                
            }
            catch(Exception e)
                {
                    System.out.print(e);
                }
        }
    }
}