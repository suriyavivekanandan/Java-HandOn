import java .io.*;
class Array21
{
    public static void main(String arg[])
    {
        try
        {
            DataInputStream t=new DataInputStream(System.in);
            int n,i=0,j=0,c=0;
            System.out.println("Enter the index value");
            n=Integer.parseInt(t.readLine());
            int a[]=new int[n];
            System.out.println("ENETER THE ELEMENTS OF A");
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(t.readLine());
            }
            System.out.println("ENETER THE ELEMENTS OF B");
            int b[]=new int[n];
            for(j=0;j<n;j++)
            {
                b[j]=Integer.parseInt(t.readLine());
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i]==b[j])
                    {
                        System.out.println("The duplicate element in the array is"+"  "+a[i]);

                    }
                }
            }
                    
                }
                catch (Exception e)
                {
                    System.out.println(e);

                }


                    }
                }
