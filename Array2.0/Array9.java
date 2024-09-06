import java.io.*;
class Sumoftwosingledimarray
{
    public static void main(String[] args) {
        {
            try
            {
                DataInputStream t=new DataInputStream(System.in);
                int i=0,n=0;
                System.out.println("enter the idex value of array");
                n=Integer.parseInt(t.readLine());
                int array1[]=new int[n];
                int array2[]=new int[n];
                int array3[]=new int[n];
                System.out.println("enter the value of array 1");
                for(i=0;i<n;i++)
                {
                    array1[i]=Integer.parseInt(t.readLine());
                }
                System.out.println("enter the value of array 2");
                for(i=0;i<n;i++)
                {
                    array2[i]=Integer.parseInt(t.readLine());  
                }
                for(i=0;i<n;i++)
                {
                    array3[i]= array1[i] +array2[i];
                }
                for(i=0;i<n;i++)
                {
                    System.out.print(array3[i]+" ");
                }
                
            }
            catch(Exception e)
                {
                    System.out.print(e);
                }
        }
    }
}