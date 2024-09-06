import java.io.*;
class ReverseArray
{
    public static void main(String[] args) {
        {
            try
            {
                DataInputStream t=new DataInputStream(System.in);
                int i=0,n=0;
                System.out.println("enter the idex value of array");
                n=Integer.parseInt(t.readLine());
                int a[]=new int [n];
                for(i=0;i<n;i++)
                {
                    a[i]=Integer.parseInt(t.readLine());

                }
                for(i=0;i<n/2;i++)
                {
                    int k =a[i];
                    a[i]=a[n-i-1];
                    a[n-i-1]=k;
                
                 }
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");

            }
        }
            catch(Exception e)
                {
                    System.out.print(e);
                }
        }
    }
}
